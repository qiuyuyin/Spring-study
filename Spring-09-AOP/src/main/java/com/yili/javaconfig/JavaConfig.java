package com.yili.javaconfig;

import com.yili.aop.AnnotationPointcut;
import com.yili.aop.UserService;
import com.yili.aop.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {
    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }
    @Bean
    public AnnotationPointcut pointcut(){
        return new AnnotationPointcut();
    }
}
