--Select
--ANSII
Select ContactName Adi, CompanyName SirketAdi, City Sehir from Customers

Select * from Customers where City = 'Berlin'

--case insensitive
sElEcT * from Products where CategoryID = 1 or CategoryID=3

sElEcT * from Products where CategoryID = 1 and UnitPrice>=10

select * from Products where CategoryID = 1 order by UnitPrice desc		--ascending	--descending

select count(*) from Products where CategoryID = 2

select count(*) Adet from Products

select categoryID, count(*) from Products group by CategoryID

select categoryID, count(*) from Products where UnitPrice>20 group by CategoryID having count(*)<10

select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID

select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice > 10

--DTO - Data Transformation Object

select * from Products p left join [Order Details] od
on p.ProductID = od.ProductID

select * from Customers c inner join Orders o
on c.CustomerID = o.CustomerID

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null

select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID

--SELECT - extracts data from a database
--UPDATE - updates data in a database
--DELETE - deletes data from a database
--INSERT INTO - inserts new data into a database
--CREATE DATABASE - creates a new database
--ALTER DATABASE - modifies a database
--CREATE TABLE - creates a new table
--ALTER TABLE - modifies a table
--DROP TABLE - deletes a table
--CREATE INDEX - creates an index (search key)
--DROP INDEX - deletes an index

--The SELECT DISTINCT statement is used to return only distinct (different) values.
--The WHERE clause is used to filter records.
--The WHERE Operators:
--	BETWEEN	Between a certain range	
--	LIKE	Search for a pattern	
--	IN	To specify multiple possible values for a column
--