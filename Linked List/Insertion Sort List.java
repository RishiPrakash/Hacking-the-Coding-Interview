/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode a) {
        
    ListNode dummy = new ListNode(0);//using dummy node to keep track of first Node

    ListNode prevNode = null;
    ListNode next = null;

    while(a!=null){
      next = a.next; //saving next node
      prevNode = dummy; // each time start from dummy node
      while(prevNode.next!=null && prevNode.next.val<a.val){
        prevNode = prevNode.next; //moving till one node beofre place to insert the node
      }
      //Insertion of node
      a.next = prevNode.next;
      prevNode.next = a;
      //moving to next node
      a = next;
    }

return dummy.next;
  
    }
}
