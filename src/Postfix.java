import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();

        System.out.print("Enter Postfix Expression: ");
        String exp = sc.next();

        for (char ch : exp.toCharArray()) {

            if (Character.isDigit(ch)) {
                s.push(ch - '0');
            } else {
                int b = s.pop();
                int a = s.pop();

                if (ch == '+')
                    s.push(a + b);
                else if (ch == '-')
                    s.push(a - b);
                else if (ch == '*')
                    s.push(a * b);
                else if (ch == '/')
                    s.push(a / b);
            }
        }

        System.out.println("Result = " + s.pop());

        sc.close();
    }
}
