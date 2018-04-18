/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        ListNode head = null;
        ListNode nextNode =A;
        ListNode startNode = null;
        ListNode endNode = null;
        while(nextNode!=null){
            int counter = B;
            startNode = nextNode;
            endNode  = nextNode;
           // System.out.println(endNode.val);
            while(counter>1){
                
                endNode = endNode.next;
                counter--;
                
            }
            if(endNode!=null)
            {
                nextNode = endNode.next;
                endNode.next = null;
            }
            else{
            nextNode = null; break;
            }
            ListNode returnNode = reverse(startNode);
            if(head!=null){
                ListNode ref = head;
                while(ref.next!=null){
                    ref = ref.next;
                }
                ref.next = returnNode;
            }else{
                head = returnNode;
            }
        }
        return head;
    }
    ListNode finalVec = null;
     public ListNode reverse(ListNode a) {
         swap(a);
        return finalVec;
    }
    void swap(ListNode x){
        //ListNode org = x;
        if(x.next==null){
            finalVec = x;    
            return;
        }
           swap(x.next);
           x.next.next = x;
           x.next = null;
    }
}
