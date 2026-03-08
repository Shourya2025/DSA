# Write your MySQL query statement below
SELECT USER_ID AS user_id  , MAX(TIME_STAMP) AS last_stamp  FROM LOGINS WHERE TIME_STAMP >= '2020-01-01'AND  time_stamp <'2021-00-00' GROUP BY user_id  ;