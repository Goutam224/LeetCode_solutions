class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] arr =new int[nums.length];
    int size=0;
    for(int x:nums){
        int i=0;
        int j=size;
        while(i!=j){
            int m=(i+j)/2;
            if(arr[m]<x){
              i=m+1;   
            }else{
                j=m;
            }
        }
        arr[i]=x;
        if(i==size){
            size++;
        }
    }
        return size;
    }
}
