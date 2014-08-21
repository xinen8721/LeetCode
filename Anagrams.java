
public class Solution {
    public List<String> anagrams(String[] strs) {
        HashTable<String, ArrayList<String>> hs = new HashTable<String,ArrayList<String>>();
        for(String s : strs)
        {
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String s = new String(array);
            
            if(hs.containsKey(s))
            {
                ArrayList<String> list = hs.get(s);
                list.add(s);
            }
            else
            {
                ArrayList<String> list = new ArrayList<String>();
                list.add(s);
                hs.put(s, list);
            }
        }
        
        Set<String> set = hs.keySet();
        
        ArrayList<String> finalList = new ArrayList<String>();
        for(String s : set)
        {
            ArrayList<String> list = hs.get(s);
            if(list.size() > 1)
            {
                finalList.addAll(list);
            }
        }
        
        return finalList;
    }
}