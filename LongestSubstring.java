import java.util.Scanner;

public class LongestSubstring{
    public static boolean isSpecial(String s1){
        String specialChars = ",.;:!?\'\"()";
        for(int i=0; i<s1.length(); i++){
            if (specialChars.indexOf(s1.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String s1=sc.nextLine();                           //I love programming, because it is fun.
            String[] s2 = s1.split("[,.;:!?\'\"()]");
            for (int i = 0; i < s2.length; i++) {
                s2[i] = s2[i].trim();
            }

            int max=0;
            String longest="";
            for(int i=0; i<s2.length; i++){
                if(!isSpecial(s2[i])){
                    if(s2[i].length()>max){
                        max=s2[i].length();
                        longest=s2[i];
                    }
                }
            }
            System.out.println(longest); //I love programming
        }

    }
        

    }
