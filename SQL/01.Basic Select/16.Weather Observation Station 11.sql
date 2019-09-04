-- https://www.hackerrank.com/challenges/weather-observation-station-11/problem

-- ORACLE SOLUTION

SELECT DISTINCT CITY FROM STATION WHERE NOT REGEXP_LIKE(CITY, '^[AEIOU]+(.)+[AEIOU]$', 'i');

-- MS SQL Server SOLUTION

SELECT DISTINCT CITY FROM STATION WHERE CITY NOT LIKE '[aeiouAEIOU]%[aeiouAEIOU]';
