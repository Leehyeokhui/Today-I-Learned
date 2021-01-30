-- 3��
-- 1��
select sysdate "Date" from dual;

-- 2,3��
select employee_id, last_name, salary, (salary*1.15) "New Salary"
from employees;

-- 4��
select employee_id, last_name, salary, (salary*1.15) "New Salary", (salary*0.15) "Increase"
from employees;

-- 5��
select initcap(last_name) "Name", length(last_name) "Length"
from employees
where (last_name like 'A%'
or last_name like 'J%'
or last_name like 'M%');

-- 6��
select last_name, round(months_between(sysdate,hire_date),0) "MONTHS_WORKED"
from employees
order by MONTHS_WORKED;

-- 7��
select last_name || ' earns ' || to_char(salary, '$99,999.00') || ' monthly but wants ' || to_char(salary*3, '$99,999.00') "Dream Salaries"
from employees;

-- 8��
select last_name, lpad(salary, 15, '$')
from employees;

-- 9��
select last_name, hire_date, to_char(next_day(add_months(hire_date, 6),'������'), 'day, "the" ddspth "of" month, yyyy') "REVIEW"
from employees;

-- 10��
select last_name, hire_date, TO_char(hire_date, 'dy') "DAY"
from employees
order by to_char(hire_date-1,'D');

-- 11��
select last_name, nvl(to_char(commission_pct), 'No Commission') "COMM"
from employees;

-- 12��
select last_name || ' ' || lpad(' ',round((salary/1000)+1,0),'*') "EMPLOYEE_AND_THEIR_SALARIES"
from employees;

-- 13��
select job_id,
        decode (job_id,
                'AD_PRES', 'A',
                'ST_MAN', 'B',
                'IT_PROG', 'C',
                'SA_REP', 'D',
                'ST_CLERK', 'E',
                0) "G"
from employees;

-- 14��
select job_id,
        case job_id when 'AD_PRES' then 'A'
                    when 'ST_MAN' then 'B'
                    when 'IT_PROG' then 'C'
                    when 'SA_REP' then 'D'
                    when 'ST_CLERK' then 'E'
        else '0' end "G"
from employees;

-- 5��
-- 4��
select max(salary) "Maximum", min(salary) "Minimum", sum(salary) "Sum", round(avg(salary),0) "Average"
from employees;

-- 5��
select job_id, max(salary) "Maximum", min(salary) "Minimum", sum(salary) "Sum", round(avg(salary),0) "Average"
from employees
group by job_id;

-- 6��
select job_id, count(*)
from employees
group by job_id;

-- 7��
select count(distinct manager_id) "Number of Managers"
from employees;

-- 8��
select max(salary)-min(salary) "DIFFERENCE"
from employees;

-- 9��
select manager_id, min(salary)
from employees
group by manager_id
having min(salary) >= 6000
and manager_id is not null
order by min(salary);

-- 10��
select d.department_name "Name", d.location_id "Location", count(*) "Number of People", round(avg(salary),2) "Salary"
from employees e
inner join departments d on d.department_id = e.department_id
group by d.department_name, d.location_id;

-- 11��
select count(*) "Total",
count(case when extract(year from hire_date) = 2005 then 1 end) "2005", count(case when extract(year from hire_date) = 2006 then 1 end) "2006",
count(case when extract(year from hire_date) = 2007 then 1 end) "2007", count(case when extract(year from hire_date) = 2008 then 1 end) "2008"
from employees;

-- decode ���
select count(*) "Total",
sum(decode(to_char(hire_date, 'yy'), 05, 1, 0)) "2005",
sum(decode(to_char(hire_date, 'yy'), 06, 1, 0)) "2006",
sum(decode(to_char(hire_date, 'yy'), 07, 1, 0)) "2007",
sum(decode(to_char(hire_date, 'yy'), 08, 1, 0)) "2008"
from employees;

-- 12��
select job_id, 
sum(case when department_id = 20 then salary end) "Dept 20", sum(case when department_id = 50 then salary end) "Dept 50",
sum(case when department_id = 80 then salary end) "Dept 80", sum(case when department_id = 90 then salary end) "Dept 90",
sum(salary) "Total"
from employees
group by job_id;

-- decode ���
select job_id,
sum(decode(department_id, 20, salary, 0)) "Dept 20",
sum(decode(department_id, 50, salary, 0)) "Dept 50",
sum(decode(department_id, 80, salary, 0)) "Dept 80",
sum(decode(department_id, 90, salary, 0)) "Dept 90",
sum(salary) "Total"
from employees
group by job_id;

-- 6��
-- 1��
select last_name, hire_date
from employees
where department_id =
                        (select department_id
                        from employees
                        where last_name = 'Zlotkey')
and last_name <> 'Zlotkey';

-- 2��
select employee_id, last_name, salary
from employees
where salary > 
                (select avg(salary)
                from employees)
order by salary;
                
-- 3��
select employee_id, last_name
from employees
where department_id in 
                        (select department_id
                        from employees
                        where last_name like '%u%');

-- 4��
select e.last_name, d.department_id, e.job_id
from employees e
join departments d on e.department_id = d.department_id
where d.location_id = 1700;

-- ���� ���� �̿�
select last_name, department_id, job_id
from employees
where department_id in
                        (select department_id
                        from departments
                        where location_id = 1700);

-- 5��
select last_name, salary
from employees
where manager_id in
                    (select employee_id
                    from employees
                    where last_name = 'King')
and last_name <> 'King';

-- 6��
select d.department_id, e.last_name, e.job_id
from employees e
join departments d on e.department_id = d.department_id
where d.department_name = 'Executive';

-- ���� ���� �̿�
select department_id, last_name, job_id
from employees
where department_id in
                        (select department_id
                        from departments
                        where department_name = 'Executive');

-- 7��
select employee_id, last_name, salary
from employees
where department_id = any 
                        (select department_id
                        from employees
                        where last_name like '%u%')
and salary >
            (select avg(salary)
            from employees);
