## paington zoo database

#### Creating Database
```
create database paingtonzoo;
```

```
show databases;
```


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



### creating adopters table 
```
create table adopters(id int primary key, adopter_name varchar(40) not null default "zoo maintanance" ,adopter_email varchar(40) not null default "paingtonzoo@gmail.com",ph_no bigint not null,animal_no int not null,foreign key(animal_no) references animal_detail(id));
```
#### inserting into adopters
```
insert into adopters value(1,"poorani","poorani@gmail.com",5678901234,1);
```

```
insert into adopters(id,ph_no,animal_no) value(2,5678901234,2);
```

```
select * from adopters;
```

| id | adopter_name    | adopter_email         | ph_no      | animal_no |
|:--:|:---------------:|:---------------------:|:----------:|:---------:|
|  1 | poorani         | poorani@gmail.com     | 5678901234 |         1 |
|  2 | zoo maintanance | paingtonzoo@gmail.com | 5678901234 |         2 |



### creating animal detail table
```
desc animal_detail;
```

| Field            | Type        | Null | Key | Default | Extra |
|:----------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| id               | int         | NO   | PRI | NULL    |       |
| catagory_id      | int         | NO   | MUL | NULL    |       |
| animal_name      | varchar(50) | NO   |     | NULL    |       |
| maintaining_fees | int         | NO   | MUL | NULL    |       |
| user_id          | int         | YES  | MUL | NULL    |       |

```
select * from animal_detail;
```

| id | catagory_id | animal_name      | maintaining_fees | user_id |
|:--:|:-----------:|:----------------:|:----------------:|:-------:|
|  1 |           2 | chilean flamingo |           200000 |       2 |
|  2 |           1 | tiger            |          1000000 |       2 |
|  3 |           3 | titan arum       |           100000 |       2 |

### creating booking table 


#### describing bookings
```
desc bookings;
```
| Field        | Type | Null | Key | Default | Extra |
|:------------:|:----:|:----:|:---:|:-------:|:-----:|
| id           | int  | NO   | PRI | NULL    |       |
| user_id      | int  | NO   | MUL | NULL    |       |
| booking_date | date | NO   | MUL | NULL    |       |
| count        | int  | NO   |     | NULL    |       |


#### inserting into bookings
```
insert into bookings value(2,3,"2022-04-01",2);
```

```
select * from bookings;
```
| id | user_id | booking_date | count |
|:--:|:-------:|:------------:|:-----:|
|  1 |       1 | 2022-04-22   |     3 |
|  2 |       3 | 2022-04-01   |     2 |


### create catagory table


#### describing categories table
```
desc categories;
```

| Field | Type        | Null | Key | Default | Extra |
|:-----:|:-----------:|:----:|:---:|:-------:|:-----:|
| id    | int         | NO   | PRI | NULL    |       |
| name  | varchar(40) | NO   | UNI | NULL    |       |

```
select * from categories;
```
| id | name             |
|:--:|:----------------:|
|  1 | animal           |
|  3 | animal and plant |
|  2 | bird             |



### create donaters table 
```
create table donaters(id int primary key, name varchar(40) not null, email varchar(40) not null,
ph_no bigint not null,donated_amount int not null, check (donated_amount >10000));
```

#### describing  donaters
```
 desc donaters;
```
| Field          | Type        | Null | Key | Default | Extra |
|:--------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| id             | int         | NO   | PRI | NULL    |       |
| name           | varchar(40) | NO   |     | NULL    |       |
| email          | varchar(40) | NO   |     | NULL    |       |
| ph_no          | bigint      | NO   |     | NULL    |       |
| donated_amount | int         | NO   |     | NULL    |       |

#### inserting into donaters
```
insert into donaters values(1,"chitra","chitra@gmail.com",12366938279280,11000),(2,"shyam","shyam@mail.com",78687598749387,11000),
(3,"prassana","prassana@gmail.com",875658735877,11000);
````

```
select * from donaters;
```
| id | name     | email              | ph_no          | donated_amount |
|:--:|:--------:|:------------------:|:--------------:|:--------------:|
|  1 | chitra   | chitra@gmail.com   | 12366938279280 |          11000 |
|  2 | shyam    | shyam@mail.com     | 78687598749387 |          11000 |
|  3 | prassana | prassana@gmail.com |   875658735877 |          11000 |


### create feeding time for animals table
```
create table feeding_time(id int primary key,animal_no int not null,foreign key(animal_no) references animal_detail(id), feeding_time time not null);
```

#### inserting into feeding time
```
insert into feeding_time value(1,1,"11:08:33");
```

```
 insert into feeding_time value(2,2,"12:08:33");
