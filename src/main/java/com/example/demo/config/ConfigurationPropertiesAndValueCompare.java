package com.example.demo.config;

import com.example.demo.YmlDemo.dto.Dog;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @Validated和@NotNull 联合使用，只有在使用Configuration注解时，才会生效
 *                              使用@Value注解进行配置文件属性注入时，不会生效
 */
@Component
@ConfigurationProperties(prefix = "person")
@Data
@ToString
//@Validated
public class ConfigurationPropertiesAndValueCompare {


    @NotNull
//    @Value("${person.name:xiaoming}")   //不会使用JSR303进行校验
    private String name;
    private int age;
    private boolean boss;
    private Date birthday;


    private Map<String,Object> map;
    private Dog dog;

    private List<String> list;

}
