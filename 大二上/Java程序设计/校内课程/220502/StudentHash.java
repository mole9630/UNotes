package com;

import java.util.Objects;

public class StudentHash {
    //私有化成员变量
    private String name;
    private String sno;
    private int age;

    public StudentHash() {
    }

    public StudentHash(String sno, String name, int age) {
        this.sno = sno;
        this.name = name;
        this.age = age;
    }

    //getter和setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSno() {
        return sno;
    }
    public void setSno(String sno) {
        this.sno = sno;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //重写方法
    @Override
    public String toString() {
        return "StudentHash{" +
                "sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentHash)) return false;
        StudentHash studentHash = (StudentHash) o;
        return age == studentHash.age && //与hashCode与之对应
                name.equals(studentHash.name) &&
                sno.equals(studentHash.sno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sno, age); //类似于数据库的主键,不能重复的变量,完全重复将去除重复值
    }
}
