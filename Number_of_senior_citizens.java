class Solution {
    public int countSeniors(String[] details) {
        int senior=0;
        for(String nums:details){
            char tens=nums.charAt(11);
            char ones=nums.charAt(12);
            if(tens>'6' || (tens=='6' && ones>'0')){
                senior++;
            }
        }
        return senior;
    }
}
