import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class subString {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.nextLine();  //a123b
            int count = 0;
            
            // This regex finds sequences of digits that are between two letters.
            // (?<=[a-zA-Z]) is a "lookbehind" that asserts that a letter comes before.
            // \\d+ matches one or more digits.
            // (?=[a-zA-Z]) is a "lookahead" that asserts that a letter comes after.
            Pattern pattern = Pattern.compile("(?<=[a-zA-Z])\\d+(?=[a-zA-Z])");
            Matcher matcher = pattern.matcher(s1);
            
            // The find() method scans the input string looking for the next subsequence that matches the pattern.
            while (matcher.find()) {
                count++;
            }
            
            System.out.println(count); // 1
        }
    }
}
