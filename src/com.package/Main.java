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
                case 1 -> atm.visualiseBalance();
                case 2 -> {
                    System.out.println("Digit value to deposit");
                    atm.depositToBalance(sc.nextDouble());
                }
                case 3 -> {
                    System.out.println("Digit value to withdraw");
                    atm.withDraw(sc.nextDouble());
                }
                case 4 -> {
                    System.out.println("See you later 🥳");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option 😒" + "\n");
            }
        }
    }
}