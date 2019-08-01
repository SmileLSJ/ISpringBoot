package com.example.demo.propetiesDemo;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
@PropertySource(value = {"classpath:student.properties","classpath:zhanwei.properties"})
@ToString
@ConfigurationProperties //该属性是将配置文件中的信息，注入进来
@Data
public class Student {

    private String name;
    private int age;

}
