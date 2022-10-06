import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t--> 0){
            int n = in.nextInt();
            System.out.println(fi(n));
        }
    }

    public static long fi(int n){
        long a = 1, b = 1, c = 0;
        if(n <= 2) return 1;
        for(int i = 3; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
