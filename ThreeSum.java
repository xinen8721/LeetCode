public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        ArrayList<List<Integer>> lists = new ArrayList<List<Integer>>();
        Arrays.sort(num);
        for(int i = 0; i < num.length; i++)
        {
            if(i > 0 && num[i] == num[i-1])
                continue;
            int x = 0 - num[i];
            
            int p = i + 1;
            int q = num.length - 1;
            
            while(p < q)
            {
                if((p > i+1) && num[p] == num[p-1])
                {
                    p++;
                    continue;
                }
                if((q < num.length - 1) && num[q] == num[q+1])
                {
                    q--;
                    continue;
                }
                if(num[p] + num[q] == x)
                {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(num[i]);
                    list.add(num[p]);
                    list.add(num[q]);
                    
                    lists.add(list);
                    p++;
                    q--;
                }
                else if(num[p] + num[q] < x)
                {
                    p++;
                }
                else
                {
                    q--;
                }
            }
            
        }
        
        return lists;
    }
}