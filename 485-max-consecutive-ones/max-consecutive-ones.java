class Solution {
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int c = 0;
        int mc = Integer.MIN_VALUE;
        for(int n:nums)
        {
            if(n==1)
            {
                c+=1;
            }
            else
            {
                c = 0;
            }
            mc = Math.max(c,mc);
        }
        return mc;
    }
}