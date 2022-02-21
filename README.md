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
|:------:|:------------|:-----|:----|:--------|:---------------|
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
+-----+
| 3+3 |
+-----+
|   6 |
+-----+

mysql> select 4-3,4*3,4/3,4%2;
+-----+-----+--------+------+
| 4-3 | 4*3 | 4/3    | 4%2  |
+-----+-----+--------+------+
|   1 |  12 | 1.3333 |    0 |
+-----+-----+--------+------+
