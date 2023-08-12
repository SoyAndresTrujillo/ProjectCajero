import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setOwner("David");
        bankAccount.setBalance(1000);

        Atm atm = new Atm(bankAccount);

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Digit 1 for visualise balance");
            System.out.println("Digit 2 for Deposit at balance");
            System.out.println("Digit 3 for withdraw balance");
            System.out.println("Digit 4 for finalize of session");
            int input = sc.nextInt();

            switch (input) {
                case 1 -> System.out.println("Your balance is: " + bankAccount.getBalance() + "\n");
                case 2 -> {
                    System.out.println("Digit value to deposit");
                    double inputValue = sc.nextDouble();
                    atm.depositToBalance(inputValue);
                    System.out.println("Your balance now is: " + bankAccount.getBalance() + "\n");
                }
                case 3 -> {
                    System.out.println("Digit value to withdraw");
                    double inputValueWithdraw = sc.nextDouble();
                    atm.withDraw(inputValueWithdraw);
                    System.out.println("Your balance now is: " + bankAccount.getBalance() + "\n");
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid option 😒" + "\n");
            }
        }
    }
}