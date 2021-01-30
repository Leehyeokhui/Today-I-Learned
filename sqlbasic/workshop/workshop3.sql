-- 8장
-- 1번, 2번
create table my_employee
(id number(4), last_name varchar2(25), first_name varchar2(25), userid varchar2(8), salary number(9,2));

desc my_employee;

-- 3번
insert into my_employee
values(1, 'Patel', 'Ralph', 'rpatel', 895);

-- 4번
insert into my_employee(id, last_name, first_name, userid, salary)
values(2, 'Dancs', 'Betty', 'bdancs', 860);

-- 5번
select * from my_employee;

-- 7번
insert into my_employee
values(3, 'Biri', 'Ben', 'bbiri', 1100);
insert into my_employee
values(4, 'Newman', 'Chad', 'cnewman', 750);

-- 8번
select * from my_employee;

-- 9번
commit;

-- 10번
update my_employee
set last_name = 'Drexler'
where id = 3;

-- 11번
update my_employee
set salary = 1000
where salary < 900;

-- 12번
select * from my_employee;

-- 13번
delete my_employee
where last_name = 'Dancs';

-- 14번
select * from my_employee;

-- 15번
commit;

-- 16번
insert into my_employee
values(5, 'Ropeburn', 'Audrey', 'aropebur', 1550);

-- 17번
select * from my_employee;

-- 18번
savepoint a;

-- 19번
delete my_employee;

-- 20번
select * from my_employee;

-- 21번
rollback to a;

-- 22번
select * from my_employee;

-- 23번
commit;

-- 9장
-- 1번
create table exdept
(id number(7), name varchar2(25));

desc exdept;

-- 2번
insert into exdept(id, name)
select department_id, department_name
from departments;

-- 3번
create table exemp
(id number(7), last_name varchar2(25), first_name varchar(25), dept_id number(7));
desc exemp;

-- 4번
alter table exemp
modify last_name varchar2(50);

-- 5번
select table_name
from user_tables;

-- 6번
create table employees2
as
(select employee_id "ID", first_name "FIRST_NAME", last_name "LAST_NAME", salary "SALARY", department_id "DEPT_ID" from employees where 1=0);

-- 7번
drop table exemp;

-- 8번
alter table employees2
rename to exemp;

-- 9번
comment on table exemp
is 'Employee infromation';
comment on table exdept
is 'department infromation';
select *
from user_tab_comments;

-- 10번
alter table exemp
drop column first_name;
desc exemp;

-- 11번
alter table exemp
set unused (dept_id);
desc exemp;

-- 12번
alter table exemp
drop unused columns;
desc exemp;
