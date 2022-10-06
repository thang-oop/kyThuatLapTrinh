import java.util.*;

public class TongCacChuSo {

    public static String sortString(String inputString){
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);

        return new String(tempArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            String s = sc.next();
            String temp = "";
            int sum = 0;

            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                    temp += s.charAt(i);
                else sum += Integer.parseInt(String.valueOf(s.charAt(i)));

            }
            System.out.println(sortString(temp) + sum);
        }
    }
}
