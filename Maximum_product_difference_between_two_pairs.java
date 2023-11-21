class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int a=nums[l-1];
        int b=nums[l-2];
        int c=nums[0];
        int d=nums[1];
        return Math.abs((a*b)-(c*d));
    }
}
