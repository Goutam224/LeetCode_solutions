class Solution {
    public int distinctAverages(int[] nums) {
        Set<Float> s=new HashSet<>();
        Arrays.sort(nums);
        float avg=0;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            avg=nums[i]+nums[j];
            s.add(avg);
            i++;
            j--;
        }
        return s.size();
    }
}
