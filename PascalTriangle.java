public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if(numRows < 1) return lists;
        ArrayList<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        lists.add(pre);

        for(int i = 1; i < numRows; i++)
        {
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            
            for(int j = 0; j < pre.size() - 1; j++ )
            {
                if(pre.size() == 1)
                    continue;
                cur.add(pre.get(j) + pre.get(j+1));
            }
            cur.add(1);
            lists.add(cur);
            pre = cur;
        }
        
        return lists;
        
    }
}