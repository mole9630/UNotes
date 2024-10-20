public class Topic2 {
    public static void main(String[] args) {
        //  题目3-2：编写程序，实现1+2+3+…+100的和（用for循环实现）。
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
