import java.util.Scanner;

public class DayXauFibonacci {

    static long[] F = new long[95];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        F[1] = F[2] = 1;
        for (int i = 3; i <= 92; i++)
            F[i] = F[i-1] + F[i-2];

        while (t > 0) {
            long n = scanner.nextLong(), i = scanner.nextLong();
            process(n, i);
            t--;
        }
    }

    static void process(long n, long i) {
        while (n > 2) {
            if (i <= F[(int) n-2]) n -= 2;
            else {
                i -= F[(int) n-2];
                n -= 1;
            }
        }

        if (n == 1) System.out.println('A');
        else System.out.println('B');
    }
}
