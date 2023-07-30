package com.example.Gira.entity;

import com.example.Gira.entity.ids.GroupPermissionIds;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "group_permission")
public class GroupPermissionEntity {

    @EmbeddedId
    GroupPermissionIds ids;

    @ManyToOne
    @JoinColumn(name = "group_id", updatable = false, insertable = false)
    private PermissionGroupEntity permissionGroupEntity;

    @ManyToOne
    @JoinColumn(name = "permission_id", insertable = false, updatable = false)
    private PermissionEntity permissionEntity;

    public GroupPermissionIds getIds() {
        return ids;
    }

    public void setIds(GroupPermissionIds ids) {
        this.ids = ids;
    }

    public PermissionGroupEntity getPermissionGroupEntity() {
        return permissionGroupEntity;
    }

    public void setPermissionGroupEntity(PermissionGroupEntity permissionGroupEntity) {
        this.permissionGroupEntity = permissionGroupEntity;
    }

    public PermissionEntity getPermissionEntity() {
        return permissionEntity;
    }

    public void setPermissionEntity(PermissionEntity permissionEntity) {
        this.permissionEntity = permissionEntity;
    }
}
