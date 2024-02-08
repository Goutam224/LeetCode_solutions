class Solution {
    public int[] sumZero(int n) {
        int[] result=new int[n];
       Arrays.fill(result,0);
        int k=0;
      if(n%2==0){
          int val=n/2;
          for(int i=1;i<=val;i++){
              result[k++]=i;
              result[k++]=-i;
          }
          }
          if(n%2!=0){
              int num=n/2;
              for(int i=1;i<=num;i++){
              result[k++]=i;
              result[k++]=-i;
          }
          }
      return result;
    }
}
