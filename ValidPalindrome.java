public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null) return false;
        char[] array = s.toCharArray();
        int len = s.length();
        int i = 0;
        int j = len - 1;
        while(i < j)
        {
            while(i < len && !isAlpha(s.charAt(i)) && !isNum(s.charAt(i)))
            {
                i++;
            }
            
            while(j > 0 && !isAlpha(s.charAt(j)) && !isNum(s.charAt(j)))
            {
                j--;
            }
            
            if(i >= j) 
                break;
            if(!isSame(s.charAt(i), s.charAt(j)))
                return false;
            
            i++;
            j--;
        }
        return true;
    }
    
    public boolean isAlpha(char c)
    {
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            return true;
        else
            return false;
    }
    
    public boolean isNum(char c)
    {
        if(c >= '0' && c <= '9')
            return true;
        else
            return false;
    }
    
    public boolean isSame(char a, char b)
    {
        if(isNum(a) && isNum(b))
        {
            return a == b;
        }
        else if(Character.toLowerCase(a) == Character.toLowerCase(b))
            return true;
        else
            return false;
    }
}