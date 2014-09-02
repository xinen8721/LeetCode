/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode fast = helper, slow = helper;
        int step = 0;
        
        while(fast.next != null)
        {
            if(step >= n)
                slow = slow.next;
            fast = fast.next;
            step++;
        }
        
        if(slow.next != null)
            slow.next = slow.next.next;
            
        return helper.next;
        
    }

}