import java.util.Scanner;
public class let {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int count=0;
            String s1 = sc.nextLine();
            char[] c = s1.toCharArray();
           
            for(int i=0;i<s1.length();i++){
               if(Character.isDigit(c[i]) && Character.isLetter(c[i+1]) && Character.isLetter(c[i-1])){
                count++;
               }
            }
            System.out.println(count);
        }
    }
}
