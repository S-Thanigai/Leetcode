class Solution {
    public boolean canAliceWin(int n)
    {
        int r = 10;
        while(n>=r)
        {
            n-=r;
            r--;
        }
        return r%2!=0;
    }
}