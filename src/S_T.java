import java.util.Scanner;

public class S_T {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- >0) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(countBuoc(a,b,0));

        }
    }

    public static int countBuoc(int a, int b, int count) {
        if (b == a) return count;
        if (a > b) return count += (a-b);
        if (b % 2 != 0) return countBuoc(a, b+1, count+1);
        return countBuoc(a, b/2, count+1);
    }
}
