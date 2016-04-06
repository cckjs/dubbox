package com.alibaba.example.rest.api;

/**
 * Created by dell on 2016/4/6.
 */
public interface UserService {
    void addUser(UserEntity user);

    UserEntity getUser(long userId);

    void deleteUser(long userId);
}
