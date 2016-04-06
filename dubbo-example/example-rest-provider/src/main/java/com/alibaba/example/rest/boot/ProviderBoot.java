package com.alibaba.example.rest.boot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by dell on 2016/4/6.
 */
public class ProviderBoot {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("provider.xml");
        ac.start();
        System.in.read();
    }
}
