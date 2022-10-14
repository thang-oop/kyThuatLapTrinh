import java.util.*;

public class BFS_TrenDoThiVoHuong {

    static List<Integer> ds[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];

    static StringBuilder result;

    public static void bfs(int u) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(u);
        check[u] = true;

        while (!queue.isEmpty()) {
            int v = queue.poll();
            result.append(v + " -> ");
            for (Integer i : ds[v]) {
                if (!check[i]) queue.add(i);
                check[i] = true;
            }
        }
    }

    public static void process(int u) {
        result = new StringBuilder("");
        result.append("BFS("+u+") = ");
        bfs(u);
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
