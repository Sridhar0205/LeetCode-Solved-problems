# Write your MySQL query statement below
SELECT unique_id,name FROM Employees F
LEFT JOIN EmployeeUNI E
ON E.id = F.id;