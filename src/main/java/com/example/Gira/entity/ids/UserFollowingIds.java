package com.example.Gira.entity.ids;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserFollowingIds implements Serializable {
    @Column(name = "user_id")
    private int userId;

    @Column(name = "basic_info_id")
    private int basicInfoId;

    public UserFollowingIds(int userId, int basicInfoId) {
        this.userId = userId;
        this.basicInfoId = basicInfoId;
    }

    public UserFollowingIds() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBasicInfoId() {
        return basicInfoId;
    }

    public void setBasicInfoId(int basicInfoId) {
        this.basicInfoId = basicInfoId;
    }
}
