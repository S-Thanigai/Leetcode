WITH temp AS (
    SELECT player_id, MIN(event_date) AS first_login_date
    FROM Activity 
    GROUP BY player_id
)
select round(
    sum(Datediff(a.event_date,t.first_login_date)=1) / count(distinct a.player_id),2) as fraction
    from Activity a join temp t on a.player_id = t.player_id;