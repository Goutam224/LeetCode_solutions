class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int max=INT_MIN;
        for(int i=0;i<nums.size();i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int ans=0;
        for(int i=0;i<nums.size();i++){
            if(max==nums[i]){
                ans=i;
            }
        }
        return ans;
    }
};
