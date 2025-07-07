package AcessModifiers;

public class BankAccountMain {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = "AC123456";
        sa.accountHolder = "Aniket";
        sa.setBalance(100000);

        sa.showAccount();
        System.out.println("Balance: " + sa.getBalance());
    }
}
