import java.util.*;

public class DuongDiCoHuong {

    static List<Integer> ds[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];
    static int[] truoc = new int[1005];


    static void bfs(int u, int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(u);
        while(queue.size() > 0) {
            int top = queue.poll();
            check[top] = true;
            if (top == v) return;
            for (Integer i : ds[top])
                if (!check[i]) {
                    check[i] = true;
                    truoc[i] = top;
                    queue.add(i);
                }

        }
    }

    static void trace(int u, int v) {
        if (!check[v]) {
            System.out.print(-1);
            return;
        }

        List<Integer> list = new ArrayList<>();
        while(u != v) {
            if (u == 0) {
                System.out.print(-1);
                return;
            }
            list.add(u);
            u = truoc[u];
        }
        list.add(v);
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++)
            if (i != list.size()-1)
                System.out.print(list.get(i) + " -> ");
            else
                System.out.print(list.get(i));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int V = scanner.nextInt(), E = scanner.nextInt(), u = scanner.nextInt(), v = scanner.nextInt();

            for (int i = 0; i <= V; i++) {
                ds[i] = new ArrayList<>();
                check[i] = false;
                truoc[i] = 0;
            }

            for (int i = 0; i < E; i++) {
                int a = scanner.nextInt(), b = scanner.nextInt();
                ds[a].add(b);
            }

            bfs(u, v);
            trace(v, u);
            System.out.println();
        }
    }
}
