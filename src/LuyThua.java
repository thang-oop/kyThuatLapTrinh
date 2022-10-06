import java.util.*;

public class LuyThua {

    static int M = 1000000007;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(luyThua(n,k));
        }
    }

    private static long luyThua(int n, int k) {
        if(k == 0) return 1;
        long x = luyThua(n,k/2);
        if(k % 2 == 0) return x * x % M;
        return n * (x * x % M) % M;
    }
}
