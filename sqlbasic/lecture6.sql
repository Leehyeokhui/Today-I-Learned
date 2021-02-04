set serveroutput on -- procedure ��¹� ����� ���ؼ� �׻� set on ����� �Ѵ�.

-- procedure
-- 2,3�� return�� ������ ���� ����, 4�� �Լ� ȣ��, ���๮�� �ּ��޸� ������
-- proc1 ����
var emp_name varchar2(25);
var emp_salary number;
exec proc1(206, :emp_name, :emp_salary);
print emp_name;
print emp_salary;

-- add_sal ����
var sal number;
begin :sal := 100; end;
/
exec add_sal(105, :sal);
print sal;

/* 
cursor
java�� resultset ó�� ���� ���� ����� �޾ƿ� �� ���
��� �� open cursor;
��� �� close cursor;
*/
exec dept_list();

-- ������ ��� �ǽ�
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
exec add_product('��ǻ��', '�Ｚ', to_date('18/12/25', 'yy/mm/dd'), 1000, 13);
select * from product;

-- find product by num
exec get_product(3);

-- find product by name
exec get_product_by_name('��ǻ��');

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

alter table emp_tmp -- column �߰�
add (type varchar2(2));

insert into emp values(306, 'aaa', 'bbb', 'emaila', '111.222.3333', 
sysdate, 'MK_MAN', 13000, null, 100, 20);

select * from emp;
select * from emp_tmp; -- trigger Ȯ��

update emp set salary=15000 where employee_id=306;

delete emp where employee_id=306;

