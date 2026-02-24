/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int su = 0;
    public int sumRootToLeaf(TreeNode root)
    {
        dfs(root,"");
        return su;
    }
    private void dfs(TreeNode node,String s)
    {
        if(node==null)
        {
            return;
        }
        s+=node.val;
        while(node.left==null && node.right==null)
        {
            su += Integer.parseInt(s,2);
            return;
        }
    dfs(node.left,s);
    dfs(node.right,s);
    }
}