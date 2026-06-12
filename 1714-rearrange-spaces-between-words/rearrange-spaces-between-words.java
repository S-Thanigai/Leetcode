class Solution {
    public String reorderSpaces(String text)
    {
        int spaces = 0;

        for(char c : text.toCharArray())
        {
            if(c == ' ')
            {
                spaces++;
            }
        }

        String[] words = text.trim().split("\\s+");
        int n = words.length;

        if(n == 1)
        {
            return words[0] + " ".repeat(spaces);
        }

        int gap = spaces / (n - 1);
        int extra = spaces % (n - 1);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++)
        {
            sb.append(words[i]);

            if(i != n - 1)
            {
                sb.append(" ".repeat(gap));
            }
        }

        sb.append(" ".repeat(extra));

        return sb.toString();
    }
}