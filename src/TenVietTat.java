import java.io.File;
import java.util.*;

public class TenVietTat {

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(new File("DANHSACH.in"));
        int test = Integer.parseInt(in.nextLine());
        ArrayList<VietTat>arrayList = new ArrayList<>();
        while(test-->0){
            VietTat temp = new VietTat(in.nextLine());
            arrayList.add(temp);
        }
        arrayList.sort(new Comparator<VietTat>() {
            @Override
            public int compare(VietTat o1, VietTat o2) {
                if(o1.getTen().compareTo(o2.getTen()) == 0){
                    return o1.getHo().compareTo(o2.getHo());
                }
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        int testVietTat = Integer.parseInt(in.nextLine());
        while(testVietTat-->0){
            String tat = in.nextLine();
            arrayList.forEach(item ->{
                if(item.checkContains(tat)){
                    System.out.println(item);
                }
            });
        }
    }
}

class VietTat {
    private String ten;

    public String getTen() {
        StringTokenizer str = new StringTokenizer(ten, " ");
        String result = "";
        while(str.hasMoreTokens()){
            result = str.nextToken();
        }
        return result;
    }

    public String getHo() {
        StringTokenizer str = new StringTokenizer(ten, " ");
        return str.nextToken();
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public VietTat(String ten) {
        this.ten = ten;
    }

    public Boolean checkContains(String a){
        StringTokenizer str = new StringTokenizer(a,".");
        StringTokenizer str1 = new StringTokenizer(ten, " ");
        boolean check = false;
        if(str.countTokens() - str1.countTokens() != 0){
            return false;
        }
        else{
            while(str.hasMoreTokens()){
                String temp = str.nextToken();
                String temp1 = str1.nextToken();
                if(!temp.equals("*") && !temp1.substring(0,1).equals(temp)){
                    check = true;
                }
            }
        }
        return !check;
    }

    @Override
    public String toString() {
        return ten;
    }
}