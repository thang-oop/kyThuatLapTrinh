import java.util.Scanner;

public class HoanViKeTiep {

    static int[] A = new int[1005];
    static boolean check(int n) {
        for (int i = 0; i < n-1; i++)
            if (A[i] < A[i + 1]) return true;
        return false;
    }

    static void process(int n) {

        if (!check(n)) {
            for (int i = 1; i <= n; i++)
                System.out.print(i + " ");
            System.out.println();
            return;
        }

        int i, j;
        for (i = n - 1; i > 0; i--)
            if (A[i] > A[i - 1]) break;

        for (j = n - 1; A[j] <= A[i - 1]; j--);

        int t = A[i - 1];
        A[i - 1] = A[j];
        A[j] = t;
        for (j = n - 1; i < j; i++, j--) {
            t = A[i];
            A[i] = A[j];
            A[j] = t;
        }

        for( i = 0; i < n; i++)
            System.out.print( A[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++)
                A[i] = scanner.nextInt();
            process(n);
            t--;
        }
    }
}
