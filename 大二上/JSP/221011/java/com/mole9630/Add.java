package com.mole9630;

public class Add {
    private double data1;
    private double data2;
    private double data;

    public Add() {
    }

    public double sum(){
        return data1 + data2 + data;
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
    public double getData() {
        return data;
    }
    public void setData(double data) {
        this.data = data;
    }
}
