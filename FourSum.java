public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        ArrayList<List<Integer>> finalList = new ArrayList<List<Integer>>();
        Arrays.sort(num);
        int arrayLen = num.length;
        for(int i = 0; i < arrayLen - 1; i++)
        {
            if(i > 0 && num[i] == num[i-1])
                continue;
            for(int j = i + 1; j < arrayLen; j++)
            {
                if(j > i + 1 && num[j] == num[j-1])
                    continue;
                int p = j + 1;
                int q = arrayLen - 1;
            
                while(p < q)
                {
                    if(p > j+1 && num[p] == num[p-1])
                    {
                        p++;
                        continue;
                    }
                    if(q < arrayLen-1 && num[q] == num[q+1])
                    {
                        q--;
                        continue;
                    }
                    if(num[i]+num[j]+num[p]+num[q] == target)
                    {
                        ArrayList<Integer> list = new ArrayList<Integer>();
                        list.add(num[i]);
                        list.add(num[j]);
                        list.add(num[p]);
                        list.add(num[q]);
                        finalList.add(list);
                        p++;
                        q--;
                    }
                    else if(num[i]+num[j]+num[p]+num[q] < target)
                    {
                        p++;
                    }
                    else
                    {
                        q--;
                    }
                }
            }
        }
        
        return finalList;
        
    }
}