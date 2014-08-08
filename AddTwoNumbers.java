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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode result = null;
        ListNode prev = null;
        int carry = 0;
        
        while(l1 != null && l2 != null)
        {
            ListNode temp = null;
            int value;
            int total = l1.val + l2.val + carry;

            value = total % 10;
            carry = total / 10;
            temp = new ListNode(value);

            if(prev != null)
            {
                prev.next = temp;    
                prev = temp;
            }
            else
            {
                result = prev = temp;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1 != null)
        {
            int total = l1.val + carry;
            int value;
            ListNode temp = null;
            value = total % 10;
            carry = total / 10;
            temp = new ListNode(value);

            prev.next = temp;
            prev = temp;
            l1 = l1.next;

        }
        
        while(l2 != null)
        {
            int total = l2.val + carry;
            ListNode temp = null;
            
            int value = total % 10;
            carry = total / 10;
            temp = new ListNode(value);

            prev.next = temp;
            prev = temp;
            l2 = l2.next;

        }
        
        if(carry != 0)
        {
            ListNode temp = new ListNode(1);
            prev.next = temp;
        }
        
        return result;
        
    }
}