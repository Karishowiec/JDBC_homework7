SELECT c.name,project_count from client c
join (
 SELECT CLIENT_ID, count(*) as project_count
 from project
 group by CLIENT_ID
 ) pc on c.id = pc.CLIENT_ID
 WHERE pc.project_count = (
 SELECT MAX(project_count)
 From (
 SELECT CLIENT_ID, COUNT(*) AS project_count
 From project
 group by client_id
 )max_pc
 );