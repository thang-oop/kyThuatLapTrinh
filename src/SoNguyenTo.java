import java.util.Scanner;

public class SoNguyenTo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {
            int a = scanner.nextInt();
            System.out.println(checkSNT(a) ? "YES" : "NO");
            t--;
        }
    }

    public static boolean checkSNT(int a) {

        for (int i = 2; i <= Math.sqrt(a); i++)
            if (a % i == 0) return false;
        return true;
    }
}
