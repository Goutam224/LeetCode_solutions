class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alicesum=0;
        int bobsum=0;
        for(int i=0;i<aliceSizes.length;i++){
            alicesum+=aliceSizes[i];
        }

        for(int i=0;i<bobSizes.length;i++){
            bobsum+=bobSizes[i];
        }
 
         int diff=(alicesum-bobsum)/2;
         for(int i=0;i<aliceSizes.length;i++){
             for(int j=0;j<bobSizes.length;j++){
                 if(aliceSizes[i]-bobSizes[j]==diff){
                     return new int[]{aliceSizes[i],bobSizes[j]};
                 }
             }
            
         }
          return null;
    }
}
