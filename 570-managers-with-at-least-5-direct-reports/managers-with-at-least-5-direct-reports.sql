# Write your MySQL query statement below
SELECT e.name FROM Employee e
JOIN Employee b
ON e.id=b.managerID
GROUP BY b.managerID
HAVING COUNT(*)>=5;