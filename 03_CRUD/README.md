# Версии
<img width="300" alt="Screen Shot 2022-05-18 at 4 12 20 PM" src="https://user-images.githubusercontent.com/92088165/169046853-3cfe9a83-ffb9-4dc9-92f2-eee704b1533b.png">

- crud_app_1 - реализован базовый каркас, методы GET (getId, getAll)
- crud_app_2 - реализован метод POST
# CRUD
Приложение которое позволяет добавлять, читать, обновлять и удалять данные(Часто доступ к CRUD приложение осуществялется через Http запрос web-приложеня).
Базовые функции при работе с БД: 
- Create
- Read
- Update
- Delete

Rest - паттерн проектирование web-приложений. Описывает как по протоколу HTTP взаимодействовать с сервером для чтения, добавления, изменения и удаления данных. Описывает ка URL'ы, HTTP методы использовать(но не только это).

DAO - напрямую Model не должна взаиможействовать с БД, все взаимодействие должен осуществлять (инкапсулировать) отдельный класс DAO(Data Access Object).
repository - большая абстракция наж БД.

<img width="500" alt="Screen Shot 2022-05-18 at 4 05 34 PM" src="https://user-images.githubusercontent.com/92088165/169045880-70a593fa-7f84-416f-b91e-66045117810e.png">
<img width="500" alt="Screen Shot 2022-05-18 at 4 08 11 PM" src="https://user-images.githubusercontent.com/92088165/169046027-0c4040a5-481c-475c-9822-bb70c0aaa910.png">

