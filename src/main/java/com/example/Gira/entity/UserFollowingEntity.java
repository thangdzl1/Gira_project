package com.example.Gira.entity;

import com.example.Gira.entity.ids.UserFollowingIds;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "user_following")
public class UserFollowingEntity {
    @EmbeddedId
    private UserFollowingIds ids;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "basic_info_id", insertable = false, updatable = false)
    private BasicInfoEntity basicInfo;

    public UserFollowingIds getIds() {
        return ids;
    }

    public void setIds(UserFollowingIds ids) {
        this.ids = ids;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public BasicInfoEntity getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfoEntity basicInfo) {
        this.basicInfo = basicInfo;
    }
}
