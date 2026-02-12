class Solution {
    public boolean isSubstringPresent(String s)
    {
        Set<String> li = new HashSet<>();
        for(int i = 0; i < s.length() - 1; i++)
        {
            li.add("" + s.charAt(i) + s.charAt(i+1));
        }

        String rev = new StringBuilder(s).reverse().toString();
        for(String st : li)
        {
            if(rev.indexOf(st) != -1)
            {
                return true;
            }
        }
        return false;
    }
}