import com.yili.configs.PojoConfig;
import com.yili.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PojoConfig.class);
        User user1 =(User) context.getBean(User.class);
        System.out.println(user1);

    }
}


