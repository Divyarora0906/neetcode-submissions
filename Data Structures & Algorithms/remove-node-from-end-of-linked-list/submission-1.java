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
    public ListNode removeNthFromEnd(ListNode head, int n) {

    if(head == null || head.next == null){
        ListNode empty = null;
    return empty;
}
       ListNode prev = null;
       ListNode curr = head;
       while(curr != null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }
       int i = 1;
       ListNode reversedHead = prev;
       ListNode t1 = reversedHead;
       ListNode t1prev = null;
       while(i < n){
        t1prev = t1;
        t1 = t1.next;
        i++;
       }
       if(t1prev == null){
            reversedHead = reversedHead.next;
        }else{
            t1prev.next = t1.next;
        }
        ListNode prevs = null;
       ListNode currs = reversedHead;
       while(currs != null){
        ListNode nexts = currs.next;
        currs.next = prevs;
        prevs = currs;
        currs = nexts;
       }
       return prevs;
    }
}
