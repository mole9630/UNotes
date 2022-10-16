package com.mole9630;

/**
 * JavaBean命名规范
 * 包命名:全部字母小写
 * 类命名:每个单词首字母大写
 * 属性名:第一个单词全部小写,之后每个单词首字母大写
 * 方法名:与属性名命名方法相同
 * 常量名:全部字母大写
 */

// 必须是公共的Java类
public class Student {
    // JavaBean所有属性必须封装
    private String studentNumber;
    private String studentName;
    private String studentSex;

    // 必须有一个公共的无参构造方法
    public Student() {
    }

    // 必须有两个公用的getter和setter方法
    public String getStudentNumber(){
        return studentNumber;
    }
    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }
    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }
}
