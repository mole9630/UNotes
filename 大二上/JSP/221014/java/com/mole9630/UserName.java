package com.mole9630;

public class UserName {
    private String username;
    private boolean isval;
    private String tip;
    String reg = "[a-zA-Z]";
    String regx = "[a-zA-Z0-9_]";

    public UserName() {
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public boolean isIsval() {
        String username = getUsername();
        String firstname = String.valueOf(username.charAt(0));
        if (firstname.matches(reg)){
            for (int i=1;i<username.length();i++){
                if (!String.valueOf(i).matches(regx)){
                    setTip("用户名首字符之外的字符必须为字母,数字或下划线");
                    return false;
                }
            }
            setTip("用户名格式正确");
            return true;
        }
        else {
            setTip("用户名首字符必须为字母");
            return false;
        }
    }
    public boolean isISval() {
        isval=isIsval();
        return isval;
    }
    public void setIsval(boolean isval) {
        this.isval = isval;
    }
    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }
    public String getReg() {
        return reg;
    }
    public void setReg(String reg) {
        this.reg = reg;
    }
    public String getRegx() {
        return regx;
    }
    public void setRegx(String regx) {
        this.regx = regx;
    }
}
