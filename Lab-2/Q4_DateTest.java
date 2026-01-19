public class Q4_DateTest {
    public static void main(String[] args) {

        Date date = new Date(9, 15, 2025);
        date.displayDate();
    }
}

class Date {

    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Setters and Getters
    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    // Display date method
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
