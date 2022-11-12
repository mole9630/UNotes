package com.mole9630;

public class AddPro {
    private double data1;
    private double data2;
    private double rusult;
    private int operator;
    private String oper;

    public AddPro() {
    }

    public double getData1() {
        return data1;
    }
    public void setData1(double data1) {
        this.data1 = data1;
    }
    public double getData2() {
        return data2;
    }
    public void setData2(double data2) {
        this.data2 = data2;
    }
    public double getRusult() {
        double result_ = 0;
        switch (operator){
            case 0:
                result_ = data1 + data2;
                oper = "+";
                break;
            case 1:
                result_ = data1 - data2;
                oper = "-";
                break;
            case 2:
                result_ = data1 * data2;
                oper = "×";
                break;
            case 3:
                result_ = data1 / data2;
                oper = "÷";
                break;
            default:
                break;
        }
        return result_;
    }
    public void setRusult(double rusult) {
        this.rusult = rusult;
    }
    public int getOperator() {
        return operator;
    }
    public void setOperator(int operator) {
        this.operator = operator;
    }
    public String getOper() {
        getRusult();
        return oper;
    }
    public void setOper(String oper) {
        this.oper = oper;
    }
}
