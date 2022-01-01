package JavaCore.Level14.Lesson8.Currencies;

public abstract class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract String getCurrencyName();
}
