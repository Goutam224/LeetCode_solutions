class Solution {
    public int reductionOperations(int[] nums) {
       Arrays.sort(nums);
      int result=0;
      int current=0;
       for(int i=1;i<nums.length;i++){
           if(nums[i]>nums[i-1]){
               current++;
           }
           result=result+current;
       }
       return result; 
    }
}
