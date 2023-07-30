package com.example.Gira.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "user_desc")
public class UserDescEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "facebook_url")
    private String facebookUrl;

    @Column(name = "jobs")
    private String jobs;

    @Column(name = "dept")
    private String dept;

    @Column(name = "hobby")
    private String hobby;

    @OneToMany(mappedBy = "userDescId")
    private Set<UserEntity> userDesc;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Set<UserEntity> getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(Set<UserEntity> userDesc) {
        this.userDesc = userDesc;
    }

}
