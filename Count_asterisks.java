class Solution {
    public int countAsterisks(String s) {
        int flag = 0;
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                flag++;
            }
            if (flag % 2 == 0 && s.charAt(i) == '*') {
                counter++;
            }
        }

        return counter;
    }
}
