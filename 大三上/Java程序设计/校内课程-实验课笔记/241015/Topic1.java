public class Topic1 {
    public static void main(String[] args) {
        // 题目3-1：用while循环计算1+1/2!+1/3!+1/4!+…的前20项和。
        double sum = 1.0;
        int i = 2;

        while (i <= 20) {
            sum += (1.0 / factorial(i));
            i++;
        }

        System.out.println("前二十项和: " + sum);
    }

    public static double factorial(int num) {
    	double res = 1;
        for (int i=2; i<=num; i++) {
            res *= i;
        }
        return res;
    }
}