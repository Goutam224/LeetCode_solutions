class Solution {
    public int findLucky(int[] arr) {
      Map<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int max = -1;

        for (int n : map.keySet()) {
            if (n == map.get(n)) {
                max = Math.max(max, n);
            }
        }

        return max;
    }
}
