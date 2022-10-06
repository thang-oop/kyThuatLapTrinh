import java.util.Scanner;

public class ThuNhapGiaoVien {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String ma = scanner.nextLine();
        String name = scanner.nextLine();
        double luong = scanner.nextDouble();
        int bac = Integer.parseInt(ma.substring(2));
        String chucVu = ma.substring(0,2);
        int phuCap = chucVu.equals("HT") ? 2000000 : chucVu.equals("HP") ? 900000 : 500000;

        System.out.println(ma + " " + name + " " + bac + " " + phuCap + " " + (long)(luong*bac+phuCap));
    }
}
