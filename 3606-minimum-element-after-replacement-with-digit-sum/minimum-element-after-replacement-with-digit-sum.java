class Solution {
    public int minElement(int[] nums)
    {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int sum = 0;
            while(nums[i]!=0)
            {
                sum+=nums[i]%10;
                nums[i]/=10;
            }
            if(sum<min)
            {
                min = sum;
            }
        }
        return min;
    }
}