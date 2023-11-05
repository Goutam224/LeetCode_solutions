class Solution {
    public int getWinner(int[] arr, int k) {
        int curwinner=arr[0];
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(curwinner<arr[i]){
                curwinner=arr[i];
                count=1;
            }else{
                count++;
            }
            if(count==k){
                return curwinner;
            }
        }
return curwinner;
    }
}
