import java.util.Scanner;
import java.util.Stack;

public class SuaLaiDayNgoac {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            String s = scanner.next();

            Stack<Character> myStack = new Stack<>();

            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) == ')' && !myStack.empty()) {
                    if (myStack.peek() == '(') myStack.pop();
                    else myStack.push(s.charAt(i));
                }
                else myStack.push(s.charAt(i));


            int leng = myStack.size();
            int count = 0;
            while (!myStack.empty() && myStack.peek() == '(') {
                myStack.pop();
                count++;
            }
            System.out.println(leng / 2 + count % 2);
        }
    }
}
