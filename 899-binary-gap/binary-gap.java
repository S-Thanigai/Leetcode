class Solution {
    public int binaryGap(int n)
    {
        String b = Integer.toBinaryString(n);
        int prev = -1, ans = 0;

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '1') {
                if (prev != -1) {
                    ans = Math.max(ans, i - prev);
                }
                prev = i;
            }
        }
        return ans;
    }
}