package com.wjf.config;

import com.wjf.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 指明当前类是配置类，来代替配置文件
 * 以前是Bean标签注入   ，现在用@Bean
 */
@Configuration
public class MyAppConfig {
    //将方法的返回值添加到容器中：容器中组建默认的id是方法名
    @Bean
    public HelloService helloService(){
        System.out.println("给容器中添加组件");
        return new HelloService();
    }
}
