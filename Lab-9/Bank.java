import java.util.*;

class Account {
    int balance = 600;

    synchronized void deposit(int amt) {
        while (balance > 2000) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        balance += amt;
        System.out.println("Deposit: " + amt + " Balance: " + balance);
        notifyAll();
    }

    synchronized void withdraw(int amt) {
        while (balance <= 2000) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        if (balance > 500) {
            balance -= amt;
            System.out.println("Withdraw: " + amt + " Balance: " + balance);
        }

        notifyAll();
    }
}

class Father extends Thread {
    Account acc;

    Father(Account a) {
        acc = a;
    }

    public void run() {
        Random r = new Random();
        while (true) {
            int amt = r.nextInt(200);
            acc.deposit(amt);
            try {
                sleep(100);
            } catch (Exception e) {
            }
        }
    }
}

class Son extends Thread {
    Account acc;

    Son(Account a) {
        acc = a;
    }

    public void run() {
        Random r = new Random();
        while (true) {
            int amt = r.nextInt(150) + 1;
            acc.withdraw(amt);
            try {
                sleep(100);
            } catch (Exception e) {
            }
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc = new Account();
        new Father(acc).start();
        new Son(acc).start();
    }
}