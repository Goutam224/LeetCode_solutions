class Solution {
public:
    char findTheDifference(string s, string t) {
        map<char,int>mp,mp1;
        char ans;
        for(auto i:s){
            mp[i]++;
        }
        for(auto j:t){
            mp1[j]++;
        }
        for(auto i:mp1){
            if(mp[i.first]!=mp1[i.first]){
                ans=i.first;
            }
        }
        return ans;
    }
};
