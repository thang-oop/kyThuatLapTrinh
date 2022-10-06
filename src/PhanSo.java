import java.math.BigInteger;
import java.util.Scanner;

public class PhanSo {

    private long tuSo;
    private long mauSo;

    public PhanSo(String str) {
        String[] arr = str.split(" ");
        this.tuSo = Long.parseLong(arr[0]);
        this.mauSo = Long.parseLong(arr[1]);
    }

    public PhanSo() {
    }

    public long getTuSo() {
        return tuSo;
    }

    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public void setMauSo(long mauSo) {
        this.mauSo = mauSo;
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }

    public PhanSo rutGonPhanSo(PhanSo B) {

        PhanSo phanSo = new PhanSo();
        BigInteger a = BigInteger.valueOf(B.getTuSo());
        BigInteger b = BigInteger.valueOf(B.getMauSo());

        BigInteger ucln = a.gcd(b);
        phanSo.setTuSo(a.divide(ucln).longValue());
        phanSo.setMauSo(b.divide(ucln).longValue());
        return phanSo;

    }
//
//    public PhanSo processCong(PhanSo B) {
//        PhanSo result = new PhanSo();
//        BigInteger c = BigInteger.valueOf((this.tuSo + this.mauSo)*(this.tuSo + this.mauSo));
//        BigInteger d = BigInteger.valueOf(this.tuSo).multiply(BigInteger.valueOf(this.mauSo)).multiply(c);
//        result.setTuSo(c.longValue());
//        result.setMauSo(d.longValue());
//        return rutGonPhanSo(result);
//    }

    public PhanSo cong(PhanSo B) {

        PhanSo temp = new PhanSo();

        BigInteger a = BigInteger.valueOf(this.tuSo);
        BigInteger b = BigInteger.valueOf(this.mauSo);
        BigInteger c = BigInteger.valueOf(B.getTuSo());
        BigInteger d = BigInteger.valueOf(B.getMauSo());

        BigInteger tu = (a.multiply(d)).add(c.multiply(b));
        BigInteger mau = b.multiply(d);
        temp.setTuSo(tu.longValue());
        temp.setMauSo(mau.longValue());
        return rutGonPhanSo(temp);
    }

    public PhanSo nhan(PhanSo B) {

        PhanSo temp = rutGonPhanSo(B);
        BigInteger a = BigInteger.valueOf(this.tuSo);
        BigInteger b = BigInteger.valueOf(this.mauSo);
        BigInteger c = BigInteger.valueOf(B.getTuSo());
        BigInteger d = BigInteger.valueOf(B.getMauSo());
        BigInteger tu = a.multiply(c);
        BigInteger mau = b.multiply(d);

        temp.setTuSo(tu.longValue());
        temp.setMauSo(mau.longValue());
        return rutGonPhanSo(temp);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            PhanSo A = new PhanSo(sc.nextLine());
            PhanSo B = new PhanSo(sc.nextLine());
            PhanSo tongAB = A.cong(B);
            PhanSo tichAB = A.nhan(B);
            PhanSo C = tongAB.nhan(tongAB);
            System.out.print(C);
            System.out.print(" ");
            System.out.println(tichAB.nhan(C));
        }
    }
}
