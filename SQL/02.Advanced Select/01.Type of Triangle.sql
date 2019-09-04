-- https://www.hackerrank.com/challenges/what-type-of-triangle/problem

-- ORACLE SOLUTION

SELECT 
    CASE
        WHEN (A + B <= C) OR (A + C <= B) OR (B + C <= A) THEN 'Not A Triangle'
        ELSE 
            CASE
                WHEN A = B AND B = C THEN 'Equilateral'
                WHEN A = B OR A = C OR B = C THEN 'Isosceles'
                ELSE 'Scalene' 
            END
    END
FROM TRIANGLES;
