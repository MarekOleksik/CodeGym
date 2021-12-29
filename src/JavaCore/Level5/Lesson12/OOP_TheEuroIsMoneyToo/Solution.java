package JavaCore.Level5.Lesson12.OOP_TheEuroIsMoneyToo;

/*
OOP: The Euro is money too

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Euro().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    // Add your code below
    public static class Euro extends Money {
        private double amount = 123d;

        public Money getMoney() {
            return this;
        }

        public Object getAmount() {
            return amount;
        }
    }
}
