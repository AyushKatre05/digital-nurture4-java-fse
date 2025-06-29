package com.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @After("execution(* com.example.HelloService.*(..))")
    public void logAfter() {
        System.out.println("Method was called.");
    }
}
