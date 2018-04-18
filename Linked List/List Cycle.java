/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode a) {
	    
  if(a==null || a.next==null || a.next.next==null){
    return null;
  }
  ListNode inCycNode = listCycle(a);
  if(inCycNode!=null){
      
      ListNode temp1 = inCycNode;
      ListNode temp2 = inCycNode;
      int cycleSize = 1;
      while(temp2.next!=temp1){
          cycleSize++;
          temp2 = temp2.next; 
      }
      
      
      ListNode kthNode = a;
      ListNode headNode = a;
      int tempCycleSize = cycleSize;
     // System.out.println("tempCycleSize=="+tempCycleSize);
      while(tempCycleSize>0){
          kthNode = kthNode.next;
          tempCycleSize--;
      }
      //System.out.println("all fine till here");
   while(headNode!=kthNode){
        //  System.out.println("In the loop");
          headNode= headNode.next;
          kthNode = kthNode.next;
      }
      return headNode;
      
  }else{
   return null;
  }
  
  
	    
	}
	
static	ListNode listCycle(ListNode a){
    	   //int cycleSize = 0; 
  if(a==null || a.next==null || a.next.next==null){
    return null;
  }
    boolean cycleExists = false;
  ListNode fast = a.next.next;
  ListNode slow = a;
  while(slow.next!=null && fast.next !=null && fast.next.next!=null){
    if(fast==slow){
     //return cycleSize;
      //cycleExists = true;
      //break;
      return fast;
    }else{
       
      fast = fast.next.next;
      slow = slow.next;
    }

  }
  
  return null;
	}
	

}
