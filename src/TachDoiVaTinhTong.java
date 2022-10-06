import java.math.BigInteger;
import java.util.Scanner;

public class TachDoiVaTinhTong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        int n = s.length();
        if (n == 1) System.out.println(s);
        while (n > 1) {
            String a = "";
            String b = "";
            for (int i = 0; i < n/2; i++)
                a += s.charAt(i);

            for (int i = n/2; i < n; i++)
                b += s.charAt(i);

            BigInteger A = new BigInteger(a);
            BigInteger B = new BigInteger(b);
            BigInteger C = A.add(B);
            System.out.println(C);
            s = C.toString();
            n = s.length();
        }
    }
}
