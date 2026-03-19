class Solution {
    public List<String> buildArray(int[] target, int n)
    {
        List<String> li = new ArrayList<>();
        int j = 0;
        int len = target.length;
        for(int i=1;i<=n;i++)
        {
            if(j==len) break;
            li.add("Push");
            if(target[j]==i)
            {
                j++;
            }
            else
            {
                li.add("Pop");
            }
        }
        return li;
    }
}