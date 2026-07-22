class Solution {
    public int minPairSum(int[] nums)
    {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length-1;
        int ms = Integer.MIN_VALUE;
        while(l<r)
        {
            int cs = 0;
            cs+=nums[l]+nums[r];
            ms = Math.max(ms,cs);
            l++;
            r--;
        }
        return ms;
    }
}