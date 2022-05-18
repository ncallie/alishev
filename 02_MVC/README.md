# MVC

MVC(Model-View-Controller)

<img width="531" alt="Screen Shot 2022-05-18 at 11 53 10 AM" src="https://user-images.githubusercontent.com/92088165/168999257-1f73fa44-b229-46da-bd9b-7fd081c18913.png">

Клиент через браузер отправляет http запрос, принимаем его на controller, после controller через Model общается с БД и полученные данные отображает View

1. Model - логика работы с данными БД (отдает контроллеру данные)
2. View - логика представления, интерфейс (HTML страницы, JS, CSS) (Thymeleaf)
3. Controller - логика навигации, обработка запросов (Обрабатывает запросы от пользователя, обменивается данными с моделью, показывает правильные представления и др)

DispatcherServlet - входная точка в приложение. (отправляет http запрос на правильный контроллер)

MVC_App_1 - конфигурация с помощью web.xml. Добавлен maping /hello-world.
<br>Стек:
Spring MVC (web.xml + appContextMVC.xml)
Tomcat ver.9
