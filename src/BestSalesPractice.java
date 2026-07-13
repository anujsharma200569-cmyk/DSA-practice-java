import java.util.*;
public class BestSalesPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        System.out.println("Enter number of sales :");
        int n = sc.nextInt();

        System.out.println("Enter sales values: ");
        for (int i = 0; i<n;i++){
            heap.add(sc.nextInt());
        }

        System.out.println("Best (Minimum) Sale = " +heap.peek());
    }
}
