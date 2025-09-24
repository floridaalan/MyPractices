import java.util.Scanner;
public class stars {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String s1=sc.next();
           
            int temp=0;
            s1=s1.substring(1,s1.length()-1);
            //split by }{
            String[] galaxies =s1.split("\\}\\{");
            for(int i=0;i<galaxies.length;i++){
                System.out.println(i+" "+galaxies[i]);

            }
            for(int i=0;i<galaxies.length;i++){
                char[] ar=galaxies[i].toCharArray();
                int count=0;
                
                for(int j=0;j<ar.length;j++){
                 
                    if(ar[j]=='*'){
                        count++;
                    }

                }
                temp=Math.max(temp,count);

            }
            System.out.println("The maximum no.of stars: "+temp);
        }

    }
    
}
