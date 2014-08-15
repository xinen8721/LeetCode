public class Solution {
    public String addBinary(String a, String b) {
        if(a == null || a.length() == 0) return b;       
        if(b == null || b.length() == 0) return a;       
        
        int aLength = a.length();
        int bLength = b.length();
        
        int i = aLength - 1, j = bLength - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        
        for(;i >= 0 && j >= 0; i--, j--)
        {
            switch(a.charAt(i) - '0' + b.charAt(j) - '0' + carry)
            {
                case 0: sb.insert(0,0); carry = 0; break;
                case 1: sb.insert(0,1); carry = 0; break;
                case 2: sb.insert(0,0); carry = 1; break;
                case 3: sb.insert(0,1); carry = 1; break;
            }
        }
        
        // b is empty
        for(; i >= 0; i--)
        {
            switch(a.charAt(i) - '0' + carry)
            {
                case 0: sb.insert(0,0); carry = 0; break;
                case 1: sb.insert(0,1); carry = 0; break;
                case 2: sb.insert(0,0); carry = 1; break;
            }
        }
        
        // a is empty
        for(; j >= 0; j--)
        {
            switch(b.charAt(j) - '0' + carry)
            {
                case 0: sb.insert(0,0); carry = 0; break;
                case 1: sb.insert(0,1); carry = 0; break;
                case 2: sb.insert(0,0); carry = 1; break;
            }
        }
        
        if(carry != 0)
        {
            sb.insert(0,1); 
        }
        
        return sb.toString();
    }
}