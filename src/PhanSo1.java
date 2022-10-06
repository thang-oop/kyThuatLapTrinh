import java.math.BigInteger;
import java.util.Scanner;

public class PhanSo1 {
    private BigInteger a;
    private BigInteger b;

    public PhanSo1() {
    }

    public BigInteger getA() {
        return a;
    }

    public void setA(BigInteger a) {
        this.a = a;
    }

    public BigInteger getB() {
        return b;
    }

    public void setB(BigInteger b) {
        this.b = b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PhanSo1 phanSoReal = new PhanSo1();
        phanSoReal.setA(scanner.nextBigInteger());
        phanSoReal.setB(scanner.nextBigInteger());

        BigInteger ucln = phanSoReal.getA().gcd(phanSoReal.getB());
        System.out.println(phanSoReal.getA().divide(ucln) + "/" + phanSoReal.getB().divide(ucln));
    }

}
