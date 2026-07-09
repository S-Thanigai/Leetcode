CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      select distinct salary from 
      (select salary,dense_rank() over(order by salary desc) as 'ran' from Employee) t
      where ran=N
  );
END