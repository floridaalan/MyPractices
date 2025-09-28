import java.util.*;

public class MaxSumPair {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 18;
            List<String> li = new ArrayList<>();
            for (int i = 0; i < N-1; i++) {
                    if (arr[i] + arr[i+1] == sum) {
                        if (arr[i] > arr[i+1]) {
                            li.add("{"+arr[i] + "," + arr[i+1]+"}");
                        } else {
                            li.add("{"+arr[i+1] + "," + arr[i]+"}");
                        }
                    }       
                }
                 for (String pair : li) {
                System.out.println(pair);
            }
        }
        }
    }

