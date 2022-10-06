import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XauNhiPhanKeTiep {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            String s = scanner.next();
            int i = s.length() - 1;
            while (i >= 0 && s.charAt(i) == '1') i--;

            if (i < 0) {
                for (int j = 0; j < s.length(); j++)
                    System.out.print(0);
                System.out.println();
                continue;
            }

            for (int k = 0; k < i; k++)
                System.out.print(s.charAt(k));
            System.out.print(1);
            for (int j = i+1; j < s.length(); j++)
                System.out.print(0);

            System.out.println();
            t--;
        }
    }
}
