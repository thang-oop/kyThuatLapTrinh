package LietKe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {

    private String file;

    public WordSet(String file) {
        this.file = file;
    }

    @Override
    public String toString() {

        StringBuilder sb;
        try {
            Scanner scanner = new Scanner(new File(file));
            TreeSet<String> treeSet = new TreeSet<>();
            sb = new StringBuilder();

            while (scanner.hasNext()) {
                String s = scanner.next();

                treeSet.add(s.toLowerCase());
            }

            String newLine = System.getProperty("line.separator");

            for (String str : treeSet) {
                sb.append(str + newLine);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
