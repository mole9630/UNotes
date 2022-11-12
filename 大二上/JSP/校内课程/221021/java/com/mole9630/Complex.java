package com.mole9630;

public class Complex {
    private double real;
    private double imag;

    // (a+bi) +-*/ (c+di)

    public Complex add(Complex comp){
        return new Complex(this.real + comp.real, this.imag + comp.imag);
    }
    public Complex sub(Complex comp){
        return new Complex(this.real - comp.real, this.imag - comp.imag);
    }
    public Complex mul(Complex comp){
        return new Complex(this.real * comp.real - this.imag * comp.imag, this.imag * comp.real + this.real * comp.imag);
    }
    public Complex div(Complex comp){
        double z = Math.pow(comp.real,2) + Math.pow(comp.imag,2);
        double x = (this.real * comp.real + this.imag * comp.imag) / z;
        double y = (this.imag * comp.real - this.real * comp.imag) / z;
        return new Complex(x,y);
    }

    public String toString(){
        if (imag >= 0){
            return this.real + " + " + this.imag + " * i"; // a + b * i
        }
        else
        {
            return this.real + "-" + this.imag + "* i"; // a + bi = a - (-b)i
        }
    }

    public Complex() {
    }
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getter & Setter
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImag() {
        return imag;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }
}
