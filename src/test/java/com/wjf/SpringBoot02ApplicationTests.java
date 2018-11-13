package com.wjf;

import com.wjf.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * springboot单元测试 可以在测试时自动注入
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ApplicationTests {

    @Autowired
    Person person;
    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
