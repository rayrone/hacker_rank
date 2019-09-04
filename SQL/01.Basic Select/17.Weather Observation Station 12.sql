-- https://www.hackerrank.com/challenges/weather-observation-station-12/problem

-- ORACLE SOLUTION

SELECT DISTINCT CITY FROM STATION WHERE NOT REGEXP_LIKE(CITY, '^[AEIOU]', 'i') AND NOT REGEXP_LIKE(CITY, '[AEIOU]$', 'i');

-- MS SQL Server SOLUTION

SELECT DISTINCT CITY FROM STATION WHERE CITY NOT LIKE '[aeiouAEIOU]%' AND CITY NOT LIKE '%[aeiouAEIOU]';
