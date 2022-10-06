package dsSinhVien1;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner in = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= n; i++){
            SinhVien a = new SinhVien(i, in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()));
            System.out.println(a);
        }
    }
}
