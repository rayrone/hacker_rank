-- https://www.hackerrank.com/challenges/weather-observation-station-9/problem

-- ORACLE SOLUTION

SELECT DISTINCT CITY FROM STATION WHERE NOT REGEXP_LIKE(CITY, '^[AEIOU]', 'i');

-- MS SQL Server SOLUTION

SELECT DISTINCT CITY FROM STATION WHERE CITY NOT LIKE '[aeiouAEIOU]%';
