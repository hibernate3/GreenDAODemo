package com.example.greendaodemo.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2017/5/24 0024.
 */
@Entity
public class UserEntity {
    private String name;
    private String password;
    private int age;
    @Generated(hash = 1962109100)
    public UserEntity(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }
    @Generated(hash = 1433178141)
    public UserEntity() {
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
