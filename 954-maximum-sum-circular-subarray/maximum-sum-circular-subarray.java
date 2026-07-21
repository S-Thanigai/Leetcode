class Solution {
    public int maxSubarraySumCircular(int[] nums)
    {
        int fls = 0;
        int mls = Integer.MIN_VALUE;
        int rls = 0;
        int mlr = Integer.MAX_VALUE;
        int as = 0;
        for(int n:nums)
        {
            fls = Math.max(n,n+fls);
            mls = Math.max(fls,mls);
            as+=n;
        }
        for(int n:nums)
        {
            rls = Math.min(n,n+rls);
            mlr = Math.min(mlr,rls);
        }
        if(mlr==as)
        {
            return mls;
        }
        return Math.max(mls,as-mlr);
    }
}