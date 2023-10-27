class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int totalsum=(n*(n+1)/2);
        int[] arr=new int[nums.length];
        int k=0;
        int repeat=0;
         int arrsum=0;

        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                repeat=nums[i];
                nums[i]=0;
            }
        }
        for(int i=0;i<n;i++){
           arrsum=arrsum+nums[i];  
        }  
    int diff=0;
    diff=Math.abs(totalsum-arrsum);
return new int[]{repeat,diff};
    }
}
