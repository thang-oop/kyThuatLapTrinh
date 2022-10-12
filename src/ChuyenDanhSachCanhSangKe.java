import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class ChuyenDanhSachCanhSangKe {

    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[1005];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {

            int E = scanner.nextInt(), V = scanner.nextInt();

            for (int i = 0; i <= E; i++) {
                dske[i] = new ArrayList<>();
            }

            for (int i = 0; i < V; i++) {
                int e = scanner.nextInt();
                int v = scanner.nextInt();
                dske[e].add(v);
                dske[v].add(e);

            }

            for (int i = 1; i <= E; i++) {
                System.out.print(i + ": ");
                for (Integer j : dske[i])
                    System.out.print(j + " ");
                System.out.println();
            }
        }
    }
}
