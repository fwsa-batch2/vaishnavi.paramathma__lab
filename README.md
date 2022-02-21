# vaishnavi.paramathma__lab
mysql> show databases;
                    
| Database           |
|:------------------:|
| freshworks_academy |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
| united             |

mysql> use united;
mysql> show tables;

| Tables_in_united |
|:----------------:|
| aspirants        |
| blazers          |
| tendots          |
| uSquare          |
| vegetable        |

mysql> desc vegetable;

| Field  | Type        | Null | Key | Default | Extra          |
|:------:|:------------|:-----|:----|:--------|:--------------:|
| id     | tinyint     | NO   | PRI | NULL    | auto_increment |
| name   | varchar(30) | NO   |     | NULL    |                |
| color  | varchar(20) | YES  |     | NULL    |                |
| price  | tinyint     | NO   |     | NULL    |                |
| weight | int         | YES  |     | NULL    |                |


mysql> select * from vegetable;

| id | name         | color  | price | weight |
|:--:|:------------:|:------:|:-----:|:------:|
|  1 | carrot       | orange |    50 |   NULL |
|  2 | beetroot     | red    |    50 |   NULL |
|  3 | lady'sfinger | red    |   100 |   NULL |

mysql> select 3+3;

| 3+3 |
|:---:|
|   6 |


mysql> select 4-3,4*3,4/3,4%2;

| 4-3 | 4*3 | 4/3    | 4%2  |
|:---:|:---:|:------:|:----:|
|   1 |  12 | 1.3333 |    0 |

mysql> use united;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> use uSquare;
ERROR 1049 (42000): Unknown database 'uSquare'
mysql> create table uSquare(id tinyint primary key , fName varchar(20) not null , lName varchar(20) , age check(age>=1));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'check(age>=1))' at line 1
mysql> create table uSquare(id tinyint primary key , fName varchar(20) not null , lName varchar(20) , age tinyint check(age>=1));
ERROR 1050 (42S01): Table 'uSquare' already exists
mysql> create table aspirants(id tinyint primary key , fName varchar(20) not null , lName varchar(20) , age tinyint check(age>=1));
Query OK, 0 rows affected (0.04 sec)

mysql> create table tendots(id tinyint primary key , fName varchar(20) not null , lName varchar(20) , age check(age>=1));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'check(age>=1))' at line 1
mysql> create table tendots(id tinyint primary key , fName varchar(20) not null , lName varchar(20) , age tinyint check(age>=1));
Query OK, 0 rows affected (0.05 sec)

mysql> desc aspirants;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| id    | tinyint     | NO   | PRI | NULL    |       |
| fName | varchar(20) | NO   |     | NULL    |       |
| lName | varchar(20) | YES  |     | NULL    |       |
| age   | tinyint     | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
4 rows in set (0.01 sec)

mysql> desc tendots;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| id    | tinyint     | NO   | PRI | NULL    |       |
| fName | varchar(20) | NO   |     | NULL    |       |
| lName | varchar(20) | YES  |     | NULL    |       |
| age   | tinyint     | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
4 rows in set (0.00 sec)

mysql> show tables;
+------------------+
| Tables_in_united |
+------------------+
| aspirants        |
| blazers          |
| tendots          |
| uSquare          |
+------------------+
4 rows in set (0.01 sec)

mysql> insert into aspirants value(1,"vaishnavi","paramathma",18);
Query OK, 1 row affected (0.01 sec)

mysql> insert into aspirants value(2,"                    

^C
mysql> insert into aspirants value(2,"keerthana","shanmugam",18),(3,"meenu","sowjanya",18),(4,"kasi","antony",18),(5,"suguram","krishna",19);
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> insert into tendots value(1,"poorani","shanmugam",18),(3,"sangeetha","sowjanya",18),(4,"maha","antony",18),(5,"vaishu","krishna",19);
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> select * from aspirants;
+----+-----------+------------+------+
| id | fName     | lName      | age  |
+----+-----------+------------+------+
|  1 | vaishnavi | paramathma |   18 |
|  2 | keerthana | shanmugam  |   18 |
|  3 | meenu     | sowjanya   |   18 |
|  4 | kasi      | antony     |   18 |
|  5 | suguram   | krishna    |   19 |
+----+-----------+------------+------+
5 rows in set (0.01 sec)

mysql> select * from tendots;
+----+-----------+-----------+------+
| id | fName     | lName     | age  |
+----+-----------+-----------+------+
|  1 | poorani   | shanmugam |   18 |
|  3 | sangeetha | sowjanya  |   18 |
|  4 | maha      | antony    |   18 |
|  5 | vaishu    | krishna   |   19 |
+----+-----------+-----------+------+
4 rows in set (0.00 sec)

mysql> delete from aspirants where id=3;
Query OK, 1 row affected (0.01 sec)

mysql> insert into tendots(id ,lName, age) values(6,"ismail",18);
ERROR 1364 (HY000): Field 'fName' doesn't have a default value
mysql> insert into tendots(id ,fName, lName) values(6,"ismail","smile");
Query OK, 1 row affected (0.00 sec)

mysql> select * from tendots;
+----+-----------+-----------+------+
| id | fName     | lName     | age  |
+----+-----------+-----------+------+
|  1 | poorani   | shanmugam |   18 |
|  3 | sangeetha | sowjanya  |   18 |
|  4 | maha      | antony    |   18 |
|  5 | vaishu    | krishna   |   19 |
|  6 | ismail    | smile     | NULL |
+----+-----------+-----------+------+
5 rows in set (0.00 sec)

mysql> select * from aspirants;
+----+-----------+------------+------+
| id | fName     | lName      | age  |
+----+-----------+------------+------+
|  1 | vaishnavi | paramathma |   18 |
|  2 | keerthana | shanmugam  |   18 |
|  4 | kasi      | antony     |   18 |
|  5 | suguram   | krishna    |   19 |
+----+-----------+------------+------+
4 rows in set (0.00 sec)
