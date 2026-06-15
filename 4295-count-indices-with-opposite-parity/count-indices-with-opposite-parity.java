class Solution {
    public int[] countOppositeParity(int[] nums)
    {
        int n = nums.length;
        int od = 0;
        int ev = 0;
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]%2!=0)
            {
                nums[i]=ev;
                od++;
            }
            else
            {
                nums[i]=od;
                ev++;
            }
        }
        return nums;
    }
}