# Looking for Bananas in the Monkeys island

Given a Jungle in the middle of an island of n*m dimensions. Each field in this jungle contains a
positive integer which is the amount of bananas that exist in that field. Initially the monkey is at first
column but can be at any row. The monkey can move only (right->,right up /,right down\) from a given
cell. Find out the maximum amount of bananas they can collect.

### Input/Output Examples:

<pre>
Input : mat[][] = {
   {1, 3, 3},
   {2, 1, 4},
   {0, 6, 4}
};

Output : 12

Path: {(1,0)->(2,1)->(2,2)}
</pre>

<pre>
Input:  mat[][] = {
    {1, 3, 1, 5}, 
    {2, 2, 4, 1}, 
    {5, 0, 2, 3}, 
    {0, 6, 1, 2}
};

Output: 16

Path : (2,0) -> (1,1) -> (1,2) -> (0,3) 
OR (2,0) -> (3,1) -> (2,2) -> (2,3)
</pre>

<pre>
Input: mat[][] = {
    {10, 33, 13, 15}, 
    {22, 21, 04, 1}, 
    {5, 0, 2, 3}, 
    {0, 6, 14, 2}
};
Output: 83

</pre>

## Requirements:

1. Please state time and space (memory) complexity in Big O notation. (m,n) may be
   used to represent. If you need a basic primer on this, it’s [here](https://medium.com/@ariel.salem1989/an-easy-to-use-guide-to-big-o-time-complexity-5dcf4be8a444):\
   Also, please state your thought process in writing (and any sketches you used) to arrive at your
   solution.

<pre>
We only iterate over the matrix once. And we need another matrix with tha same size
to store the solution

Time Complexity :O(m*n)
Space Complexity :O(m*n)
</pre>

2. Thought process (Excel spreadsheet, sketches, etc.)
<pre>
The idea is create another matrix with the same size of the original
and iterate over the original matrix, always choosing the max number between diagonal up or diagonal down
and sum then with the value from the original matrix. So we can choose the perfect path, maximum amount of
bananas collected.
</pre>

3. Working solution & test code
<pre>
Solution and tests on the repo
</pre>