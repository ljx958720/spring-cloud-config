package com.ghy.service.serviceFeign;

import org.springframework.web.bind.annotation.GetMapping;

public interface UserService {
    @GetMapping("/user")
    String user();

}
