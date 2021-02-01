---------- java하고 연결 ----------
select * from member;

drop table board;
create table board(
num number primary key, 
writer varchar2(20) references member(id) on delete cascade,
w_date date,
title varchar2(50) not null,
content varchar2(100) not null
);









