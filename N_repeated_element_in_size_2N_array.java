class Solution {
    public int repeatedNTimes(int[] nums) {
      HashMap<Integer,Integer> hm=new HashMap<>();
      for(int i:nums){
        hm.put(i,hm.getOrDefault(i,0)+1);
        if(hm.get(i)>1){
            return i;
        }
      }
      return -1;  
    }
}
