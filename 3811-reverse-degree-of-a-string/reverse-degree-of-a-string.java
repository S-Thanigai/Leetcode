class Solution {
    public int reverseDegree(String s)
    {
        char arr[] = s.toCharArray();
        int sum = 0;
        int p = 1;
        for(char c:arr)
        {
            int ch = 26 - (c - 'a');
            sum += ch * p;
            p+=1;
        }
        return sum;
    }
}