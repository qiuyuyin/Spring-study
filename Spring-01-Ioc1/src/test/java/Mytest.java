import com.yili.dao.UserDaoImpl;
import com.yili.dao.UserDaoMysqlImpl;
import com.yili.service.UserService;
import com.yili.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");



        userService.getUser();


    }
}
