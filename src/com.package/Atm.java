public class Atm {
    private BankAccount bankAccount;

    public Atm(BankAccount BankAccount) {
        this.bankAccount = BankAccount;
    }

    public void visualiseBalance() {
        System.out.println("Your balance is: " + bankAccount.getBalance() + "\n");
    }

    public void depositToBalance(double value) {
        bankAccount.setBalance(bankAccount.getBalance() + value);
        visualiseBalance();
    }

    void withDraw(double value) {
        if (value > bankAccount.getBalance()) {
            System.out.println("Balance insufficient \n");
        } else {
            bankAccount.setBalance(bankAccount.getBalance() - value);
            visualiseBalance();
        }
    }
}
