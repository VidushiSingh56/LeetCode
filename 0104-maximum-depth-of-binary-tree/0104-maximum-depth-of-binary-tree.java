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
    public int maxDepth(TreeNode root) 
    {
        // if(root == null)
        // return 0;

        // int left = maxDepth(root.left);
        // int right = maxDepth(root.right);

        // return 1+Math.max(left, right);  

        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
        return 0;

        q.offer(root);
        
        int level =0;
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i =0;i<size;i++)
            {
                TreeNode node = q.poll();
                if(node.left != null)q.offer(node.left);
                if(node.right != null)q.offer(node.right);
            }
            level++;
        }
        return level;
    }
}