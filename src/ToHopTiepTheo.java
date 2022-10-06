import java.util.Scanner;

public class ToHopTiepTheo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- >0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] A = new int[100];
            int[] B = new int[100];
            for (int i = 1; i <= k; i++) {
                A[i] = scanner.nextInt();
                B[i] = A[i];
            }

            int i = k, j;
            while (A[i] == n - k + i) i--;
            if (i == 0) {
                System.out.println(k);
            }
            else {
                A[i]++;
                if (A[i + 1] - A[i] != 1)
                    for (j = i + 1; j <= k; j++)
                        A[j] = A[i] + (j - i);

                int count = 0;
                for ( i = 1; i <= k; i++) {
                    for ( j = 1; j <= k; j++) {
                        if (B[i] == A[j]) count++;
                    }
                }
                System.out.println(k - count);
            }
        }
    }
}
