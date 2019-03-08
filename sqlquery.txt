create table students
(
  id number(10) not null,
  name varchar2(50) not null,
  roll_no varchar2(10) not null,
  class varchar2(20) not null,
  gender varchar2(10) not null,
  address varchar2(50) not null,
  phone_number number(10) not null,
  email varchar2(50) not null,
  password varchar2(20) not null,
  constraint pk_student_id primary key(name),
  constraint unique_key unique(id,email,phone_number,roll_no)
  );
  
create sequence students_id_seq
start with 1
increment by 1;

 create table admin
  (
     id varchar2(10) not null,
     name varchar2(50) not null,
     phone_number number(10) not null,
     student_name varchar2(50) not null,
     attendence_status varchar2(10) not null,
     dates date not null,
     constraint pk_admins_name primary key(name),
     constraint uni_key unique(id,phone_number)
     );
  create sequence admins_id_seq
  start with 1
  increment by 1;

 create table adminregister
  (
     id number(10) not null,
     name varchar2(50) not null,
     password varchar2(20) not null,
     dob date not null,
     email varchar2(50) not null,
     phone_number number(10),
     constraint pk_adminregister_name primary key(name),
     constraint uni_key_id_email unique(id,email,phone_number)
     );
  create sequence adminreg_id_seq
  start with 1
  increment by 1;