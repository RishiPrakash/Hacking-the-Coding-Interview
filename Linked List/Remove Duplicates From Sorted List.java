/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode a) {
        ListNode org = a;
        if(a!=null && a.next!=null){
            ListNode ref = a.next;
            while(ref.next!=null){
                if(ref.val!=a.val){
                    a.next=ref;
                    a= ref;
                }
                ref = ref.next; 
            }
            if(a.val!=ref.val){
                a.next = ref;
            }else{
                a.next=null;
            }
        }
        return org;
    }
}
