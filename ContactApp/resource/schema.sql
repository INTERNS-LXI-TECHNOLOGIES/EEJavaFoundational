create schema lxisoft;
use lxisoft;
CREATE TABLE `contacts` (
  `f_name` tinytext,
  `l_name` tinytext,
  `ph_no` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `sl_no` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`sl_no`),
  UNIQUE KEY `ph_no` (`ph_no`)
);

create table users (username varchar(15) not null primary key,password varchar(15) not null);

create table roles (   role_name varchar(15) not null primary key );

create table users_roles (username varchar(15) not null, role_name varchar(15) not null,   primary key (username, role_name), FOREIGN KEY (username) REFERENCES users (username) ON DELETE CASCADE  ON UPDATE CASCADE, FOREIGN KEY (role_name) REFERENCES roles (role_name) ON DELETE CASCADE ON UPDATE CASCADE );

