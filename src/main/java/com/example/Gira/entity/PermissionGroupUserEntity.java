package com.example.Gira.entity;

import com.example.Gira.entity.Ids.UserPermissionGroupIds;

import javax.persistence.*;

@Entity(name = "permissio_group_user")
public class PermissionGroupUserEntity {
    @EmbeddedId
    private UserPermissionGroupIds ids;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "permission_group_id", insertable = false, updatable = false)
    private PermissionGroupEntity permissionGroup;
}
