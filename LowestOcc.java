import java.util.*;
public class LowestOcc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //20
        String s=sc.next(); // ACABDDABDCDACFAEGFDA
        char[] ar=s.toCharArray();
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<ar.length;i++){
            mp.put(ar[i],mp.getOrDefault(ar[i],0)+1);
        }
        int temp=Integer.MAX_VALUE ;
        for(int freq:mp.values()){
            if(freq<temp){
                temp=Math.min(temp,freq);
            }
        }
        System.out.println("The minimum occuring character is: "+temp); //output: 1
        sc.close();
    }
}
