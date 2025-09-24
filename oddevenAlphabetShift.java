import java.util.Scanner;
public class oddeven {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String s1=sc.next();
            char[] ar=s1.toCharArray();
            int oddf=sc.nextInt();
            int evenback=sc.nextInt();
     
            for(int i=0;i<ar.length;i++){
                if((i+1)%2==0){
                    System.out.print((char)(ar[i]-evenback));
                }else{
                    System.out.print((char)(ar[i]+oddf));
                }
            }
        }


    }
    
}
