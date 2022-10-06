import java.util.*;

public class DsMatHang {

    private int ma;
    private String name;
    private String donVi;
    private int giaMua;
    private int giaBan;

    private int loiNhan;

    public DsMatHang() {
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(int giaMua) {
        this.giaMua = giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getLoiNhan() {
        return loiNhan;
    }

    public void setLoiNhan(int loiNhan) {
        this.loiNhan = loiNhan;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner scanner = new Scanner(System.in);

        List<DsMatHang> dsMatHangs = new ArrayList<>();
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            DsMatHang dsMatHang = new DsMatHang();
            dsMatHang.setMa(i+1);
            dsMatHang.setName(scanner.nextLine());
            dsMatHang.setDonVi(scanner.nextLine());
            dsMatHang.setGiaMua(Integer.parseInt(scanner.nextLine()));
            dsMatHang.setGiaBan(Integer.parseInt(scanner.nextLine()));
            dsMatHang.setLoiNhan(dsMatHang.getGiaBan() - dsMatHang.getGiaMua());
            dsMatHangs.add(dsMatHang);
        }


        Collections.sort(dsMatHangs, new Comparator<DsMatHang>() {
            @Override
            public int compare(DsMatHang o1, DsMatHang o2) {
                int c = o1.getLoiNhan() - o2.getLoiNhan();
                if (c == 0)
                    c = o2.getMa() - o1.getMa();
                return c;
            }
        });

        for (int i = dsMatHangs.size()-1; i >= 0; i--) {

            int ma = dsMatHangs.get(i).getMa();
            String maTr = "MH" + (ma < 10 ? "00"+ma : ma == 100 ? ma : "0"+ma);
            System.out.println(maTr + " " + dsMatHangs.get(i).getName() + " " + dsMatHangs.get(i).getDonVi() + " " + dsMatHangs.get(i).getGiaMua() + " " + dsMatHangs.get(i).getGiaBan() + " " + dsMatHangs.get(i).getLoiNhan());
        }
    }
}
