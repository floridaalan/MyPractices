import java.util.*;
public class adjMax {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) { // input: 10 15 12 9 14
                ar[i] = sc.nextInt();
            }

            ArrayList<Integer> al = new ArrayList<>();
            List<Integer> li = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                al.add(ar[i]);
            }
    
            for (int i = 0; i < al.size(); i++) {
                int count = 0;
                int max = al.get(i);

                if (i == 0) { // first element
                    if (al.get(i + 1) > max) {
                        count++;
                    }
                    if (al.get(al.size() - 1) > max) { 
                        count++;
                    }
                } 
                else if (i == al.size() - 1) { // last element
                    if (al.get(0) > max) {
                        count++;
                    }
                    if (al.get(i - 1) > max) {
                        count++;
                    }

                } else { // middle elements
                    if (al.get(i + 1) > max) {
                        count++;
                    }
                    if (al.get(i - 1) > max) {
                        count++;
                    }
                }
                li.add(count);
            }

            System.out.println(li);
            // output: [2, 0, 1, 2, 0]
        }
    }
}
