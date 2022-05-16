# ApplicationContext-DependencyInjection
ApplicationContext - это главный интерфейс в Spring-приложении, который предоставляет информацию о конфигурации приложения. Он доступен только для чтения во время выполнения, но может быть перезагружен при необходимости и поддержке приложением. Число классов, реализующих ApplicationContext интерфейс, доступны для различных параметров конфигурации и типов приложений.
Облегчает: 
1. работу с Singleton объектами
2. внедрение зависимостей
3. выстраивание иерархии
4. "Управление жизненным циклом"

Описываем объекты и связи между ними в конфигурационном файле, а создание и внедрение зависимостей на себя берет Spring.

Зависимости:
1. Spring Core - основная зависимость 
2. Spring Beans - создание экземпляров (beans) класса
3. Spring Context - хранилище созданных объектов


ApplicationContext.xml -  https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html

ClassPathXmlApplicationContext - обращается к файлу ApplicationContext.xml считывает и помещает все бины в ApplicationContext.

