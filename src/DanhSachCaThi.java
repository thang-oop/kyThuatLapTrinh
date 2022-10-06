import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class DanhSachCaThi {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("DATA.in"));
        int test = Integer.parseInt(in.nextLine());
        ArrayList<CaThi> list = new ArrayList<>();
        while(test-->0){
            CaThi temp = new CaThi(in.nextLine(),in.nextLine(),in.nextLine());
            list.add(temp);
        }
        list.sort(new Comparator<CaThi>() {
            @Override
            public int compare(CaThi o1, CaThi o2) {
                if(o1.getNgayThi().compareTo(o2.getNgayThi()) == 0){
                    if(o1.getGioThi().compareTo(o2.getGioThi()) == 0){
                        return o1.getMaCaThi().compareTo(o2.getMaCaThi());
                    }
                    return o1.getGioThi().compareTo(o2.getGioThi());
                }
                return o1.getNgayThi().compareTo(o2.getNgayThi());
            }
        });
        list.forEach(item -> System.out.println(item));
    }
}

class CaThi {
    private String maCaThi, phongThi;
    private static int id = 0;
    private Date ngayThi, gioThi;

    public CaThi(String ngayThi,String gioThi, String phongThi) throws ParseException {
        this.phongThi = phongThi;
        this.ngayThi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayThi);
        this.gioThi = new SimpleDateFormat("HH:mm").parse(gioThi);
        this.maCaThi = "C" + String.format("%03d", ++id);
    }

    public Date getNgayThi() {
        return ngayThi;
    }

    public String getMaCaThi() {
        return maCaThi;
    }

    public Date getGioThi() {
        return gioThi;
    }

    @Override
    public String toString() {
        return maCaThi + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayThi) + " " + new SimpleDateFormat("HH:mm").format(gioThi) + " " + phongThi;
    }
}
