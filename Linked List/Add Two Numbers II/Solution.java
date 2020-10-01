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

import java.util.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // getListStack
        // compare the stack size and set s1 as the larger one
        // return getResultList(s1, s2)
        
        Stack<ListNode> s1 = getListStack(l1);
        Stack<ListNode> s2 = getListStack(l2);
        
        if (s1.size() > s2.size()) {
            
            return getResultList(s1, s2);
        }
        
        return getResultList(s2, s1);
        
    }
    
    // Return a stack with the linked list nodes as elements.
    public Stack<ListNode> getListStack(ListNode listNode) {
        
        Stack<ListNode> listStack = new Stack<ListNode>();
        
        while(listNode != null) {
            
            listStack.push(listNode);
            listNode = listNode.next;
        }
        
        return listStack;
    }
    
    // Return the resultant list after performing the addition.
    public ListNode getResultList(Stack<ListNode> s1, Stack<ListNode> s2) {
        
        ListNode resultList = null;
        
        int carry = 0;
        
        while (!s1.empty() && !s2.empty()) {
            
            
            int val1 = s1.pop().val;
            int val2 = s2.pop().val;
            
            int sum = val1 + val2 + carry;
            
            int result = sum % 10;
            carry = sum / 10;
            
            
            resultList = appendInfront(resultList, new ListNode(result));
        }
        
        while (!s1.empty()) {
            
            int sum = s1.pop().val + carry;
            
            int result = sum % 10;
            
            carry = sum / 10;
            
            resultList = appendInfront(resultList, new ListNode(result));
        }
        
        if (carry == 1) {
            
            resultList = appendInfront(resultList, new ListNode(1));
        }
        
        return resultList;
    }
    
    // Helper method to append a node infront of the linked list.
    public ListNode appendInfront(ListNode resultList, ListNode node) {
        
        node.next = resultList;
        resultList = node;
        
        return resultList;
    }
}
