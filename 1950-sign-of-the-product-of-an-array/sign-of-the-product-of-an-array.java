class Solution {
    public int arraySign(int[] nums)
    {
        return signFunc(nums);
    }
    private int signFunc(int[] arr)
    {
        boolean zero = false;
        int neg = 0;
        for(int n:arr)
        {
            if(n==0)
            {
                zero = true;
                break;
            }
            else if(n<0)
            {
                neg+=1;
            }
        }
        if(zero)
        {
            return 0;
        }
        else
        {
            if(neg%2!=0)
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
    }
}