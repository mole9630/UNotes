public class Circle {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public double Circumference() {
        return 2 * Math.PI * r;
    }

    public double area() {
        return Math.PI * Math.pow(r, 2);
    }
}
