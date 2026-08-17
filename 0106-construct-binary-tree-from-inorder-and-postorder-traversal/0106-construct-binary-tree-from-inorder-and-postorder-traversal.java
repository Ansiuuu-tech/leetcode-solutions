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
    public TreeNode buildTree( int[] inorder,int[] postorder) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }

        TreeNode root=build(postorder,0,postorder.length-1,inorder,0,inorder.length-1,map);

        return root;
    }

    public TreeNode build(int[] postorder,int postSt,int postEn,int[] inorder,int inSt,int inEn,Map<Integer,Integer> map)
    {
        if(postSt>postEn || inSt>inEn)
        return null;
        TreeNode root=new TreeNode(postorder[postEn]);
        int inr=map.get(postorder[postEn]);
        int numsl=inr-inSt;

        root.left=build(postorder,postSt,postSt+numsl-1,inorder,inSt,inr-1,map);
         root.right=build(postorder,postSt+numsl,postEn-1,inorder,inr+1,inEn,map);

         return root;
    }
}