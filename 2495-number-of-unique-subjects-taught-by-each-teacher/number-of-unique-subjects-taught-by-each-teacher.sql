# Write your MySQL query statement below
SELECT DISTINCT teacher_id , COUNT( DISTINCT subject_id) AS cnt  FROM TEACHER
GROUP BY TEACHER_ID ;