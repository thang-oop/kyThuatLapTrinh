import java.util.Scanner;

public class SoDep {
    static boolean isBeautifulNumber(String a) {

        StringBuilder b = new StringBuilder(a).reverse();

        if (a.compareTo(b.toString()) != 0) return false;
        for (int i = 0; i < a.length(); i++) {
            if (Integer.valueOf(a.charAt(i) - '0') % 2 != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();

        while (t-- > 0) {
            String s = sr.next();
            if (isBeautifulNumber(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
