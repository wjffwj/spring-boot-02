package com.wjf;

import com.wjf.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * springboot单元测试 可以在测试时自动注入
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ApplicationTests {

    @Autowired
    Person person;
    @Autowired
    private ApplicationContext applicationContext;
    @Test
    public void contextLoads() {
        System.out.println(person);
    }
    @Test
    public void testHelloService(){
        boolean flag = applicationContext.containsBean("helloService");
        System.out.println(flag);
    }

}
