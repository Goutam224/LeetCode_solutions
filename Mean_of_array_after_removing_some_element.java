class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double sum=0;
        double count=0;
        int n=arr.length;
        int eleremove=(n*5)/100;
        for(int i=eleremove;i<n-eleremove;i++){
           sum=sum+arr[i];
           count++;
        }
      double mean=0;
      mean=sum/count;
      return mean;
    }
}
