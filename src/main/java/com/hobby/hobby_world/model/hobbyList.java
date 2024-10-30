package com.hobby.hobby_world.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hobbylist")
public class hobbyList {

    @Id
    @Column(name="hobbycode")
    private Integer hobbyCode;
    @Column(name="hobbyname")
    private String hobbyName;

    public Integer getHobbyCode() {
        return hobbyCode;
    }

    public void setHobbyCode(Integer hobbyCode) {
        this.hobbyCode = hobbyCode;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }
}
