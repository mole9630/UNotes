package com.mole9630;

import java.io.UnsupportedEncodingException;

public class Register {
    private String name;
    private String sex;
    private String birthday;
    private String ethnicity;
    private String introduction;

    // 构造方法
    public Register() {
    }
    public Register(String name, String sex, String birthday, String ethnicity, String introduction) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.ethnicity = ethnicity;
        this.introduction = introduction;
    }

    // Getter & Setter
    public String getName() {
        return toString(name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return toString(sex);
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getBirthday() {
        return toString(birthday);
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getEthnicity() {
        return toString(ethnicity);
    }
    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }
    public String getIntroduction() {
        return toString(introduction);
    }
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    //toString
    public String toString(String str) {
        String text = "";
        if (str != null && ! str.equals("")){
            try {
                text = new String(str.getBytes("ISO-8859-1"),"utf-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        return text;
    }
}
