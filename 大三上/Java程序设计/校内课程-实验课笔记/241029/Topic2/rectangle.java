package Topic2;

public class rectangle implements rectangleI {
    public double area(double length, double width) {
        return length * width;
    }

    public double circumference(double length, double width) {
        return 2 * (length + width);
    }
}