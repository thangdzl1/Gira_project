package com.example.Gira.entity.ids;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserPermissionIds implements Serializable {

    @Column(name = "user_id")
    private int userId;

    @Column(name = "permission_id")
    private int permissionId;

    public UserPermissionIds(int userId, int permissionId) {
        this.userId = userId;
        this.permissionId = permissionId;
    }

    public UserPermissionIds() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }
}
