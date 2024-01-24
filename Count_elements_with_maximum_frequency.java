class Solution {
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer,Integer> m=new HashMap<>();
       int maxfreq=0;
       for(int i:nums){
           m.put(i,m.getOrDefault(i,0)+1);
           maxfreq=Math.max(maxfreq,m.get(i));
       }
        int count=0;
        for(int n:nums){
            if(m.getOrDefault(n,0)==maxfreq){
                count++;
            }
        }
        return count;
    }
}
