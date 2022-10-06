import java.util.Scanner;

public class SapXepNoiBot {

    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int[] a = new int[n + 5];
        int temp = 1;

        for (int i = 0; i < n; i++)
            a[i] = sr.nextInt();

        for (int i = 0; i < n; i++) {
            int kq = 1;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int x = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = x;
                    kq = 0;
                }
            }
            if (kq == 1) break;
            System.out.print("Buoc " + temp + ": ");
            for (int j = 0; j < n; j++) System.out.print(a[j] + " ");
            System.out.println();
            temp++;
        }
    }
}
