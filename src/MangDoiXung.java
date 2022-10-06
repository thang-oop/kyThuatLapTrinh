import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MangDoiXung {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t > 0) {
            int n = scanner.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++)
                arr.add(scanner.nextInt());

            boolean check = true;
            for (int i = 0; i < n / 2; i++) {
                if (arr.get(i) != arr.get(n-1-i)) {
                    System.out.println("NO");
                    check = false;
                    break;
                }
            }

            if (check) System.out.println("YES");
            t--;
        }
    }
}
