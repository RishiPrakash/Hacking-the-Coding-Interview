/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    int getTotLength(ListNode a){
		int tot = 0;
		while(a!=null){
			tot++;
			a= a.next;
		}
		return tot;
	}
    
    public ListNode reorderList(ListNode a) {
        
			ListNode org = a;
			ListNode orgFan = org;
			int n = getTotLength(a);
			int cnc =1;
			ListNode secondHalf = a;
			while(cnc-1<(n/2)){
			    secondHalf = secondHalf.next;
			    cnc++;
			}
			
			ListNode secHalfTemp = secondHalf.next;
			secondHalf.next = null;
		    secHalfTemp = 	reverselist(secHalfTemp);
						
			while(org!=null && secHalfTemp!=null){
			
			ListNode temp2= org.next;
			ListNode temp3 = secHalfTemp.next;
			ListNode temp = org.next;
			org.next =secHalfTemp;
			secHalfTemp.next = temp;
			org = temp2;
			secHalfTemp = temp3;
			}
		return orgFan;
		}
		
		
		   ListNode finalVec=null;
    public ListNode reverseList(ListNode a) {
         swap(a);
        return finalVec;
    }
    
    
    public ListNode reverselist(ListNode node) {
        ListNode prev = null, curr = node, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }
 
    
    void swap(ListNode x){
        //ListNode org = x;
        if(x==null || x.next==null){
            finalVec = x;    
            return;
        }
           swap(x.next);
           x.next.next = x;
           x.next = null;
    }
		
    }

