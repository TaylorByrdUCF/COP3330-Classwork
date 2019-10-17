public class Problem_2 {

    public static void main(String[] args) {

        SavingsAccount person1, person2;

        person1 = new SavingsAccount(2000.0);
        person2 = new SavingsAccount(3000.0);

        int total = 0;

        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Balance for 1st Person  :  Balance for 2nd Person");
        for(int i = 0; i < 12; i++){
            person1.calculateMonthlyInterest();
            person2.calculateMonthlyInterest();
            System.out.printf("[P1] Month %2d : %.2f   [P2] Month %2d : %.2f\n", (i+1), person1.getSavingBalance(), (i+1), person2.getSavingBalance());
        }

        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("\nAfter changing annual interest rate to 0.05\n\nBalance for 1st Person  :  Balance for 2nd Person");
        for(int i = 0; i < 12; i++){
            person1.calculateMonthlyInterest();
            person2.calculateMonthlyInterest();
            System.out.printf("[P1] Month %2d : %.2f   [P2] Month %2d : %.2f\n", (i+1), person1.getSavingBalance(), (i+1), person2.getSavingBalance());
        }
    }

}
