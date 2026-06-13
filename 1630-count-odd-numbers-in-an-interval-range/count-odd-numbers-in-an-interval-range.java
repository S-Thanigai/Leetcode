class Solution {
    public int countOdds(int low, int high)
    {
        int nwr = high - low + 1;
        if(nwr%2==0)
        {
            return nwr / 2;
        }
        else
        {
            if(high%2!=0 || low%2!=0)
            {
                return nwr / 2 +1;
            }
            else
            {
                return nwr / 2;
            }
        }
    }
}