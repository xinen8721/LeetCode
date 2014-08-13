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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null)   
            return list;
        
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        
        s1.push(root);
        
        while(!s1.isEmpty())
        {
            TreeNode pop = s1.pop();
            s2.push(pop);
            
            if(pop.left != null)
                s1.push(pop.left);
            if(pop.right != null)
                s1.push(pop.right);
        }
        
        while(!s2.isEmpty())
        {
            TreeNode temp = s2.pop();
            list.add(temp.val);
        }
        
        return list;
        
    }
}