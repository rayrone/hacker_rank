-- https://www.hackerrank.com/challenges/weather-observation-station-4/problem
-- ORACLE SOLUTION

SELECT COUNT(CITY) - COUNT(DISTINCT CITY) FROM STATION;
