class Solution {
    public int largestAltitude(int[] gain)
    {
        int n = gain.length;
        int su = 0;
        int cs = 0;
        for(int i=0;i<n;i++)
        {
            cs+=gain[i];
            su = Math.max(su,cs);
        }
        return su;
    }
}