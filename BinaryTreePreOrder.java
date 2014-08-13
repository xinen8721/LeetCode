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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null)
            return list;
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        
        while(!s.isEmpty())
        {
            TreeNode pop = s.pop();
            list.add(pop.val);
            if(pop.right != null)
                s.push(pop.right);
            if(pop.left !=null)
                s.push(pop.left);
        }
        
        return list;
    }
}