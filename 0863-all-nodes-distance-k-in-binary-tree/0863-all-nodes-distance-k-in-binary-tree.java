/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> pt=new HashMap<>();
        markParent(root,pt,root);
        Map<TreeNode ,Boolean> visited=new HashMap<>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(target);
        visited.put(target,true);
        int curlev=0;

        while(!queue.isEmpty()){
             if (curlev == k)
                break;
            int size=queue.size();
            curlev++;

            for(int i=0;i<size;i++)
            {
                TreeNode curr=queue.poll();
                if(curr.left!=null&&visited.get(curr.left)==null){
                    queue.offer(curr.left);
                    visited.put(curr.left,true);
                    
                }
                if(curr.right!=null&&visited.get(curr.right)==null){
                    queue.offer(curr.right);
                    visited.put(curr.right,true);
                    
                }
                if(pt.get(curr)!=null&&visited.get(pt.get(curr))==null){
                    queue.offer(pt.get(curr));
                    visited.put(pt.get(curr),true);
                    
                }
            }
        }
        List<Integer> res =new ArrayList<>();
        while(!queue.isEmpty())
        {
            TreeNode curr=queue.poll();
            res.add(curr.val);
        }
        return res;
    }
    public void markParent(TreeNode root,Map<TreeNode,TreeNode> pt,TreeNode target)
    {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode current=queue.poll();
            if(current.left!=null){
                pt.put(current.left,current);
                queue.offer(current.left);
            }
              if(current.right!=null){
                pt.put(current.right,current);
                queue.offer(current.right);
            }
        }
    }

}