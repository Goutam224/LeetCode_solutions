class Solution {
    public int[] singleNumber(int[] nums) {

     if(nums.length==2){
        return nums;
     }

HashMap<Integer,Integer> map=new HashMap<>();
for(int n:nums){
    map.put(n,map.getOrDefault(n,0)+1);
}

int[] result=new int[2];
int index=0;
for(Map.Entry<Integer,Integer> entry:map.entrySet()){
    if(entry.getValue()==1){
        result[index++]=entry.getKey();
    }
}

    return result;  
    }
}
