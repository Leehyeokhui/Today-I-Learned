select *
from departments;

select department_id, location_id
from departments;

select location_id, department_id
from departments;

select last_name, hire_date, salary
from employees;

select last_name, hire_date, salary + 300
from employees;

select last_name, hire_date, 12 * salary + 300
from employees;

select last_name, hire_date, 12 * (salary + 300)
from employees;

select last_name, hire_date, salary, commission_pct
from employees;

select last_name ,12 * salary * commission_pct
from employees;

select last_name name, salary*12 "Annual Salary"
from employees;

select last_name || job_id "Employees"
from employees;

select last_name || ' is a ' || job_id "Employee Details"
from employees;

select department_id
from employees;

select distinct department_id
from employees;

desc employees;

select employee_id, last_name, job_id, department_id
from employees
where department_id = 90;

select last_name, job_id, department_id
from employees
where last_name = 'Whalen';

select last_name, salary
from employees
where salary <= 3000;

select last_name, salary
from employees
where salary between 2500 and 3500;

select employee_id, last_name, salary, manager_id
from employees
where manager_id in (100, 101, 201);

select first_name
from employees
where first_name like 'S%';

select last_name
from employees
where last_name like '_o%';

select last_name, manager_id
from employees
where manager_id is null;

select employee_id, last_name, job_id, salary
from employees
where salary >= 10000
and job_id like '%MAN%';

select employee_id, last_name, job_id, salary
from employees
where salary >= 10000
or job_id like '%MAN%';

select last_name, job_id
from employees
where job_id not in ('IT_PROG', 'ST_CLERK', 'SA_REP');

select last_name, job_id, salary
from employees
where job_id = 'SA_REP'
or job_id = 'AD_PRES'
and salary > 15000;

select last_name, job_id, salary
from employees
where (job_id = 'SA_REP'
or job_id = 'AD_PRES')
and salary > 15000;

select last_name, job_id, department_id, hire_date
from employees
order by hire_date;

select last_name, job_id, department_id, hire_date
from employees
order by hire_date desc;

select employee_id, last_name, salary*12 annsal
from employees
order by annsal;

select last_name, department_id, salary
from employees
order by department_id, salary desc;

select employee_id, last_name, department_id
from employees
where lower(last_name) = 'higgins';

select employee_id, concat(first_name, last_name) name, job_id, length(last_name), instr(last_name, 'a') "Contains 'a'?"
from employees
where substr(job_id, 4) = 'REP';

select employee_id, concat(first_name, last_name) name, job_id, length(last_name), instr(last_name, 'a') "Contains 'a'?"
from employees
where substr(last_name, -1, 1) = 'n';

select round(45.923,2), round(45.923,0), round(45.923,-1)
from dual;

select trunc(45.923,2), trunc(45.923,0), trunc(45.923,-1)
from dual;

select last_name, salary, mod(salary, 5000)
from employees
where job_id = 'SA_REP';

select last_name, hire_date
from employees
where last_name like 'G%';

select sysdate from dual;

select last_name, (sysdate - hire_date)/7 "WEEKS"
from employees
where department_id = 90;

select employee_id, hire_date, round(months_between(sysdate, hire_date),0) tenure,
add_months(hire_date, 6) review, next_day(hire_date, '±›ø‰¿œ'), last_day(hire_date)
from employees;

select employee_id, hire_date,
round(hire_date, 'month'), trunc(hire_date, 'month')
from employees
where hire_date like '%05';

select employee_id, to_char(hire_date, 'mm/yy') month_hired
from employees
where last_name = 'Higgins';

select last_name, to_char(hire_date, 'fmdd month yyyy') hiredate
from employees;

select to_char(salary, '$99,999.00') salary
from employees;

select last_name, nvl(to_char(manager_id), 'No Manager')
from employees
where manager_id is null;

select last_name, salary, nvl(commission_pct, 0),
(salary*12) + (salary*12*nvl(commission_pct,0)) an_sal
from employees;

select last_name, salary, commission_pct, nvl2(commission_pct, 'SAL+COM', 'SAL') income
from employees
where department_id in (50, 80);

select first_name, length(first_name) expr1,
last_name, length(last_name) expr2,
nullif(length(first_name), length(last_name)) result
from employees;

select last_name, coalesce(commission_pct, salary, 10) comm
from employees
order by commission_pct;

select last_name, job_id, salary,
case job_id when 'IT_PROG' then 1.10*salary
            when 'ST_CLERK' then 1.15*salary
            when 'SA_§¢EP' then 1.20*salary
else salary end "REVISED_SALARY"
from employees;

select last_name, job_id, salary,
decode( job_id,  'IT_PROG',  1.10*salary,
             'ST_CLERK',  1.15*salary,
             'SA_§¢EP',  1.20*salary,
             salary) "REVISED_SALARY"
from employees;