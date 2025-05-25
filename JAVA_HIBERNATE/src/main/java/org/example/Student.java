package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int sid;
    private String name;
    private int age;

    public int getSid() {
        return sid;
    }

    public void setSid(int rollNo) {
        this.sid = rollNo;
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
        return "Student{" +
                "rollNo=" + sid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
