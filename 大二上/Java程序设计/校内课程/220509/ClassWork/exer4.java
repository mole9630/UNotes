package ClassWork;
//P168
class Exc0 extends Exception{}
class Exc1 extends Exception{}
public class exer4 {
    public static void main(String[] args) {
        try {
            throw new Exc0();
        } catch (Exception e) {
            System.out.println("Exception");
//        } catch (Exc0 e) { //异常已经被捕获了
//            System.out.println("Exc0");
        }
    }
}
