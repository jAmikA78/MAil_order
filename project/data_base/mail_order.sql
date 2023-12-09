CREATE DATABASE mail_order;
USE mail_order;

CREATE TABLE Employee (
    ID INT IDENTITY PRIMARY KEY,
    F_name NVARCHAR(20),
    L_name NVARCHAR(20),
    E_ZIP NVARCHAR(20),
    pass_world NVARCHAR(30) NOT NULL CONSTRAINT chk_password CHECK (LEN(pass_world) >= 8 AND pass_world LIKE '%[0-9]%' AND pass_world LIKE '%[A-Z]%')
);

CREATE TABLE Customer (
    ID INT IDENTITY PRIMARY KEY,
    F_name NVARCHAR(20),
    L_name NVARCHAR(20),
    E_ZIP NVARCHAR(20),
    pass_world NVARCHAR(30) NOT NULL CONSTRAINT chk_password1 CHECK (LEN(pass_world) >= 8 AND pass_world LIKE '%[0-9]%' AND pass_world LIKE '%[A-Z]%'),
);

CREATE TABLE or_der (
    Order_num INT IDENTITY PRIMARY KEY,
    Date_of_receipt DATE,
    Ship_date DATE,
    Actual_ship_date DATE,
    time_order TIME,
    customer_id INT FOREIGN KEY REFERENCES Customer(ID),
	employee_id INT FOREIGN KEY REFERENCES Employee(ID)
);

CREATE TRIGGER tr_or_der_ship_date
ON or_der
AFTER INSERT, UPDATE
AS
BEGIN
    UPDATE or_der
    SET Ship_date = DATEADD(day, 2, inserted.Date_of_receipt)
    FROM or_der
    INNER JOIN inserted ON or_der.Order_num = inserted.Order_num;
END;

CREATE TABLE Part(
    Num INT IDENTITY PRIMARY KEY,
    Name NVARCHAR(20),
    Price INT,
    Quantity_in_stock INT
);

CREATE TABLE Part_of_order(
    Ord_ID INT REFERENCES or_der(Order_num),
    Part_ID INT REFERENCES Part(Num),
    Quantity INT
);

CREATE TABLE Adminn(
    username NVARCHAR(30) PRIMARY KEY,
    pass_world NVARCHAR(30) NOT NULL
);

insert into Adminn (username,pass_world) values (123,123);
