#### Leetcode Link: 

> https://leetcode.com/problems/reverse-integer/

### Problem Statement

> Given a 32-bit signed integer, reverse digits of an integer.
>
> **Note:**
>  Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−2<sup>31</sup>, 2<sup>31</sup> − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
>
>  
>
> **Example 1:**
>
> ```
> Input: x = 123
> Output: 321
> ```
>
> **Example 2:**
>
> ```
> Input: x = -123
> Output: -321
> ```
>
> **Example 3:**
>
> ```
> Input: x = 120
> Output: 21
> ```
>
> **Example 4:**
>
> ```
> Input: x = 0
> Output: 0
> ```
>
>  
>
> **Constraints:**
>
> - -2<sup>31</sup> <= x <= 2<sup>31</sup> - 1



#### Approach: Pop and Push Digits & Check before Overflow

**Intuition**

We can build up the reverse integer one digit at a time. While doing so, we can check beforehand whether or not appending another digit would cause overflow.

**Algorithm**

Reversing an integer can be done similarly to reversing a string.

We want to repeatedly "pop" the last digit off of x and "push" it to the back of the rev. In the end, rev will be the reverse of the x.

To "pop" and "push" digits without the help of some auxiliary stack/array, we can use math.

```
//pop operation:
pop = x % 10;
x /= 10;

//push operation:
temp = rev * 10 + pop;
rev = temp;
```

However, this approach is dangerous, because the statement `temp = rev * 10 + pop` can cause overflow.

Luckily, it is easy to check beforehand whether or this statement would cause an overflow.

To explain, lets assume that rev is positive.

1. If `temp = rev * 10 + pop` causes overflow, then it must be that `rev >= INTMAX/10`.
2. If `rev > INTMAX/10`, then `temp = rev * 10 + pop` is guaranteed to overflow.
3. If `rev == INTMAX/10`, then `temp = rev * 10 + pop` will overflow if and only if `pop > 7`. 

Similar logic can be applied when rev is negative.



**Complexity Analysis:**

- **Time complexity : O(log(x))**. There are roughly log<sub>10</sub>(x) digits in x.
- **Space complexity : O(1)**. 