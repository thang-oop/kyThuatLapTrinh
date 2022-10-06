import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;

public class TinhTong {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("DATA.in"));

        long sum = 0;

        while(in.hasNextLine()){
            StringTokenizer tokenizer = new StringTokenizer(in.nextLine());
            while (tokenizer.hasMoreTokens()) {
                String word = tokenizer.nextToken();
                if (Character.isDigit(word.charAt(0))) {
                    try {
                        int a = Integer.parseInt(word);
                        sum += a;
                    }catch (Exception e) {
                        continue;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
