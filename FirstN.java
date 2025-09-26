import java.util.*;
public class FirstN {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = {1,2,3,4,5,6};   
            int N = sc.nextInt();       
            
            List<Integer> li = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                li.add(arr[i]);          
            }

            for (int i = arr.length; i < N; i++) {
                int res=li.get(i-1)+li.get(i-2);
                li.add(res);    
            }

            System.out.println(li);
        }
    }
}
