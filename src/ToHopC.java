import java.util.Scanner;

public class ToHopC {

    static int[][] C = new int[1005][1005];
    static int n, k;
    static int M = 1000000007;

    static void process() {
        int j;
        for (int i = 0; i <= 1000; i++) {
            for (j = 0; j <= i; j++) {
                if (j == 0 || j == i) C[i][j] = 1;
                else C[i][j] = (C[i - 1][j] + C[i - 1][j - 1]) % M;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            process();
            System.out.println(C[n][k]);
            t--;
        }
    }
}
