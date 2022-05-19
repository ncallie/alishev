# DB

One to Many (связь происходит через FK)

<img width="500" alt="Screen Shot 2022-05-19 at 11 58 47 AM" src="https://user-images.githubusercontent.com/92088165/169255312-844ea364-be1c-485d-afc4-d446351c57b1.png">

One to One (дочерняя таблица одновременно PK и FK)

<img width="500" alt="Screen Shot 2022-05-19 at 12 02 55 PM" src="https://user-images.githubusercontent.com/92088165/169256150-8b1fb79f-72d3-476e-9ce7-da27aab0654d.png">

Many to Many (через Join Table (Составной PK - (Fk, FK))

<img width="500" alt="Screen Shot 2022-05-19 at 12 08 42 PM" src="https://user-images.githubusercontent.com/92088165/169257476-f2535d0e-534b-485f-ac93-bc40290e2c0b.png">

Слияние:
- Inner Join ```SELECT * FROM Person JOIN Order ON Person.user_id = Order.user_id;``` (если пара не найдена строка не отоброзится)
- Outer Join. 
- - Left Join ```SELECT * FROM Person LEFT JOIN Order ON Person.user_id = Order.user_id;``` (если пара не найдена, отобразит (null))
- - Right Join ```SELECT * FROM Person RIGHT JOIN Order ON Person.user_id = Order.user_id;``` (сопостовляет с левой таблицей (основа правая))
- Cross Jion ```SELECT * FROM Person CROSS JOIN Order;``` (все возможные сопоставления двух таблиц)
