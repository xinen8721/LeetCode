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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if(root == null) return lists;

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        
        //Count of Nodes of Current Level and Next Level
        int newCount = 1;
        int oldCount = 1;
        
        while(!q.isEmpty())
        {
            oldCount = newCount;
            newCount = 0;

            List<Integer> tempList = new ArrayList<Integer>();            
            
            for(int i = 0; i < oldCount; i++)
            {
                TreeNode node = q.poll();
                
                if(node.left != null)
                {
                    q.add(node.left);
                    newCount++;
                }
                if(node.right != null)
                {
                    q.add(node.right);
                    newCount++;
                }
                tempList.add(node.val);
            }
            
        
           lists.add(new ArrayList<Integer>(tempList));
        
        }
        
        return lists;
        
    }
}