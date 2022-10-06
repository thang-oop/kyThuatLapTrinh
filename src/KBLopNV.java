import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KBLopNV {

    private String mnv;
    private String name;
    private String sex;
    private String dob;
    private String address;
    private String mst;
    private String ngayKyHopDong;

    public KBLopNV() {
    }

    public String getMnv() {
        return mnv;
    }

    public void setMnv(String mnv) {
        this.mnv = mnv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst;
    }

    public String getNgayKyHopDong() {
        return ngayKyHopDong;
    }

    public void setNgayKyHopDong(String ngayKyHopDong) {
        this.ngayKyHopDong = ngayKyHopDong;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        KBLopNV kbLopNV = new KBLopNV();
        kbLopNV.setName(scanner.nextLine());
        kbLopNV.setSex(scanner.nextLine());
        kbLopNV.setDob(format(scanner.nextLine()));
        kbLopNV.setAddress(scanner.nextLine());
        kbLopNV.setMst(scanner.nextLine());
        kbLopNV.setNgayKyHopDong(format(scanner.nextLine()));
        kbLopNV.setMnv("00001");

        System.out.print(kbLopNV.getMnv() + " " + kbLopNV.getName() + " " + kbLopNV.getSex() + " " + kbLopNV.getDob() + " "
        + kbLopNV.getAddress() + " " + kbLopNV.getMst() + " " + kbLopNV.getNgayKyHopDong());
    }

    public static String format(String s) {
        Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(s);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
}
