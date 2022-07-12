package com.example.application.views.helloworld;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
public class GoodbyeService extends HelloService {
    @Override
    @NotNull
    public String sayHello(@NotNull String name) {
        return "Goodbye, " + name;
    }
}
