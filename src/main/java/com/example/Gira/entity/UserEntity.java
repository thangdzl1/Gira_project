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

    @ManyToOne
    @JoinColumn(name = "permission_group_id")
    private PermissionGroupEntity permissionGroup;

    @OneToMany(mappedBy = "creatorId")
    private Set<ProjectEntity> creatorId;

    @OneToMany(mappedBy = "managerId")
    private Set<ProjectEntity> managerId;

    @OneToMany(mappedBy = "user")
    private Set<UserPermissionEntity> userPermission;

    @OneToMany(mappedBy = "user")
    private Set<UserTasksEntity> userTasks;

    @OneToMany(mappedBy = "manager")
    private Set<TasksEntity> tasks;

    @OneToMany(mappedBy = "performerId")
    private Set<AdditionalTaskEntity> additionalTask;

    @OneToMany(mappedBy = "writterId")
    private Set<CommentInfoEntity> commentInfo;

    @OneToMany(mappedBy = "changerId")
    private Set<HistoryInfoEntity> historyInfo;

    @OneToMany(mappedBy = "creatorId")
    private Set<BasicInfoEntity> basicInfoCreatorId;

    @OneToMany(mappedBy = "inchargeId")
    private Set<BasicInfoEntity> basicInfoInchargeId;

    @OneToMany(mappedBy = "user")
    private Set<UserFollowingEntity> userFollowing;

    @OneToMany(mappedBy = "user")
    private Set<ProgressInfoEntity> progressInfo;

    public Set<ProgressInfoEntity> getProgressInfo() {
        return progressInfo;
    }

    public void setProgressInfo(Set<ProgressInfoEntity> progressInfo) {
        this.progressInfo = progressInfo;
    }

    public Set<UserFollowingEntity> getUserFollowing() {
        return userFollowing;
    }

    public void setUserFollowing(Set<UserFollowingEntity> userFollowing) {
        this.userFollowing = userFollowing;
    }

    public Set<CommentInfoEntity> getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(Set<CommentInfoEntity> commentInfo) {
        this.commentInfo = commentInfo;
    }

    public Set<BasicInfoEntity> getBasicInfoCreatorId() {
        return basicInfoCreatorId;
    }

    public void setBasicInfoCreatorId(Set<BasicInfoEntity> basicInfoCreatorId) {
        this.basicInfoCreatorId = basicInfoCreatorId;
    }

    public Set<BasicInfoEntity> getBasicInfoInchargeId() {
        return basicInfoInchargeId;
    }

    public void setBasicInfoInchargeId(Set<BasicInfoEntity> basicInfoInchargeId) {
        this.basicInfoInchargeId = basicInfoInchargeId;
    }

    public Set<HistoryInfoEntity> getHistoryInfo() {
        return historyInfo;
    }

    public void setHistoryInfo(Set<HistoryInfoEntity> historyInfo) {
        this.historyInfo = historyInfo;
    }

    public Set<AdditionalTaskEntity> getAdditionalTask() {
        return additionalTask;
    }

    public void setAdditionalTask(Set<AdditionalTaskEntity> additionalTask) {
        this.additionalTask = additionalTask;
    }

    public Set<TasksEntity> getTasks() {
        return tasks;
    }

    public void setTasks(Set<TasksEntity> tasks) {
        this.tasks = tasks;
    }

    public Set<UserTasksEntity> getUserTasks() {
        return userTasks;
    }

    public void setUserTasks(Set<UserTasksEntity> userTasks) {
        this.userTasks = userTasks;
    }

    public PermissionGroupEntity getPermissionGroup() {
        return permissionGroup;
    }

    public void setPermissionGroup(PermissionGroupEntity permissionGroup) {
        this.permissionGroup = permissionGroup;
    }

    public Set<UserPermissionEntity> getUserPermission() {
        return userPermission;
    }

    public void setUserPermission(Set<UserPermissionEntity> userPermission) {
        this.userPermission = userPermission;
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
