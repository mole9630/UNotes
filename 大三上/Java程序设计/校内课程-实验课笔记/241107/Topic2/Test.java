package Topic2;

public class Test {
    public static void main(String[] args) {
        BusCard bc = new BusCard(50); // 初始化余额为50元

        try {
            bc.swipe(20); // 正常刷卡
            bc.swipe(40); // 刷卡金额大于余额，将触发异常
        } catch (BusCardException e) {
            System.out.println("刷卡失败：" + e.getMessage());
        }
    }
}