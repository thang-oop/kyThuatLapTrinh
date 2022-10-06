import java.util.Scanner;
import java.util.Stack;

public class TienTo_HauTo {

    static boolean isOperrator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') return true;
        return false;
    }

    static String prefixToPostfix(String s) {
        Stack <String> myStack = new Stack<>();
        int leng = s.length();

        for (int i = leng - 1; i >= 0; i--) {
            if (isOperrator(s.charAt(i))) {
                String operator1 = myStack.peek(); myStack.pop();
                String operator2 = myStack.peek(); myStack.pop();
                String temp = operator1  + operator2 + s.charAt(i);
                myStack.push(temp);
            }
            else myStack.push(s.charAt(i) + "");
        }
        return myStack.peek();
    }

    static void process(String s) {
        System.out.println(prefixToPostfix(s));
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-->0) {
            process(scanner.next());
        }

    }
}
