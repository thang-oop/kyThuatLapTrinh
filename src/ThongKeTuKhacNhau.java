import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class ThongKeTuKhacNhau {

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        WordSet ws = new WordSet(input);
        System.out.println(ws);
    }
}

class WordSet {
    private String s = "";
    Scanner scanner;

    public WordSet(Scanner scanner) {
        this.scanner = scanner;

        TreeSet<String> treeSet = new TreeSet<>();

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().toLowerCase();
            if (s.length() == 0) break;
            StringTokenizer stringTokenizer = new StringTokenizer(s);
            while (stringTokenizer.hasMoreTokens()) {
                treeSet.add(stringTokenizer.nextToken());
            }
        }
        for (String str : treeSet)
            s += str + "\n";
    }

    @Override
    public String toString() {
        return s;
    }
}
