class Solution {
    public int[] sortArrayByParity(int[] nums)
    {
        int len = nums.length;
        int l = 0;
        int r = len-1;
        while(l<r)
        {
            while(l<len && nums[l]%2==0)
            {
                l++;
            }
            while(r>=0 && nums[r]%2!=0)
            {
                r--;
            }
            if(l<r)
            {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }    
            l++;
            r--;
        }
        return nums;
    }
}