import com.yili.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People user = (People) context.getBean("people");

        user.getCat().shot();
        user.getDog().shot();

    }
}
