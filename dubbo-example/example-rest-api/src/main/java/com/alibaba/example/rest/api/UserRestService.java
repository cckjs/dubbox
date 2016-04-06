package com.alibaba.example.rest.api;

import javax.validation.constraints.Min;

/**
 * Created by dell on 2016/4/6.
 */
public interface UserRestService {
    UserEntity getUser(@Min(value = 1L, message = "User ID must be greater than 1") Long id);
}
