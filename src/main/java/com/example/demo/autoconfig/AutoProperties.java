package com.example.demo.autoconfig;

import lombok.Data;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by smile on 2019/8/1.
 */
@ConfigurationProperties(prefix = "config")
@Data
public class AutoProperties implements BeanClassLoaderAware{

    private Integer index;

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {

    }
}
