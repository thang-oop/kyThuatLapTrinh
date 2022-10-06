import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class DanhSachMonThi {

    public static void main(String[] args) throws IOException {
        List<String> input = new ArrayList<>();
        List<MonHoc> monHocs = new ArrayList<>();
        Stream<String> stream = Files.lines(Paths.get("MONHOC.in"));

        stream.forEach(lines -> {
            input.add(lines);
        });

        int t = Integer.parseInt(input.get(0));
        int i = 1;
        while (t-->0) {
            monHocs.add(new MonHoc(input.get(i++), input.get(i++), input.get(i++)));
        }

        Collections.sort(monHocs, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (MonHoc mh : monHocs) {
            System.out.println(mh);
        }
    }
}


class MonHoc {

    private String ma;

    private String name;

    private String hinhThuc;

    public MonHoc() {
    }

    public MonHoc(String ma, String name, String hinhThuc) {
        this.ma = ma;
        this.name = name;
        this.hinhThuc = hinhThuc;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + hinhThuc;
    }

    public String getMa() {
        return ma;
    }
}
