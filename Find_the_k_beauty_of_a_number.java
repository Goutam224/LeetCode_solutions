class Solution {
    public int divisorSubstrings(int num, int k) {
        
        String str = num+"";
        int count=0;
        for(int i=0;i<=str.length()-k;i++){
            String temp = str.substring(i,i+k);
            int a = Integer.parseInt(temp);
            if(a!=0 && num%a==0) count++;
        }
        return count;
    }
}
