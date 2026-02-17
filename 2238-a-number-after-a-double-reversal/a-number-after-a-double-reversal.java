class Solution {
    public int reverse(int n)
    {
        int rev = 0;
        while(n!=0)
        {
            int u = n%10;
            rev = rev * 10 + u;
            n/=10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num)
    {
        if(num >= 0 && num<=9)
        {
            return true;
        }
        int rev1 = reverse(num);
        int rev2 = reverse(rev1);
        return num==rev2;
    }
}