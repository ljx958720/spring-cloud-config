package com.ghy.user;

import com.ghy.service.serviceFeign.FeignClient.UserFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController  {
    @Resource
    UserFeignClient userOpenFeign;

    @GetMapping("/user")
    public String UserName(){

        return userOpenFeign.user();
    }
}
