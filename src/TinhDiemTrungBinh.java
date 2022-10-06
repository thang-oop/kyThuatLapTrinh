import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TinhDiemTrungBinh {

    public static String chuanHoa(String s) {

        StringTokenizer stringTokenizer = new StringTokenizer(s.trim().toLowerCase(), " ");
        String result = "";
        while(stringTokenizer.hasMoreTokens()){
            String temp = stringTokenizer.nextToken();
            result = result.concat(temp.substring(0,1).toUpperCase() + temp.substring(1) + " ");
        }
        return result;
    }

    public static float diemTB(int a, int b, int c) {
        float d = (float) (a*3 + b*3 + c*2) / (float) 8;
        return (float) (Math.round(d*100.0)/100.0);
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("DATA.in"));

        List<BangDiem> bangDiems = new ArrayList<>();
        int t = Integer.parseInt(scanner.nextLine());
        int count = 1;
        while (t-->0) {
            bangDiems.add(new BangDiem(count++, chuanHoa(scanner.nextLine()), diemTB(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()))));
        }

        Collections.sort(bangDiems, new Comparator<BangDiem>() {
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                if (o1.getTb() == o2.getTb()) {
                    return o1.getMa() - o2.getMa();
                }

                return Float.compare(o2.getTb(), o1.getTb());
            }
        });

        int j = 1;

        for (int i = 0; i < bangDiems.size(); i++) {
            System.out.print(bangDiems.get(i));
            System.out.println(i+1);
            j = i+1;
            boolean check = false;
            while (j < bangDiems.size() && bangDiems.get(i).getTb() == bangDiems.get(j).getTb()) {
                System.out.print(bangDiems.get(j));
                System.out.println(i+1);
                j++;
                check = true;
            }

            if (check) {
                i = j-1;
            }
        }
    }
}

class BangDiem {

    private int ma;

    private String name;

    private float tb;

    public BangDiem(int ma, String name, float tb) {
        this.ma = ma;
        this.name = name;
        this.tb = tb;
    }

    public int getMa() {
        return ma;
    }

    public float getTb() {
        return tb;
    }

    @Override
    public String toString() {
        return "SV" + String.format("%02d", ma) + " " + name + " " + String.format("%.2f", tb) + " ";
    }
}
