-- https://www.hackerrank.com/challenges/occupations/problem

-- ORACLE SOLUTION

select d,p,s,a from 
(
  select Name,Occupation,(row_number() over(partition by Occupation order by Name)) as rn
  from Occupations
) 
pivot 
( 
  max(Name) for Occupation in ('Doctor' as d,'Professor' as p,'Singer' as s,'Actor' as a)  
)
order by rn;