Ver1 - внедрили бины с помощью ApplicationContextXML, реализовав IoC(интерфейс + принимающий его класс)

Ver2 - принимающий класс тоже бин,принимающий ссылку на другой бин (через конструктор)

Ver3 - принимающий класс тоже бин,принимающий ссылку на другой бин (через setter), приватные поля инициализируются с помощью сетеров вызванных из XML. Добавлен файл properties. Добавлен list заполняющийся через XML.





[1](https://www.baeldung.com/spring-dependency-injection#:~:text=Dependency%20Injection%20is%20a%20fundamental,managing%20components%20onto%20the%20container.)
[2](http://spring-projects.ru/guides/lessons/lesson-2/)
[3](https://habr.com/ru/post/455794/)
