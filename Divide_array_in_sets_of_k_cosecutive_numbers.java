class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        while(!m.isEmpty()){
            int first=Collections.min(m.keySet());
            for(int i=first;i<first+k;i++){
                if(!m.containsKey(i)){
                    return false;
                }
                m.put(i,m.get(i)-1);
                if(m.get(i)==0){
                    m.remove(i);
                }
            }
        }
        return true;
            }
}
