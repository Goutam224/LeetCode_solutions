class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
       int move=0;
       Arrays.sort(seats);
       Arrays.sort(students);
       for(int i=0;i<seats.length;i++){
           int diff=Math.abs(seats[i]-students[i]);
           move=move+diff;
       }
       return move;
    }
}
