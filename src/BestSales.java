import java.util.PriorityQueue;
import java.util.Scanner;

public class BestSales {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        System.out.print("Enter number of sales: ");
        int n = sc.nextInt();

        System.out.println("Enter sales values:");
        for (int i = 0; i < n; i++) {
            heap.add(sc.nextInt());
        }

        System.out.println("Best (Minimum) Sale = " + heap.peek());

        sc.close();
    }
}
