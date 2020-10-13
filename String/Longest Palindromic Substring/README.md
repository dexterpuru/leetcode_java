#### Leetcode Link: 

> https://leetcode.com/problems/longest-palindromic-substring/

### Problem Statement

> Given a string **s**, find the longest palindromic substring in **s**. You may assume that the maximum length of **s** is 1000.
>
> **Example 1:**
>
> ```
> Input: "babad"
> Output: "bab"
> Note: "aba" is also a valid answer.
> ```
>
> **Example 2:**
>
> ```
> Input: "cbbd"
> Output: "bb"
> ```

### Manacher's Algorithm

To find a longest palindrome in a string in linear time, an algorithm may take advantage of the following characteristics or observations about a palindrome and a sub-palindrome:

    The left side of a palindrome is a mirror image of its right side.
    
    (Case 1) A third palindrome whose center is within the right side of a first 
    palindrome will have exactly the same length as a second palindrome anchored at 
    the mirror center on the left side, if the second palindrome is within the bounds 
    of the first palindrome by at least one character (not meeting the left bound of 
    the first palindrome). Such as "dacabacad", the whole string is the first 
    palindrome, "aca" in the left side as second palindrome, "aca" in the right side 
    as third palindrome. In this case, the second and third palindrome have exactly 
    the same length.
    
    (Case 2) If the second palindrome meets or extends beyond the left bound of the 
    first palindrome, then the distance from the center of the second palindrome to 
    the left bound of the first palindrome is exactly equal to the distance from the 
    center of the third palindrome to the right bound of the first palindrome.
    To find the length of the third palindrome under Case 2, the next character after 
    the right outermost character of the first palindrome would then be compared with 
    its mirror character about the center of the third palindrome, until there is no 
    match or no more characters to compare.
    
    (Case 3) Neither the first nor second palindrome provides information to help 
    determine the palindromic length of a fourth palindrome whose center is outside 
    the right side of the first palindrome.
    It is therefore desirable to have a palindrome as a reference (i.e., the role of 
    the first palindrome) that possesses characters farthest to the right in a string 
    when determining from left to right the palindromic length of a substring in the 
    string (and consequently, the third palindrome in Case 2 and the fourth palindrome 
    in Case 3 could replace the first palindrome to become the new reference).
    Regarding the time complexity of palindromic length determination for each 
    character in a string: there is no character comparison for Case 1, while for 
    Cases 2 and 3 only the characters in the string beyond the right outermost 
    character of the reference palindrome are candidates for comparison (and 
    consequently Case 3 always results in a new reference palindrome while Case 2 does 
    so only if the third palindrome is actually longer than its guaranteed minimum 
    length).
    For even-length palindromes, the center is at the boundary of the two characters 
    in the middle.

-------------------------------------------------------------------------------------------

### Pseudo-code with explanation

To help understand how this algorithm works, the following is commented pseudo-code 
that explains what's going on:

    given string S
    generate S' by inserting a bogus character ('|') between each character in S (
    including outer boundaries)
    Create array P to store the lengths of the palindrome for each center point in S (
    initially all 0s)
        (S'.length = P.length = 2 × S.length + 1)
    track the following pointers (referencing indices in P and S'):
        R -> the next element to be examined (initially 0)
        C -> the largest/left-most palindrome whose right boundary is R-1 (initially 0)
        i -> the next palindrome to be calculated (initially 1)
        L -> character candidate for comparing with R.  Computed implicitly as:
            L = i − (R − i)
        i' -> the palindrome mirroring i from C.  Computed implicitly as:
            i' = C − (i − C)
    
    while R < P.length:
        If i is within the palindrome at C (Cases 1 and 2):
            Set P[i] = P[i'] (else P[i] is set to 0)
    
        Expand the palindrome at i (primarily Cases 2 and 3; can be skipped in Case 1, 
        though we have already shown that S'[R] ≠ S'[L] because otherwise the 
        palindrome at i' would have extended at least to the left edge of the 
        palindrome at C):
            while S'[R] == S'[L]:
                increment P[i]
                increment R
    
        If the palindrome at i extends past the palindrome at C:
            Update C = i
    
        increment i
    
    return max(P)

This diverges a little from Manacher's original algorithm primarily by deliberately 
declaring and operating on R in such a way to help show that the runtime is in fact 
linear. You can see in the pseudo-code that R, C and i are all monotonically 
increasing, each stepping through the elements in S' and P. (the end condition was 
also changed slightly to not compute the last elements of P if R is already at the 
end; these will necessarily have lengths less than P[C] and can be skipped).

The use of S' provides a couple of simplifications for the code: it provides a string 
aligned to P allowing direct use of the pointers in both arrays and it implicitly 
enables the inner while-loop to double-increment P[i] and R (because every other time 
it will be comparing the bogus character to itself). 



**Time Complexity: O(N)**

**Space Complexity: O(N)**