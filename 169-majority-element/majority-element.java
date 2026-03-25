class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int cand = 0;
        for(int n:nums)
        {
            if(c==0)
            {
                cand=n;
            }
            if(n==cand)
            {
                c++;
            }
            else
            {
                c--;
            }
        }
        return cand;
    }
}