class Solution {
    public int gcdOfOddEvenSums(int n)
    {
        int odsum = n*n;
        int evsum = n*(n+1);
        return gcd(odsum,evsum);
    }
    public int gcd(int odsum,int evsum)
    {
        if (evsum == 0) {
            return odsum;
        }
        return gcd(evsum, odsum % evsum);
    }
}