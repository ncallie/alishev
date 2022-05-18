## Версии
- MVC_App_1 - конфигурация с помощью web.xml. Добавлен maping /hello-world.
- MVC_App_2 - конфигурация с помощью jav-code(SpringConfig + DispatcherServlet)
- MVC_App_3 - добавленно несколько GetMapping и RequestMapping

Стек:
1. Spring MVC
2. Tomcat ver.9

# MVC
MVC(Model-View-Controller)

<img width="500" alt="Screen Shot 2022-05-18 at 11 53 10 AM" src="https://user-images.githubusercontent.com/92088165/168999257-1f73fa44-b229-46da-bd9b-7fd081c18913.png">

Клиент через браузер отправляет http запрос, принимаем его на controller, после controller через Model общается с БД и полученные данные отображает View

1. Model - логика работы с данными БД (отдает контроллеру данные)
2. View - логика представления, интерфейс (HTML страницы, JS, CSS) (Thymeleaf)
3. Controller - логика навигации, обработка запросов (Обрабатывает запросы от пользователя, обменивается данными с моделью, показывает правильные представления и др)

DispatcherServlet - входная точка в приложение. (отправляет http запрос на правильный контроллер)

Маппинги: (что хочет сделать клиент?)
@RequestMapping(префикс) - все методы в контроллере имели префикс.

1. @GetMapping - get-запросы (@RequestMapping(method=RequestMethod.GET)) (идемпотентный) (но можно помещать параметры после ?key=value&kay=value)
2. @PostMapping - post-запросы 
3. @PutMapping
4. @DeleteMapping
5. @PatchMapping

# HTTP
<img width="500" alt="Screen Shot 2022-05-18 at 1 51 47 PM" src="https://user-images.githubusercontent.com/92088165/169022644-80e0cf0d-753d-4ca6-8a87-eeeb40e97a82.png">
<img width="500" alt="Screen Shot 2022-05-18 at 1 53 36 PM" src="https://user-images.githubusercontent.com/92088165/169022905-b352180d-2348-4653-9fd4-3094ce09f609.png">




