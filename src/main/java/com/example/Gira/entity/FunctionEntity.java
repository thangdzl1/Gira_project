package com.example.Gira.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "function")
public class FunctionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "function")
    private Set<PermissionEntity> permission;

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

    public Set<PermissionEntity> getPermission() {
        return permission;
    }

    public void setPermission(Set<PermissionEntity> permission) {
        this.permission = permission;
    }
}
