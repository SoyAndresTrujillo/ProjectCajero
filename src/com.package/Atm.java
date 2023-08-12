public class Atm {
    private BankAccount bankAccount;

    public Atm(BankAccount BankAccount) {
        this.bankAccount = BankAccount;
    }

    void visualiseBalance() {
        bankAccount.getBalance();
    }

    void depositToBalance(double value) {
        bankAccount.setBalance(bankAccount.getBalance() + value);
    }

    void withDraw(double value) {
        if (value > bankAccount.getBalance()) {
            System.out.println("The balance to withdraw is major that your balance");
        } else {
            bankAccount.setBalance(bankAccount.getBalance() - value);
        }
    }
}
