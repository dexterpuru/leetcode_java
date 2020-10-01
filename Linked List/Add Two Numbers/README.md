#### Leetcode Link: 

> https://leetcode.com/problems/add-two-numbers/

### Problem Statement

> You are given two **non-empty** linked lists representing two non-negative integers. The digits are stored in **reverse order** and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
>
> You may assume the two numbers do not contain any leading zero, except the number 0 itself.
>
> **Example:**
>
> ```
>Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
> Output: 7 -> 0 -> 8
> Explanation: 342 + 465 = 807.
> ```

### Approach

On analysing the problem statement using the given example, we can see that it is merely a simple addition, but in the opposite order (if we take the linked list nodes into consideration). 

So, basically we need to do the simple addition of the decimal system, but instead of going from right to left in the traditional manner, we need to go from the left node to the right node, since the digits of our numbers are given in the reverse order.

We can simply create a third linked list and then iterate over the two given linked lists, while adding the digits and creating a new node with the sum, while also maintaining a carry and adding that to the sum and adding those nodes to the third linked list, all this while incrementing the respective linked lists where ever necessary.

### Pseudo-code

> Create a third linked list with a dummy node.
>
> Take reference of this dummy node as `dummy`.
>
> ```
> carry = a = b = 0
> 
> While (NOT((linkedList1 points to NULL) AND (linkedLise2 points to NULL) AND (carry = 0))) {
> 
> 	If (linkedList1 points to NULL) {
> 		a = 0
> 	} else {
> 		a = linkedList1.value
> 	}
> 	
> 	If (linkedList2 points to NULL) {
> 		b = 0
> 	} else {
> 		b = linkedList2.value
> 	}
> 	
> 	sum = a + b + carry
> 	
> 	int digit = sum % 10
> 	
> 	Create new node with digit
> 	Add this node to the rear of third linked list
> 	Increment third linked list
> 	
> 	If (NOT(linkedList1 points to NULL)) {
> 		Increment linkedList1
> 	}
> 	
> 	If (NOT(linkedList2 points to NULL)) {
> 		Increment linkedList2
> 	}
> }
> ```
>
> Increment `dummy` and return it.



**Time Complexity: O(MAX(M, N)**, where M and N are the number of nodes in the respective linked lists.

**Space Complexity: O(1)**, since other than the output list, no extra space was required.