public class Responder implements Runnable {
    private final QResponse qResponse;
    private final String name;

    public Responder(QResponse qResponse, String name) {
        this.qResponse = qResponse;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            qResponse.answer(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}