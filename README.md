# vaishnavi.paramathma__lab
``` show databases;```
                    
| Database           |
|:------------------:|
| freshworks_academy |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
| united             |

``` use united;```
``` show tables;```

| Tables_in_united |
|:----------------:|
| aspirants        |
| blazers          |
| tendots          |
| uSquare          |
| vegetable        |

 ```desc vegetable;```

| Field  | Type        | Null | Key | Default | Extra          |
|:------:|:------------|:-----|:----|:--------|:--------------:|
| id     | tinyint     | NO   | PRI | NULL    | auto_increment |
| name   | varchar(30) | NO   |     | NULL    |                |
| color  | varchar(20) | YES  |     | NULL    |                |
| price  | tinyint     | NO   |     | NULL    |                |
| weight | int         | YES  |     | NULL    |                |


``` select * from vegetable;```

| id | name         | color  | price | weight |
|:--:|:------------:|:------:|:-----:|:------:|
|  1 | carrot       | orange |    50 |   NULL |
|  2 | beetroot     | red    |    50 |   NULL |
|  3 | lady'sfinger | red    |   100 |   NULL |

``` select 3+3;```

| 3+3 |
|:---:|
|   6 |


``` select 4-3,4*3,4/3,4%2;```

| 4-3 | 4*3 | 4/3    | 4%2  |
|:---:|:---:|:------:|:----:|
|   1 |  12 | 1.3333 |    0 |

 ```use united;```

 ```use uSquare;```

``` create table aspirants(id tinyint primary key , fName varchar(20) not null , lName varchar(20) , age tinyint check(age>=1));```


 ```create table tendots(id tinyint primary key , fName varchar(20) not null , lName varchar(20) , age check(age>=1));```

 ```create table tendots(id tinyint primary key , fName varchar(20) not null , lName varchar(20) , age tinyint check(age>=1));```

 ```desc aspirants;```

| Field | Type        | Null | Key | Default | Extra |
|:-----:|:-----------:|:----:|:---:|:-------:|:-----:|
| id    | tinyint     | NO   | PRI | NULL    |       |
| fName | varchar(20) | NO   |     | NULL    |       |
| lName | varchar(20) | YES  |     | NULL    |       |
| age   | tinyint     | YES  |     | NULL    |       |

``` desc tendots;```

| Field | Type        | Null | Key | Default | Extra |
|:-----:|:-----------:|:----:|:---:|:-------:|:-----:|
| id    | tinyint     | NO   | PRI | NULL    |       |
| fName | varchar(20) | NO   |     | NULL    |       |
| lName | varchar(20) | YES  |     | NULL    |       |
| age   | tinyint     | YES  |     | NULL    |       |


```show tables;```

| Tables_in_united |
|:----------------:|
| aspirants        |
| blazers          |
| tendots          |
| uSquare          |

``` insert into aspirants value(1,"vaishnavi","paramathma",18); ```                   

``` insert into aspirants value(2,"keerthana","shanmugam",18),(3,"meenu","sowjanya",18),(4,"kasi","antony",18),(5,"suguram","krishna",19);```


``` insert into tendots value(1,"poorani","shanmugam",18),(3,"sangeetha","sowjanya",18),(4,"maha","antony",18),(5,"vaishu","krishna",19);```

``` select * from aspirants;```

| id | fName     | lName      | age  |
|:--:|:---------:|:----------:|:----:|
|  1 | vaishnavi | paramathma |   18 |
|  2 | keerthana | shanmugam  |   18 |
|  3 | meenu     | sowjanya   |   18 |
|  4 | kasi      | antony     |   18 |
|  5 | suguram   | krishna    |   19 |



``` select * from tendots;```

| id | fName     | lName     | age  |
|:--:|:---------:|:---------:|:----:|
|  1 | poorani   | shanmugam |   18 |
|  3 | sangeetha | sowjanya  |   18 |
|  4 | maha      | antony    |   18 |
|  5 | vaishu    | krishna   |   19 |


``` delete from aspirants where id=3;```

``` insert into tendots(id ,fName, lName) values(6,"ismail","smile");```

``` select * from tendots;```

| id | fName     | lName     | age  |
|:--:|:---------:|:---------:|:----:|
|  1 | poorani   | shanmugam |   18 |
|  3 | sangeetha | sowjanya  |   18 |
|  4 | maha      | antony    |   18 |
|  5 | vaishu    | krishna   |   19 |
|  6 | ismail    | smile     | NULL |

``` select * from aspirants;```

| id | fName     | lName      | age  |
|:--:|:---------:|:----------:|:----:|
|  1 | vaishnavi | paramathma |   18 |
|  2 | keerthana | shanmugam  |   18 |
|  4 | kasi      | antony     |   18 |
|  5 | suguram   | krishna    |   19 |

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| freshworks_academy |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
| united             |
+--------------------+
6 rows in set (0.02 sec)

mysql> use united;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;
+------------------+
| Tables_in_united |
+------------------+
| aspirants        |
| blazers          |
| tendots          |
| uSquare          |
+------------------+
4 rows in set (0.00 sec)

