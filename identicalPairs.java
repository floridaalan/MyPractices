import java.util.Scanner;
import java.util.HashMap;

public class pairs {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int[] ar=new int[n];
            int count=0;
            for(int i=0;i<n;i++){
                ar[i]=sc.nextInt();
            } 
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                map.put(ar[i],map.getOrDefault(ar[i], 0)+1);
            }
           
        for(int freq : map.values()){
            if(freq == 2){
                count+=2;
            
            }
        }
        System.out.println(n-count);
    }
}
}
