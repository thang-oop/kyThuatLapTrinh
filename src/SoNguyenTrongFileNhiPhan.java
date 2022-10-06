import java.util.*;
import java.io.*;

public class SoNguyenTrongFileNhiPhan {

    public static void main(String[] args) throws Exception {

        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arrayList = (ArrayList<Integer>) sc.readObject();

        int []a = new int[10000];
        for(Integer i:arrayList ){
            a[i]++;
        }
        for(int i=2; i<10000; i++){
            if(checkSTN(i)){
                if(a[i] > 0){
                    System.out.println(i+" "+a[i]);
                }
            }
        }
    }

    public static boolean checkSTN(int n) {
        if(n<2) return false;
        if(n==2) return true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
