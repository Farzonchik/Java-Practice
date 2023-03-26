import java.util.Scanner;

public class BankAccount {
    static Scanner scanner = new Scanner(System.in);
    static String acctNumber;
    static double balance;

    public static void main(String[] args) {
        System.out.println();
        acctNumber = scanner.next();
        balance = scanner.nextDouble();

        CertificateOfDeposit certificateOfDeposit = new CertificateOfDeposit();
        int expiryYear = certificateOfDeposit.expiryYear;

        CheckingAccount checkingAccount = new CheckingAccount();
        double limit = checkingAccount.limit;

        SavingsAccount savingsAccount = new SavingsAccount();
        int transfer = savingsAccount.transfer;

        System.out.println("The");
    }
}

class CertificateOfDeposit extends BankAccount {
    int expiryYear = scanner.nextInt();
}

class CheckingAccount extends BankAccount {
    double limit = scanner.nextDouble();
}

class SavingsAccount extends BankAccount {
    int transfer = scanner.nextInt();
}