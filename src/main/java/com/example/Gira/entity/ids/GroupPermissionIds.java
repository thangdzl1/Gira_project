package com.example.Gira.entity.ids;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GroupPermissionIds implements Serializable {

    @Column(name = "group_id")
    private int groupId;

    @Column(name = "permission_Id")
    private int permissionId;

    public GroupPermissionIds(int groupId, int permissionId) {
        this.groupId = groupId;
        this.permissionId = permissionId;
    }

    public GroupPermissionIds() {

    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }
}
