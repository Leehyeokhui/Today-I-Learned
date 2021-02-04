set serveroutput on -- procedure 출력문 출력을 위해서 항상 set on 해줘야 한다.

-- procedure
-- 2,3행 return값 저장할 변수 선언, 4행 함수 호출, 실행문에 주석달면 오류남
-- proc1 실행
var emp_name varchar2(25);
var emp_salary number;
exec proc1(206, :emp_name, :emp_salary);
print emp_name;
print emp_salary;

-- add_sal 실행
var sal number;
begin :sal := 100; end;
/
exec add_sal(105, :sal);
print sal;

/* 
cursor
java의 resultset 처럼 여러 행의 결과를 받아올 때 사용
사용 전 open cursor;
사용 후 close cursor;
*/
exec dept_list();

-- 편의점 기능 실습
create table product(
sno number primary key,
name varchar2(20),
company varchar2(50),
p_date date,
price number,
quantity number
);

create sequence seq_prod;

-- add product
exec add_product('컴퓨터', '삼성', to_date('18/12/25', 'yy/mm/dd'), 1000, 13);
select * from product;

-- find product by num
exec get_product(3);

-- find product by name
exec get_product_by_name('컴퓨터');

-- edit price
exec edit_product(1, 1300);
select * from product;
exec edit_product(3, 1300);

-- test1
var emp_name varchar2(25);
exec test1('Fay', :emp_name);
print emp_name;

-- function
select make_name(first_name,last_name)
from employees;

-- make grade
var grade varchar2;
exec :grade:=make_grade(175);
print grade;

var grade varchar2;
exec :grade:=make_grade(92);
print grade;

-- salary grade
select employee_id, last_name, salary, sal_grade(salary) "sal grade"
from employees;

select * from job_grades;

-- trigger
create table emp_tmp
as
select employee_id, last_name, job_id, salary
from employees
where 1=0;

alter table emp_tmp -- column 추가
add (type varchar2(2));

insert into emp values(306, 'aaa', 'bbb', 'emaila', '111.222.3333', 
sysdate, 'MK_MAN', 13000, null, 100, 20);

select * from emp;
select * from emp_tmp; -- trigger 확인

update emp set salary=15000 where employee_id=306;

delete emp where employee_id=306;

