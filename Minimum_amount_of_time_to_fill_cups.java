class Solution {
    public int fillCups(int[] amount) {
        int max = Math.max(Math.max(amount[0], amount[1]), amount[2]);

        int sum = amount[0] + amount[1] + amount[2];

        if(max >= sum - max){
            return max;
        }
        
        return (sum + 1)/2;
    }
}
