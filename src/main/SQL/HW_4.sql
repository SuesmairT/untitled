--1. Вывести данные о товарах (проекция: название товара, цена, название категории, названиекомпаниипоставщика)
SELECT
ProductName,
Price,
CategoryName,
SupplierName
FROM ProductsSELECT *
ProductName,
Price AS Price USD
FROM Orders
JOIN Customers ON Orders.CustomerID = Customers.CustomerID
JOIN OrderDetails ON Orders.OrderDetailID = Customers.OrderDetailID
JOIN Products ON
JOIN Categories ON Products.CategoryID = Categories.CategoryID
JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID


--2. Вывести заказы клиентов не из France  (номерзаказа, имяклиента, страна_клиента)
SELECT
Orders.OrderID,
Customers.CustomerName,
Customers.Country
FROM Orders
JOIN Customers ON Orders.CustomerID = Customers.CustomerID
WHERE
NOT Customers.Country = 'France'



--3. Вывести название и стоимость в USD одного самого дорогого проданного товара

SELECT
Products.ProductName,
Products.Price AS Price_USD
FROM Orders
JOIN Customers ON Orders.CustomerID = Customers.CustomerID
JOIN OrderDetails ON Orders.OrderID = OrderDetails.OrderID
JOIN Products ON OrderDetails.ProductID = Products.ProductID
ORDER BY Price DESC
LIMIT 1 OFFSET 1


--4. Вывести список стран, которые поставляют морепродукты
SELECT
Suppliers.Country
FROM Categories
JOIN Products ON Categories.CategoryID = Products.CategoryID
JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
WHERE Categories.Description='Seaweed and fish'


--5. Вывести два самых дорогих товара из категории Beverages из USA
SELECT *
FROM Products
JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
JOIN Categories ON Products.CategoryID = Categories.CategoryID
WHERE CategoryName='Beverages'
AND Country='USA'
ORDER BY Price DESC
LIMIT 2