```

```
insert into feeding_time value(3,3,"14:08:33");
```

```
select * from feeding_time;
```
| id | animal_no | feeding_time |
|:--:|:---------:|:------------:|
|  1 |         1 | 11:08:33     |
|  2 |         2 | 12:08:33     |
|  3 |         3 | 14:08:33     |


### create table for role
```
create table role(id int primary key, name varchar(30) not null unique);
```

#### inserting into role
```
insert into role values(1,"admin"),(2,"customer");
```

```
select * from role;
```
| id | name     |
|:--:|:--------:|
|  1 | admin    |
|  2 | customer |


### create staff table
```
create table staff(stf_id int primary key,name varchar(40) not null,email varchar(40) not null,gender char(1) not null,ph_no bigint not null,date_of_join date not null,status varchar(20) not null,check(status in ("active","inactive")));
```


#### describing staff
```
desc staff;
```

| Field        | Type        | Null | Key | Default | Extra |
|:------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| stf_id       | int         | NO   | PRI | NULL    |       |
| name         | varchar(40) | NO   |     | NULL    |       |
| email        | varchar(40) | NO   |     | NULL    |       |
| gender       | char(1)     | NO   |     | NULL    |       |
| ph_no        | bigint      | NO   |     | NULL    |       |
| date_of_join | date        | NO   |     | NULL    |       |
| status       | varchar(20) | NO   |     | NULL    |       |

#### inserting into staff
```
insert into staff value(1,"vaishnavi","vaishnavi@gmail.com","f",1234567890,"2010-08-22","active");
```

```
insert into staff value(2,"abi","abi@gmail.com","m",2345678901,"2010-08-13","active");
```

```
insert into staff value(3,"vaishali","vaishali@gmail.com","f",3456789012,"2010-08-23","inactive");
```

```
select * from staff;
```
| stf_id | name      | email               | gender | ph_no      | date_of_join | status   |
|:------:|:---------:|:-------------------:|:------:|:----------:|:------------:|:--------:|
|      1 | vaishnavi | vaishnavi@gmail.com | f      | 1234567890 | 2010-08-22   | active   |
|      2 | abi       | abi@gmail.com       | m      | 2345678901 | 2010-08-13   | active   |
|      3 | vaishali  | vaishali@gmail.com  | f      | 3456789012 | 2010-08-23   | inactive |


### create user table

#### describing user
```
desc user;
```
| Field    | Type        | Null | Key | Default | Extra |
|:--------:|:-----------:|:----:|:---:|:-------:|:-----:|
| id       | int         | NO   | PRI | NULL    |       |
| name     | varchar(40) | NO   | MUL | NULL    |       |
| email    | varchar(40) | NO   |     | NULL    |       |
| DOB      | date        | NO   |     | NULL    |       |
| password | varchar(20) | NO   |     | NULL    |       |


#### inserting into user
```
insert into user values(3,"abi","abi@gmail.com","2001-08-13","abi345"),(4,"rubi","rubi@gmail.com","2010-09-12","rubi345");
```

```
insert into user values(5,"suzi","suzi@gmail.com","2009-05-14","suzi567"),(6,"hema","hema@gmail.com","1989-08-16","hema567");
```

```
select * from user;
```
| id | name      | email               | DOB        | password     |
|:--:|:---------:|:-------------------:|:----------:|:------------:|
|  1 | vaishu    | vaishu@gmail.com    | 2003-08-22 | vaish123     |
|  2 | vaishnavi | vaishnavi@gmail.com | 2003-08-23 | vaishnavi123 |
|  3 | abi       | abi@gmail.com       | 2001-08-13 | abi345       |
|  4 | rubi      | rubi@gmail.com      | 2010-09-12 | rubi345      |
|  5 | suzi      | suzi@gmail.com      | 2009-05-14 | suzi567      |
|  6 | hema      | hema@gmail.com      | 1989-08-16 | hema567      |


### create user role table
```
create table user_role(id int primary key,user_id int not null,foreign key(user_id) references user(id),role_id int not null,foreign key(role_id) references role(id));
```

#### inserting into user role
```
insert into user_role values(1,1,2),(2,2,1),(3,3,2),(4,4,2),(5,5,2),(6,6,2);
```

```
select * from user_role;
```

| id | user_id | role_id |
|:--:|:-------:|:-------:|
|  1 |       1 |       2 |
|  2 |       2 |       1 |
|  3 |       3 |       2 |
|  4 |       4 |       2 |
|  5 |       5 |       2 |
|  6 |       6 |       2 |


### create zookeeper table

#### describing zookeeper
```
desc zookeepers;
```
| Field     | Type | Null | Key | Default | Extra |
|:---------:|:----:|:----:|:---:|:-------:|:-----:|
| id        | int  | NO   | PRI | NULL    |       |
| staff_id  | int  | NO   | MUL | NULL    |       |
| animal_id | int  | NO   | MUL | NULL    |       |
```
select * from zookeepers;
```


| id | staff_id | animal_id |
|:--:|:--------:|:---------:|
|  1 |        1 |         1 |
|  2 |        2 |         2 |

### er diagram
![paington-er](https://user-images.githubusercontent.com/93571103/159882409-f5b54a2f-d531-4b5f-8520-11e523b9db60.png)


### eer diagram

![eer](https://user-images.githubusercontent.com/93571103/159881970-cf2274be-302b-48bc-8924-d5bedaa36da3.png)


