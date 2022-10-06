/*
    Author Quang Thang
    Time 4:49 PM 
    Day Detail 09 October 2020
    Project CodePtit 
*/

import java.util.Scanner;

public class RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String s = sr.next();
        while (true) {
            int len = s.length();
            s = s.replaceAll("(.)\\1", "");

            if (s.length() == len) break;
        }

        System.out.println((s.isEmpty()) ? "Empty String" : s);
    }
}
