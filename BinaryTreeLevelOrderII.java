/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if(root == null)    
            return lists;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        
        int curLevelCount = 1;
        int lowLevelCount = 1;
        while(!q.isEmpty())
        {
            curLevelCount = lowLevelCount;
            lowLevelCount = 0;
            
            List<Integer> list = new ArrayList<Integer>();
            
            for(int i = 0; i < curLevelCount; i++)
            {
                TreeNode node = q.poll();
                
                if(node.left != null)
                {
                    q.add(node.left);
                    lowLevelCount++;
                }
                if(node.right != null)
                {
                    q.add(node.right);
                    lowLevelCount++;
                }
                list.add(node.val);
            }
            lists.add(list);
        }
        
        List<List<Integer>> finalLists = new ArrayList<List<Integer>>();
        for(int i = lists.size() - 1; i >= 0; i--)
        {
            finalLists.add(lists.get(i));
        }
        
        return finalLists;
    }
}