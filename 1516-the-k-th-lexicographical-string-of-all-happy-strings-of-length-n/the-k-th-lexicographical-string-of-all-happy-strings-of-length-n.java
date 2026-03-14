class Solution
{
    static char arr[] = {'a','b','c'};
    static TreeSet<String> ts = new TreeSet<>();
    public void generate(String s,int n)
    {
        if(s.length()==n)
        {
            ts.add(s);
            return;
        }
        for(char c : arr)
        {
            if(s.length() == 0 || s.charAt(s.length()-1) != c)
            {
                generate(s + c, n);
            }
        }
    } 
    public String getHappyString(int n, int k)
    {
        ts.clear();
        generate("",n);

        if(k>ts.size())
        return "";

        int i=1;
        for(String s:ts)
        {
            if(i==k)
            return s;
            i++;
        }
        return "";
    }
}