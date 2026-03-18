class Solution {
    public int minNumberOperations(int[] target)
    {
        int sum =  target[0];
        int len = target.length;
        for(int i=1;i<len;i++)
        {
            if(target[i]>target[i-1])
            {
                sum += target[i] - target[i-1];
            }
        }
        return sum;
    }
}