CREATE TABLE Employee (
    employee_id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(20),
    hire_date DATE NOT NULL,
    job_title VARCHAR(50) NOT NULL,
    department_id INT NOT NULL,
    salary DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (employee_id),
    FOREIGN KEY (department_id) REFERENCES Department(department_id)
);
CREATE TABLE Department (
    department_id INT NOT NULL AUTO_INCREMENT,
    department_name VARCHAR(50) NOT NULL,
    manager_id INT,
    location VARCHAR(100),
    PRIMARY KEY (department_id)
);
DESC DEPARTMENT;
DESC EMPLOYEE;
INSERT INTO DEPARTMENT
VALUES(1,"finance",12,"tvm");
INSERT INTO DEPARTMENT
VALUES(2,"support",23,"tvm");
INSERT INTO DEPARTMENT
VALUES(3,"smart",32,"bnglr");
INSERT INTO DEPARTMENT
VALUES(4,"HR",32,"bnglr");
INSERT INTO DEPARTMENT
VALUES(5,"HR",32,"bnglr");
SELECT * FROM DEPARTMENT;
INSERT INTO EMPLOYEE
VALUES(4,"SAMyuKTHA","ES","samyuK@gmail.com",9867777127,"10-4-22","Software EngineerI",2,60000);
SELECT * FROM Employee;

SELECT UPPER(first_name) AS EmpName FROM Employee;
 

SELECT COUNT(*) FROM department WHERE department_name = "HR";

SELECT CURRENT_DATE;

CREATE TABLE NEWONE LIKE department;
 INSERT INTO NEWONE SELECT * FROM department;
 SELECT * FROM NEWONE;
 
 SELECT SUBSTRING(first_name,1,4) FROM employee;
 
 SELECT * FROM Employee WHERE Salary BETWEEN '50000' AND '100000';
 
 SELECT * FROM Employee WHERE first_name LIKE 'S%';
 
 SELECT UPPER(first_name) AS EmpName FROM Employee;
 SELECT * FROM EMPLOYEE;

 
 SELECT CONCAT(first_name, ' ', Last_name) AS 'FullName' FROM Employee;
 
 SELECT * FROM Employee ORDER BY Salary DESC LIMIT  N;
 
 
 











