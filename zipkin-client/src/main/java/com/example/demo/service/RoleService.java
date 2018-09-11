package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public String getRole() {
        logger.error("this is role");
        return "get role";
    }
}
