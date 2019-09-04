-- https://www.hackerrank.com/challenges/weather-observation-station-6/problem

-- ORACLE SOLUTION

SELECT DISTINCT CITY FROM STATION WHERE REGEXP_LIKE(CITY, '^[AEIOU]', 'i');

-- MS SQL Server SOLUTION

SELECT DISTINCT CITY FROM STATION WHERE CITY LIKE '[aeiouAEIOU]%';
