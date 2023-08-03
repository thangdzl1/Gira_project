package com.example.Gira.payload.request;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserAddRequest {
    @NotNull(message = "username not null")
    @NotEmpty(message = "username not empty")
    private String username;

    @Length(min = 8, max = 40)
    @NotNull(message = "password not null")
    @NotEmpty(message = "password not empty")
    private String password;

    @NotNull(message = "email not null")
    @NotEmpty(message = "email not empty")
    @Email(message = "must be email form")
    private String email;

    @NotNull(message = "permission group must not null")
    private int permission_group_id;

    private String fullname;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getPermission_group_id() {
        return permission_group_id;
    }

    public void setPermission_group_id(int permission_group_id) {
        this.permission_group_id = permission_group_id;
    }
}
