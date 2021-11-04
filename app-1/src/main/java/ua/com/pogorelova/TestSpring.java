
//MAVEN DOESN'T WORK!!!
//TODO Maven

package ua.com.pogorelova;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //штука которая считает файлик applicationContext.xml и положит созданный Бин в аппликейшн контекст
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //достать бин из аппликейшн контекста
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }
}
