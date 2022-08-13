package ClassWork;
//P168
public class exer3 {
    public static void func() {
        try {
            throw new Exception();
//            System.out.println("A"); //无法到达的语句
        } catch (Exception e) {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        try {
            func();
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }
}