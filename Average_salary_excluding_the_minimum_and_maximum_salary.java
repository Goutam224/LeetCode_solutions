class Solution {
    public double average(int[] salary) {
        double sum=0;
      Arrays.sort(salary);
      double min=salary[0];
      double max=salary[salary.length-1];
      for(int i=0;i<salary.length;i++){
          sum=sum+salary[i];
      }
         sum=sum-min;
         sum=sum-max;
         int l=salary.length;
         return sum/(l-2);
    }
}
