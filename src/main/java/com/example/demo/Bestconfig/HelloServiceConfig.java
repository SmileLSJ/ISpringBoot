package com.example.demo.Bestconfig;

import com.example.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * springboot推荐的使用该方式，给容器添加实例
 */
@Configuration
public class HelloServiceConfig {


    //id 即为方法名，区分大小，因为方法区分大小写
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }

}
