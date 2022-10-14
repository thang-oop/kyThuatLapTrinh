import java.util.*;

public class DuonDiTheoDFS {
    static List<Integer> ds[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];
    static int truoc[] = new int[1005];

    public static void dfs(int u) {
        check[u] = true;
        for (Integer i : ds[u]) {
            if (!check[i]) {
                truoc[i] = u;
                dfs(i);
            }
        }
    }

    public static void process(int u, int v) {
        dfs(u);
        for(int i = 1; i <= v; i++){
            if(i != u && check[i]){
                int temp = i;
                String s = "";
                while(temp != u){
                    s = temp + " "  + s;
                    temp = truoc[temp];
                }
                s = temp + " "  + s;
                System.out.println(s);
            }
            else if(i != u && !check[i]){
                System.out.println("No path");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int v = scanner.nextInt(), e = scanner.nextInt(), u = scanner.nextInt();

            for(int i = 0; i <= v; i++){
                ds[i] = new ArrayList<>();
                check[i] = false;
                truoc[i] = 0;
            }

            for(int i = 0; i < e; i++){
                int a = scanner.nextInt(), b = scanner.nextInt();
                ds[a].add(b);
                ds[b].add(a);
            }
            process(u, v);
        }
    }
}
