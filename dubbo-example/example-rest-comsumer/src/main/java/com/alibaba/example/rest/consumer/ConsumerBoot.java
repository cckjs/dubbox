package com.alibaba.example.rest.consumer;

import com.alibaba.example.rest.api.UserEntity;
import com.alibaba.example.rest.api.UserRestService;
import com.alibaba.example.rest.api.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2016/4/6.
 */
public class ConsumerBoot {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        UserService userService =  context.getBean(UserService.class);
        UserEntity user = userService.getUser(100l);
        System.out.println(user.getGender());

        UserRestService userRestService = context.getBean(UserRestService.class);
        UserEntity user1 = userRestService.getUser(100l);
        System.out.println(user1.getName());


    }
}
