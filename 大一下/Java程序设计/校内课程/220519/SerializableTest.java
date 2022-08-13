package com;

import java.io.Serializable;

public class SerializableTest implements Serializable { //实现序列号接口
    public static final long SerializableVersion = 20220519; //实现接口有个表示序列号版本标识符的静态常量
    private String name;
    private String sex;

    public SerializableTest() {
    }
    public SerializableTest(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}
