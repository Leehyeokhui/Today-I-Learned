create table t1(
col1 varchar2(10) primary key,
col2 varchar2(10) not null,
col3 varchar2(10) unique
);

insert into t1
values(null, 'aaa', 'aaa'); -- primary key�� �ߺ� �ȵ�
insert into t1
values('aaa', 'aaa', 'aaa'); -- ���� ����
insert into t1
values('aaa', 'aaa', 'aaa'); -- col1, col3 �ߺ�
insert into t1(col1, col3)
values('bbb','bbb'); -- col2 null�̶� ����

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

-- �Խ���
-- ȸ�� table
create table member(
id varchar2(20) primary key,
pwd varchar2(20) not null,
name varchar2(20) not null,
email varchar2(20) not null
);

-- �Խñ� table
create table board(
num number primary key,
writer varchar2(20) references member(id),
w_date date,
title varchar2(50) not null,
content varchar2(100) not null
);

-- ȸ�� ����
insert into member values('user1','apfhd','lee','naver');
insert into member values('user2','qlfyd','kim','google');
insert into member values('user3','gurdk','park','daum');

/* �α���
id�� �˻� 
1.�˻� ��� ���� -> ���� id
2.�˻� ��� ���� -> �Է¹��� pwd�� pwd �÷��� ���� ������ ��, ������ �α���, �ٸ��� �߸��� pwd */
select * from member where id = 'user1';

-- �� ���� ����(�α��� ���� : �� - ���������� Ȯ��. pc�� - static ������ �α��� id ����)
select * from member where id = 'user1';

-- �� ���� ����(�α��� ����) => pwd�� ����
update member
set pwd = 'new pwd'
where id = 'user1';

-- �α׾ƿ� => ���ǿ��� ó��
-- db�� �� �� ����

-- Ż��
delete from member where id = 'user1';

-- sequence : �ڵ����� ��ȣ �����Ͽ� ��ȯ : 1,2,3,...
-- mysql�� auto increment �ɼ� �߰��ؼ� ����
create sequence seq_board;
select seq_board.nextval from dual; -- ���� ��ȣ ����
select seq_board.currval from dual; -- ������ ��ȣ Ȯ��(���� sequence �� �˻�)

-- �Խ���
-- �۾��� => ����, ���� �Է¹޾Ƽ� insert
insert into board
values(seq_board.nextval, 'user1', sysdate, 'title1', 'content1');
insert into board
values(seq_board.nextval, 'user1', sysdate, 'title2', 'content2');
insert into board
values(seq_board.nextval, 'user1', sysdate, 'title3', 'content3');
insert into board
values(seq_board.nextval, 'user2', sysdate, 'title', 'content4');

-- �۸�� => �� ��ü�˻�
select * from board;

-- �� �󼼳��뺸�� => �� ��ȣ�� �˻��Ͽ� ��ü ���� ���
select * from board where num = 4;

-- �� ���� => num, title, content�� �� ���� �Է¹޾� ����, �α��� �� ����� �۸� ���� ����
update board
set title = 'new_title', content = 'new_content', w_date = sysdate
where num = 3;

-- �� ���� => num �� ����, �α��� �� ����� �۸� ���� ����
delete board where num = 4;

-- �� �ۼ��ڷ� �˻�
select * from board where writer = 'user1';

-- �� �������� �˻�
select * from board where title like '%title%';
select * from board where title like '%new%';

-- ȸ�� Ż��
delete from member where id = 'user1'; -- id�����ϴ� board�� ���� �Խñ� ������ ���� �ȵ�
delete from member where id = 'user3'; -- �Խñ� ���� ������ ������ ����
select * from member;

delete board where writer = 'user1'; -- user1�� �ۼ��� �Խñ� ���� ��
delete from member where id = 'user1'; -- user1 ����
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

-- table ���� �� on delete cascade ���� �� �Խñ� ���� ���� �ٷ� ȸ�� ���� ����
delete member where id = 'user2'; 
select * from member;

drop table board;
create table board(
num number primary key,
writer varchar2(20) references member(id) on delete set null, --���� �� �ۼ��ڰ� null�� �ȴ�.
w_date date,
title varchar2(50) not null,
content varchar2(100) not null
);

-- ȸ�� ����, �� �ۼ�
insert into member values('bbb','apfhd','lee','naver');

insert into board
values(seq_board.nextval, 'bbb', sysdate, 'title2', 'content2');
select * from board;

delete member where id = 'bbb'; -- bbb Ż��

select * from member;
select * from board; -- �ۼ��� null�� ����� �� Ȯ��

create table t2(
col1 number,
col2 number,
col3 number
);

-- table ���� �� ��������
alter table t2
add primary key(col1); -- �������� �߰�

alter table t2
modify col2 not null; -- not null �������� �߰�

alter table t2
drop constraint SYS_C007058;

alter table t2
drop constraint SYS_C007059;
