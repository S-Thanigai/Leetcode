class Solution {
    public double angleClock(int hour, int minutes)
    {
        double ha = 30*hour;
        double hm = 5.5*minutes;
        double res =  Math.abs(ha-hm);
        if(res>=180)
        {
            return 360.0 - res;
        }
        else
        {
            return res;
        }
    }
}