import java.util.*;

class Convert extends Thread {
    String exp;

    Convert(String exp) {
        this.exp = exp;
    }

    public void run() {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                st.push(c + "");
            } else {
                if (st.size() < 2) {
                    return;
                }

                String b = st.pop();
                String a = st.pop();

                st.push(a + c + b);
            }
        }

        if (!st.isEmpty()) {
            System.out.println("Infix Expression: " + st.peek());
        }
    }
}

public class ConvertMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String s = sc.next();

        Convert t1 = new Convert(s);

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}