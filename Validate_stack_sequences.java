class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int i=0,j=0;
        for(i=0;i<pushed.length;i++){
                 st.push(pushed[i]);
            while(!st.isEmpty() && st.peek()==popped[j]){
                st.pop();
                j++;
            }
        }

        if(st.size()==0){
            return true;
        }else{
            return false;
        }
    }
}
