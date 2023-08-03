package com.example.Gira.entity;

import org.apache.catalina.User;

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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "permission_id")
    private PermissionEntity permission;

    @OneToMany(mappedBy = "permissionGroup")
    private Set<UserEntity> userGroup;

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

    public Set<UserEntity> getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(Set<UserEntity> userGroup) {
        this.userGroup = userGroup;
    }
}
