# Data Structures

#### Arrays
* Collection of items stored at contiguous memory location
* Random Access
* Growing or shrinking the array is difficult, all the previous elements need to be relocated
* Because of contiguous storage, you have better cache locality (more cache hits and so preformance advantage)

#### Linked-List
* Elements are not stored at contiguous memory locations
* No Random access
* Bad cache utilization
* growing/shrinking the list is inherently supported

#### Stack
* Last-In First-Out
* Usage:
* DFS
* InOrder, PreOrder and PostOrder tree traversals
* Infix, prefix and postfix evaluation
* effectively every recursive problem can be modelled using Stack

#### Queue
* First-In First-Out
* Usage:
	* BFS
	* Priority queues are used in Dijkstras

#### Binary Tree

#### Binary Search Tree
 
#### Self Balancing Tree
* B Tree
* B+ Tree
* SelfBalancing Binary Search Tree
	* AVL tree 
		* Strict balancing is maintained 
		* difference between height of left subtree and right subtree is no more than 1.
	* Red Black Tree 
		* flexible balancing 
		* the longest root-to-leaf path can be in worst case at max double of the shortest root-to-leaf path.

#### Heap (basically a priority queue - implemented as array)
* Min-Heap
* Max-Heap
* Binomial Heap
* Fibonnacci Heap

#### Hash-Table
* Collision Handling Technique
	* Separate chaining
	* Open addressing

#### Graph
* Tree (a connected graph with no cycles)
	* Directed/undirected
	* Weighted/unweighted

#### Segment Tree
* Lazy propogation in segment tree

#### Suffix Array and Suffix Tree

#### Binary-Indexed Tree

#### Trie
* [LeetCode2018](https://leetcode.com/problems/implement-trie-prefix-tree/)

#### Splay Tree

#### K Dimensional Tree

#### Treap

#### 

# Algorithms
#### Basic recursion
* [LeetCode337](https://leetcode.com/problems/house-robber-iii/)

#### Binary Search
* A variant - [LeetCode162](https://leetcode.com/problems/find-peak-element/)
#### Sorting 
* [with custom comparator](https://leetcode.com/problems/largest-number/)
#### Divide and Conquer
#### Greedy Algorithms
#### Dynamic Programming
* Subset Sum Problem [LeetCode416](https://leetcode.com/problems/partition-equal-subset-sum/)
* Variant of coin change problem [LeetCode279](https://leetcode.com/problems/perfect-squares/)

#### Graph
* Basic Traversal - [LeetCode310](https://leetcode.com/problems/minimum-height-trees/)
* BFS - [LeetCode200](https://leetcode.com/problems/number-of-islands/)
* DFS - [LeetCode200](https://leetcode.com/problems/number-of-islands/)
	* Topological sorting - [LeetCode210](https://leetcode.com/problems/course-schedule-ii/) 
	* Strongly connected components
	* Detecting cycles in a undirected/directed graph - [LeetCode210](https://leetcode.com/problems/course-schedule-ii/)
    * Longest path in a DAG [LeetCode329](https://leetcode.com/problems/longest-increasing-path-in-a-matrix/) (Read [this](http://www.mathcs.emory.edu/~cheung/Courses/171/Syllabus/11-Graph/Docs/longest-path-in-dag.pdf) link for a more clear and succinct explanation)


# Problem Solving
* Simulating division - [LeetCode166](https://leetcode.com/problems/fraction-to-recurring-decimal/)
* [4Sum - LeetCode454](https://leetcode.com/problems/4sum-ii/) (good)
* Decode Strings[LeetCode394](https://leetcode.com/problems/decode-string/) (good)



# My specific Preparation (DataDump)
### isPrime
```java
/*
0 false
1 false
2 true (corner case)
3 true
4 false (perfect square)
8 false
11 true (a prime number)

for negative numbers it should throw an IllegalArgumentException
*/
public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println(new PrimeChecker().isPrime(0)); // false
        System.out.println(new PrimeChecker().isPrime(1)); // false
        System.out.println(new PrimeChecker().isPrime(2)); // true
        System.out.println(new PrimeChecker().isPrime(3)); // true
        System.out.println(new PrimeChecker().isPrime(4)); // false
        System.out.println(new PrimeChecker().isPrime(8)); // false
        System.out.println(new PrimeChecker().isPrime(11)); // true
    }

    public boolean isPrime(long n) {
        if (n == 0 || n == 1)
            return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

```

### Recursive Extended Euclidean Theorem
### Euclidean Algorithm for GCD
### Recursive Modular Exponentiation
### Iterative Modular Exponention
### Power function for negative exponents
### Seive of Erasthones (using BitSet)
### Sum of Divisors Using Array
### Number of Divisors using Array
### Finding Modular Multiplicative Inverse
### Finding all SubStrings nC2 + n
### Recursive function to print all permutations of a String
### Printing all lexicographic permutations of String: non-recursive
### Finding all the sub-sets of a given set (Power-set)
### Finding the number of ways in which `n` can be expressed as a sum of `k` different numbers
### Fibonacci numbers
### Sum of first `n` fibonacci numbers
### Infix to Perfix conversion using Stack
### Infix to Prefix conversion using recursion
### Evaluation of Postfix
### Evaluation of Prefix
### Largest sum contiguous sub-array - Kadane's Algo
### Finding a pair in array that sums to a given value
### Finding a Triplet in array that sums to a given value
### Finding a tuple of 4 elementes in array that sums to a given value
### Convert Binary Tree into it's mirror
### Check if two trees are mirror of each other
### Tower of Hanoi
### Lowest common ancestor in a BST
### Height of a Binary Tree
### Tree-Traversals
#### InOrder
#### PreOrder
#### PostOrder
#### Level Order Traversal

### Determine if 2 given trees are identical
### Count leaf nodes in a given Binary tree
### Size of a Binary Tree
### Children sum property
### Check whether a number is power of 2 or not
### DP (Dynamic programming)
### LIS - Longest Increasing SubSequence O(n^2) and O(n log(n))
### LCS - Longest common subsequence
### Edit Distance
### min-cost path
### Subset sum problem
### Knapsack Problem (With repetition, without repetition, fractional knapsack)
### Coin change problem
### Calculating binomial coefficient
### Matric Chain Multiplication
### Longest palindromic Subsequence
### Rod Cutting problem
### Maximum Sum Increasing Subsequence
### Longest Bitonic Sequence
### Floyd Warshall's Algo - All pair shortest path
### Catalan Number
### Generating 0 and 1 randomly with 75% and 25% probaility
### Adjacency matrix. Interpretation of A^n[i][j]
### Finding cycles in undirected graph
### Finding cycles in directed graph
