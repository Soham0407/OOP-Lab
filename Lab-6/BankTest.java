import java.util.Scanner;

class Bank {

    double deposit(double amount, double balance) {
        double newBalance = balance + amount;
        return newBalance;
    }

    double withdraw(double amount, double balance) {
        if (balance >= amount) {
            return balance - amount;
        } else {
            return 0;
        }
    }
}

public class BankTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        System.out.print("Enter current balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();

        balance = b.deposit(depositAmount, balance);
        System.out.println("Balance after deposit: " + balance);

        System.out.print("Enter withdraw amount: ");
        double withdrawAmount = sc.nextDouble();

        double newBalance = b.withdraw(withdrawAmount, balance);

        if (newBalance == 0) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            System.out.println("Balance after withdrawal: " + newBalance);
        }

        sc.close();
    }
}