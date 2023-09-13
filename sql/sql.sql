-- This is Online Banking System Mysql Query

-- Create DataBase Bank

CREATE DATABASE Bank;

--Create Table Account

CREATE TABLE Account (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Account_id VARCHAR(250),
    Customer_id VARCHAR(250),
    Account_Type VARCHAR(250),
    Balance INT,
    Pin VARCHAR(250)
);

-- Create Table Customer

CREATE TABLE Customer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Customer_id VARCHAR(250),
    First_Name VARCHAR(250),
    Last_Name VARCHAR(250),
    Street VARCHAR(250),
    City VARCHAR(250),
    Phone VARCHAR(250),
    Branch VARCHAR(250)
);

--Create Table Branch

CREATE TABLE Branch (
    id INT AUTO_INCREMENT PRIMARY KEY,
    BranchName VARCHAR(250)
);

--Create Table Deposit

CREATE TABLE Deposit (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Account_id VARCHAR(250),
    Customer_id VARCHAR(250),
    Date VARCHAR(250),
    Balance DOUBLE,
    Deposit DOUBLE
);

--Create Table Loan

CREATE TABLE Loan (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Account_No VARCHAR(250),
    Customer_No VARCHAR(250),
    First_Name VARCHAR(250),
    Loan_Type VARCHAR(250),
    Loan_Amount VARCHAR(250),
    Interest_Rate VARCHAR(250),
    EMI VARCHAR(250),
    Duration VARCHAR(250)
);

--Create Table Transfer

CREATE TABLE Transfer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    From_Account VARCHAR(250),
    To_Account VARCHAR(250),
    Amount DOUBLE
);

--Create Table Withdraw

CREATE TABLE Withdraw (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Account_id VARCHAR(250),
    Customer_id VARCHAR(250),
    Date VARCHAR(250),
    Balance DOUBLE,
    Withdraw DOUBLE
);

--Create Table Login

CREATE TABLE Login (
    User_Name VARCHAR(250) PRIMARY KEY,
    Password VARCHAR(250)
);
