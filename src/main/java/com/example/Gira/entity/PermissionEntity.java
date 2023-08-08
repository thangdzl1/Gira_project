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
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @OneToMany(mappedBy = "permission")
    private Set<PermissionGroupEntity> permisionGroup;


    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Set<PermissionGroupEntity> getPermisionGroup() {
        return permisionGroup;
    }

    public void setPermisionGroup(Set<PermissionGroupEntity> permisionGroup) {
        this.permisionGroup = permisionGroup;
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
