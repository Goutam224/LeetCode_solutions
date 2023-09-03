class Solution {
public:
    vector<int> sortArrayByParityII(vector<int>& nums) {
        vector<int>v;
        vector<int>even;
        vector<int>odd;
        for(int i=0;i<nums.size();i++){
           if(nums[i]%2==0){
               even.push_back(nums[i]);
           }else{
               odd.push_back(nums[i]);
           }
        }
        int k=0;
        int l=0;
        for(int i=0;i<nums.size();i++){
            if(i%2==0){
                v.push_back(even[k++]);
            }else{
                v.push_back(odd[l++]);
            }
        }
        return v;
    }
};
