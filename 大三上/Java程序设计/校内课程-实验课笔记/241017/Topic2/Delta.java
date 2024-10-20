public class Delta {
    int a, b, c;

    public Delta(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int circumference() {
        return a + b + c;
    }

    public double area() {
        double s = (a+b+c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
