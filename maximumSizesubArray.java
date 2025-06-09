class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int curr=0;
        int ans=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            curr+=nums[right];
            while(curr>=target){
                ans=Math.min(ans,right-left+1);
                curr-=nums[left];
                left++;

            }
            
        }
        return (ans==Integer.MAX_VALUE) ? 0:ans;

    }
}
