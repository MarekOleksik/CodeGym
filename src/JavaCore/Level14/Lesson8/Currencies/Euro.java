package JavaCore.Level14.Lesson8.Currencies;

public class Euro extends Money{

    public Euro(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "EUR";
    }
}
