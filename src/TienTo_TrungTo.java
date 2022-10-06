import java.util.Scanner;
import java.util.Stack;

public class TienTo_TrungTo {

    static boolean isOperrator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') return true;
        return false;
    }

    static String prefixToInfix(String s) {
        Stack <String> myStack = new Stack<>();
        int leng = s.length();

        for (int i = leng - 1; i >= 0; i--) {
            if (isOperrator(s.charAt(i))) {
                String operator1 = myStack.peek(); myStack.pop();
                String operator2 = myStack.peek(); myStack.pop();
                String temp = "(" + operator1 + s.charAt(i) + operator2 + ")";
                myStack.push(temp);
            }
            else myStack.push(s.charAt(i) + "");
        }
        return myStack.peek();
    }

    static void process(String s) {
        System.out.println(prefixToInfix(s));
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-->0) {
            process(scanner.next());
        }

    }
}
