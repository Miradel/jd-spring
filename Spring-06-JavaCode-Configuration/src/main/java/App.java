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




    }
}
