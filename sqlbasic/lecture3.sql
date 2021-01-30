-- dept talbe, departments table의 구조만 복사해서 생성(성립이 안되는 조건을 넣어서 구조 복사)
create table dept
as
(select * from departments where 1=0); --where는 행을 검색하는 조건

desc dept;

select * from dept;

-- column명 생략하면 table의 모든 column에 순서대로 값을 입력
insert into dept values(10,'aaa',100,1700);

insert into dept (department_id, department_name)
values(20,'bbb');

insert into dept(manager_id, location_id, department_id, department_name)
values(100,1700,30,'ccc');

insert into dept values(40,'ddd',null,null);

-- 다른 table 행 복사
insert into dept
select * from departments
where department_id = 80;

insert into dept
select * from departments
where department_id > 40 and department_id <>80;

-- 행 update
update dept
set department_name = 'xxx'
where department_id = 40;

-- employees 구조 복사
create table emp
as
(select * from employees where 1=0);

insert into emp(employee_id, first_name, last_name, email, phone_number,
hire_date, job_id, salary, commission_pct, manager_id, department_id)
values (113,'Louis','Popp','LPOPP','515.124.4567',sysdate,'AC_ACCOUNT',6900,null,205,100);

select * from emp;

-- 싹 다 복사
drop table emp;
create table emp
as
select * from employees;

select * from emp;

-- 두 행 update
select * from emp where employee_id in (114,205);

update emp
set job_id = (select job_id
              from emp
              where employee_id = 205),
    salary = (select salary
              from emp
              where employee_id = 205)
where employee_id = 114;


-- dept_loc table 생성, dept_id가 기본키, default 설정 가능
create table dept_loc(
dept_id number primary key,
loc_name varchar2(20) default '서울');

alter table dept_loc -- dept_name column 추가
add (dept_name varchar2(20));

alter table dept_loc -- dept_name2 column 추가
add (dept_name2 varchar2(20));

alter table dept_loc -- dept_name3 column 추가
add (dept_name3 varchar2(20));

alter table dept_loc -- dept_name size 변경
modify (dept_name varchar2(30));

alter table dept_loc -- dept_name column 삭제
drop column dept_name;

alter table dept_loc -- unused 설정
set unused (dept_name);

alter table dept_loc
set unused (dept_name2);

alter table dept_loc
set unused (dept_name3);

alter table dept_loc -- unused 설정되어 있는 columns 한 번에 삭제
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
emp : employees와 동일
emp2 : 부서 80만, 모든 사람의 이름이 aaa, bbb

emp => emp2 
emp2쪽으로 합칠 때
emp2에 없으면 insert
양쪽에 값이 있지만 같지 않으면 emp의 내용으로 emp2를 update
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
commit : 데이터베이스 쓰기 완료 => 내가 변경한 내용이 다른 user에게도 적용
=> 취소 안됨

sql 실행하는 app이 정상종료
ddl 문장 하나 실행
dcl 문장 하나 실행 
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






