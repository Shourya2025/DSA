# Write your MySQL query statement below
SELECT ID , MOVIE , description  , RATING FROM CINEMA WHERE MOD(ID, 2) =1  AND description  != 'boring' ORDER BY RATING DESC  ;
 