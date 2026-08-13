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
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer,Set<Integer>>map =new HashMap<>();
        convert(root,0,map);
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        int minute=0;
        Set<Integer> visited= new HashSet<>();
        visited.add(start);
        while (!q.isEmpty())
        {
            int s=q.size();
            while(s>0) {
                int cur=q.poll();
                for (int num : map.get(cur)) 
                {
                    if (!visited.contains(num)) 
                    {
                        visited.add(num);
                        q.add(num);
                    }
                }
                s--;
            }
            minute++;
        }
        return minute-1;
    }

    void convert(TreeNode current, int parent, Map<Integer, Set<Integer>> map) {
        if (current==null) {
            return;
        } 
        if (!map.containsKey(current.val)) {
            map.put(current.val, new HashSet<>());
        }
        Set<Integer> ls=map.get(current.val);
        if (parent!=0) {
            ls.add(parent);
        } 
        if (current.left != null) {
            ls.add(current.left.val);
        } 
        if (current.right != null) {
            ls.add(current.right.val);
        }
        convert(current.left, current.val, map);
        convert(current.right, current.val, map);
    }
}
