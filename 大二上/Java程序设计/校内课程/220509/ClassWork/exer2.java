package ClassWork;
//P167
public class exer2 {
    public static void main(String[] args) {
        int test = test(3,5);
        System.out.println(test);
    }
    public static int test(int a, int b) {
        int result = a;
        try {
            if (a<0 || b<0) {
                return 0;
            }
            result = a + b;
            return result; //8
        } finally {
            System.out.println("result = " + (a - b));
        }
    }
}
