class Solution {
    public boolean threeConsecutiveOdds(int[] arr)
    {
        int c = 0;
        for(int n:arr)
        {
            if(n%2!=0)
            {
                c+=1;
            }
            else
            {
                c=0;
            }
            if(c==3)
            {
                return true; 
            }
        }
        return false;
    }
}