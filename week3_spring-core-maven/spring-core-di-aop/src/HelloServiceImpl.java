package com.example;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
