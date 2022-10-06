import java.util.Scanner;

public class SoKhongLienKe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {

            String n = scanner.next();
            int sum = 0;
            for (int i = 0; i < n.length(); i++)
                sum += Integer.parseInt(n.charAt(i) + "");

            if (sum % 10 != 0) {
                System.out.println("NO");
                t--;
                continue;
            }

            boolean check = false;

            for (int i = 0; i < n.length() - 1; i++)
                if (Math.abs(Integer.parseInt(n.charAt(i) +"") - Integer.parseInt(n.charAt(i+1) +"")) != 2) {
                    System.out.println("NO");
                    check = true;
                    break;
                }
            if (!check) System.out.println("YES");

            t--;
        }
    }
}
