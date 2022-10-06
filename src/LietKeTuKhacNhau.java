import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class LietKeTuKhacNhau {

    private String s;
    private String file;


    public LietKeTuKhacNhau(String file) {
        this.file = file;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "LietKeTuKhacNhau{}";
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("DATA.in"));

    }
}
