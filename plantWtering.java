import java.util.Scanner;
public class water {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int N=sc.nextInt();//no.of.trees
            int K=sc.nextInt();//units of water available
            int M=sc.nextInt();//inital units of water to be used on all trees
            int[] A=new int[N];
            int[] B=new int[N];
            int result=0;
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            for(int i=0;i<N;i++){
                B[i]=sc.nextInt();
            }
            //logic
            for(int i=0;i<A.length;i++){

                result+=M+(A[i]*B[i]);
            }
            if(K==result){
                System.out.println(0);

            }else{
                System.out.println("Remaining water: "+ (K-result));//remaining water
            }

        }

    }
    
}
