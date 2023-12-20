class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int a=prices[0];
        int b=prices[1];
        int sum=a+b;
        if(sum==money){
            return 0;
        }
       else if(sum<money){
            int diff=money-(a+b);
            return diff;
        }
        return money;
    }
}
