package com.example.demo.ZhanWeiFu;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by smile on 2019/7/31.
 */

@Component
@ToString
@Data   //通过get  set方法进行反射注入
public class ZhanWeiFuDemo {

    @Value("${RanValue:10}")
    private int ranValue;

    //添加默认值
    @Value("${firstname:小明}")
    private String firstname;

}
