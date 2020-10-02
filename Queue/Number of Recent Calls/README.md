#### Leetcode Link: 

> https://leetcode.com/problems/number-of-recent-calls

### Problem Statement

> 
> You have a RecentCounter class which counts the number of recent requests within a certain time frame.
>
> Implement the RecentCounter class:
>
> - RecentCounter() Initializes the counter with zero recent requests.
> - int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
>
> It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.
> 
> 
> Example 1:
>
> **Input**
> ```
> ["RecentCounter", "ping", "ping", "ping", "ping"]
> [[], [1], [100], [3001], [3002]]
> ```
> **Output**
> ```
> [null, 1, 2, 3, 3]
> ```
> **Explanation**
> ```
> RecentCounter recentCounter = new RecentCounter();
> recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
> recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
> recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
> recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
> ```
> 
>
> **Constraints:**
>
> - 1 <= t <= 10^4
> - Each test case will call ping with strictly increasing values of t.
> - At most 10^4 calls will be made to ping.
> 

### Approach

There are multiple solutions for this problem. First I have solved it using ArrayList, since the constraints are not that high. But if we consider total optimization (consider not only about speed but also space) then usage of LinkedList is more reasonable.

### Pseudo-code

> 
> - Initialize the LinkedList
> - Every time when the ping method is called we add the `t` value from the right side to the linked-list, 
>   - check the left-most value for being bigger then `t-3000`
>   - If the left-most value is less than `t-3000` then remove it from the linked list (do it in a cycle)
>



**Time Complexity: O(M)**, We have a constant time complexity, since every time when we do a ping we just add and remove values to right-most and left-most positions. We have no iteration over the list. Worst case we would remove 3000 elements from the left which still stays a constant.

**Space Complexity: O(M)**, M is a maximum size of the linked list which is 3000.