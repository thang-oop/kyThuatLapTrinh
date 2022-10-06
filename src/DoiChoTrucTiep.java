import java.util.Scanner;

public class DoiChoTrucTiep {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[100];
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();

        int count = 0;
        boolean check = false;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    check = true;
                }
            }
            if (check) {
                count++;
                System.out.print("Buoc " + count + ": ");
                print(a,n);
                check = false;
            }
        }
    }

    public static void print(int a[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
