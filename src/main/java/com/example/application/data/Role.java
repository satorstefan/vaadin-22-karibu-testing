package com.example.application.data;

import org.jetbrains.annotations.NotNull;

public enum Role {
    USER("user"), ADMIN("admin");

    @NotNull
    private final String roleName;

    Role(@NotNull String roleName) {
        this.roleName = roleName;
    }

    @NotNull
    public String getRoleName() {
        return roleName;
    }
}
