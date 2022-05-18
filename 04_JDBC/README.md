#Версии
- jdbc_app_1 - реализованно подключение через JDBC API к БД(PostgreSQL), id у всех пользователей на данный момент 1
- jdbc_app_2 - JDBC API заменено на JdbcTemplate;
- jdbc_app_3 - добавлен файл properties
- jdbc_app_4(тестовая версия) - Batch Update
    - Batch Update - снижаем нагрузку на БД,  распараллеливание запросов и упаковка как один пакет
# JDBC
<img width="500" alt="Screen Shot 2022-05-18 at 7 39 36 PM" src="https://user-images.githubusercontent.com/92088165/169096374-aec3d858-2051-493f-af29-7857940cd7ef.png">

```
create table Person (
    id int,
    name varchar,
    age int,
    email varchar
);
insert into person values (1, 'Tom', 18, 'tom@mail.com');
insert into person values (1, 'Bob', 21, 'bob@mail.com');
insert into person values (1, 'Mike', 42, 'mke@mail.com');
insert into person values (1, 'Katy', 14, 'katy@mail.com');
```

