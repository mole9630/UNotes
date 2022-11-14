package com.mole9630;

public class Student {
    private String sno, name, sex;

    public Student() {
    }
    public Student(String sno, String name, String sex) {
        this.sno = sno;
        this.name = name;
        this.sex = sex;
    }

    public String getSno() {
        return sno;
    }
    public void setSno(String sno) {
        this.sno = sno;
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
