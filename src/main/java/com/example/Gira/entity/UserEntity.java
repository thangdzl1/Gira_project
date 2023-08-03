package com.example.Gira.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "display_name")
    private String display_name;

    @Column(name = "avatar")
    private String avatar;

    @ManyToOne
    @JoinColumn(name = "acct_stat_id")
    private AcctStatEntity acct_stat;

    @ManyToOne
    @JoinColumn(name = "user_desc_id")
    private UserDescEntity userDescId;

    @OneToMany(mappedBy = "creatorId")
    private Set<ProjectEntity> creatorId;

    @OneToMany(mappedBy = "managerId")
    private Set<ProjectEntity> managerId;

    @OneToMany(mappedBy = "user")
    private Set<PermissionEntity> permission;

    @OneToMany(mappedBy = "user")
    private Set<PermissionGroupUserEntity> permissionGroupUser;

    public Set<PermissionEntity> getPermission() {
        return permission;
    }

    public void setPermission(Set<PermissionEntity> permission) {
        this.permission = permission;
    }

    public Set<PermissionGroupUserEntity> getPermissionGroupUser() {
        return permissionGroupUser;
    }

    public void setPermissionGroupUser(Set<PermissionGroupUserEntity> permissionGroupUser) {
        this.permissionGroupUser = permissionGroupUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public AcctStatEntity getAcct_stat() {
        return acct_stat;
    }

    public void setAcct_stat(AcctStatEntity statId) {
        this.acct_stat = statId;
    }

    public UserDescEntity getUserDescId() {
        return userDescId;
    }

    public void setUserDescId(UserDescEntity userDescId) {
        this.userDescId = userDescId;
    }

    public Set<ProjectEntity> getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Set<ProjectEntity> creatorId) {
        this.creatorId = creatorId;
    }

    public Set<ProjectEntity> getManagerId() {
        return managerId;
    }

    public void setManagerId(Set<ProjectEntity> managerId) {
        this.managerId = managerId;
    }
}
