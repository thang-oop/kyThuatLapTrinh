import java.math.BigInteger;
import java.util.Scanner;

public class HieuSoNguyenLon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        System.out.println(a.subtract(b));
    }

}
