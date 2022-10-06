import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DiemTuyenSinh {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        int test = Integer.parseInt(in.nextLine());
        ArrayList<TuyenSinh> list = new ArrayList<>();
        while (test--> 0) {
            TuyenSinh temp = new TuyenSinh(in.nextLine(), Float.parseFloat(in.nextLine()),in.nextLine(), Integer.parseInt(in.nextLine()));
            list.add(temp);
        }
        list.sort(new Comparator<TuyenSinh>() {
            @Override
            public int compare(TuyenSinh o1, TuyenSinh o2) {
                return Float.compare(o2.getDiemThi(), o1.getDiemThi());
            }
        });
        list.forEach(item -> System.out.println(item));
    }
}

class TuyenSinh {
    private static int id = 0;
    private String ten,danToc, maSV, trangThai;
    private int khuVuc;
    private float diemThi;

    public TuyenSinh(String ten, float diemThi,String danToc, int khuVuc) {
        this.ten = chuanHoa(ten);
        this.danToc = danToc;
        this.khuVuc = khuVuc;
        this.diemThi = tinhDiemThi(diemThi);
        this.maSV = taoMaSV();
    }

    private float tinhDiemThi(float diemThi) {
        float diemCong = 0;
        switch (khuVuc){
            case 1:
                diemCong += 1.5;
                break;
            case 2:
                diemCong += 1;
                break;
            default:
                diemCong = 0;
        }
        if(danToc.compareTo("Kinh") != 0){
            diemCong += 1.5;
        }
        if(Float.compare(diemThi+diemCong,20.5f) >= 0){
            trangThai = "Do";
        }
        else{
            trangThai = "Truot";
        }
        return diemThi+diemCong;
    }

    private String taoMaSV() {
        id++;
        StringBuilder result = new StringBuilder(String.valueOf(id));
        if(id < 10){
            result.insert(0,"0");
        }
        result.insert(0,"TS");
        return result.toString();
    }

    private String chuanHoa(String ten) {
        StringTokenizer str = new StringTokenizer(ten.trim().toLowerCase(), " ");
        StringBuilder result = new StringBuilder("");
        while(str.hasMoreTokens()){
            String temp = str.nextToken();
            result.append(temp.substring(0,1).toUpperCase() + temp.substring(1) + " ");
        }
        return result.toString().trim();
    }

    public String getMaSV() {
        return maSV;
    }

    public float getDiemThi() {
        return diemThi;
    }

    @Override
    public String toString() {
        return maSV + " " + ten + " " + String.format("%.1f",diemThi) + " " + trangThai;
    }
}
