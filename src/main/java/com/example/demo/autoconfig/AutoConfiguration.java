package com.example.demo.autoconfig;

import com.example.demo.YmlDemo.dto.Config;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by smile on 2019/8/1.
 */

@Configuration
@EnableConfigurationProperties({AutoProperties.class})
public class AutoConfiguration {

    private AutoProperties properties;

    public AutoConfiguration(AutoProperties properties){
        this.properties=properties;
    }

    @Bean
    public Config config(){
        Config config = new Config();
        config.setIndex(properties.getIndex());
        return config;
    }
}
