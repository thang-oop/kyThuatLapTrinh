import java.util.Scanner;
import java.util.Stack;

public class DaoTu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        while (t > 0) {

            String s = scanner.nextLine();

            String[] arr = s.split(" ");

            for (int  i = 0; i < arr.length; i++) {
                for (int j = arr[i].length()-1; j >= 0; j--) {
                    System.out.print(arr[i].charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
            t--;
        }

    }
}
