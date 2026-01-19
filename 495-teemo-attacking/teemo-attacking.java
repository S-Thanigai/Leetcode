class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration)
    {
        if(timeSeries.length == 0) return 0;
        int c = 0;
        for(int i=1;i<timeSeries.length;i++)
        {
            c += Math.min(duration,timeSeries[i]-timeSeries[i-1]);
        }
        c += duration;
        return c;
    }
}