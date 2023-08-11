package com.example.Gira.entity;

import com.example.Gira.entity.ids.UserPermissionIds;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "user_permission")
public class UserPermissionEntity {
    @EmbeddedId
    private UserPermissionIds ids;

    @ManyToOne
    @JoinColumn(name = "user_id", updatable = false, insertable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "permission_id", updatable = false, insertable = false)
    private PermissionEntity permission;

    public UserPermissionIds getIds() {
        return ids;
    }

    public void setIds(UserPermissionIds ids) {
        this.ids = ids;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public PermissionEntity getPermission() {
        return permission;
    }

    public void setPermission(PermissionEntity permission) {
        this.permission = permission;
    }
}
