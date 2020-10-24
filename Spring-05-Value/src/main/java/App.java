import interfaces.Course;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");


        Course course = container.getBean("selenium",Course.class);
        System.out.println( course.toString());


        Course course2 = container.getBean("java",Course.class);
        System.out.println( course2.toString());



    }


}
