package com.leesure.spring5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 完全注解开发 ,此类相当于一个xml配置文件. 后期spring boot 就是根据这来做
 */
@Configuration
@ComponentScan(basePackages = {"com.leesure.spring5"})
public class ConfigClass {
}
