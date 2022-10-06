import java.util.Scanner;

public class SapXepChon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int A[] = new int[n + 5];

        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        int count = 1;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (A[min] > A[j]) min = j;

            int temp = A[min];
            A[min] = A[i];
            A[i] = temp;

            System.out.print("Buoc " + count + ": ");
            print(A, n);
            count++;
        }
    }
    public static void print(int a[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
