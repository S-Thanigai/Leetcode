class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lid = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> li = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || i==j)
                {
                    li.add(1);
                }
                else
                {
                    int f = lid.get(i-1).get(j-1)+lid.get(i-1).get(j);
                    li.add(f);
                }
            }
            lid.add(li);
        }
        return lid;
    }
}