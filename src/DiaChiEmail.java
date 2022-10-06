import java.util.HashMap;
import java.util.Scanner;

public class DiaChiEmail {

    public static String process(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String arr[] = s.split(" ");

        String temp = "";
        temp += (arr[arr.length - 1].toLowerCase());

        for (int i = 0; i < arr.length - 1; i++)
            temp += (String.valueOf(arr[i].charAt(0)).toLowerCase());

        return temp;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> hm = new HashMap<>();

        while (t-- > 0) {
            String s = sc.nextLine();
            String temp = process(s);
            if(!hm.containsKey(temp))
                hm.put(temp,0);
            hm.put(temp,hm.get(temp)+1);
            if(hm.get(temp) == 1){
                System.out.println(temp + "@ptit.edu.vn");
            }else System.out.println(temp + hm.get(temp) + "@ptit.edu.vn");


        }
    }
}
