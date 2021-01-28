package com.yili.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;

@Configuration
@MapperScan("com.yili.dao")
@ComponentScan("com.yili.dao")
@ComponentScan("com.yili.service")
@ImportResource("classpath:spring-dao.xml")
public class SpringConfig {

}
