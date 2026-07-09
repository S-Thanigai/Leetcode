with tab as
(
    select d.name as Department,
    e.name as Employee,
    e.salary as Salary,
    dense_rank() over(partition by e.departmentId order by e.salary desc) as rk
    from Employee e join Department d on e.departmentId = d.id
)
select Department,Employee,Salary from tab
where rk<=3;