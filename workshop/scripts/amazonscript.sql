-- This is a comment. SQL comments start with '--' and are ignored by the database.

-- Create a new database if it doesn't exist
CREATE DATABASE IF NOT EXISTS amazon;

-- Use the newly created database
USE amazon;

-- Create a table named 'users'
CREATE TABLE IF NOT EXISTS company (
    company_id INT AUTO_INCREMENT PRIMARY KEY,
    company_name VARCHAR(100) NOT NULL,
    industry VARCHAR(100) NOT NULL,
    employee_count VARCHAR(100) NOT NULL,
	founded_date VARCHAR(100) NOT NULL,
	revenue VARCHAR(100) NOT NULL,
	location VARCHAR(100) NOT NULL,
	ceo_name VARCHAR(100) NOT NULL,
	phone_number VARCHAR(100) NOT NULL,
	stock_symbol VARCHAR(100) NOT NULL ,
	customer_count VARCHAR(100) NOT NULL,
	is_deleted BOOLEAN DEFAULT FALSE
);
CREATE TABLE IF NOT EXISTS employees( name VARCHAR(50) PRIMARY KEY,employee_data LONG BLOB);
CREATE TABLE IF NOT EXISTS products (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(255),
    product_category VARCHAR(255),
    product_price VARCHAR(50),
    product_brand VARCHAR(255),
    product_manufacturer VARCHAR(255),
    product_release_date VARCHAR(50),
    product_availability VARCHAR(50)
);

-- Add an index on the 'email' column for faster lookups

