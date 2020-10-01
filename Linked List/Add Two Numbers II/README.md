#### Leetcode Link: 

> https://leetcode.com/problems/add-two-numbers-ii/

### Problem Statement

> You are given two **non-empty** linked lists representing two  non-negative integers. The most significant digit comes first and each  of their nodes contain a single digit. Add the two numbers and return it as a linked list.
>
> You may assume the two numbers do not contain any leading zero, except the number 0 itself.
>
> **Follow up:**
>  What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
>
> **Example:**
>
> ```
> Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
> Output: 7 -> 8 -> 0 -> 7
> ```

### Approach

The given problem statement makes it clear that this problem is a simple addition problem. There's also a follow up in the given problem statement to solve this problem without reversing the linked lists, which would have made the problem fairly easy. Nevertheless, we could use stacks to solve this problem without needing to reverse the linked list.

### Pseudo-code

> Convert the given linked lists into stacks which contain the linked list nodes as elements. Say we have two stacks s1 and s2 as a result.
>
> Let's suppose that the size of s1 > s2.
>
> ```
> resultList = NULL
> carry = 0
> 
> While (s1 is NOT empty AND s2 is NOT empty) {
> 
> 	val1 = s1.pop().val;
> 	val2 = s2.pop().val;
> 	
> 	sum = val1 + val2 + carry
> 	result = sum % 10
> 	carry = sum / 10
> 	
> 	Create new node using result.
> 	Append this node in the front of the resultList.
> }
> 
> While (s1 is NOT empty) {
> 	
> 	sum = s1.pop().val + carry
> 	result = sum % 10
> 	carry = sum / 10
> 	
> 	Create new node using result.
> 	Append this node in the front of the resultList.
> }
> 
> If (carry == 1) {
> 	
> 	Create new node using 1 as value.
> 	Append this node in the front of the resultList.
> }
> 
> return resultList
> ```
>
> 



**Time Complexity: O(MAX(M, N)**, where M and N are the number of nodes in the respective linked lists.

**Space Complexity: O(M + N)**,  since we created two stacks of sizes M and N, which we later emptied, for the given two linked lists respectively.