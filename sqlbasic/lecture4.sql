create table t1(
col1 varchar2(10) primary key,
col2 varchar2(10) not null,
col3 varchar2(10) unique
);

insert into t1
values(null, 'aaa', 'aaa'); -- primary key는 중복 안됨
insert into t1
values('aaa', 'aaa', 'aaa'); -- 정상 실행
insert into t1
values('aaa', 'aaa', 'aaa'); -- col1, col3 중복
insert into t1(col1, col3)
values('bbb','bbb'); -- col2 null이라서 에러

drop table t1;
create table t1(
col1 number,
col2 number,
constraint t1_col1_check check(col1>0),
constraint t1_col2_check check(col2>10)
);

insert into t1 values(-1,12);
insert into t1 values(1,5);
insert into t1 values(1,12);

-- 게시판
-- 회원 table
create table member(
id varchar2(20) primary key,
pwd varchar2(20) not null,
name varchar2(20) not null,
email varchar2(20) not null
);

-- 게시글 table
create table board(
num number primary key,
writer varchar2(20) references member(id),
w_date date,
title varchar2(50) not null,
content varchar2(100) not null
);

-- 회원 가입
insert into member values('user1','apfhd','lee','naver');
insert into member values('user2','qlfyd','kim','google');
insert into member values('user3','gurdk','park','daum');

/* 로그인
id로 검색 
1.검색 결과 없음 -> 없는 id
2.검색 결과 있음 -> 입력받은 pwd와 pwd 컬럼의 값과 같은지 비교, 같으면 로그인, 다르면 잘못된 pwd */
select * from member where id = 'user1';

-- 내 정보 보기(로그인 상태 : 웹 - 세션정보로 확인. pc앱 - static 변수에 로그인 id 저장)
select * from member where id = 'user1';

-- 내 정보 수정(로그인 상태) => pwd만 수정
update member
set pwd = 'new pwd'
where id = 'user1';

-- 로그아웃 => 세션에서 처리
-- db는 할 게 없음

-- 탈퇴
delete from member where id = 'user1';

-- sequence : 자동으로 번호 생성하여 반환 : 1,2,3,...
-- mysql은 auto increment 옵션 추가해서 생성
create sequence seq_board;
select seq_board.nextval from dual; -- 다음 번호 생성
select seq_board.currval from dual; -- 생성된 번호 확인(현재 sequence 값 검색)

-- 게시판
-- 글쓰기 => 제목, 내용 입력받아서 insert
insert into board
values(seq_board.nextval, 'user1', sysdate, 'title1', 'content1');
insert into board
values(seq_board.nextval, 'user1', sysdate, 'title2', 'content2');
insert into board
values(seq_board.nextval, 'user1', sysdate, 'title3', 'content3');
insert into board
values(seq_board.nextval, 'user2', sysdate, 'title', 'content4');

-- 글목록 => 글 전체검색
select * from board;

-- 글 상세내용보기 => 글 번호로 검색하여 전체 정보 출력
select * from board where num = 4;

-- 글 수정 => num, title, content의 세 내용 입력받아 수정, 로그인 한 사람의 글만 수정 가능
update board
set title = 'new_title', content = 'new_content', w_date = sysdate
where num = 3;

-- 글 삭제 => num 글 삭제, 로그인 한 사람의 글만 삭제 가능
delete board where num = 4;

-- 글 작성자로 검색
select * from board where writer = 'user1';

-- 글 제목으로 검색
select * from board where title like '%title%';
select * from board where title like '%new%';

-- 회원 탈퇴
delete from member where id = 'user1'; -- id참조하는 board로 인해 게시글 있으면 삭제 안됨
delete from member where id = 'user3'; -- 게시글 없는 유저는 삭제가 쉽다
select * from member;

delete board where writer = 'user1'; -- user1이 작성한 게시글 삭제 후
delete from member where id = 'user1'; -- user1 삭제
select * from member;

drop table board;
create table board(
num number primary key,
writer varchar2(20) references member(id) on delete cascade,
w_date date,
title varchar2(50) not null,
content varchar2(100) not null
);

insert into board values(seq_board.nextval, 'user2', sysdate, 'title6', 'content3');
select * from board;

-- table 생성 시 on delete cascade 지정 시 게시글 삭제 없이 바로 회원 삭제 가능
delete member where id = 'user2'; 
select * from member;

drop table board;
create table board(
num number primary key,
writer varchar2(20) references member(id) on delete set null, --삭제 시 작성자가 null이 된다.
w_date date,
title varchar2(50) not null,
content varchar2(100) not null
);

-- 회원 가입, 글 작성
insert into member values('bbb','apfhd','lee','naver');

insert into board
values(seq_board.nextval, 'bbb', sysdate, 'title2', 'content2');
select * from board;

delete member where id = 'bbb'; -- bbb 탈퇴

select * from member;
select * from board; -- 작성자 null로 변경된 것 확인

create table t2(
col1 number,
col2 number,
col3 number
);

-- table 생성 후 제약조건
alter table t2
add primary key(col1); -- 제약조건 추가

alter table t2
modify col2 not null; -- not null 제약조건 추가

alter table t2
drop constraint SYS_C007058;

alter table t2
drop constraint SYS_C007059;
