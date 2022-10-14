import java.util.*;

public class GiaoThongTrongYeu {

    static List<Integer> ds[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];


    public static void bfs(int u) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(u);
        check[u] = true;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (Integer i : ds[v]) {
                if (!check[i]) {
                    check[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void process(int v) {
        List<Integer>result = new ArrayList<>();
        for(int i = 1; i <= v; i++){

            for(int k = 0; k <= v; k++)
                check[k] = false;

            check[i] = true;
            int count = 0;

            for(int j = 1;j <= v; j++){
                if(!check[j]){
                    bfs(j);
                    count++;
                }
            }

            if(count >= 2)
                result.add(i);

        }

        System.out.println(result.size());
        result.forEach(item -> System.out.print(item + " "));
        System.out.println();
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int v = scanner.nextInt(), e = scanner.nextInt();

            for(int i = 0; i <= v; i++){
                ds[i] = new ArrayList<>();
                check[i] = false;
            }

            for(int i = 0; i < e; i++){
                int a = scanner.nextInt(), b = scanner.nextInt();
                ds[a].add(b);
                ds[b].add(a);
            }
            process(v);
        }
    }
}
