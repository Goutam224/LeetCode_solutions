class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int arrive=arrivalTime+delayedTime;
        if(arrive>=24){
            arrive=arrive-24;
        }else{
            return arrive;
        }
        return arrive;
    }
}
