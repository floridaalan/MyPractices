import java.util.*;
public class nail {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int N=sc.nextInt(); // 5
            int X=sc.nextInt(); // 4
            int[] S=new int[N];
            for(int i=0;i<S.length;i++){   // 2 2 4 1 1
                S[i]=sc.nextInt();
            }
            int max=0;
            int singleMode = 0;
            for(int i=0;i<S.length;i++){
                //single mode
                singleMode += (int)Math.ceil(S[i]/(double)X);

                //dynamic mode
                 if(S[i]>max){
                    max=S[i];
                }  
            }
            int dynamicMode=max;
            int temp=Math.min(singleMode, dynamicMode);
            System.out.println(temp); // 4
        }
        
       
        
    }
    
}
