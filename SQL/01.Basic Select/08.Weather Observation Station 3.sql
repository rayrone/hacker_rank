-- https://www.hackerrank.com/challenges/weather-observation-station-3/problem
-- ORACLE SOLUTION

SELECT DISTINCT CITY FROM STATION WHERE MOD(ID, 2) = 0;
