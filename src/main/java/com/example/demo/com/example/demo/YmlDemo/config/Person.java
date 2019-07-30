package com.example.demo.com.example.demo.YmlDemo.config;

import com.example.demo.com.example.demo.YmlDemo.dto.Dog;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by smile on 2019/7/30.
 */
@Component
@ConfigurationProperties(prefix = "person")
@Data
@ToString
public class Person {

    private String name;
    private int age;
    private boolean boss;
    private Date birthday;


    private Map<String,Object> map;
    private Dog dog;

    private List<String> list;

}
