import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
        Mentor mentor = (Mentor) container.getBean("partTimeMentor");
        mentor.createAccount();

        ApplicationContext container2 = new ClassPathXmlApplicationContext("config.xml");
        Mentor mentor2 = container2.getBean("fullTimeMentor",Mentor.class);
        mentor2.createAccount();

    }


}
