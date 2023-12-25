package com.example.Poll.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Service
@FeignClient(
        name = "UserServices",
        url = "${user.url}"
)

public interface UserService {
    @GetMapping(path = "/by_id")
     public User getUserByUserId(@RequestParam(value = "user_id") Integer userId);

}//end class
