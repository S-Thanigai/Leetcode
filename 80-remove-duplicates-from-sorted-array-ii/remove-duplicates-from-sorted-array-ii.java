class Solution {
    public int removeDuplicates(int[] nums)
    {
        int k = 2;
        int len  = nums.length;
        for(int i=2;i<len;i++)
        {
            if(nums[i]!=nums[k-2])
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}