public class Oblong {
    int a, b;

    public Oblong(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double Circumference() {
        return (a+b) * 2;
    }

    public double area() {
        return a * b;
    }
}
