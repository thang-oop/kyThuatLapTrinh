import java.util.Scanner;
import java.util.StringTokenizer;

public class ChuanHoaXauHoTen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        while (t > 0) {
            System.out.println(process(scanner.nextLine()));
            t--;
        }
    }

    public static String process(String s) {

        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            kq.append(Character.toUpperCase(word.charAt(0)));

            for (int i = 1; i < word.length(); i++) {
                kq.append(Character.toLowerCase(word.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
}
