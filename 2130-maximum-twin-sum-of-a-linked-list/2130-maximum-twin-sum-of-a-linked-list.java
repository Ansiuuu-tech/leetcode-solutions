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
    public int pairSum(ListNode head) {
        ListNode s=head,f=head;
        while(f!=null&&f.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }

        ListNode prev=null;
        while(s!=null)
        {
            ListNode nnode=s.next;
            s.next=prev;
            prev=s;
            s=nnode;
        }

        int res=0;
        ListNode first=head;
        ListNode second=prev;

        while(second!=null)
        {
            res=Math.max(res,first.val+second.val);
            first=first.next;
            second =second.next;
        }
        return res;
    }
}