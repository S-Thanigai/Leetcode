class Solution {
    public boolean sumOfNumberAndReverse(int num)
    {
        if(num==0)
        {
            return true;
        }
        for(int i=0;i<num;i++)
        {
            int sum = i + reverse(i);
            if(sum==num)
            {
                return true;
            }
        }
        return false;
    }
    public int reverse(int n)
    {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        return Integer.parseInt(rev);
    }
}