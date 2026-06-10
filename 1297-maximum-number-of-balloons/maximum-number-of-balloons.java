class Solution {
    public int maxNumberOfBalloons(String text)
    {
        int bc = 0;
        int ac = 0;
        int lc = 0;
        int oc = 0;
        int nc = 0;
        int n = text.length();
        for(int i=0;i<n;i++)
        {
            char ch = text.charAt(i);
            if(ch=='b')
            {
                bc+=1;
            }
            if(ch=='a')
            {
                ac+=1;
            }
            if(ch=='l')
            {
                lc+=1;
            }
            if(ch=='o')
            {
                oc+=1;
            }
            if(ch=='n')
            {
                nc+=1;
            }
        }
        int c = 0;
        while(true)
        {
            if(bc<1 || ac<1 || lc<2 || oc<2 || nc<1)
            {
                break;
            }
            else
            {
                bc-=1;
                ac-=1;
                lc-=2;
                oc-=2;
                nc-=1;
                c+=1;
            }
        }
        return c;
    }
}