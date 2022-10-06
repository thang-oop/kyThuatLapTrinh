import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class GiaTriNhoNhatCuaXau {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- >0) {
            int k = scanner.nextInt();
            String s = scanner.next();
            long[] d = new long[500];
            PriorityQueue<Long> q = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < 500; i++)
                d[i] = 0;

            for (int i = 0; i < s.length(); i++)
                d[s.charAt(i)]++;

            for (int i = 0; i < 500; i++)
                if (d[i] > 0) q.add(d[i]);

            while (q.size() > 0 && k > 0) {
                long top = q.peek(); q.poll();
                k--;
                top--;
                q.add(top);
            }

            long res = 0;
            while (q.size() > 0) {
                res += q.peek()*q.peek();
                q.poll();
            }

            System.out.println(res);
        }
    }
}
