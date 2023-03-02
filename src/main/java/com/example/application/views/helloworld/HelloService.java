package com.example.application.views.helloworld;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @NotNull
    public String sayHello(@NotNull String name) {
        return "Hello, " + name;
    }
}
