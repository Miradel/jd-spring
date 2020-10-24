import interfaces.Course;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("java",Course.class);

        course.getTeachingHours();

        Course course2 = container.getBean("selenium",Course.class);

        course2.getTeachingHours();

        Course course3 = container.getBean("API",Course.class);

        course3.getTeachingHours();





    }


}
