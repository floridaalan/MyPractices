// duplicates are printed in output and not the unique ones

import java.util.HashMap;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set <Integer,Integer> hp=new HashSet<>();
        if(nums1.length>nums2.length){ // getting num1 as shorter length
            return intersection(nums2,nums1);
        }
        for(int num:nums1){
            hp.put(num,hp.getOrDefault(num,0)+1);
        }
        //List<Integer> is used becoz , we don't know the length of resultant array.
        List<Integer> result=new ArrayList();
        for(int num:nums2){
            // num exist in map AND the count of num is greater than 0.
            if(hp.containsKey(num)&&hp.get(num)>0){ 
                result.add(num);
                //to manage duplicates --> decrease the count
                hp.put(num,hp.get(num)-1); 
            }
        }
        // convert List<Integer>(dynamic) to int[](fixed-size)
        int[] res=new int[result.size()];
        for(int i=0;i<result.size();i++){
            res[i]=result.get(i);
        }
        return res;



    }
}
