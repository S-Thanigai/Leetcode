class Solution {
    public char processStr(String s, long k)
    {
        long ans=0;

        for(char el: s.toCharArray()){
            if(el=='*') ans = (ans==0) ? ans : ans-1;
            else if(el == '#') ans *= 2;
            else if(el == '%') ans = ans;
            else ans ++;
        }
        if (k>=ans) return '.';
        
        for(int i=s.length()-1; i>=0; i--){
            char el = s.charAt(i);
            if(el=='*') ans++;
            else if(el == '#'){
                long mid = ans/2;
                k = (k<mid) ? k : k-mid;
                ans/=2;
            }else if(el == '%'){
                long mid = ans/2;
                k = 2*mid - k;
                if(ans%2==0) k--;
            }else{
                ans--;
                if(ans == k) return el;
            }

        }
        return '.';
    }
}