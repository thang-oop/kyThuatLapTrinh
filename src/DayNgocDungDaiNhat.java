import java.util.Scanner;
import java.util.Stack;

public class DayNgocDungDaiNhat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-->0) {
            int Max = 0;
            String s = scanner.next();
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) == '(') stack.push(i);
                else {
                    stack.pop();
                    if (!stack.empty())
                        Max = Math.max(Max, i - stack.peek());
                    else stack.push(i);
                }

            System.out.println(Max);
        }
    }
}
