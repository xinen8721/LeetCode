public class Solution {
    public int longestConsecutive(int[] num) {
        Set<Integer> s = new HashSet<Integer>();
        for(int value : num)
        {
            s.add(value);
        }
        
        int max = 1;
        for(int value : num)
        {
            int left = value - 1;
            int right = value + 1;
            int count = 1;
            
            while(s.contains(left))
            {
                count++;
                s.remove(left);
                left--;
            }
            
            while(s.contains(right))
            {
                count++;
                s.remove(right);
                right++;
            }
            
            max = Math.max(max, count);
        }
        
        return max;
    }
}