class Solution {
    public void duplicateZeros(int[] arr) {
     String s="";
     StringBuilder sb=new StringBuilder();
     for(int i:arr){
        s+=i;
     }
     for(int j=0;j<s.length();j++){
        if(s.charAt(j)=='0'){
            sb.append('0');
            sb.append('0');
        }else{
            sb.append(s.charAt(j));
        }
     }
     String tostring=sb.toString();
     for(int i=0;i<arr.length;i++){
        arr[i]=tostring.charAt(i)-'0';
     }
     return;   
    }
}
