import com.yili.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student)context.getBean("student");
        Student student2 = (Student)context.getBean("student");
        System.out.println(student.equals(student2));
        System.out.println(student.hashCode()+" \n"+student2.hashCode());
    }
}
