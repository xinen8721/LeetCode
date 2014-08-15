public class Solution {
    public boolean isValid(String s) {
        if(s == null) return false;
        if(s.length() < 2) return false;
        
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++)
        {
            switch(s.charAt(i))
            {
                case '(':
                case '{':
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;    
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{' )
                        return false;
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}