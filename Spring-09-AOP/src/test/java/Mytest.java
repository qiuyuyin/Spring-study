import com.yili.aop.UserService;
import com.yili.aop.UserServiceImpl;
import com.yili.javaconfig.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mytest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserService service = context.getBean(UserService.class);
        service.add();

    }
}
