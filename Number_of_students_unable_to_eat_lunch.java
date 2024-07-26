class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zeros=0;
        int ones=0;
        for(int student:students)
        {
            if(student==0) zeros++;
            else ones++;
        }
        for(int sandwich: sandwiches)
        {
            if(sandwich==0){
            if(zeros==0)
            {
                break;
            }
        
            zeros--;
            }
        else{
        if(ones==0)
        {
            break;
        }
        
            ones--;
        }
        }
        return ones+zeros;

    }
}
