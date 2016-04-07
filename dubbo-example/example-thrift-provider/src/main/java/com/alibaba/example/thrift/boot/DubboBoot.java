package com.alibaba.example.thrift.boot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by dell on 2016/4/7.
 */
public class DubboBoot {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("provider.xml");
        ac.start();
        System.in.read();
    }
}
