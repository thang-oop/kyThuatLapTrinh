import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Stream;


public class DanhSachTrungTuyen {

    private static String chuanhoa(String s) {
        String word = "";
        s = s.trim().toLowerCase();
        s = s.replaceAll("\\s+", " ");
        String[] words = s.split(" ");
        for (String i : words) {
            word += String.valueOf(i.charAt(0)).toUpperCase();
            word += i.substring(1);
            word += " ";
        }
        return word.trim();
    }

    public static void main(String[] args) throws IOException {
        List<String> arr = new ArrayList<>();
        List<ThiSinh> listTS = new ArrayList<>();

        String file = "THISINH.in";

        Scanner scanner = new Scanner(new File(file));
        while (scanner.hasNextLine()) {
            arr.add(scanner.nextLine());
        }

        int soSV = Integer.parseInt(arr.get(0));
        int dem = 1;
        for (int i = 0; i < soSV; i++) {
            ThiSinh ts = new ThiSinh(arr.get(dem), chuanhoa(arr.get(++dem)), Float.parseFloat(arr.get(++dem)), Float.parseFloat(arr.get(++dem)), Float.parseFloat(arr.get(++dem)));
            dem++;
            listTS.add(ts);
        }


        Collections.sort(listTS, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                return Double.compare(Double.parseDouble(o2.kq()), Double.parseDouble(o1.kq()));
            }
        });
        double diemchuan = 0;
        if (Integer.parseInt(arr.get(arr.size() - 1)) >= Integer.parseInt(arr.get(0))) {
            diemchuan = Double.parseDouble(listTS.get(listTS.size() - 1).kq());
        } else {
            diemchuan = Double.parseDouble(listTS.get(Integer.parseInt(arr.get(arr.size() - 1)) - 1).kq());
        }
        System.out.println(diemchuan);
        for (ThiSinh ts : listTS) {
            System.out.print(ts);
            if (Double.parseDouble(ts.kq()) >= diemchuan) {
                System.out.println(" TRUNG TUYEN");
            } else {
                System.out.println(" TRUOT");
            }
        }
    }
}
class ThiSinh{
    private String ma, name;

    private float toan, ly, hoa;

    public ThiSinh(String ma, String name, float toan, float ly, float hoa) {
        this.ma = ma;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String diemuutien() {
        String maKV = this.ma.substring(0, 3);
        if (maKV.compareTo("KV1") == 0) {
            return "0.5";
        }
        if (maKV.compareTo("KV2") == 0) {
            return "1";
        }
        if (maKV.compareTo("KV3") == 0) {
            return "2.5";
        }
        return "";
    }

    public String kq() {
        float diem = toan * 2 + ly + hoa + Float.parseFloat(diemuutien());
        return diem % 1.0 == 0 ? Integer.toString((int) diem) : String.valueOf(diem);
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + diemuutien() + " " + kq();
    }
}
