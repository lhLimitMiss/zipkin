package com.example.demo.ctrl;

import com.example.demo.service.AuthService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthCtrl {

    private static final Logger logger = LoggerFactory.getLogger(AuthCtrl.class);

    @Autowired
    private AuthService authService;

    @GetMapping("/auth/send")
    public String sendMsg() {
        logger.error("发送权限信息");
        return authService.getAuthority();
    }

}
