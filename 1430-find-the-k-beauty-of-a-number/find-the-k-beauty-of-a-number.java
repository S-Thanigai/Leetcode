class Solution {
    public int divisorSubstrings(int num, int k)
    {
        String n = String.valueOf(num);
        int len = n.length();
        int c = 0;
        for(int i=0;i<=len-k;i++)
        {
            int nu = Integer.parseInt(n.substring(i,i+k));
            if(nu!=0)
            {
                if(num%nu==0)
                {
                    c+=1;
                }
            }
        }
        return c;
    }
}