package com.alibaba.example.rest.provider;

import com.alibaba.example.rest.api.UserEntity;
import com.alibaba.example.rest.api.UserService;

/**
 * Created by dell on 2016/4/6.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser(UserEntity user) {

    }

    @Override
    public UserEntity getUser(long userId) {
        UserEntity entity = new UserEntity();
        entity.setAge(25);
        entity.setGender("male");
        entity.setName("路宽");
        entity.setId(1000l);
        return entity;
    }

    @Override
    public void deleteUser(long userId) {

    }
}
