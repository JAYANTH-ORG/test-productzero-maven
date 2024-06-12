package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    int testMethod() {
        System.out.println("Hello world");
        return 10;
    }
}
