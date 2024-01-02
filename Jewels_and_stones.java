class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      int count=0;
        char [] je=jewels.toCharArray();
        char [] s=stones.toCharArray();
        for(int i=0;i<je.length;i++){
            for(int j=0;j<s.length;j++)
            if(je[i]==s[j]){
                count++;
            }
        }
        if(count>0){
            return count;
        }else{
            return 0;
        }
    }
}
