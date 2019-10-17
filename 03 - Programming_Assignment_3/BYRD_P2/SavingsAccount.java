public class SavingsAccount {

    static private double annualInterestRate;
    private double savingBalance;

    public SavingsAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }


    public double getSavingBalance() {
        return this.savingBalance;
    }


    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }


    public void calculateMonthlyInterest() {
        double monthlyI;
        monthlyI = (double) (this.savingBalance * annualInterestRate / 12);
        this.savingBalance += monthlyI;

    }
}
