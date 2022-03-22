## paington zoo database

#### Creating Database

mysql> create database paingtonzoo;

mysql> show databases;

| Database           |
|:------------------:|
| academy            |
| freshworks_academy |
| information_schema |
| mysql              |
| paingtonzoo        |
| performance_schema |
| prac_view          |
| subqu              |
| sys                |
| united             |
| usquare_school     |
| vaishnavi          |


mysql> create table staff(stf_id int primary key,name varchar(40) not null,email varchar(40) not null,gender char(1) not null,
ph_no bigint not null,date_of_join date not null,status varchar(20) not null,check(status in ("active","inactive")));


mysql> desc staff;

| Field        | Type        | Null | Key | Default | Extra |
|:------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| stf_id       | int         | NO   | PRI | NULL    |       |
| name         | varchar(40) | NO   |     | NULL    |       |
| email        | varchar(40) | NO   |     | NULL    |       |
| gender       | char(1)     | NO   |     | NULL    |       |
| ph_no        | bigint      | NO   |     | NULL    |       |
| date_of_join | date        | NO   |     | NULL    |       |
| status       | varchar(20) | NO   |     | NULL    |       |

mysql> insert into staff value(1,"vaishnavi","vaishnavi@gmail.com","f",1234567890,"2010-08-22","active");

mysql> insert into staff value(2,"abi","abi@gmail.com","m",2345678901,"2010-08-13","active");

mysql> insert into staff value(3,"vaishali","vaishali@gmail.com","f",3456789012,"2010-08-23","inactive");

mysql> select * from staff;

| stf_id | name      | email               | gender | ph_no      | date_of_join | status   |
|:------:|:---------:|:-------------------:|:------:|:----------:|:------------:|:--------:|
|      1 | vaishnavi | vaishnavi@gmail.com | f      | 1234567890 | 2010-08-22   | active   |
|      2 | abi       | abi@gmail.com       | m      | 2345678901 | 2010-08-13   | active   |
|      3 | vaishali  | vaishali@gmail.com  | f      | 3456789012 | 2010-08-23   | inactive |


mysql> create table zookeepers(id int primary key,staff_id int not null,animal_id int not null,foreign key (staff_id) references staff(stf_id),foreign key(animal_id) references animal_detail(id));


mysql> insert into zookeepers values(1,1,1),(2,2,2);

mysql> desc zookeepers;

| Field     | Type | Null | Key | Default | Extra |
|:---------:|:----:|:----:|:---:|:-------:|:-----:|
| id        | int  | NO   | PRI | NULL    |       |
| staff_id  | int  | NO   | MUL | NULL    |       |
| animal_id | int  | NO   | MUL | NULL    |       |


#### creating adopters table 
mysql> create table adopters(id int primary key, adopter_name varchar(40) not null default "zoo maintanance" ,adopter_email varchar(40) not null default "paingtonzoo@gmail.com",ph_no bigint not null,animal_no int not null,foreign key(animal_no) references animal_detail(id));


mysql> insert into adopters value(1,"poorani","poorani@gmail.com",5678901234,1);

mysql> insert into adopters(id,ph_no,animal_no) value(2,5678901234,2);

mysql> select * from adopters;

| id | adopter_name    | adopter_email         | ph_no      | animal_no |
|:--:|:---------------:|:---------------------:|:----------:|:---------:|
|  1 | poorani         | poorani@gmail.com     | 5678901234 |         1 |
|  2 | zoo maintanance | paingtonzoo@gmail.com | 5678901234 |         2 |



#### create animal detail table

mysql> desc animal_detail;

| Field            | Type        | Null | Key | Default | Extra |
|:----------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| id               | int         | NO   | PRI | NULL    |       |
| catagory_id      | int         | NO   | MUL | NULL    |       |
| animal_name      | varchar(50) | NO   |     | NULL    |       |
| maintaining_fees | int         | NO   | MUL | NULL    |       |
| user_id          | int         | YES  | MUL | NULL    |       |


mysql> select * from animal_detail;

