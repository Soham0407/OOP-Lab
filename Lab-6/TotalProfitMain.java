import java.util.Scanner;

class TotalProfit {
    int attendees;
    double profit = 20;

    TotalProfit(int attendees) {
        this.attendees = attendees;
    }

    void profit() {
        profit = (attendees * (5.0 - 0.5)) - 20;
        System.out.println("Total Profit earned by the theatre: " + profit);
    }
}

public class TotalProfitMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of attendees at the show: ");
        int attendees = input.nextInt();
        TotalProfit theatre = new TotalProfit(attendees);
        theatre.profit();
    }
}