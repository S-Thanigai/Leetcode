class Solution {
    public int evalRPN(String[] tokens)
    {
        Stack<Integer> st = new Stack<>();
        for(String a:tokens)
        {
            if(a.equals("+"))
            {
                int s = st.pop();
                int f = st.pop();
                st.push(f+s);
            }
            else if(a.equals("-"))
            {
                int s = st.pop();
                int f = st.pop();
                st.push(f-s);
            }
            else if(a.equals("*"))
            {
                int s = st.pop();
                int f = st.pop();
                st.push(f*s);
            }
            else if(a.equals("/"))
            {
                int s = st.pop();
                int f = st.pop();
                st.push(f/s);
            }
            else
            {
                st.push(Integer.parseInt(a));
            }
        }
        return st.pop();
    }
}