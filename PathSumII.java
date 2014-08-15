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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null)
            return new ArrayList<List<Integer>>();
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        createLists(lists, list, root, sum);
        
        return lists;
    }
    public void createLists(List<List<Integer>> finalLists, List<Integer> list, TreeNode root, int sum)
    {
        if(root == null)
            return;
        if(root.val == sum && root.left == null && root.right == null)
        {
            list.add(root.val);
            finalLists.add(new ArrayList<Integer>(list));
            list.remove(list.size() - 1);
            return;
        }
        
        list.add(root.val);
        createLists(finalLists, list, root.left, sum - root.val);
        createLists(finalLists, list, root.right, sum - root.val);
        list.remove(list.size() - 1);
    }
}