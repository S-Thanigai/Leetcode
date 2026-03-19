class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums)
    {
        int len = nums.length;
        int res[] = new int[len];
        for(int i=0;i<len;i++)
        {
            int cur = nums[i];
            int c = 0;
            for(int j=0;j<len;j++)
            {
                if(nums[j]<cur && i!=j)
                {
                    c+=1;
                }
            }
            res[i]=c;
        }
        return res;
    }
}