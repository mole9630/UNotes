public class Main {
    public static void main(String[] args) {
            QResponse qResponse = new QResponse();

            Thread r1 = new Thread(new Responder(qResponse, "答题者1"));
            Thread r2 = new Thread(new Responder(qResponse, "答题者2"));
            Thread r3 = new Thread(new Responder(qResponse, "答题者3"));

            r1.start();
            r2.start();
            r3.start();
        }


}