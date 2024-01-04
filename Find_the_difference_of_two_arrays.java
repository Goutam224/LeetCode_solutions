class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       HashSet<Integer> mp1=new HashSet<>(); 
        HashSet<Integer> mp2=new HashSet<>();
     List<List<Integer>> ans=new ArrayList<List<Integer>>();
     List<Integer> ans1=new ArrayList<>();
     List<Integer> ans2=new ArrayList<>();

        for(int n:nums1){
            mp1.add(n);
        }

        for(int n:nums2){
            mp2.add(n);
        } 

        for(int i:mp1){
            if(!mp2.contains(i)){
                ans1.add(i);
            }
        }

        for(int i:mp2){
            if(!mp1.contains(i)){
                ans2.add(i);
            }
        }
         
         ans.add(ans1);
         ans.add(ans2);
        return ans;
    }
}
