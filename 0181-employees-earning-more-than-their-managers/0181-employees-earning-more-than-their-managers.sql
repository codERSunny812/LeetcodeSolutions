select 
E.name  as Employee
from
Employee E
inner join 
Employee M
on E.managerId = M.id
where E.salary > M.salary
