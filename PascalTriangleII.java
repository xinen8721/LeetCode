public class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        if(rowIndex < 1) return pre;
        for(int i = 1; i <= rowIndex; i++)
        {
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            for(int j = 0; j < pre.size() - 1; j++)
            {
                if(pre.size() == 1)
                    continue;
                cur.add(pre.get(j) + pre.get(j+1));
            }
            
            cur.add(1);
            pre = cur;
        }
        return pre;
    }
}