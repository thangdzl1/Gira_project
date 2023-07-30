package com.example.Gira.entity;

import com.example.Gira.entity.ids.GroupPermissionIds;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "permission_group")
public class PermissionGroupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "desc")
    private String desc;

    @OneToMany(mappedBy = "permissionGroupEntity")
    private Set<GroupPermissionEntity> permissionEntity;

    @OneToMany(mappedBy = "permissionGroupEntity")
    private Set<GroupPermissionUserEntity> groupPermissionUserEntities;

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

    public Set<GroupPermissionEntity> getPermissionEntity() {
        return permissionEntity;
    }

    public void setPermissionEntity(Set<GroupPermissionEntity> permissionEntity) {
        this.permissionEntity = permissionEntity;
    }

    public Set<GroupPermissionUserEntity> getGroupPermissionUserEntities() {
        return groupPermissionUserEntities;
    }

    public void setGroupPermissionUserEntities(Set<GroupPermissionUserEntity> groupPermissionUserEntities) {
        this.groupPermissionUserEntities = groupPermissionUserEntities;
    }
}
