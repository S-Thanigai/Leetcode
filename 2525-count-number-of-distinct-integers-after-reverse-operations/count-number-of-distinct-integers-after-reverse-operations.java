class Solution {
    public int countDistinctIntegers(int[] nums)
    {
        Set<Integer> hs = new HashSet<>();
        for(int n:nums)
        {
            hs.add(n);
            hs.add(reverse(n));
        }
        return hs.size();
    }
    public int reverse(int n)
    {
        int rev = 0;
        while(n!=0)
        {
            int v = n%10;
            rev = v + rev * 10;
            n/=10;
        }
        return rev;
    }
}