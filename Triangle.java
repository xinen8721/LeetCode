public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null) return Integer.MAX_VALUE;
        int rowLength = triangle.size();    
        
        for(int i = rowLength - 2; i >=0; i--)
        {
            for(int j = 0; j <= triangle.get(i).size() - 1; j++)
            {
                int val = triangle.get(i).get(j);
                
                triangle.get(i).set(j, val + Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
            }
        }
        
        return triangle.get(0).get(0);
    }
}