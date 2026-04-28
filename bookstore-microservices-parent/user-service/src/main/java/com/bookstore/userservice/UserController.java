/*
 * Simple test controller for User Service
 * Used to verify service is running and reachable
 */

package com.bookstore.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/test")
    public String test() {
        return "User Service is working!";
    }
}