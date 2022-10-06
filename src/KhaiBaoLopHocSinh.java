import java.util.Scanner;

public class KhaiBaoLopHocSinh {

    private String name;

    private String dob;

    private float mark1;

    private float mark2;

    private float mark3;

    private float totalMark;

    public KhaiBaoLopHocSinh() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public float getMark1() {
        return mark1;
    }

    public void setMark1(float mark1) {
        this.mark1 = mark1;
    }

    public float getMark2() {
        return mark2;
    }

    public void setMark2(float mark2) {
        this.mark2 = mark2;
    }

    public float getMark3() {
        return mark3;
    }

    public void setMark3(float mark3) {
        this.mark3 = mark3;
    }

    public float getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(float totalMark) {
        this.totalMark = totalMark;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        KhaiBaoLopHocSinh khaiBaoLopHocSinh = new KhaiBaoLopHocSinh();
        khaiBaoLopHocSinh.setName(scanner.nextLine());
        khaiBaoLopHocSinh.setDob(scanner.nextLine());
        khaiBaoLopHocSinh.setMark1(scanner.nextFloat());
        khaiBaoLopHocSinh.setMark2(scanner.nextFloat());
        khaiBaoLopHocSinh.setMark3(scanner.nextFloat());
        khaiBaoLopHocSinh.setTotalMark(khaiBaoLopHocSinh.getMark2()+khaiBaoLopHocSinh.getMark1()+khaiBaoLopHocSinh.getMark3());

        System.out.println(khaiBaoLopHocSinh.getName() + " " + khaiBaoLopHocSinh.getDob() + " " + khaiBaoLopHocSinh.getTotalMark());
    }
}
