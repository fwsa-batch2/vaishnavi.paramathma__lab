# vaishnavi.paramathma__lab
mysql> show databases;
+                    +
| Database           |
|:------------------:|
| freshworks_academy |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
| united             |

6 rows in set (0.00 sec)

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
| vegetable        |
+------------------+
5 rows in set (0.00 sec)

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

mysql> select * from vegetable;
+----+--------------+--------+-------+--------+
| id | name         | color  | price | weight |
+----+--------------+--------+-------+--------+
|  1 | carrot       | orange |    50 |   NULL |
|  2 | beetroot     | red    |    50 |   NULL |
|  3 | lady'sfinger | red    |   100 |   NULL |
+----+--------------+--------+-------+--------+
3 rows in set (0.00 sec)

mysql> select3+3;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'select3+3' at line 1
mysql> selec 3+3;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'selec 3+3' at line 1
mysql> select 3+3;
+-----+
| 3+3 |
+-----+
|   6 |
+-----+
1 row in set (0.00 sec)

mysql> select 4-3,4*3,4/3,4%2;
+-----+-----+--------+------+
| 4-3 | 4*3 | 4/3    | 4%2  |
+-----+-----+--------+------+
|   1 |  12 | 1.3333 |    0 |
+-----+-----+--------+------+
