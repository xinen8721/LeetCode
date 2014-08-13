/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head ==  null || head.next == null)  return;
        ListNode slow = head;
        ListNode fast = head;
        
        // Find the middle point of current list
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = null;
        ListNode reversedHead = null;
        ListNode head2 = slow.next;
        slow.next = null;
        // Reverse the latter part of list
        while(head2 != null)
        {
            ListNode next = head2.next;
            if(next == null)
            {
                reversedHead = head2;
            }
            head2.next = prev;
            prev = head2;
            head2 = next;
        }
        
        ListNode p = head; 
        ListNode q = reversedHead;
        while(q != null)
        {
            ListNode pNext = p.next;
            ListNode qNext = q.next;
            p.next = q;
            q.next = pNext;
            
            p = pNext;
            q = qNext;
        }
    }
}