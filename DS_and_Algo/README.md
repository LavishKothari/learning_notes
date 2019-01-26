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
Time complexity = `O(sqrt(n))` if you find whether `n` is prime or not.
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
_________________________________

### Recursive Extended Euclidean Theorem
_________________________________

### Euclidean Algorithm for GCD
```java
/**
 * Eculidean algorithm for finding GCD of 2 numbers
 * <p>
 * Time Complexity: O(log(a) + log(b)) for finding gcd(a,b)
 */
public class GCD {
    public static void main(String[] args) {
        System.out.println(new GCD().gcd(8,20));
    }
    private long gcd(long a, long b) {
        if (b == 0)
            return a;
        else return gcd(b, a % b);
    }
}
```
_________________________________

### Recursive Modular Exponentiation
```java
/*
    (anything, 0, anything) answer should be 1
    (1, anything, anything) 1
*/
public class RecursiveModularExponentiation {
    public static void main(String[] args) {
        System.out.println(new RecursiveModularExponentiation().power(1, 34, 34543)); // should return 1
        System.out.println(new RecursiveModularExponentiation().power(13465, 0, 34543)); // should return 1
        System.out.println(new RecursiveModularExponentiation().power(2, 10, 100)); // should return 24

        System.out.println(new RecursiveModularExponentiation().powerAlternative(1, 34, 34543)); // should return 1
        System.out.println(new RecursiveModularExponentiation().powerAlternative(13465, 0, 34543)); // should return 1
        System.out.println(new RecursiveModularExponentiation().powerAlternative(2, 10, 100)); // should return 24

    }

    public long power(long a, long b, long mod) {
        if (b == 0) return 1;
        if (b == 1) return a % mod; // don’t make a mistake by just returning a
        long temp = power(a, b >> 1, mod);
        if ((b & 1) == 1) {
            return (((temp * temp) % mod) * a) % mod;
        } else {
            return (temp * temp) % mod;
        }
    }

    public long powerAlternative(long a, long b, long mod) {
        if (b == 0) return 1;
        if (a == 1) return a % mod;
        if ((b & 1) == 1) {
            return (a * powerAlternative((a * a) % mod, b >> 1, mod)) % mod;
        } else {
            return powerAlternative((a * a) % mod, b >> 1, mod);
        }
    }
}
```
_________________________________

### Iterative Modular Exponention
(using bitwise-operators can be an advantage, but now-a-days compilers are smart enough to do this on your behalf - so you might not care about this)
```java
public class IterativeModularExponentiation {
    public static void main(String[] args) {
        System.out.println(new IterativeModularExponentiation().power(1, 43543, 435)); // returns 1
        System.out.println(new IterativeModularExponentiation().power(154654, 0, 435)); // returns 1
        System.out.println(new IterativeModularExponentiation().power(2, 10, 100)); // returns 24
    }
    public long power(long a, long b, long mod) {
        long tempResult = 1, result = 1;
        while (b != 0) {
            if ((b & 1) == 1)
                result = (result * a) % mod;
            b >>= 1;
            a = (a * a) % mod;
        }
        return result;
    }
}
```
_________________________________

### Power function for negative/positive exponents
(make sure to have proper method signature - this shows how carefully you design your API)
```java
public class GenericPower {
    public static void main(String[] args) {
        System.out.println(new GenericPower().genericPower(1,324));
        System.out.println(new GenericPower().genericPower(345,1));
        System.out.println(new GenericPower().genericPower(1,-2));
        System.out.println(new GenericPower().genericPower(2,-4));
    }
    public double genericPower(double a, int b) {
        if(b==0) return 1;
        if(a==1) return 1;

        double temp = genericPower(a, b/2);
        if(b%2 == 0) {
            return temp*temp;
        } else {
            if(b<0) return temp*temp/a;
            else return temp*temp*a;
        }
    }
}
```
_________________________________

### Counting number of '1' in binary representation of a number
Make sure that you get correct answer for both positive  and negative numbers.
```java
public class CountOnes {
    public static void main(String[] args) {
        System.out.println(new CountOnes().countOne(10)); // should pring 2
        System.out.println(new CountOnes().countOne(-5000));
    }

    public int countOne(long n) {
        int answer = 0;
        while (n != 0) {
            if ((n & 1) == 1)
                answer++;
            n >>>= 1; // should use unsigned right-shift, so that it works for negative also
        }
        return answer;
    }
}
```
_________________________________

