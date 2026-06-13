class Solution {
    public String mapWordWeights(String[] words, int[] weights)
    {
        StringBuilder sb = new StringBuilder();
        for(String wo:words)
        {
            int sum = 0;
            for(int i=0;i<wo.length();i++)
            {
                char ch = wo.charAt(i);
                sum+=weights[ch-'a'];
            }
            sum=sum%26;
            sb.append((char)('z'-sum));
        }
        return sb.toString();    
    }
}