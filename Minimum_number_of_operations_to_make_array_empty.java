class Solution {
    public int minOperations(int[] nums) {
        int count=0;
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
    }

     for(int n:map.keySet()){
         int k=map.get(n);
         if(k<2){
             return -1;
         }
         if(k==2 || k==3){
             count++;
         }else{
             if(k%3==0){
                 count+=k/3;
             }
             if(k%3==1 || k%3==2){
                 count+=k/3+1;
             }
         }
     }
         return count; 
         }
}
