/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       if(head==null){
        return null;
       }
       Map<Node, Node> oldtoNew = new HashMap<>();
       Node curr = head;
       while(curr != null){
        oldtoNew.put(curr, new Node(curr.val));
        curr=curr.next;
       }
       curr = head;
       while(curr != null){
        Node cloneNode = oldtoNew.get(curr);
        cloneNode.next = oldtoNew.get(curr.next);
        cloneNode.random = oldtoNew.get(curr.random);
        curr = curr.next;
       }
       return oldtoNew.get(head);
    }
}
