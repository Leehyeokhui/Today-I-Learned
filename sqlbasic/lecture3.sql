-- dept talbe, departments table�� ������ �����ؼ� ����(������ �ȵǴ� ������ �־ ���� ����)
create table dept
as
(select * from departments where 1=0); --where�� ���� �˻��ϴ� ����

desc dept;

select * from dept;

-- column�� �����ϸ� table�� ��� column�� ������� ���� �Է�
insert into dept values(10,'aaa',100,1700);

insert into dept (department_id, department_name)
values(20,'bbb');

insert into dept(manager_id, location_id, department_id, department_name)
values(100,1700,30,'ccc');

insert into dept values(40,'ddd',null,null);

-- �ٸ� table �� ����
insert into dept
select * from departments
where department_id = 80;

insert into dept
select * from departments
where department_id > 40 and department_id <>80;

-- �� update
update dept
set department_name = 'xxx'
where department_id = 40;

-- employees ���� ����
create table emp
as
(select * from employees where 1=0);

insert into emp(employee_id, first_name, last_name, email, phone_number,
hire_date, job_id, salary, commission_pct, manager_id, department_id)
values (113,'Louis','Popp','LPOPP','515.124.4567',sysdate,'AC_ACCOUNT',6900,null,205,100);

select * from emp;

-- �� �� ����
drop table emp;
create table emp
as
select * from employees;

select * from emp;

-- �� �� update
select * from emp where employee_id in (114,205);

update emp
set job_id = (select job_id
              from emp
              where employee_id = 205),
    salary = (select salary
              from emp
              where employee_id = 205)
where employee_id = 114;


-- dept_loc table ����, dept_id�� �⺻Ű, default ���� ����
create table dept_loc(
dept_id number primary key,
loc_name varchar2(20) default '����');

alter table dept_loc -- dept_name column �߰�
add (dept_name varchar2(20));

alter table dept_loc -- dept_name2 column �߰�
add (dept_name2 varchar2(20));

alter table dept_loc -- dept_name3 column �߰�
add (dept_name3 varchar2(20));

alter table dept_loc -- dept_name size ����
modify (dept_name varchar2(30));

alter table dept_loc -- dept_name column ����
drop column dept_name;

alter table dept_loc -- unused ����
set unused (dept_name);

alter table dept_loc
set unused (dept_name2);

alter table dept_loc
set unused (dept_name3);

alter table dept_loc -- unused �����Ǿ� �ִ� columns �� ���� ����
drop unused columns;

insert into dept_loc(dept_id) values(10);
insert into dept_loc values(20,default);
insert into dept_loc values(30,null);
select * from dept_loc;
desc dept_loc;
----------------------------------------------
select * from emp;

create table emp2
as
select * from employees where department_id = 80;
select * from emp2;

update emp2 set first_name = 'aaa', last_name = 'bbb';

/*
emp : employees�� ����
emp2 : �μ� 80��, ��� ����� �̸��� aaa, bbb

emp => emp2 
emp2������ ��ĥ ��
emp2�� ������ insert
���ʿ� ���� ������ ���� ������ emp�� �������� emp2�� update
*/

merge into emp2 e2
using emp e
on(e2.employee_id = e.employee_id)
when matched then
update set
    e2.first_name = e.first_name,
    e2.last_name = e.last_name,
    e2.email = e.email,
    e2.phone_number = e.phone_number,
    e2.hire_date = e.hire_date,
    e2.job_id = e.job_id,
    e2.salary = e.salary,
    e2.commission_pct = e.commission_pct,
    e2.manager_id = e.manager_id,
    e2.department_id = e.department_id
when not matched then
insert values(e.employee_id, e.first_name, e.last_name, e.email, e.phone_number,
e.hire_date, e.job_id, e.salary, e.commission_pct, e.manager_id, e.department_id);

/* 
commit : �����ͺ��̽� ���� �Ϸ� => ���� ������ ������ �ٸ� user���Ե� ����
=> ��� �ȵ�

sql �����ϴ� app�� ��������
ddl ���� �ϳ� ����
dcl ���� �ϳ� ���� 
*/

select * from emp2;
commit;
update emp2 set first_name = 'ccc' where employee_id = 145;
savepoint a;
delete emp2 where employee_id = 145;
savepoint b;
update emp2 set first_name = 'qqq' where employee_id = 146;
rollback to a;
rollback;






