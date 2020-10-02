#### Leetcode Link:
> https://leetcode.com/problems/course-schedule/

### Problem Statement

> There are a total of numCourses courses you have to take, labeled from 0 to numCourses-1.
> Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
> Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
>
> **Example:**
>
> ```
> Input: numCourses = 2, prerequisites = [[1,0]]
> Output: true
> Explanation: There are a total of 2 courses to take. To take course 1 you should have finished course 0. So it is possible.
> ```

### Approach

The basic idea is to use Topological algorithm: put NODE with 0 indgree into the queue, then make indegree of node's successor decrease by 1.

Finally, if each node's indegree equals 0, then it is validated DAG (Directed Acyclic Graph), which means the course schedule can be finished.  It uses a BFS approach.

### Time Complexity

O(V+E)
