package com.example.Gira.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "plan_info")
public class PlanInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "est_day")
    private int estDay;

    @Column(name = "est_start")
    private Date estStart;

    @Column(name = "est_end")
    private Date estEnd;

    @Column(name = "actu_start")
    private Date actuStart;

    @Column(name = "actu_end")
    private Date actuEnd;

    @OneToMany(mappedBy = "planInfo")
    private Set<TasksEntity> tasks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getEstDay() {
        return estDay;
    }

    public void setEstDay(int estDay) {
        this.estDay = estDay;
    }

    public Date getEstStart() {
        return estStart;
    }

    public void setEstStart(Date estStart) {
        this.estStart = estStart;
    }

    public Date getEstEnd() {
        return estEnd;
    }

    public void setEstEnd(Date estEnd) {
        this.estEnd = estEnd;
    }

    public Date getActuStart() {
        return actuStart;
    }

    public void setActuStart(Date actuStart) {
        this.actuStart = actuStart;
    }

    public Date getActuEnd() {
        return actuEnd;
    }

    public void setActuEnd(Date actuEnd) {
        this.actuEnd = actuEnd;
    }

    public Set<TasksEntity> getTasks() {
        return tasks;
    }

    public void setTasks(Set<TasksEntity> tasks) {
        this.tasks = tasks;
    }
}
