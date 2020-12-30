package com.ghy.service.serviceFeign.FeignClient;

import com.ghy.service.serviceFeign.UserService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("spring-cloud-service")
public interface UserFeignClient extends UserService {

}
