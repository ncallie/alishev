# Hibernate
- hibernate_app_1 - 
- hibernate_app_2 - hibernate hql
- hibernate_app_3 - Каскадирование (@OneToMany(mappedBy = "owner", cascade = CascadeType.PERSIST)) возможно flush()?

<img width="500" alt="Снимок экрана 2022-05-21 в 14 16 30" src="https://user-images.githubusercontent.com/92088165/169649314-eff85152-de37-460e-ba72-33439f1f9a02.png">


<img width="500" alt="Снимок экрана 2022-05-21 в 14 37 36" src="https://user-images.githubusercontent.com/92088165/169649998-a7ca2280-66e7-4a7f-b0bc-6da558a6a995.png">


```
insert into person(name, age) VALUES ('Tom', 34);
insert into person(name, age) VALUES ('Dom', 24);
insert into person(name, age) VALUES ('Mom', 87);
```

```
insert into item(person_id, item_name) VALUES (1, 'Book');
insert into item(person_id, item_name) VALUES (1, 'AirPods');
insert into item(person_id, item_name) VALUES (2, 'Iphone');
insert into item(person_id, item_name) VALUES (3, 'Kindle');
insert into item(person_id, item_name) VALUES (3, 'TV');
insert into item(person_id, item_name) VALUES (3, 'PlayStation');
```
# Жизненный цикл сущности

<img width="500" alt="Снимок экрана 2022-05-21 в 15 52 32" src="https://user-images.githubusercontent.com/92088165/169652474-bbc99598-678c-4b28-a02c-b055ecc0e271.png">

<img width="500" alt="Снимок экрана 2022-05-21 в 15 52 54" src="https://user-images.githubusercontent.com/92088165/169652475-3cc5cc87-67d9-46c5-868e-40a0e007d282.png">

<img width="500" alt="Снимок экрана 2022-05-21 в 15 53 25" src="https://user-images.githubusercontent.com/92088165/169652479-ddbba7b9-1f69-41da-b03b-7260c26cf682.png">

<img width="500" alt="Снимок экрана 2022-05-21 в 15 53 55" src="https://user-images.githubusercontent.com/92088165/169652483-8b699277-b844-424a-96c0-254b0ee8b85c.png">

<img width="500" alt="Снимок экрана 2022-05-21 в 15 54 13" src="https://user-images.githubusercontent.com/92088165/169652487-cd6f4734-8f79-432a-bd99-401d2dc7bc90.png">

<img width="500" alt="Снимок экрана 2022-05-21 в 15 54 37" src="https://user-images.githubusercontent.com/92088165/169652494-d3f00c9f-7934-485e-b758-29be4456fbfd.png">

## Doc
[Session](https://docs.jboss.org/hibernate/orm/6.0/javadocs/org/hibernate/Session.html#flush())
