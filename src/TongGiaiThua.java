import java.util.Scanner;

public class TongGiaiThua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long sum = 0, t = 1;
        for (int i = 1; i <= n; i++) {
            t *= i;
            sum += t;
        }
        System.out.println(sum);
    }
}

