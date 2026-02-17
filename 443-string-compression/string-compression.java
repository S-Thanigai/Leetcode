class Solution {
    public int compress(char[] chars)
    {
        int i = 0;
        int n = chars.length;
        int ind = 0;
        while(i<n)
        {
            char cu = chars[i];
            int co = 0;
            while(i<n && cu==chars[i])
            {
                i++;
                co++;
            }
            chars[ind++]=cu;
            if(co>1)
            {
                for(char c : String.valueOf(co).toCharArray())
                {
                    chars[ind++] = c;
                }
            }
        }
        return ind;
    }
}