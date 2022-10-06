import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KhaiBaoLopSV {

    private String MSV;
    private String name;
    private String classSv;
    private String dob;
    private float gpa;

    public KhaiBaoLopSV() {
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassSv() {
        return classSv;
    }

    public void setClassSv(String classSv) {
        this.classSv = classSv;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        KhaiBaoLopSV khaiBaoLopSV = new KhaiBaoLopSV();
        khaiBaoLopSV.setMSV("B20DCCN001");
        khaiBaoLopSV.setName(scanner.nextLine());
        khaiBaoLopSV.setClassSv(scanner.nextLine());


        String dateStr = scanner.nextLine();

        try {

            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
            khaiBaoLopSV.setDob(new SimpleDateFormat("dd/MM/yyyy").format(date));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        khaiBaoLopSV.setGpa(scanner.nextFloat());

        System.out.println(khaiBaoLopSV.getMSV() + " " + khaiBaoLopSV.getName() + " " + khaiBaoLopSV.getClassSv()
        + " " + khaiBaoLopSV.getDob() + " " + String.format("%.2f", khaiBaoLopSV.getGpa()));
    }
}
