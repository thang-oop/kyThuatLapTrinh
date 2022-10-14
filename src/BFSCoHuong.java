import java.util.*;

public class BFSCoHuong {

    static ArrayList<Integer> dske[] = new ArrayList[1005];
    static Boolean[] check = new Boolean[1005];
    static int[] truoc = new int[1005];

    static void bfs(int u, int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        while (q.size() > 0) {
            int top = q.poll();
            check[top] = true;
            if (top == v) return;
            for (int i = 0; i < dske[top].size(); i++) {
                if (!check[dske[top].get(i)]) {
                    check[dske[top].get(i)] = true;
                    truoc[dske[top].get(i)] = top;
                    q.add(dske[top].get(i));
                }
            }
        }
    }

    static void trace(int u, int v) {
        if (!check[v]) {
            System.out.print(-1);
            return;
        }
       List<Integer> vt = new ArrayList<>();
        while (u != v) {
            vt.add(u);
            u = truoc[u];
        }
        vt.add(v);
        Collections.reverse(vt);
        for (int i = 0; i < vt.size(); i++)
            System.out.print(vt.get(i) + " ");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            for (int i = 0; i <= 1004; i++) {
                dske[i] = new ArrayList<>();
                check[i] = false;
                truoc[i] = 0;
            }

            int u, v, U = scanner.nextInt(), V = scanner.nextInt(), start = scanner.nextInt(), end = scanner.nextInt();
            for (int i = 0; i < V; i++) {
                u = scanner.nextInt();
                v= scanner.nextInt();
                dske[u].add(v);
                dske[v].add(u);
            }
            bfs(start, end);
            trace(end, start);
            System.out.println();
        }
    }
}
