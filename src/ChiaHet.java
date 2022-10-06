import java.math.BigInteger;
import java.util.Scanner;

public class ChiaHet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            if (a.mod(b).equals(BigInteger.ZERO) || b.mod(a).equals(BigInteger.ZERO))
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
    }
}
