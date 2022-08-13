package com;

public interface Shape {
    void area();
}

class Test
{
    public static void show(Shape s)
    {
        s.area();
    }

    public static void main(String[] args) {
        show(new Shape() { //匿名内部类
            @Override
            public void area() {
            }
        });
    }
}
