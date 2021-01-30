-- 8��
-- 1��, 2��
create table my_employee
(id number(4), last_name varchar2(25), first_name varchar2(25), userid varchar2(8), salary number(9,2));

desc my_employee;

-- 3��
insert into my_employee
values(1, 'Patel', 'Ralph', 'rpatel', 895);

-- 4��
insert into my_employee(id, last_name, first_name, userid, salary)
values(2, 'Dancs', 'Betty', 'bdancs', 860);

-- 5��
select * from my_employee;

-- 7��
insert into my_employee
values(3, 'Biri', 'Ben', 'bbiri', 1100);
insert into my_employee
values(4, 'Newman', 'Chad', 'cnewman', 750);

-- 8��
select * from my_employee;

-- 9��
commit;

-- 10��
update my_employee
set last_name = 'Drexler'
where id = 3;

-- 11��
update my_employee
set salary = 1000
where salary < 900;

-- 12��
select * from my_employee;

-- 13��
delete my_employee
where last_name = 'Dancs';

-- 14��
select * from my_employee;

-- 15��
commit;

-- 16��
insert into my_employee
values(5, 'Ropeburn', 'Audrey', 'aropebur', 1550);

-- 17��
select * from my_employee;

-- 18��
savepoint a;

-- 19��
delete my_employee;

-- 20��
select * from my_employee;

-- 21��
rollback to a;

-- 22��
select * from my_employee;

-- 23��
commit;

-- 9��
-- 1��
create table exdept
(id number(7), name varchar2(25));

desc exdept;

-- 2��
insert into exdept(id, name)
select department_id, department_name
from departments;

-- 3��
create table exemp
(id number(7), last_name varchar2(25), first_name varchar(25), dept_id number(7));
desc exemp;

-- 4��
alter table exemp
modify last_name varchar2(50);

-- 5��
select table_name
from user_tables;

-- 6��
create table employees2
as
(select employee_id "ID", first_name "FIRST_NAME", last_name "LAST_NAME", salary "SALARY", department_id "DEPT_ID" from employees where 1=0);

-- 7��
drop table exemp;

-- 8��
alter table employees2
rename to exemp;

-- 9��
comment on table exemp
is 'Employee infromation';
comment on table exdept
is 'department infromation';
select *
from user_tab_comments;

-- 10��
alter table exemp
drop column first_name;
desc exemp;

-- 11��
alter table exemp
set unused (dept_id);
desc exemp;

-- 12��
alter table exemp
drop unused columns;
desc exemp;
