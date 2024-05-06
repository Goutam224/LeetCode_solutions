class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int num1=nums1[0];
      int num2=nums2[0];
      int diff=num2-num1;
      return diff;
    }
}
