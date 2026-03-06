class Solution {
    public List<Integer> selfDividingNumbers(int left, int right)
    {
        List<Integer> li = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(sdn(i))
            {
                li.add(i);
            }
        }
        return li;
    }
    public boolean sdn(int num)
    {
        int v = num;
        while(v!=0)
        {
            int d = v%10;
            if(d==0)
            {
                return false;
            }
            if(num%d!=0)
            {
                return false;
            }
            v=v/10;
        }
        return true;
    }
}