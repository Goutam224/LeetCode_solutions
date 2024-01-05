class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int n:nums){
         map.put(n,map.getOrDefault(n,0)+1);
     }

    for(int i:nums){
        if(map.get(i)==1){
            sum=sum+i;
        }
    }
        return sum;
    }

}
