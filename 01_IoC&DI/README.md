## Версии

Ver1 - внедрили бины с помощью ApplicationContextXML, реализовав IoC(интерфейс + принимающий его класс)

Ver2 - принимающий класс тоже бин,принимающий ссылку на другой бин (через конструктор)

Ver3 - принимающий класс тоже бин,принимающий ссылку на другой бин (через setter), приватные поля инициализируются с помощью сетеров вызванных из XML. Добавлен файл properties. Добавлен list заполняющийся через XML.

Ver4 - добавлен scope, init-method, destroy-method

Ver5 - добавлен factory-method [FactoryMethod](https://github.com/ncallie/Other/tree/main/FactoryMethod)

Ver6 - конфигурация с помощью аннотаций(Component, Autowired, Qualifier, Value, Scope, PustConstruct, PreDestroy)

Ver7 - конфигурация с помощью java-code(без xml), добавленные аннотации(Configuration, ComponentScan, PropertySource, Bean)

# IoC&DI
IoC — это принцип разработки программного обеспечения, который передает управление объектами или частями программы контейнеру или фреймворку. Чаще всего мы используем его в контексте объектно-ориентированного программирования.

DI — это шаблон, который мы можем использовать для реализации IoC, где инвертируемый элемент управления устанавливает зависимости объекта.

Полезные материалы:
[1](https://www.baeldung.com/spring-dependency-injection#:~:text=Dependency%20Injection%20is%20a%20fundamental,managing%20components%20onto%20the%20container.)
[2](http://spring-projects.ru/guides/lessons/lesson-2/)
[3](https://habr.com/ru/post/455794/)
