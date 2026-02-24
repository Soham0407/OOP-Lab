import java.util.Scanner;

public class WashingMachine {

    private int noOfClothes;
    private boolean isOn;

    public void switchOn() {
        isOn = true;
        System.out.println("Washing Machine is switched ON.");
    }

    public int acceptClothes(int noOfClothes) {
        this.noOfClothes = noOfClothes;
        System.out.println(noOfClothes + " clothes accepted.");
        return this.noOfClothes;
    }

    public void acceptDetergent(String detergent) {
        System.out.println("Detergent added: " + detergent);
    }

    public void switchOff() {
        isOn = false;
        System.out.println("Washing Machine is switched OFF.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WashingMachine wm = new WashingMachine();

        wm.switchOn();

        System.out.print("Enter number of clothes: ");
        int clothes = sc.nextInt();
        wm.acceptClothes(clothes);
        sc.nextLine();

        System.out.print("Enter detergent name: ");
        String detergent = sc.nextLine();
        wm.acceptDetergent(detergent);

        wm.switchOff();

        sc.close();
    }
}