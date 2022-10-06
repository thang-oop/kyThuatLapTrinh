import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SoKhacNhauTrongFile1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> map = new TreeMap<>();

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (!map.containsKey(a))
                map.put(a,0);
            map.put(a,map.get(a)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
