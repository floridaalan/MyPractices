import java.util.Scanner;
public class slid {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int[] ar=new int[n];
            int temp=0;
            int k=sc.nextInt();//window size
            int left=0; int right=k-1;
            for(int i=0;i<n;i++){
                ar[i]=sc.nextInt();
            }
            //logic
            for(int i=0;i<=n-k;i++){  // to the last start index
                int sum=0;
                for(int j=left;j<=right;j++){
                    sum+=ar[j];
                }
                temp=Math.max(sum,temp);

                left++;
                right++;
            }
            System.out.println("The maximum sum is: "+temp);
          
        }

    }
    
}
