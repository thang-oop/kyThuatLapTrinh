import java.util.*;
import java.io.*;

public class DocFileVanban {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        while(in.hasNextLine()){
            String s = in.nextLine();
            System.out.println(s);
        }
    }

}
