class Solution {
    public String findTheString(int[][] lcp)
    {
        int n = lcp.length;
        int c = 0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                continue;
            }
            if(++c > 26)
            {
                return "";
            }
            for(int j=i;j<n;j++)
            {
                if(lcp[i][j]>0)
                {
                    arr[j] = c;
                }
            }
        }    
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int v = i+1 < n && j+1<n ? lcp[i+1][j+1] : 0;
                v = arr[i]==arr[j] ? v+1 : 0;
                if(lcp[i][j]!=v)
                {
                    return "";
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for(int a:arr)
        {
            res.append((char)('a'+a-1));
        }
        return res.toString();
    }
}