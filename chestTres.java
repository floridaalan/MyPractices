import java.util.*;
public class chest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();     // 4
        int[] coins=new int[N];
        for(int i=0;i<N;i++){     
            coins[i]=sc.nextInt();   // 1 2 3 1
        }
        int sum1=0;
        int sum2=0;
        for(int i=0;i<N;i++){
            if(i%2==0){
                sum1+=coins[i];
            }else{
                sum2+=coins[i];
            }
        }
        int temp=Math.max(sum1,sum2);
            System.out.println(temp); // 4
            sc.close();
    }

    
}
