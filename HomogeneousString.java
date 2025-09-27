import java.util.*;

public class Homogenous {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.next(); //aaabbbcccddddd
            
            long count = 0;
            int n = s1.length();
            int i = 0;
            
            while (i < n) {
                int j = i;
                
                while (j < n && s1.charAt(i) == s1.charAt(j)) {
                    j++;
                }
             
                count ++; 
                i = j;
            }
            
            System.out.println(count);//4
        }
    }
}
