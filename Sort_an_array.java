class Solution {
    public static void mergesortinplace(int nums[], int low, int high) {
        if (high - low <= 1) {
            return;
        }
        int mid = (low + high) / 2;
        mergesortinplace(nums, low, mid);
        mergesortinplace(nums, mid, high);
        mergeinplace(nums, low, mid, high);
    }

    public static void mergeinplace(int nums[], int low, int mid, int high) {
        int[] mix = new int[high - low];
        int i = low;
        int j = mid;
        int k = 0;
        while (i < mid && j < high) {
            if (nums[i] < nums[j]) {
                mix[k++] = nums[i++];
            } else {
                mix[k++] = nums[j++];
            }
        }

        while (i < mid) {
            mix[k++] = nums[i++];
        }
        while (j < high) {
            mix[k++] = nums[j++];
        }
        for (int l = 0; l < mix.length; l++) {
            nums[low + l] = mix[l];
        }
    }

    public int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length;
        mergesortinplace(nums, low, high);
        return nums;
    }
}
