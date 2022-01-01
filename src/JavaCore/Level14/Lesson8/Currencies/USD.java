package JavaCore.Level14.Lesson8.Currencies;

public class USD extends Money{

    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
