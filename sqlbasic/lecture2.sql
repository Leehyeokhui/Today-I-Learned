select last_name, department_name dept_name
from employees, departments;

select e.employee_id, e.last_name, e.department_id, d.department_id, d.location_id
from employees e, departments d
where e.department_id = d.department_id;

select last_name, e.department_id, department_name
from employees e, departments d
where e.department_id = d.department_id
and last_name = 'Matos';

select e.last_name, d.department_name, l.city
from employees e, departments d, locations l
where e.department_id = d.department_id
and d.location_id = l.location_id;

select w.last_name || ' works for ' || m.last_name
from employees w, employees m
where w.manager_id = m.employee_id;

select last_name, department_name
from employees
cross join departments;

select department_id, department_name, location_id, city
from departments
natural join locations;

select e.employee_id, e.last_name, d.location_id
from employees e
join departments d
using(department_id);

select e.employee_id, e.last_name, e.department_id, d.department_id, d.location_id
from employees e
join departments d
on e.department_id = d.department_id;

select employee_id, city, department_name
from employees e
join departments d
on e.department_id = d.department_id
join locations l
on d.location_id = l.location_id;

select avg(salary), max(salary), min(salary), sum(salary)
from employees
where job_id like '%REP%';

select min(hire_date), max(hire_date)
from employees;

select count(*)
from employees
where department_id = 50;

select count(commission_pct)
from employees
where department_id = 80;

select count(distinct department_id)
from employees;

select avg(commission_pct)
from employees;

select avg(nvl(commission_pct, 0))
from employees;

select department_id, avg(salary)
from employees
group by department_id;

select avg(salary)
from employees
group by department_id;

select department_id dept_id, job_id, sum(salary)
from employees
group by department_id, job_id;

select department_id, avg(salary)
from employees
group by department_id
having avg(salary) > 8000;

select department_id, max(salary)
from employees
group by department_id
having max(salary) > 10000;

select job_id, sum(salary) payroll
from employees
where job_id not like '%REP%'
group by job_id
having sum(salary) > 13000
order by sum(salary);

select max(avg(salary))
from employees
group by department_id;

select last_name
from employees
where salary >
                (select salary
                from employees
                where last_name = 'Abel');

select last_name, job_id, salary
from employees
where job_id = 
                (select job_id
                from employees
                where employee_id = 141)
and salary >
                (select salary
                from employees
                where employee_id = 143);
                
select last_name, job_id, salary
from employees
where salary = 
                (select min(salary)
                from employees);
                
select department_id, min(salary)
from employees
group by department_id
having min(salary) > 
                    (select min(salary)
                    from employees
                    where department_id = 50);
                    
select last_name, salary, department_id
from employees
where salary in (select min(salary)
                from employees
                group by department_id);
                
select employee_id, last_name, job_id, salary
from employees
where salary < any
                    (select salary
                    from employees
                    where job_id = 'IT_PROG')
and job_id <> 'IT_PROG';

select employee_id, last_name, job_id, salary
from employees
where salary < all
                    (select salary
                    from employees
                    where job_id = 'IT_PROG')
and job_id <> 'IT_PROG';
                






