class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int>v;
        unordered_map<int,int>mp;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;
        }
        int n=nums.size()/3;
        for(auto i:mp){
            if(n<i.second){
                v.push_back(i.first);
            }
        }
        return v;
    }
};
