class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int n=heights.length;
        int[] arr=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            arr[k++]=heights[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
                if(arr[i]!=heights[i]){
                      count++;
                }
        }
        return count;
    }
}
