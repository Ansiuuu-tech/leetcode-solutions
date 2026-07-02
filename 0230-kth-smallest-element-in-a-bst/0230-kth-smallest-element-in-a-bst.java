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
    int val=-1,c=0;
        boolean res=false;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null||res)
        {
            return -1;
        }

        if(c==0)
        c=k;
        kthSmallest(root.left,k);
        if(c==1 && !res){
        val=root.val;
        res=true;
        return val;
    }
    c--;
    kthSmallest(root.right,k);
        return val;
    }
}