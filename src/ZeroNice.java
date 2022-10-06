import java.util.*;

public class ZeroNice {

    static List<String> number = new ArrayList<>();

    public static void solve() {
        Queue<String> q = new LinkedList<>();
        q.add("9");
        for (int i = 10005; i >= 0; i--) {
            String s1 = q.peek();
            number.add(s1);
            q.poll();
            String s2 = s1;
            q.add(s1+="0");
            q.add(s2+="9");
        }
    }

    public static void main(String[] args) {
        solve();
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- >0) {

            int a = scanner.nextInt();
            for(int i = 0; i < number.size(); i++)
                if (Integer.parseInt(number.get(i)) % a == 0) {
                    System.out.println(number.get(i));
                    break;
                }

        }

    }
}
