import java.util.Scanner;
import java.util.TreeSet;

public class HopCuaHaiDaySo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        TreeSet<Integer> a = new TreeSet<>();
        TreeSet<Integer> b = new TreeSet<>();
        for (int i = 0; i < n; i++)
            a.add(scanner.nextInt());
        for (int i = 0; i < m; i++)
            b.add(scanner.nextInt());

        a.addAll(b);

        for (Integer x : a)
            System.out.print(x + " ");
    }
}