mysql> create table vegetable(id tinyint primary key auto_increment ,name varchar(30)not null ,color varchar(20),price tinyint (10) not null);
Query OK, 0 rows affected, 1 warning (0.05 sec)

mysql> desc vegetable;
+-------+-------------+------+-----+---------+----------------+
| Field | Type        | Null | Key | Default | Extra          |
+-------+-------------+------+-----+---------+----------------+
| id    | tinyint     | NO   | PRI | NULL    | auto_increment |
| name  | varchar(30) | NO   |     | NULL    |                |
| color | varchar(20) | YES  |     | NULL    |                |
| price | tinyint     | NO   |     | NULL    |                |
+-------+-------------+------+-----+---------+----------------+
4 rows in set (0.01 sec)

mysql> insert into vegetable(name,color,price) values("carrot","orange",50),("beetroot","red",50),("tomato
","red",100);
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> select * from vegetable;
+----+----------+--------+-------+
| id | name     | color  | price |
+----+----------+--------+-------+
|  1 | carrot   | orange |    50 |
|  2 | beetroot | red    |    50 |
|  3 | tomato   | red    |   100 |
+----+----------+--------+-------+
3 rows in set (0.00 sec)

mysql> select max(price) from vegetable;
+------------+
| max(price) |
+------------+
|        100 |
+------------+
1 row in set (0.00 sec)

mysql> select min(price) from vegetable;
+------------+
| min(price) |
+------------+
|         50 |
+------------+
1 row in set (0.00 sec)

mysql> select sum(price) from vegetable;
+------------+
| sum(price) |
+------------+
|        200 |
+------------+
1 row in set (0.00 sec)

mysql> select avg(salary) from vegetable;
ERROR 1054 (42S22): Unknown column 'salary' in 'field list'
mysql> select avg(price) from vegetable;
+------------+
| avg(price) |
+------------+
|    66.6667 |
+------------+
1 row in set (0.00 sec)

mysql> select count(price)from vegetable;
+--------------+
| count(price) |
+--------------+
|            3 |
+--------------+
1 row in set (0.00 sec)

mysql> select * from vegetable where name='tomato';
+----+--------+-------+-------+
| id | name   | color | price |
+----+--------+-------+-------+
|  3 | tomato | red   |   100 |
+----+--------+-------+-------+
1 row in set (0.00 sec)

mysql> select * from vegetable where name like "bet%";
Empty set (0.00 sec)

mysql> select * from vegetable where name like "beet%";
+----+----------+-------+-------+
| id | name     | color | price |
+----+----------+-------+-------+
|  2 | beetroot | red   |    50 |
+----+----------+-------+-------+
1 row in set (0.00 sec)

mysql> select * from vegetable where name like "%root%";
+----+----------+-------+-------+
| id | name     | color | price |
+----+----------+-------+-------+
|  2 | beetroot | red   |    50 |
+----+----------+-------+-------+
1 row in set (0.00 sec)

mysql> select * from vegetable where price<=50;
+----+----------+--------+-------+
| id | name     | color  | price |
+----+----------+--------+-------+
|  1 | carrot   | orange |    50 |
|  2 | beetroot | red    |    50 |
+----+----------+--------+-------+
2 rows in set (0.00 sec)

mysql> update veetable set name='potato' where id = 3;
ERROR 1146 (42S02): Table 'united.veetable' doesn't exist
mysql> update veetable set name=potato where id = 3;
ERROR 1146 (42S02): Table 'united.veetable' doesn't exist
mysql> update vegetable set name=potato where id = 3;
ERROR 1054 (42S22): Unknown column 'potato' in 'field list'
mysql> select * from vegetable where price<=50;
+----+----------+--------+-------+
| id | name     | color  | price |
+----+----------+--------+-------+
|  1 | carrot   | orange |    50 |
|  2 | beetroot | red    |    50 |
+----+----------+--------+-------+
2 rows in set (0.00 sec)

mysql> update vegetable set name="lady'sfinger" where id=3;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select* from vegetables;
ERROR 1146 (42S02): Table 'united.vegetables' doesn't exist
mysql> select* from vegetable;
+----+--------------+--------+-------+
| id | name         | color  | price |
+----+--------------+--------+-------+
|  1 | carrot       | orange |    50 |
|  2 | beetroot     | red    |    50 |
|  3 | lady'sfinger | red    |   100 |
+----+--------------+--------+-------+
3 rows in set (0.00 sec)

mysql> alter table vegetable add column weight int ;
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc table;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 1
mysql> desc vegetable;
+--------+-------------+------+-----+---------+----------------+
| Field  | Type        | Null | Key | Default | Extra          |
+--------+-------------+------+-----+---------+----------------+
| id     | tinyint     | NO   | PRI | NULL    | auto_increment |
| name   | varchar(30) | NO   |     | NULL    |                |
| color  | varchar(20) | YES  |     | NULL    |                |
| price  | tinyint     | NO   |     | NULL    |                |
| weight | int         | YES  |     | NULL    |                |
+--------+-------------+------+-----+---------+----------------+
5 rows in set (0.00 sec)

mysql> 
