class Solution {
    public String thousandSeparator(int n)
    {
        String v = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for(int i = v.length() - 1; i >= 0; i--)
        {
            sb.append(v.charAt(i));
            if((v.length() - i) % 3 == 0 && i != 0)
            {
                sb.append(".");
            }
        }
        return sb.reverse().toString();
    }
}