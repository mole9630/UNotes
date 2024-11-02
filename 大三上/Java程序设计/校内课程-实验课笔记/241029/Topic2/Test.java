package Topic2;

public class Test {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        double length = 4.0;
        double width = 6.0;

        System.out.println(String.format("矩形面积: %.2f", rect.area(length, width)));
        System.out.println(String.format("矩形周长: %.2f", rect.circumference(length, width)));
    }
}