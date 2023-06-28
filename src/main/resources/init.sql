CREATE DATABASE Homework_35;

USE Homework_35;

CREATE TABLE products(
id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(50),
price FLOAT,
PRIMARY KEY(id)
);

CREATE TABLE carts(
id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(50),
PRIMARY KEY(id)
);

CREATE TABLE products_carts(
products_id INT NOT NULL ,
carts_id INT NOT NULL,
FOREIGN KEY(products_id) REFERENCES products(id),
FOREIGN KEY(carts_id) REFERENCES carts(id)
);

INSERT INTO products(name,price)
VALUES('coffee',10),
('tea',5),
('hot dog',20),
('cake',15),
('sandwich',15),
('water',2),
('ice tea',8),
('juice',12),
('lemonade',17),
('ice cream',16);

INSERT INTO carts(name)
VALUES('cart1'),
('cart2'),
('cart3');

INSERT INTO products_carts(products_id,carts_id)
VALUES(1,1),
(4,1),
(7,1),
(1,2),
(4,3),
(6,3),
(3,3);


