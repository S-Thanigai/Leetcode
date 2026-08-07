class Solution {
    public int[][] merge(int[][] intervals)
    {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int []> mer = new ArrayList<>();
        int pre[] = intervals[0];
        for(int i=0;i<intervals.length;i++)
        {
            if(intervals[i][0] <= pre[1])
            {
                pre[1] = Math.max(pre[1],intervals[i][1]);
            }
            else
            {
                mer.add(pre);
                pre = intervals[i];
            }
        }
        mer.add(pre);
        return mer.toArray(new int[mer.size()][]);
    }
}