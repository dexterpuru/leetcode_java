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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode l3 = new ListNode(0);
        
        ListNode dummy = l3;
        
        int carry = 0;
        int a;
        int b;
        
        while (!(l1 == null && l2 == null && carry == 0)) {
            
            if (l1 == null) {
                a = 0;
            } else {
                a = l1.val;
            }
            
            if (l2 == null) {
                b = 0;
            } else {
                b = l2.val;
            }
            
            int sum = a + b + carry;
            
            int digit = sum % 10;
            
            carry = sum / 10;
            
            ListNode newNode = new ListNode(digit);
            
            l3.next = newNode;
            l3 = l3.next;
            
            if (l1 != null) {
                l1 = l1.next;
            }
            
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        
        return dummy.next;
    }
}