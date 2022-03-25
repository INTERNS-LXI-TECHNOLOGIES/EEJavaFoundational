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
