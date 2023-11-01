class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        int nums=num;
        while(nums!=0){
        if(nums%2==0){
            nums=nums/2;
        }
        else{
            nums=nums-1;
        }
        count++;
        }
        return count;
    }
}
