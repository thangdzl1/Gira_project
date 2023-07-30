package com.example.Gira.entity;


import javax.persistence.*;
import java.util.Set;

@Entity(name = "acct_stat")
public class AcctStatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "acct_stat")
    private Set<UserEntity> userAcctStat;

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

    public Set<UserEntity> getUserAcctStat() {
        return userAcctStat;
    }

    public void setUserAcctStat(Set<UserEntity> userAcctStat) {
        this.userAcctStat = userAcctStat;
    }
}
