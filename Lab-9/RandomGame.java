import java.util.*;

class Player extends Thread {
    int userInput;
    int randomNumber;

    public Player(int userInput) {
        this.userInput = userInput;
    }

    public void run() {
        Random rand = new Random();
        randomNumber = rand.nextInt(100);
    }
}

public class RandomGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Player 1, enter a number: ");
        int input1 = sc.nextInt();

        System.out.print("Player 2, enter a number: ");
        int input2 = sc.nextInt();

        Player p1 = new Player(input1);
        Player p2 = new Player(input2);

        p1.start();
        p2.start();

        try {
            p1.join();
            p2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int r1 = p1.randomNumber;
        int r2 = p2.randomNumber;

        System.out.println("Player 1 generated: " + r1);
        System.out.println("Player 2 generated: " + r2);

        if (r1 > r2) {
            System.out.println("Player 1 wins!");
            System.out.println("Points: " + (r1 - r2));
        } else if (r2 > r1) {
            System.out.println("Player 2 wins!");
            System.out.println("Points: " + (r2 - r1));
        } else {
            System.out.println("Same score");
        }

        sc.close();
    }
}