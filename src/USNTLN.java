import java.util.Scanner;

public class USNTLN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t > 0) {
            long n = scanner.nextLong();
            long max = 0;
            while (n % 2 == 0) {
                max = 2;
                n /= 2;
            }

            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                while (n % i == 0) {
                    max = max < i ? i : max;
                    n /= i;
                }
            }
            if (n > 2)
                max = max < n ? n : max;
            System.out.println(max);

            t--;
        }
    }
}
