CREATE DATABASE Homework_35;

USE Homework_35;

CREATE TABLE products(
id INT NOT NULL,
name VARCHAR(50),
price FLOAT,
PRIMARY KEY(id)
);

CREATE TABLE carts(
id INT NOT NULL,
name VARCHAR(50),
product_Id INT,
FOREIGN KEY (product_Id)  REFERENCES products(id),
PRIMARY KEY(id)
);

CREATE TABLE products_carts(
products_id INT NOT NULL ,
carts_id INT NOT NULL,
FOREIGN KEY(products_id) REFERENCES products(id),
FOREIGN KEY(carts_id) REFERENCES carts(id)
);

INSERT INTO products(id,name,price)
VALUES(1,'coffee',10),
(2,'tea',5),
(3,'hot dog',20),
(4,'cake',15),
(5,'sandwich',15),
(6,'water',2),
(7,'ice tea',8),
(8,'juice',12),
(9,'lemonade',17),
(10,'ice cream',16);

INSERT INTO carts(id,name)
VALUES(1,'cart1'),
(2,'cart2'),
(3,'cart3');

INSERT INTO products_carts(products_id,carts_id)
VALUES(1,1),
(4,1),
(7,1),
(1,2),
(4,3),
(6,3),
(3,3);


