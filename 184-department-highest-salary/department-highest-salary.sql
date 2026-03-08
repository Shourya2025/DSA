# Write your MySQL query statement below
    SELECT D.NAME AS  Department  , E.NAME AS Employee   ,E.SALARY  AS Salary  FROM EMPLOYEE AS E INNER JOIN DEPARTMENT AS D ON E.departmentId  = D.id WHERE (E.departmentId, E.SALARY) IN (
    SELECT departmentId, MAX(SALARY)
    FROM Employee
    GROUP BY departmentId
);