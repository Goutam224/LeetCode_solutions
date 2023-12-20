class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length==2){
            return cost[0]+cost[1];
        }
        int n=cost.length;
        int sum=0;
        int totalsum=0;
        Arrays.sort(cost);
        for(int i=0;i<cost.length;i++){
                 totalsum+=cost[i];
        }
        if(n%3==0){
            for(int i=0;i<n;i=i+3){
                sum=sum+cost[i];
            }
        }
        if(n%3==1){
            for(int i=1;i<n;i=i+3){
                sum=sum+cost[i];
            }
        }
        if(n%3==2){
            for(int i=2;i<n;i=i+3){
                sum=sum+cost[i];
            }
        }
        return totalsum-sum;
    }
}
