package com.mole9630;

public class Add {
    private double data1;
    private double data2;
    private double data3;
    private double sum;

    public Add() {
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
    public double getData3() {
        return data3;
    }
    public void setData3(double data3) {
        this.data3 = data3;
    }
    public double getSum() {
        sum = data1 + data2 +data3;
        return sum;
    }
    public void setSum(double sum) {
        this.sum = sum;
    }
}
