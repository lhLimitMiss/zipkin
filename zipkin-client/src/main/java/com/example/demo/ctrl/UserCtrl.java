package com.example.demo.ctrl;

import com.example.demo.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserCtrl {

    private static final Logger logger = LoggerFactory.getLogger(UserCtrl.class);

    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/send")
    public String sendMsg() {
        logger.error("试试水");
        userService.getUser();

        //service B
        String resultMsg = restTemplate.getForObject("http://localhost:8086/auth/send", String.class);
        logger.info(resultMsg);
        return "good";
    }

}
