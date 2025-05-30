package org.example.learn.spring.boot.data.redis.commons.model.user.po;

import java.io.Serializable;

public class UserPO implements Serializable {

    private String id;
    private String name;
    private int age;

    public UserPO() {}

    public UserPO(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{id='" + id + "', name='" + name + "', age=" + age + "}";
    }
}
