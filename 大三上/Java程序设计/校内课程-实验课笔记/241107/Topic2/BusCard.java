package Topic2;

public class BusCard {
    private double balance;

    public BusCard(double initialBalance) {
        this.balance = initialBalance;
    }

    public void swipe(double amount) throws BusCardException {
        if (amount > balance) {
            throw new BusCardException("余额不足，当前余额为: " + balance);
        }
        balance -= amount;
        System.out.println("成功刷卡，扣除金额: " + amount + "，剩余余额: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}