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

    @ManyToOne
    @JoinColumn(name = "permission_group_id")
    private PermissionGroupEntity permissionGroup;

    @OneToMany(mappedBy = "permission")
    private Set<UserPermissionEntity> userPermission;

    public PermissionGroupEntity getPermissionGroup() {
        return permissionGroup;
    }

    public void setPermissionGroup(PermissionGroupEntity permissionGroup) {
        this.permissionGroup = permissionGroup;
    }

    public Set<UserPermissionEntity> getUserPermission() {
        return userPermission;
    }

    public void setUserPermission(Set<UserPermissionEntity> userPermission) {
        this.userPermission = userPermission;
    }

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
}
