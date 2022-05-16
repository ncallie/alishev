# ApplicationContext
```ApplicationContext```(контейнер) - это главный интерфейс в Spring-приложении, который предоставляет информацию о конфигурации приложения. Он доступен только для чтения во время выполнения, но может быть перезагружен при необходимости и поддержке приложением. Число классов, реализующих ApplicationContext интерфейс, доступны для различных параметров конфигурации и типов приложений.

```Bean -компонент``` — это объект, который создается, собирается и управляется контейнером Spring. Определяются в основном для объектов сервисного уровня, объектов доступа к данным(DAO), объектов представления, объектов инфраструктуры, таких как Hibernate и др.

Зависимости:
1. Spring Core - основная зависимость 
2. Spring Beans - создание экземпляров (beans) класса
3. Spring Context - хранилище созданных объектов(контейнер)

У интерфейса ApplicationContext есть большое количество реализаций:
- ClassPathXmlApplicationContext;
- FileSystemXmlApplicationContext;
- GenericGroovyApplicationContext;
- AnnotationConfigApplicationContext;
- и даже StaticApplicationContext;
- а также некоторые другие.

Они отличаются друг от друга именно тем, каким способом задаются мета-данные и где хранится эта конфигурация. Например:
- ```ClassPathXmlApplicationContext``` — метаданные конфигурируются XML-файлом(-ами) и они лежат в classpath, т. е. в ресурсах модуля;
- ```FileSystemXmlApplicationContext``` — метаданные тоже конфигурируются XML-файлом(-ами), но они находятся где-то в файловой системе, например, /etc/yourapp/spring-context.xml;
- ```AnnotationConfigApplicationContext``` — метаданные конфигурируются с помощью аннотаций прямо на классах.

Современным способом конфигурирования считаются аннотации ```AnnotationConfigApplicationContext```


```ClassPathXmlApplicationContext``` - обращается к файлу ```ApplicationContext.xml``` считывает и помещает все бины в ```ApplicationContext```.

# Полезные материалы
[baeldung](https://www.baeldung.com/spring-application-context)
[ApplicationContext.xml](https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html)
