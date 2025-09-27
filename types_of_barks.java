import java.util.*;
public class Barks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String[] ar=s1.split("\\.+");//B...B...BB...B....BBB

        Set<Integer> set=new HashSet<>();
        for(String part: ar){
            set.add(part.length());
        }
        System.out.println(set.size()); // 3

    }
    
}