| id | catagory_id | animal_name      | maintaining_fees | user_id |
|:--:|:-----------:|:----------------:|:----------------:|:-------:|
|  1 |           2 | chilean flamingo |           200000 |       2 |
|  2 |           1 | tiger            |          1000000 |       2 |
|  3 |           3 | titan arum       |           100000 |       2 |




mysql> desc bookings;

| Field        | Type | Null | Key | Default | Extra |
|:------------:|:----:|:----:|:---:|:-------:|:-----:|
| id           | int  | NO   | PRI | NULL    |       |
| user_id      | int  | NO   | MUL | NULL    |       |
| booking_date | date | NO   | MUL | NULL    |       |
| count        | int  | NO   |     | NULL    |       |


mysql> insert into bookings value(2,3,"2022-04-01",2);

mysql> select * from bookings;

| id | user_id | booking_date | count |
|:--:|:-------:|:------------:|:-----:|
|  1 |       1 | 2022-04-22   |     3 |
|  2 |       3 | 2022-04-01   |     2 |


#### create catagory table
mysql> desc categories;

| Field | Type        | Null | Key | Default | Extra |
|:-----:|:-----------:|:----:|:---:|:-------:|:-----:|
| id    | int         | NO   | PRI | NULL    |       |
| name  | varchar(40) | NO   | UNI | NULL    |       |


mysql> select * from categories;

| id | name             |
|:--:|:----------------:|
|  1 | animal           |
|  3 | animal and plant |
|  2 | bird             |



#### create donaters table 
mysql> create table donaters(id int primary key, name varchar(40) not null, email varchar(40) not null,
ph_no bigint not null,donated_amount int not null, check (donated_amount >10000));


mysql> desc donaters;

| Field          | Type        | Null | Key | Default | Extra |
|:--------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| id             | int         | NO   | PRI | NULL    |       |
| name           | varchar(40) | NO   |     | NULL    |       |
| email          | varchar(40) | NO   |     | NULL    |       |
| ph_no          | bigint      | NO   |     | NULL    |       |
| donated_amount | int         | NO   |     | NULL    |       |

mysql> insert into donaters values(1,"chitra","chitra@gmail.com",12366938279280,11000),(2,"shyam","shyam@mail.com",78687598749387,11000),
(3,"prassana","prassana@gmail.com",875658735877,11000);

mysql> select * from donaters;

| id | name     | email              | ph_no          | donated_amount |
|:--:|:--------:|:------------------:|:--------------:|:--------------:|
|  1 | chitra   | chitra@gmail.com   | 12366938279280 |          11000 |
|  2 | shyam    | shyam@mail.com     | 78687598749387 |          11000 |
|  3 | prassana | prassana@gmail.com |   875658735877 |          11000 |


#### create feeding time for animals table
mysql> create table feeding_time(id int primary key,animal_no int not null,foreign key(animal_no) references animal_detail(id), feeding_time time not null);

mysql> insert into feeding_time value(1,1,"11:08:33");


mysql> insert into feeding_time value(2,2,"12:08:33");

mysql> insert into feeding_time value(3,3,"14:08:33");

mysql> select * from feeding_time;

| id | animal_no | feeding_time |
|:--:|:---------:|:------------:|
|  1 |         1 | 11:08:33     |
|  2 |         2 | 12:08:33     |
|  3 |         3 | 14:08:33     |


7.role

mysql> create table role(id int primary key, name varchar(30) not null unique);

mysql> insert into role values(1,"admin"),(2,"customer");


mysql> select * from role;

| id | name     |
|:--:|:--------:|
|  1 | admin    |
|  2 | customer |


#### create staff table

mysql> create table staff(stf_id int primary key,name varchar(40) not null,email varchar(40) not null,gender char(1) not null,ph_no bigint not null,date_of_join date not null,status varchar(20) not null,check(status in ("active","inactive")));
Query OK, 0 rows affected (0.05 sec)

mysql> desc staff;

| Field        | Type        | Null | Key | Default | Extra |
|:------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| stf_id       | int         | NO   | PRI | NULL    |       |
| name         | varchar(40) | NO   |     | NULL    |       |
| email        | varchar(40) | NO   |     | NULL    |       |
| gender       | char(1)     | NO   |     | NULL    |       |
| ph_no        | bigint      | NO   |     | NULL    |       |
| date_of_join | date        | NO   |     | NULL    |       |
| status       | varchar(20) | NO   |     | NULL    |       |

