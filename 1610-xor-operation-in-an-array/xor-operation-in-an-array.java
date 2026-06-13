class Solution {
    public int xorOperation(int n, int start)
    {
        int sum = start;
        for(int i=1;i<n;i++)
        {
            int v = start + 2 * i;
            sum = sum ^ v;
        }
        return sum;
    }
}