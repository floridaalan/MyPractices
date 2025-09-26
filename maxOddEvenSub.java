import java.util.*;
public class maxOddEven {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String s1=sc.next();  // input: aaartfu
            char[] s2=s1.toCharArray();
            
            Map<Character,Integer> mp=new HashMap<>();
            for(int i=0;i<s2.length;i++){
                mp.put(s2[i],mp.getOrDefault(s2[i], 0)+1);  
            }
             int maxOdd = Integer.MIN_VALUE;
            int minEven = Integer.MAX_VALUE;

            for (int freq : mp.values()) {
                if (freq % 2 == 1) { // odd
                    maxOdd = Math.max(maxOdd, freq);
                } else { // even
                    minEven = Math.min(minEven, freq);
                }
            }
            System.out.println(Math.abs(maxOdd-minEven)); //output: 1

        }
        

    }
    
}
