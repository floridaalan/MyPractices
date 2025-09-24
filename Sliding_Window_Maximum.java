class Solution {
  public int[] maxSlidingWindow(int[] arr, int k) {
    int temp = 0;
    int left = 0;
    int right = k - 1;
    int n=arr.length;
    int[] sol = new int[n-k+1];

     for (int i = 0; i <= n - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            sol[i] = max;
        }
        return sol;
    }
  }
