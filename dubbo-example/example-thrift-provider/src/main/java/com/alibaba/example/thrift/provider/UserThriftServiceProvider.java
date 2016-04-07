package com.alibaba.example.thrift.provider;

import com.alibaba.example.thrift.api.User;
import com.alibaba.example.thrift.api.UserThriftService;
import org.apache.thrift.TException;

/**
 * Created by dell on 2016/4/7.
 */
public class UserThriftServiceProvider implements UserThriftService.Iface {
    @Override
    public User getUser(short id) throws TException {
        User user = new User();
        user.setAge(30);
        user.setGender("male");
        user.setName("路宽");
        user.setId((short) 100);
        return user;
    }
}
