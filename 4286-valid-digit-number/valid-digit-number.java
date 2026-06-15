class Solution {
    public boolean validDigit(int n, int x)
    {
        String str = String.valueOf(n);
        String in = String.valueOf(x);
        if(str.charAt(0)-'0'==x)
        {
            return false;
        }
        return str.contains(in);
    }
}