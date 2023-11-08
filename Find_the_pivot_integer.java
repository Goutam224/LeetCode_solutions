class Solution {
    public int pivotInteger(int n) {
        int leftsum=0;
        int rightsum=n*(n+1)/2;
        for(int i=1;i<=n;i++){
            leftsum=leftsum+i;
            if(leftsum==rightsum){
                return i;
            }else{
                rightsum=rightsum-i;
            }
        }
      return -1;
    }
}
