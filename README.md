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

