public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
        {
            return false;
        }
        int count = 0, temp = x;

        while(temp > 0)
        {
            count++;
            temp /= 10;
        }
        int powBase = (int)Math.pow(10, count - 1);
        
        while(x > 0)
        {
            int firstDigit = x / powBase;
            int lastDigit = x % 10;
            if(firstDigit != lastDigit)
            {
                return false;
            }
            x = (x % powBase) / 10;
            powBase /= 100;
        }
        return true;
    }

}