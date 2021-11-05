package ua.com.pogorelova;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //штука которая считает файлик applicationContext.xml и положит созданный Бин в аппликейшн контекст
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic1 = context.getBean("classicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicBean", ClassicalMusic.class);
        System.out.println(classicalMusic1.getSong());
        System.out.println(classicalMusic2.getSong());
        System.out.println((classicalMusic1 == classicalMusic2));// singleton = true    // prototype = false

        context.close();
    }
}
