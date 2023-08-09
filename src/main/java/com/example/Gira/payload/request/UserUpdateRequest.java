package com.example.Gira.payload.request;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserUpdateRequest {
    @NotNull(message = "username not null")
    @NotEmpty(message = "username not empty")
    private String username;

    @NotNull(message = "email not null")
    @NotEmpty(message = "email not empty")
    @Email(message = "must be email form")
    private String email;

    @NotNull(message = "permission_group_id must not null")
    private int permission_group_id;

    @NotNull(message = "fullname must not null")
    @NotEmpty(message = "fullname not empty")
    private String fullname;

    @NotNull(message = "acct_stat_id must not null")
    private int acct_stat_id;

    @NotNull(message = "id not null")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAcct_stat_id() {
        return acct_stat_id;
    }

    public void setAcct_stat_id(int acct_stat_id) {
        this.acct_stat_id = acct_stat_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

