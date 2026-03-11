class Solution {
    public int bitwiseComplement(int n)
    {
        String s = Integer.toBinaryString(n);
        s = s.replace('0', 'x');  // temporary
        s = s.replace('1', '0');
        s = s.replace('x', '1');
        int num = Integer.parseInt(s,2);
        //StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        return num;
    }
}