mysql> insert into staff value(1,"vaishnavi","vaishnavi@gmail.com","f",1234567890,"2010-08-22","active");

mysql> insert into staff value(2,"abi","abi@gmail.com","m",2345678901,"2010-08-13","active");

mysql> insert into staff value(3,"vaishali","vaishali@gmail.com","f",3456789012,"2010-08-23","inactive");


mysql> select * from staff;

| stf_id | name      | email               | gender | ph_no      | date_of_join | status   |
|:------:|:---------:|:-------------------:|:------:|:----------:|:------------:|:--------:|
|      1 | vaishnavi | vaishnavi@gmail.com | f      | 1234567890 | 2010-08-22   | active   |
|      2 | abi       | abi@gmail.com       | m      | 2345678901 | 2010-08-13   | active   |
|      3 | vaishali  | vaishali@gmail.com  | f      | 3456789012 | 2010-08-23   | inactive |


#### create user table

mysql> desc user;

| Field    | Type        | Null | Key | Default | Extra |
|:--------:|:-----------:|:----:|:---:|:-------:|:-----:|
| id       | int         | NO   | PRI | NULL    |       |
| name     | varchar(40) | NO   | MUL | NULL    |       |
| email    | varchar(40) | NO   |     | NULL    |       |
| DOB      | date        | NO   |     | NULL    |       |
| password | varchar(20) | NO   |     | NULL    |       |

mysql> insert into user values(3,"abi","abi@gmail.com","2001-08-13","abi345"),(4,"rubi","rubi@gmail.com","2010-09-12","rubi345");

mysql> insert into user values(5,"suzi","suzi@gmail.com","2009-05-14","suzi567"),(6,"hema","hema@gmail.com","1989-08-16","hema567");

mysql> select * from user;

| id | name      | email               | DOB        | password     |
|:--:|:---------:|:-------------------:|:----------:|:------------:|
|  1 | vaishu    | vaishu@gmail.com    | 2003-08-22 | vaish123     |
|  2 | vaishnavi | vaishnavi@gmail.com | 2003-08-23 | vaishnavi123 |
|  3 | abi       | abi@gmail.com       | 2001-08-13 | abi345       |
|  4 | rubi      | rubi@gmail.com      | 2010-09-12 | rubi345      |
|  5 | suzi      | suzi@gmail.com      | 2009-05-14 | suzi567      |
|  6 | hema      | hema@gmail.com      | 1989-08-16 | hema567      |


#### create user role table
 create table user_role(id int primary key,user_id int not null,foreign key(user_id) references user(id),role_id int not null,foreign key(role_id) references role(id));

mysql> insert into user_role values(1,1,2),(2,2,1),(3,3,2),(4,4,2),(5,5,2),(6,6,2);

mysql> select * from user_role;
![eer](https://user-images.githubusercontent.com/93571103/159457225-eee081c4-afa9-42e5-9a62-c3f7d5d53831.png)

| id | user_id | role_id |
|:--:|:-------:|:-------:|
|  1 |       1 |       2 |
|  2 |       2 |       1 |
|  3 |       3 |       2 |
|  4 |       4 |       2 |
|  5 |       5 |       2 |
|  6 |       6 |       2 |


#### create zookeeper table
mysql> desc zookeepers;

| Field     | Type | Null | Key | Default | Extra |
|:---------:|:----:|:----:|:---:|:-------:|:-----:|
| id        | int  | NO   | PRI | NULL    |       |
| staff_id  | int  | NO   | MUL | NULL    |       |
| animal_id | int  | NO   | MUL | NULL    |       |


mysql> select * from zookeepers;

| id | staff_id | animal_id |
|:--:|:--------:|:---------:|
|  1 |        1 |         1 |
|  2 |        2 |         2 |


![eer](https://user-images.githubusercontent.com/93571103/159458353-30edea92-ccca-45cc-8c57-bb4d14f03462.png)
