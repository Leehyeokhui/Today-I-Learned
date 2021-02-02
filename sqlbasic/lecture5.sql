create view salvu50
as select employee_id "ID_NUMBER", last_name "NAME", salary*12 "ANN_SALARY"
   from employees
   where department_id = 50;
   
select * from salvu50;

create view dept_sum_vu(name, minsal, maxsal, avgsal)
as select d.department_name, min(e.salary), max(e.salary), round(avg(e.salary),0)
   from employees e, departments d
   where e.department_id = d.department_id
   group by d.department_name;

select * from dept_sum_vu;

select rownum "Rank", last_name, salary
from (select last_name, salary from employees
     order by salary desc)
where rownum <= 3;

create sequence dept_deptid_seq
                increment by 10
                start with 120
                maxvalue 9999
                nocache
                nocycle;

select sequence_name, min_value, max_value, increment_by, last_number
from user_sequences;

--------------pl/sql
set serveroutput on

declare
   vename employees.last_name%type;
   vempno employees.employee_id%type;
   vjob_id employees.job_id%type;
   vdeptname departments.department_name%type;
begin
   select employee_id, last_name, job_id, department_name
   into vempno, vename, vjob_id, vdeptname
   from employees e, departments d
   where e.department_id=d.department_id
   and employee_id=145;
   DBMS_OUTPUT.PUT_LINE('emp no:' ||  vempno);
   DBMS_OUTPUT.PUT_LINE('name:' ||  vename);
   DBMS_OUTPUT.PUT_LINE('job:' ||  vjob_id);
   DBMS_OUTPUT.PUT_LINE('department:' ||  vdeptname);
end;
/

---- if문
declare
   vscore number(3);
begin
   vscore := 50;
   if(vscore>=60)
   then DBMS_OUTPUT.PUT_LINE('합격');
   else DBMS_OUTPUT.PUT_LINE('불합격');
   end if;
   end;
   /

declare
   x number(1);
begin
   x := 3;
   if(x=1)
   then DBMS_OUTPUT.PUT_LINE('하나');
   elsif(x=2) 
   then DBMS_OUTPUT.PUT_LINE('둘');
   elsif(x=3) 
   then DBMS_OUTPUT.PUT_LINE('셋');
   elsif(x=4) 
   then DBMS_OUTPUT.PUT_LINE('넷');
   else
   DBMS_OUTPUT.PUT_LINE('범위 밖의 값');
   end if;
   DBMS_OUTPUT.PUT_LINE('if밖');
   end;
   /

declare
   vscore number(3);
begin
   vscore := 195;
   if(vscore>100 or vscore<0 )
   then DBMS_OUTPUT.PUT_LINE('잘못된 점수');
   elsif(vscore>=90)
   then DBMS_OUTPUT.PUT_LINE('A');
   elsif(vscore>=80) 
   then DBMS_OUTPUT.PUT_LINE('B');
   elsif(vscore>=70) 
   then DBMS_OUTPUT.PUT_LINE('C');
   elsif(vscore>=60) 
   then DBMS_OUTPUT.PUT_LINE('D');
   else
   DBMS_OUTPUT.PUT_LINE('F');
   end if;
   
   end;
   /

declare
   vsalary employees.salary%type;
   vcomm employees.commission_pct%type;
   vann number(15,2);
   venum employees.employee_id%type;
begin
   venum := 145;
   select salary, commission_pct 
   into vsalary, vcomm
   from employees
   where employee_id=venum;
   if(vcomm is null)
   then vann:=vsalary*12;
   else
   vann:=vsalary*12+(vsalary*12*vcomm);
   end if;
   DBMS_OUTPUT.PUT_LINE('연 봉:'||vann);
   end;
   /

--- loop문
declare
     vename employees.last_name%type;
    venum employees.employee_id%type;
begin
     venum:=100;
      loop
         select last_name into vename from employees 
         where employee_id=venum;
         if(vename is not null)
             then DBMS_OUTPUT.PUT_LINE(vename);
         end if;
         venum:=venum+1;
         if(venum>200)
             then exit;
         end if;
     end loop;
        
end;
/

declare
        vemp employees%rowtype; 
        venum employees.employee_id%type;
    begin
            select * into vemp from employees 
            where employee_id=&venum;
            
            DBMS_OUTPUT.PUT_LINE(vemp.employee_id || ' / ' || 
            vemp.last_name || ' / ' ||vemp.job_id);    
            
    end;
    /  
    
declare
        dan number(1);
        x number:=1;
    begin
        dan:=&dan;        
        for x in 1..9 loop
            DBMS_OUTPUT.PUT_LINE(dan || ' * ' || x || ' = ' || dan*x);
        end loop; 
    end;
    /  

declare
    type ename_arr is table of employees.last_name%type
    index by binary_integer;
    type job_arr is table of employees.job_id%type
    index by binary_integer;
    
    names ename_arr;
    jobs job_arr;
    
    i binary_integer:=0;
    
begin
    for k in(select last_name, job_id from employees) loop
        i:=i+1;
        names(i):=k.last_name;
        jobs(i):=k.job_id;
    end loop;
    
    for j in 1..i loop
        DBMS_OUTPUT.PUT_LINE(names(j) || ' / ' || jobs(j));
    end loop;
end;
/

--- record 타입
declare
    type emp_record is record(
    vnum employees.employee_id%type,
    vname employees.last_name%type,
    vsalary employees.salary%type,
    vjob employees.job_id%type);
    
    vemp_rec emp_record;
begin
    select employee_id, last_name, salary, job_id
    into vemp_rec 
    from employees
    where employee_id=100;
    DBMS_OUTPUT.PUT_LINE(vemp_rec.vnum || ' / ' || 
    vemp_rec.vsalary || ' / ' || vemp_rec.vjob || ' / ' || 
    vemp_rec.vname);
end;
/

declare
    type emp_arr is table of employees%rowtype
    index by binary_integer;   
    vemp emp_arr;  
    i binary_integer:=0;

begin
    for k in(select * from employees) loop
        i:=i+1;
        vemp(i):=k;
    end loop;
    
    for j in 1..i loop
        DBMS_OUTPUT.PUT_LINE(vemp(j).last_name || ' / ' ||vemp(j).job_id);
    end loop;
end;
/