### Seive of Erasthones (using BitSet)
(You should know how to use BitSet or equivalent in the programming language that you are coding in.)
```java
import java.util.*;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        System.out.println(new SieveOfEratosthenes().getPrimeBitSet(100));
    }

    public BitSet getPrimeBitSet(int size) {
        BitSet isPrime = new BitSet(size); // initially every bit is false
        isPrime.flip(0, size); // making every bit to true
        isPrime.set(0, false); // 0 is not a prime
        isPrime.set(1, false); // 1 is not a prime

        for (int i = 2; i * i < size; i++) {
            if (isPrime.get(i)) { // if i is prime then making all it's multiples non-prime
                for (int j = i * i; j < size; j += i) {
                    isPrime.set(j, false);
                }
            }
        }
        return isPrime;
    }
}
```
_________________________________

### Number of Divisors using Array
* You need to write a method that returns an array, say `arr` such that `arr[i]` stores the count of divisors of `i`.
* Divisors of `12` are `{1, 2, 3, 4, 6, 12}`. 
* If you are asked for the proper divisors, you don't need to count the number itself while counting divisors. Proper Divisors of `12` are `{1, 2, 3, 4, 6}`
```java
public class NumberOfDivisors {
    public static void main(String[] args) {
        int arr[] = new NumberOfDivisors().numberOfDivisors(12);
        System.out.println(arr[12]); // should print 6
    }

    /**
     * returns an array of integer such that
     * arr[i] stores number of divisors of i
     */
    public int[] numberOfDivisors(int n) {
        int[] result = new int[n + 1];
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = 2; // 1 and the number itself
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i * 2; j <= n; j += i)
                result[j]++;
        }
        return result;
    }
}
```
_________________________________

### Sum of Divisors Using Array
```java
public class SumOfDivisors {
    public static void main(String[] args) {
        int arr[] = new SumOfDivisors().sumOfDivisors(12);
        System.out.println(arr[12]); // should print 28
    }

    /**
     * returns an array of integer such that
     * arr[i] stores sum of divisors of i
     */
    public int[] sumOfDivisors(int n) {
        int[] result = new int[n + 1];
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = i + 1; // 1 and the number itself
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i * 2; j <= n; j += i)
                result[j] += i;
        }
        return result;
    }
}
```
_________________________________

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
### DFS - Longest path in a DAG
[LeetCode329](https://leetcode.com/problems/longest-increasing-path-in-a-matrix/)
(Read [this](http://www.mathcs.emory.edu/~cheung/Courses/171/Syllabus/11-Graph/Docs/longest-path-in-dag.pdf) link for a more clear and succinct explanation)
```java
import java.util.*;

public class LeetCode329_1 {

    private static final int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static void main(String[] args) {
        System.out.println(new LeetCode329_1().longestIncreasingPath(new int[][]{})); // prints 0
        System.out.println(new LeetCode329_1().longestIncreasingPath(new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}})); // prints 4
        System.out.println(new LeetCode329_1().longestIncreasingPath(new int[][]{{1, 7, 8, 1}, {1, 6, 9, 1}, {1, 5, 10, 11}, {1, 1, 13, 12}})); // prints 10
        System.out.println(new LeetCode329_1().longestIncreasingPath(new int[][]{{1, 2}})); // prints 2
    }

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0)
            return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        boolean visited[][] = new boolean[m][n]; // all are initially false
        List<Integer> order = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, visited, m, n, matrix, order);
                }
            }
        }
        Collections.reverse(order); // linear ordering

        int length[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                length[i][j] = 1; // initialize all the length to 1.
        }
        int max = 1;
        for (int currentNode : order) { // picking the nodes in the linearized order.
            int x = currentNode / n, y = currentNode % n;
            for (int[] cd : dir) {
                int a = cd[0] + x;
                int b = cd[1] + y;
                if (a >= 0 && b >= 0 && a < m && b < n &&
                        matrix[a][b] > matrix[x][y] && length[a][b] < length[x][y] + 1) {
                    length[a][b] = length[x][y] + 1; // updating distance of children
                    max = length[a][b] > max ? length[a][b] : max; // updating max if required
                }
            }
        }
        return max;
    }

    private void dfs(int x, int y, boolean visited[][], int m, int n, int[][] matrix, List<Integer> order) {
        for (int[] cd : dir) {
            int a = cd[0] + x;
            int b = cd[1] + y;
            if (a >= 0 && b >= 0 && a < m && b < n && !visited[a][b] && matrix[a][b] > matrix[x][y]) {
                visited[a][b] = true;
                dfs(a, b, visited, m, n, matrix, order);
            }
        }
        order.add(x * n + y);
    }
}
```