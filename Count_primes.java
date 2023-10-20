class Solution {
    public int countPrimes(int n) {
       int count=0;
       if(n<2){
           return 0;
       }
       boolean isprime[]=new boolean[n+1]; 
       for(int i=2;i<n;i++){
           if(isprime[i]==false){
               count++;
               for(int j=i;j<n;j=j+i){
                   isprime[j]=true;
               }
           }
       }
       return count;
    }
}
