CREATE TABLE Students(name VARCHAR2(20),roll_no VARCHAR2(10),class varchar2(10),address varchar2(30));
INSERT INTO students VALUES('Ajay',1,'12th','Tirupur');
INSERT INTO students VALUES('Arvind',3,'12th','Coimbatore');
INSERT INTO students VALUES('Naveen',12,'11th','Coimbatore');
TRUNCATE TABLE students;
ALTER TABLE students ADD gender varchar2(10);
DROP TABLE students;
CREATE TABLE Students(name VARCHAR2(20),roll_no VARCHAR2(10),class varchar2(10),gender varchar2(10),address varchar2(30));
INSERT INTO students VALUES('Ajay',1,'12th','Male','Tirupur',9655701174,'ajay@gmail.com','aj1');
INSERT INTO students VALUES('Arvind',3,'12th','Male','Coimbatore',9999999999,'arvind@gmail.com','ar2');
INSERT INTO students VALUES('Naveen',12,'11th','Male','Coimbatore',9898989898,'naveen@gmail.com','na3');
SELECT * FROM Students;
DELETE FROM students where name = 'Naveen';
INSERT INTO students VALUES('Narayanan',24,'10th','Male','Thirunelveli',9000000000,'narayanan@gmail.com','nr4');
INSERT INTO students VALUES('Hariharan',39,'8th','Male','Pollachi',9659264266,'hariharan@gmail.com','harisp');
ALTER TABLE students ADD (phoneno number(10),email varchar2(20),password varchar2(10));
CREATE TABLE login(name varchar2(20),phoneno number(10),password varchar2(10));
DROP TABLE login;
INSERT INTO login values('Ajay',9655701174,'aj1');
INSERT INTO login VALUES('Arvind',9999999999,'ar2');
INSERT INTO login VALUES('Naveen',9898989898,'na3');
INSERT INTO login VALUES('Narayanan',9000000000,'nr4');
INSERT INTO login VALUES('Hariharan',9659264266,'harisp');
SELECT * FROM login;
DELETE FROM students where address = "ooty";
DELETE FROM students where password = 'dfgs';
SELECT * FROM students;
delete from students where roll_no=345;
select * from admins;
desc students;

CREATE TABLE admins(admin_id number(5),admin_name varchar2(10),admin_phoneno number(10),student_name varchar2(20),attendence_status varchar2(10));

INSERT INTO admins values(101,'Ajay',7092065844,'Narayanan','Present','28-02-2019');
SELECT * FROM admins;
desc admins;
ALTER TABLE admins ADD dates DATE;
TRUNCATE TABLE admins;

CREATE TABLE adminregister(id number(5),name varchar2(20),password varchar2(20),dob date,email varchar2(20),phoneno number(10));
DROP TABLE adminregister;
INSERT INTO adminregister values(101,'ajay','ajay123','26-01-1998','ajay@gmail.com',9655701174);
SELECT * FROM adminregister;
INSERT INTO admins values(101,'Ajay',9655701174,'mahi','Present','04-03-2019');
SELECT * FROM Students;
commit;
commit;