package com.springApi.CourseRegistrationSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="login")
public class Login {
    @Id
    private String name;
    private String password;
    public String getName() {
        return name;
    }

    public void setId(String name) {
        this.name= name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
