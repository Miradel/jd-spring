import configs.AppConfig;
import interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.Java;

public class App {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        Course course = container.getBean("java",Course.class);
        course.getTeachingHours();

        Course course2 = container.getBean("selenium",Course.class);
        course2.getTeachingHours();


        Course course3 = container.getBean("api",Course.class);
        course3.getTeachingHours();

        Course course4 = container.getBean("html",Course.class);
        course4.getTeachingHours();

        Course course5 = container.getBean("api",Course.class);
        System.out.println(course5.toString());








    }
}
