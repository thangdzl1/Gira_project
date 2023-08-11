package com.example.Gira.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "basic_info")
public class BasicInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String name;

    @Column(name = "category")
    private int sequenceNumber;

    @Column(name = "desc")
    private int desc;

    @ManyToOne
    @JoinColumn(name = "creator_id")
    private UserEntity creatorId;

    @ManyToOne
    @JoinColumn(name = "incharge_id")
    private UserEntity inchargeId;

    @OneToMany(mappedBy = "basicInfo")
    private Set<TasksEntity> tasks;

    @OneToMany(mappedBy = "basicInfo")
    private Set<UserFollowingEntity> userFollowing;

    public Set<UserFollowingEntity> getUserFollowing() {
        return userFollowing;
    }

    public void setUserFollowing(Set<UserFollowingEntity> userFollowing) {
        this.userFollowing = userFollowing;
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

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public int getDesc() {
        return desc;
    }

    public void setDesc(int desc) {
        this.desc = desc;
    }

    public UserEntity getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(UserEntity creatorId) {
        this.creatorId = creatorId;
    }

    public UserEntity getInchargeId() {
        return inchargeId;
    }

    public void setInchargeId(UserEntity inchargeId) {
        this.inchargeId = inchargeId;
    }

    public Set<TasksEntity> getTasks() {
        return tasks;
    }

    public void setTasks(Set<TasksEntity> tasks) {
        this.tasks = tasks;
    }
}
