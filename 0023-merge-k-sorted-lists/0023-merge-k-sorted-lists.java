/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)-> a.val-b.val);
        for(ListNode t: lists)
        if(t!=null)
        pq.add(t);

        ListNode temp=new ListNode(0);
        ListNode last=temp;
        while(!pq.isEmpty())
        {
            ListNode curr=pq.poll();
            last.next=curr;
            last=last.next;
        

        if(curr.next!=null)
        {
            pq.add(curr.next);
        }
    }
    return temp.next;
}
}