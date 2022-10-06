import java.util.Scanner;

public class BDN1 {

    public static int count(int m, int n) {
        if (m == 1 || n == 1) return 1;
        return count(m - 1, n) + count(m, n - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- >0) {

            int[][] A = new int[25][25];

            int m = scanner.nextInt();
            int n = scanner.nextInt();
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++)
                    A[i][j] = scanner.nextInt();
            }
            System.out.println(count(m, n));
        }
    }

}






