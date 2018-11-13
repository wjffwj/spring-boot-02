package com.wjf.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;
//@ConfigurationProperties 告诉springboot将本类中所有的属性和配置文件中相关的配置进行绑定 prefix 配置文件中那个下面的属性进行映射
//只有这个组件事容器中的组建，才能使用容器中的功能
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "person")
public class Person {
    //lastName必须是邮箱格式
    //@Email
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;
    private Map<String,String> map;
    private List<Object> list;
    private Dog dog;

}
