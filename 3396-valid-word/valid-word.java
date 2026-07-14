public class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if (n < 3) {
            return false;
        }

        boolean vowels = false;
        boolean consonants = false;

        for (char c : s.toCharArray())
        {
            if (Character.isLetter(c))
            {
                if ("aeiouAEIOU".indexOf(c) != -1)
                {
                    vowels = true;;
                }
                else
                {
                    consonants = true;;
                }
            }
            else if (!Character.isDigit(c))
            {
                return false;
            }
        }
        return vowels && consonants;
    }
}