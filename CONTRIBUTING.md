## CONTRIBUTION GUIDELINES

1. problemStatementList.md contains our stock of problem statements, so make sure to check that before contributing a problem solution.

2. Creating an issue: 

   **Title Format:** \<Add/Update> '\<Name of problem statement>'

   *Example:* Add 'Longest Palindromic Substring'

   **Description Format:** 

   > **Leetcode Link:** \<problem statement link>

3. You are free to explore other issues, which need attention, like issues with ***help wanted*** label with no ***assignee***.

4. Kindly try to always get to work after the issue has been assigned to you.

5. In case if you're adding a new problem statement, the PR must contain 3 file changes. 2 new files, *Solution.java* and *README.md* for the aforementioned problem statement. These two files need to be in a folder as \<Topic>/\<Name of problem statement>/. If the folder for a particular *topic* is not already present, you are free to create one. The Solution.java may or may not have a main method. The README.md for the problem statement should contain the Leetcode link, problem statement, detailed solution approach, and, time and space complexity analysis. Utilise the *PROBLEM_STATEMENT_README_TEMPLATE.md*, copy it to your problem statement directory and rename it as README.md, and do the needful. You also need to update the problem statement in the *problemStatementList.md*. Just giving the name at the end is enough. The maintainers and collaborators will take care of the hyperlinking.

6. Creating a PR:

   **Title Format:** \<Added/Updated> '\<Name of problem statement>'

   *Example:* Added 'Longest Palindromic Substring'

   **Description Format:** 

   > ## Closes #\<Issue No.>
   >
   > ### Checklist: 
   >
   > - [x] Added detailed solution approach
   >
   > - [x] Added complexity analysis
   >
   > - [x] Updated problemStatementList.md
   >
   >   ...

7. A few things to keep in mind: It doesn't matter if the solution is not yours. Code must be clean and understandable, also properly documented.

8. Wait for the PR to be reviewed, and make necessary changes if requested.