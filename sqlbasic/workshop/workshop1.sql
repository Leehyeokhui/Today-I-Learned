-- 1��
-- 6��
desc departments;
select * from departments;

-- 7, 8��
desc employees;
select last_name, job_id, hire_date as "STARTDATE" from employees;

-- 9��
select distinct job_id from employees;

-- 11��
select last_name || ', ' || job_id as "Employee and Title" from employees;

-- 12��
select employee_id || ', ' || first_name || ', ' || last_name || ', ' || email || ', ' || phone_number || ', ' || hire_date || ', ' || job_id || ', ' || salary || ', ' || commission_pct || ', ' || manager_id || ', ' || department_id as "THE_OUTPUT" from employees;

-- 2��
-- 1��
select last_name, salary
from employees
where salary > 12000;

-- 2��
select last_name, department_id
from employees
where employee_id = 176;

-- 3��
select last_name, salary
from employees
where not salary between 5000 and 12000;

-- 4�� - ������ ���� ���� ��¥�� ����ŵ�ϴ�.
select last_name, job_id, hire_date
from employees
where hire_date between '1998-02-20' and '1998-05-01'
order by hire_date;

-- 4�� �������� ���Ƿ� ���� ���� �� ����
select last_name, hire_date
from employees
where hire_date between '2002-02-20' and '2002-12-01'
order by hire_date;

-- 5��
select last_name, department_id
from employees
where department_id in (20, 50)
order by last_name;

-- 6��
select last_name as "Employee", salary as "Monthly Salary"
from employees
where salary between 5000 and 12000
and department_id in (20,50);

-- 7�� - 4���� ���������� ���� ���� �ش��ϴ� ������ ����
select last_name, hire_date
from employees
where hire_date between '1994-01-01' and '1994-12-31';

-- 7�� - ���� ��ü�Ͽ� ���
select last_name, hire_date
from employees
where hire_date between '2002-01-01' and '2002-12-31';

-- 8��
select last_name, job_id
from employees
where manager_id is null;

-- 9��
select last_name, salary, commission_pct
from employees
where commission_pct is not null
order by commission_pct desc;

-- 10��
select last_name
from employees
where last_name like '__a%';

-- 11��
select last_name
from employees
where last_name like '%a%'
and last_name like '%e%';

-- 12��
select last_name, job_id, salary
from employees
where (job_id = 'ST_CLERK' or job_id = 'SA_REP')
and salary not in (2500, 3500, 7000);

-- 13��
select last_name as "Employee", salary as "Monthly Salary", commission_pct
from employees
where commission_pct = 0.2;

-- 4��
-- 1��
select e.last_name, e.department_id, d.department_name
from employees e, departments d
where e.department_id = d.department_id;

-- 2��
select distinct e.job_id, l.location_id
from employees e, departments d, locations l
where d.department_id = 80
and e.department_id = d.department_id;

-- 3��
select e.last_name, d.department_name, l.location_id, l.city
from employees e, departments d, locations l
where e.commission_pct is not null
and e.department_id = d.department_id
and d.location_id = l.location_id;

-- 4��
select e.last_name, d.department_name
from employees e, departments d
where e.last_name like '%a%'
and e.department_id = d.department_id;

-- 9��
create table job_grades(
grade varchar2(1) primary key, 
lowest_sal number(8, 2),
highest_sal number(8, 2)
);

insert into job_grades values('A', 1000, 2999);
insert into job_grades values('B', 3000, 5999);
insert into job_grades values('C', 6000, 9999);
insert into job_grades values('D', 10000, 14999);
insert into job_grades values('E', 15000, 24999);
insert into job_grades values('F', 25000, 40000);


