class Solution {
    public boolean checkPerfectNumber(int num) {
      int ans=0;
      int number=num;
      for(int i=1;i<num;i++){
        if(number%i==0){
            ans=ans+i;
        }
        }
      if(ans==number){
          return true;
      }else{
          return false;
      } 
    }
}
