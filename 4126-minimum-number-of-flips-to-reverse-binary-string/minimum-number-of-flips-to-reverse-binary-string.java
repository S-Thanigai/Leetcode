class Solution {
    public int minimumFlips(int n)
    {
        String res=Integer.toBinaryString(n);
        String rev=new StringBuilder(res).reverse().toString();
        int count=0;
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)!=rev.charAt(i)){
                count++;
            }
        }
        return count;
    }
}