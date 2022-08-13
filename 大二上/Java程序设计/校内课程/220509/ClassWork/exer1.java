package ClassWork;
//P167
public class exer1 {
    public static void main(String[] args) {
        try {
            newExce();
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
        } finally {
            System.out.println("3");
        }
        System.out.println("4");
    }
    public static void newExce() throws Exception {
        throw new Exception();
    }
}
