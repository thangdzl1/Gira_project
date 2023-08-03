package com.example.Gira.entity.Ids;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserPermissionGroupIds implements Serializable {

    @Column(name="user_id")
    private int user_id;

    @Column(name = "permission_group_id")
    private int permission_group_id;

    public UserPermissionGroupIds(int user_id, int permission_group_id) {
        this.user_id = user_id;
        this.permission_group_id = permission_group_id;
    }

    public UserPermissionGroupIds() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPermission_group_id() {
        return permission_group_id;
    }

    public void setPermission_group_id(int permission_group_id) {
        this.permission_group_id = permission_group_id;
    }
}
