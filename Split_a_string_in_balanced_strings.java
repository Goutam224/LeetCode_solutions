class Solution {
    public int balancedStringSplit(String s) {
        int lcounter=0;
        int rcounter=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                rcounter++;
            }else{
                lcounter++;
            }
             if(lcounter==rcounter){
            count++;
        }
        }
        return count;
    }
}
