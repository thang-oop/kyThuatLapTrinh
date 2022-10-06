import java.util.Scanner;

public class NhamChuSo {

    public static int convertMin(String a) {
        String tempA = "";
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) == '6')
                tempA += '5';
            else
                tempA += a.charAt(i);

        return Integer.parseInt(tempA);
    }

    public static int convertMax(String a) {
        String tempA = "";
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) == '5')
                tempA += '6';
            else
                tempA += a.charAt(i);

        return Integer.parseInt(tempA);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        System.out.println(convertMin(a) + convertMin(b) + " " + (convertMax(a) + convertMax(b)));
    }
}
