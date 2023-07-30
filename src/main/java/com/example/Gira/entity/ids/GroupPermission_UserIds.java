package com.example.Gira.entity.ids;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GroupPermission_UserIds implements Serializable {

    @Column(name = "group_id")
    private int groupId;

    @Column(name = "user_id")
    private int userId;

    public GroupPermission_UserIds(int groupId, int userId) {
        this.groupId = groupId;
        this.userId = userId;
    }

    public GroupPermission_UserIds() {

    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
