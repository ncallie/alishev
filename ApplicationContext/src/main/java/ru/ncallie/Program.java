package ru.ncallie;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean);
        context.close();
    }
}
