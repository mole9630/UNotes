package Topic1;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        double r = 3.5;
        double s = 5.5;

        System.out.println(String.format("圆面积：%.2f", circle.area(r)));
        System.out.println(String.format("正方形面积: %.2f", square.area(s)));
    }
}