class Solution {
    public int minPartitions(String n)
    {
        int max = 0;
        for(char c : n.toCharArray())
        {
            int v = c-'0';
            if(v>max)
            {
                max = v;
            }
        }
        return max;
    }
}