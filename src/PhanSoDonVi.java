import java.util.Scanner;

public class PhanSoDonVi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            long tu = sc.nextLong();
            long mau = sc.nextLong();
            long res;

            while (true) {
                if (mau % tu == 0) {
                    System.out.print("1/" + mau/tu);
                    break;
                } else {
                    res = mau/tu + 1;
                    System.out.print("1/" + res + " + ");
                    tu = tu * res - mau;
                    mau = mau * res;
                }
            }
            System.out.println();
        }
    }
}
