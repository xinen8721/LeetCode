public class Solution {
    public double pow(double x, int n) {
        double result = -1;
        if(equalZero(x))
            return 0;
        if(n > 0)
        {
            result = calculatePow(x, n);
        }
        else
        {
            double temp = calculatePow(x, Math.abs(n));
            result = 1 / temp;
        }
        return result;
    }
    public boolean equalZero(double x)
    {
        if(Math.abs(x) < 0.00000001)
            return true;
        else
            return false;
    }
/*    public double calculatePow(double x, int n)
    {
        double result = 1;
        while(n != 0)
        {
            result *= x;
            --n;
        }
        return result;
    }
*/  public double calculatePow(double x, int n)
    {
        if(n == 0)
        {
            return 1;
        }
        if(n == 1)
        {
            return x;
        }
        double result = calculatePow(x, n/2);
        result *= result;
        if((n & 0x1) == 1)
        {
            result *= x;
        }
        return result;
    }
}