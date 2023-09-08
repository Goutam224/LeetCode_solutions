class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int maxlen=0,start=0;
        for(int i=0;i<s.length();i++){
            char rightchar=s.charAt(i);
                if(map.containsKey(rightchar)){
                    start=Math.max(start,map.get(rightchar)+1);
                }
                map.put(rightchar,i);
                maxlen=Math.max(maxlen,i-start+1);
            }

        return maxlen;
    }
}