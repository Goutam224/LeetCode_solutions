class Solution {
    public int numberOfMatches(int n) {
        int m=n;
        int match=0;
        while(m!=1){
           if(m%2==0){
            match=match+m/2;
              m= m/2;
           }else{
               match=match+(m-1)/2;
               m=(m-1)/2+1;
           }

        }
        return match;
    }
}
