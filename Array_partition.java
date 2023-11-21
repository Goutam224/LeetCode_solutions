class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int minvalue=0;
        int j=1;
       for(int i=1;i<=nums.length-1;i++){
          minvalue=minvalue+Math.min(nums[i],nums[i-1]);
          i=i+1;
       } 
       return minvalue;
    }
}
