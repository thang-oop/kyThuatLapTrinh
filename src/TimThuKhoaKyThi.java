import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TimThuKhoaKyThi {

    public static float mark(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        List<ThuKhoa> thuKhoas = new ArrayList<>();

        int t = Integer.parseInt(scanner.nextLine());
        int i = 1;
        while (t-->0) {
            thuKhoas.add(new ThuKhoa(i++, scanner.nextLine(), scanner.nextLine(), mark(Float.parseFloat(scanner.nextLine()),Float.parseFloat(scanner.nextLine()),Float.parseFloat(scanner.nextLine()))));
        }

        Collections.sort(thuKhoas, new Comparator<ThuKhoa>() {
            @Override
            public int compare(ThuKhoa o1, ThuKhoa o2) {
                if (o1.getMark() == o2.getMark())
                    return o1.getMa() - o2.getMa();
                return Float.compare(o2.getMark(), o1.getMark());
            }
        });

        float max = thuKhoas.get(0).getMark();

        for (int j = 0; j < thuKhoas.size(); j++)
            if (thuKhoas.get(j).getMark() == max)
                System.out.println(thuKhoas.get(j));
            else
                break;
    }
}

class ThuKhoa {

    private int ma;

    private String name;

    private String dob;

    private float mark;

    public ThuKhoa(int ma, String name, String dob, float mark) throws ParseException {
        this.ma = ma;
        this.name = name;
        this.dob = dob;
        this.mark = mark;
    }

    public int getMa() {
        return ma;
    }

    public float getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + dob + " " + mark;
    }
}
