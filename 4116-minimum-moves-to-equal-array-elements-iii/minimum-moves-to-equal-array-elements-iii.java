class Solution {
    public int minMoves(int[] nums)
    {
        int max = 0;
        for(int a:nums)
        {
            max = Math.max(max,a);
        }
        int c = 0;
        for(int a:nums)
        {
            c += max - a;
        }
        return c;
    }
}