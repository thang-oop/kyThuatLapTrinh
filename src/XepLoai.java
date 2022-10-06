import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class XepLoai {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<TongKet> arrayList = new ArrayList<TongKet>();
        while(t-->0){
            TongKet sv = new TongKet(in.nextLine(),Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
            arrayList.add(sv);
        }
        arrayList.sort(new Comparator<TongKet>() {
            @Override
            public int compare(TongKet o1, TongKet o2) {

                return o2.getDiemTongK().compareTo(o1.getDiemTongK());
            }
        });
        arrayList.forEach(item -> System.out.println(item));
    }
}

class TongKet {
    private String hoTen, maSV, xepLoai;
    private String diemTongK;
    private static int id = 1;

    public TongKet(String hoTen, int d1, int d2, int d3) {
        this.hoTen = chuanHoaHoTen(hoTen);
        this.diemTongK = tinhDiemTong(d1,d2,d3);
        this.maSV = taoMaSV();
    }

    private String taoMaSV() {
        StringBuilder str = new StringBuilder(String.valueOf(id));
        if(id < 10){
            str.insert(0,"0");
        }
        id++;
        str.insert(0,"SV");
        return str.toString();
    }

    public String getDiemTongK() {
        return diemTongK;
    }

    private String tinhDiemTong(int d1, int d2, int d3) {
        float sum = (float) ((float)d1*0.25 + (float)d2*0.35 + (float)d3*0.40);
        if(sum >= 8) xepLoai = "GIOI";
        if(sum < 8 && sum >= 6.5) xepLoai = "KHA";
        if(sum < 6.5 && sum >= 5) xepLoai = "TRUNG BINH";
        if(sum < 5) xepLoai = "KEM";
        return String.format("%.2f",sum);
    }

    private String chuanHoaHoTen(String hoTen) {
        StringTokenizer str = new StringTokenizer(hoTen.trim().toLowerCase(), " ");
        StringBuilder result = new StringBuilder();
        while(str.hasMoreTokens()){
            String temp = str.nextToken();
            result.append(temp.substring(0,1).toUpperCase() + temp.substring(1) + " ");
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + diemTongK + " " + xepLoai;
    }
}