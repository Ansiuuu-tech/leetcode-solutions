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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }

        TreeNode root=build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);

        return root;
    }

    public TreeNode build(int[] preorder,int preSt,int preEn,int[] inorder,int inSt,int inEn,Map<Integer,Integer> map)
    {
        if(preSt>preEn || inSt>inEn)
        return null;
        TreeNode root=new TreeNode(preorder[preSt]);
        int inr=map.get(root.val);
        int numsl=inr-inSt;

        root.left=build(preorder,preSt+1,preSt+numsl,inorder,inSt,inr-1,map);
         root.right=build(preorder,preSt+numsl+1,preEn,inorder,inr+1,inEn,map);

         return root;
    }
}