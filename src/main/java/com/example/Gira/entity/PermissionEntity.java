package com.example.Gira.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "permission")
public class PermissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "desc")
    private String desc;

    @OneToMany(mappedBy = "permission")
    private Set<UserPermissionEntity> permission;

    @OneToMany(mappedBy = "permissionEntity")
    private Set<GroupPermissionEntity> groupPermission;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Set<UserPermissionEntity> getPermission() {
        return permission;
    }

    public void setPermission(Set<UserPermissionEntity> permission) {
        this.permission = permission;
    }

    public Set<GroupPermissionEntity> getGroupPermission() {
        return groupPermission;
    }

    public void setGroupPermission(Set<GroupPermissionEntity> groupPermission) {
        this.groupPermission = groupPermission;
    }
}
