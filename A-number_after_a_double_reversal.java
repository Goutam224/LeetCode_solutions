class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        int rev=0;
        int newnum=num;
        while(newnum!=0){
          int digit=newnum%10;
          rev=(rev*10)+digit;
          newnum=newnum/10;
        }
        int rev1=0;
        while(rev!=0){
            int digit1=rev%10;
            rev1=(rev1*10)+digit1;
            rev=rev/10;
        }
        if(rev1==num){
            return true;
        }else{
            return false;
        }
    }
}
