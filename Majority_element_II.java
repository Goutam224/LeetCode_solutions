class Solution {
    public List<Integer> majorityElement(int[] nums) {
    //create a array list to store the elements that appear more than n/3 times
     List<Integer> list=new ArrayList<>();

     //create a map that stores the key or values
     Map<Integer,Integer>map=new HashMap<>();
     
     
     int compare=nums.length/3;
     for(int i:nums){
         map.put(i,map.getOrDefault(i,0)+1);
     } 
     for(int i:map.keySet()){
      //checking the elements that appears more than n/3 times
         if(map.get(i)>compare){

      //add the elements that appears more than n/3 times in an array list        
             list.add(i);
         }
     }
     return list;  
    }
}
