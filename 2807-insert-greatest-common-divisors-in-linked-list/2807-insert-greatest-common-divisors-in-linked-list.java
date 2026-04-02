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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp!=null&&temp.next!=null)
        {
            int gcd=gcdd(temp.val,temp.next.val);
            ListNode newnd=new ListNode(gcd);
            newnd.next=temp.next;
            temp.next=newnd;

            temp=newnd.next;

        }
        return head;
    }
    public static int gcdd(int a,int b)
    {
        while(b!=0){
        int t=b;
        b=a%b;
        a=t;
        }
        return a;
    }
}