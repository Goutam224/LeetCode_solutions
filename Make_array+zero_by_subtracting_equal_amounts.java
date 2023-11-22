class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        if(nums[0]>0){
            ans++;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                ans++;
            }
        }
        return ans;
    }
}
