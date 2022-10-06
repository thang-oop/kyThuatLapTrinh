import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class XetTuyen {

    public static String chuanHoa (String s) {
        String result = "";
        s = s.trim().toLowerCase().replaceAll("\\s+", " ");

        String words[] = s.split(" ");

        for (String word : words) {
            result += String.valueOf(word.charAt(0)).toUpperCase();
            result += word.substring(1);
            result += " ";
        }
        return result.trim();
    }

    public static void main(String[] args) throws IOException, ParseException {

        Stream<String> stream = Files.lines(Paths.get("DATA.in"));

        List<String> input = new ArrayList<>();
        List<Apply> applies = new ArrayList<>();
        stream.forEach(lines -> {
            input.add(lines);
        });

        int t = Integer.parseInt(input.get(0));
        int i = 1, count = 1;

        while (t-->0) {
            applies.add(new Apply("PH" + String.format("%02d", count++), chuanHoa(input.get(i++)), input.get(i++), Float.parseFloat(input.get(i++)), Float.parseFloat(input.get(i++))));
        }
        for (Apply apply : applies)
            System.out.println(apply);
    }

}

class Apply {

    private String ma;

    private String name;

    private Date dob;

    private float th;

    private float lt;

    public Apply(String ma, String name, String dob, float th, float lt) throws ParseException {
        this.ma = ma;
        this.name = name;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.th = th;
        this.lt = lt;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getTuoi() {
        return 2021 - 1900 - dob.getYear();
    }

    public int getDiem() {
        int diem = (int) Math.round((lt + th)/2 + (lt >= 8 && th >= 8 ? 1 : lt >= 7.5 && th >= 7.5 ? 0.5 : 0));
        return diem > 10 ? 10 : diem;
    }

    public String getXepLoai() {
        int diem = getDiem();
        return diem < 5 ? "Truot" : diem >= 5 && diem <= 6 ? "Trung binh" : diem == 7 ? "Kha" : diem == 8 ? "Gioi" : "Xuat sac";
    }
    @Override
    public String toString() {
        return ma + " " + name + " " + getTuoi() + " " + getDiem() + " " + getXepLoai();
    }
}