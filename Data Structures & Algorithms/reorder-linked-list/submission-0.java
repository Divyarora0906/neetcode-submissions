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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while( fast != null  && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode otherListHead = slow.next;
        slow.next = null;

        //Reverse the second half 
        ListNode prev = null;
        ListNode curr = otherListHead;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }

        ListNode t1 = head;
        ListNode t2 = prev;
        while(t2 != null){
        ListNode m1 = t1.next;
        ListNode m2 = t2.next;
            t1.next = t2;
            t2.next = m1;
            t1 = m1;
            t2 = m2;
        }
    }
}
