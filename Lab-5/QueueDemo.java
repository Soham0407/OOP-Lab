import java.util.Scanner;

interface QueueImpl {
    void insert(int item);

    void delete();

    void display();
}

public class QueueDemo implements QueueImpl {

    int[] queue = new int[10];
    int front = -1;
    int rear = -1;
    int MAX = 10;

    public void insert(int item) {
        if (rear == MAX - 1) {
            System.out.println("Queue Overflow: Cannot insert " + item);
            return;
        }

        if (front == -1) {
            front = 0;
        }

        queue[++rear] = item;
        System.out.println(item + " inserted into queue");
    }

    public void delete() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(queue[front] + " deleted from queue");
        front++;

        for (int i = front; i < rear; i++) {
            queue[i] = queue[i + 1];
        }

        rear--;

        if (front > rear) {
            front = rear = -1;
        }
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        QueueDemo q = new QueueDemo();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an item to insert: ");
                    int item = sc.nextInt();
                    q.insert(item);
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}
