import java.util.Scanner;
public class Market{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int N=sc.nextInt(); //5043
            int sum=N;
             while(N!=0){
                sum+=(int)Math.floor(N/10);
                 N/=10;
             }
             System.out.println(sum); // 5+50+504+5043=5602
        }
    }
}
