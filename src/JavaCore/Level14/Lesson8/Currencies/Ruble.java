package JavaCore.Level14.Lesson8.Currencies;

public class Ruble extends Money{

    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
