package com.alibaba.example.thrift.consumer;

import com.alibaba.example.thrift.api.UserThriftService;
import org.apache.thrift.TException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by dell on 2016/4/7.
 */
public class DubboConsumer {
    public static void main(String[] args) throws IOException, TException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("consumer.xml");
        ac.start();
        UserThriftService.Iface face = (UserThriftService.Iface) ac.getBean("userThriftService");
        System.out.println(face.getUser((short) 100).getName());
    }
}
