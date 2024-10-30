package com.hobby.hobby_world.model1;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class hobbyList1 {

    private Integer hobbyCode;
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
