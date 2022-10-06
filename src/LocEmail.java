import java.util.Scanner;
import java.util.TreeSet;

public class LocEmail {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeSet<String> treeSet = new TreeSet<>();

        while (scanner.hasNextLine()) {
            treeSet.add(scanner.nextLine().toLowerCase());
        }
        for (String x : treeSet)
            System.out.println(x);
    }
}




