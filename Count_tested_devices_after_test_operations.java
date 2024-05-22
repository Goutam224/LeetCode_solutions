class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int count =0;
        int tester=0;
        for(Integer num : batteryPercentages){
            if(num+tester>0){count+=1; tester-=1;}
        }
        return count;
    }
}
