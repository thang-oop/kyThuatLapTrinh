import java.util.Scanner;
import java.util.Stack;

public class KiemTraNgoacDung {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-->0) {
            String s = scanner.nextLine();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                stack.add(s.charAt(i));
            } else {
                if (!stack.isEmpty()) {
                    if (s.charAt(i) == ']' && stack.peek() == '[') stack.pop();
                    else if (s.charAt(i) == ')' && stack.peek() == '(') stack.pop();
                    else if (s.charAt(i) == '}' && stack.peek() == '{') stack.pop();
                    else return false;
                } else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
