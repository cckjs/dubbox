package com.alibaba.example.rest.provider;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.alibaba.example.rest.api.UserEntity;
import com.alibaba.example.rest.api.UserRestService;
import com.alibaba.example.rest.api.UserService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by dell on 2016/4/6.
 */
@Path("user")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class UserRestServiceImpl implements UserRestService {

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private UserService userService;

    @GET
    @Path("{id : \\d+}")
    @Override
    public UserEntity getUser(@PathParam("id") Long id) {
        return userService.getUser(id);
    }
}
