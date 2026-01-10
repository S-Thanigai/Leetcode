class Solution {
    public boolean isHappy(int n)
    {
        HashSet<Integer> hs = new HashSet<>();
        while(n!=1 && !hs.contains(n))
        {
            hs.add(n);
            n=sum(n);
        }
        return n==1;
    }
    public static int sum(int n)
    {
        int s = 0;
        while(n!=0)
        {
            int q = n%10;
            s+=q*q;
            n/=10;
        }
        return s;
    }
}