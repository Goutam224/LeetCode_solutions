class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
int size = nums.length;
        int[] targetArray = new int[size];
        ArrayList<Integer> list = new ArrayList<>();
       
        for(int i = 0; i < size; i++){
            list.add(index[i], nums[i]);
        }

        for(int i = 0; i < size; i++){
            targetArray[i] = list.get(i);
        }

        return targetArray;
    }
}
