import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFS_TrenDoThiVoHuong {

    static List<Integer> ds[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];

    static StringBuilder result;
    private static void DFS(int u) {
        result.append(u + " -> ");
        check[u] = true;
        for(Integer v : ds[u]){
            if(!check[v])
                DFS(v);
        }
    }

    public static void process(int u) {
        result = new StringBuilder("");
        result.append("DFS("+u+") = ");
        DFS(u);
        System.out.println(result.substring(0,result.length()-4));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int v = scanner.nextInt(), e = scanner.nextInt(), u = scanner.nextInt();

            for(int i = 0; i <= v; i++){
                ds[i] = new ArrayList<>();
                check[i] = false;
            }

            for(int i = 0; i < e; i++){
                int a = scanner.nextInt(), b = scanner.nextInt();
                ds[a].add(b);
                ds[b].add(a);
            }
            process(u);
        }
    }
}
