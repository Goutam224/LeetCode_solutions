class Solution {
    public int xorOperation(int n, int start) {
        int[] nums=new int[n];
        int i=0;
        for(int j=0;j<n;j++){
            nums[i++]=start+2*j; 
        }
        int ans=nums[0];
        for(int k=1;k<nums.length;k++){
            ans=ans^nums[k];
        }
        return ans;
    }
}
