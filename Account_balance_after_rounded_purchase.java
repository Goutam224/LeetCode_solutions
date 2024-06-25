class Solution {
    public int accountBalanceAfterPurchase(int pa) {
        int a=pa%10;
        if(a==0)
            return Math.abs(100-pa);
        int c=0;
        System.out.print(a);
        if(a>=5){
            c=10-a;
            pa+=c;
        }
        else{
             
            pa-=a;
        }
        return Math.abs(100-pa);
    }
}
