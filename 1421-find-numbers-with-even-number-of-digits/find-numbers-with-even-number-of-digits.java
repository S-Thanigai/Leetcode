class Solution {
    public int findNumbers(int[] nums)
    {
        int len = nums.length;
        int ec = 0;
        for(int i=0;i<len;i++)
        {
            int cur = nums[i];
            int c = 0;
            while(cur!=0)
            {
                cur/=10;
                c+=1;
            }
            if(c%2==0)
            {
                ec+=1;
            }
        }
        return ec;
    }
}