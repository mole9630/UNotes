public class Main {
    public static void main(String[] args) {
        Oblong o = new Oblong(10, 20);
        Delta d = new Delta(5, 6, 7);
        Circle c = new Circle(5);

        System.out.println(o.Circumference());
        System.out.println(o.area());

        System.out.println(d.circumference());
        System.out.println(d.area());

        System.out.println(c.Circumference());
        System.out.println(c.area());
    }
}
