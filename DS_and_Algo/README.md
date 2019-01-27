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
 * effectively every recursive problem can be modelled to an iterative one using Stack

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



# My custom preparation (DataDump)
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
        System.out.println(new GenericPower().genericPower(1, 324));
        System.out.println(new GenericPower().genericPower(345, 1));
        System.out.println(new GenericPower().genericPower(1, -2));
        System.out.println(new GenericPower().genericPower(2, -4));
    }

    public double genericPower(double a, int b) {
        if (b == 0) return 1;
        if (a == 1) return 1;

        double temp = genericPower(a, b / 2);
        if (b % 2 == 0) {
            return temp * temp;
        } else {
            if (b < 0) return temp * temp / a;
            else return temp * temp * a;
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
#### With respect to a prime
* Using Euler's theorem `a^phi(n) = 1 (mod)` if `a` and `n` are coprime (their GCD is 1).
* If `p` is a prime then, `phi(p) = p-1`.
* `a^(p-1) = 1 (mod p)` if `p` is prime and `a` & `p` are co-prime (this is Fermatt's Little theorem). This gives `a^(-1) = a^(p-2) (mod p)`. You can calculate this using modular exponentiation.

#### With respect to a non-prime
* To calculate multiplicative modular inverse of `a` wrt `m`, it's only possible if `a` and `m` are co-prime.
* Using Extended Euclidean Theorem you can write `ax + my = 1` where `x` and `y` are integers. Here `x` is the multiplicative inverse of `a` with respect to `m`.
_________________________________

### Finding all SubStrings nC2 + n
* There are a total of `nC2 + n` substrings for a given string of length `n`. (choose any 2 indices out of n - this accounts for the `nC2` - all the strings with length 2 or greater than 2, add `n` to take into acoount substrings of length `1`).

```java
import java.util.*;

public class SubStrings {
    public static void main(String[] args) {
        System.out.println(new SubStrings().getSubstrings("Hello"));
    }

    public List<String> getSubstrings(String s) {
        List<String> subStrings = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                subStrings.add(s.substring(i, j + 1));
            }
        }
        return subStrings;
    }
}
```
_________________________________

### Recursive function to print all permutations of a String
* For `Sun` the output should be something like: `[Sun, Snu, uSn, unS, nuS, nSu]`

```java
import java.util.*;

public class StringPermutation {
    public static void main(String[] args) {
        System.out.println(new StringPermutation().getPermutations("Sun"));
    }

    public List<String> getPermutations(String s) {
        List<String> result = new ArrayList<>();
        getPermutations(s.toCharArray(), result, 0);
        return result;
    }

    private void getPermutations(char[] arr, List<String> result, int counter) {
        if (counter == arr.length) { // base condition
            result.add(new String(arr));
            return;
        }

        /* i should be started from couter and not from counter+1 */
        for (int i = counter; i < arr.length; i++) {
            swap(arr, i, counter);
            getPermutations(arr, result, counter + 1);
            swap(arr, i, counter);
        }
    }

    private void swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
```
_________________________________

### Printing all lexicographic permutations of String: non-recursive
_________________________________

### Finding all the sub-sets of a given set (Power-set) - Recursive
```java
import java.util.*;

class PowerSetRecursive {
    public static void main(String[] args) {
        System.out.println(new PowerSetRecursive().powerSet(Arrays.asList(new Integer[]{1, 2, 3})));
    }

    public List<List<Integer>> powerSet(List<Integer> set) {
        return powerSet(set, 0);
    }

    private List<List<Integer>> powerSet(List<Integer> set, int counter) {
        if (counter == set.size()) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>()); // don't forget this
            return list;
        }
        List<List<Integer>> list1 = powerSet(set, counter + 1);
        List<List<Integer>> list2 = new ArrayList<>();
        for (List<Integer> cl : list1) {
            List<Integer> tempList = new ArrayList<>(cl);
            tempList.add(set.get(counter));
            list2.add(tempList);
        }
        list1.addAll(list2);
        return list1;
    }
}
```

_________________________________

### Finding all the sub-sets of a given set (Power-set) - Iterative

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PowerSetIterative {
    public static void main(String[] args) {
        System.out.println(new PowerSetIterative().powerSetIterative(Arrays.asList(new Integer[]{1, 2, 3})));
    }

    public List<List<Integer>> powerSetIterative(List<Integer> list) {
        List<List<Integer>> result = new ArrayList<>();
        int power = (1 << list.size());
        for (int i = 0; i < power; i++) {
            int ci = i; // don't update the original i
            List<Integer> tempList = new ArrayList<>();
            int counter = 0;
            while (ci != 0) {
                if ((ci & 1) == 1)
                    tempList.add(list.get(counter));
                counter++;
                ci >>= 1;
            }
            result.add(tempList);
        }
        return result;
    }
}
```
_________________________________
### Finding the number of ways in which `n` can be expressed as a sum of `k` different numbers
* `k` non-zero numbers
* Suppose you need to find number of ways in which `10` can be expresses as a sum of `4` different non-zero numbers.
 * To visualize, assume you have an array of `10` elements and each element of the array is `1`.
 * there are a total of 9 internal boundaries in this array and and you need to choose `3` of them to partition this arrya of `1`s into 4 non-zero parts.
 * so for `n=10` and `k=4`, then answer is `9C3` = `84`
* The answer comes out to be `(n-1)C(k-1)`
_________________________________

### Calculate `nCk (mod p)` (where `p` is prime)
* Idea:
 * don't repeatedly calculte the same factorials, instead store the factorials in an array and avoid recomputing.
 * As `p` is prime, you can apply Fermat's little theorem to calculate modular inverse.

 ```java
 import java.util.ArrayList;
 import java.util.List;

 // 9C3 should return 84
 public class NCKModP {
     public static void main(String[] args) {
         System.out.println(new NCKModP().nCkModP(9, 3, 1000000007)); // 84
         System.out.println(new NCKModP().nCkModP(1, 1, 1000000007)); // 1
         System.out.println(new NCKModP().nCkModP(1, 0, 1000000007)); // 1
     }

     // assuming that p is prime
     public long nCkModP(int n, int k, long p) {
         List<Long> facts = getFactorials(n, p);
         long numerator = facts.get(n);
         long denominator = (facts.get(k) * facts.get(n - k)) % p;

         return (numerator * power(denominator, p - 2, p)) % p;
     }

     private long power(long a, long b, long mod) {
         if (b == 0)
             return 1;
         long temp = power(a, b / 2, mod);
         if ((b & 1) == 1) {
             return (((temp * temp) % mod) * a) % mod;
         } else return (temp * temp) % mod;
     }

     private List<Long> getFactorials(int n, long p) {
         List<Long> facts = new ArrayList<>(n + 1);
         facts.add(1L); // factorial of 0 is 1
         for (int i = 1; i <= n; i++) {
             facts.add((facts.get(i - 1) * i) % p);
         }
         return facts;
     }
 }
 ```

### Fibonacci numbers
* Using recursion
* Using DP
* Using no extra memory

```java
public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(new FibonacciNumbers().getNth(10)); // 55
        System.out.println(new FibonacciNumbers().getNthDP(10)); // 55
        System.out.println(new FibonacciNumbers().getNthIterative(10)); // 55
    }

    /**
     * Recursion:
     * Time complexity = O(2^n) for finding nth fibonacci number
     */
    public long getNth(int n) {
        if (n == 1 || n == 2)
            return 1;
        return getNth(n - 1) + getNth(n - 2);
    }

    /**
     * Iterative - Dynamic Programming approach:
     * Time complexity = O(n) for finding nth fibonacci number
     * Space complexity = O(n)
     */
    public long getNthDP(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }

    /**
     * Iterative with constant space, time compleity: O(n)
     */
    public long getNthIterative(int n) {
        long a = 0, b = 1, answer = 0;
        for (int i = 2; i <= n; i++) {
            answer = a + b;
            a = b;
            b = answer;
        }
        return answer;
    }
}
```
* Some facts about Fibonacci Numbers:
 * calculating Fibonacci numbers using Golden Ratio:
   * `F(n) = floor(phi^n / sqrt(5) + 0.5)` where `phi` is the golden ratio.
   * Using this above formula, you can calculate the `n`th fibonacci number in time complexity `O(log(n))`.
 * calculating Fibonacci numbers using matrix
 ```
 [ 1 1 ] ^ n   =  [F(n+1)     F(n)]
 [ 1 0 ]          [F(n)       F(n-1)]
 ```
   * You can calculate the power of the above matrix in `O(log(n))` using divide and conquer

_________________________________

### Sum of first `n` fibonacci numbers in `O(log(n))`
* `Sum(first n fibonacci numbers) = f(n+2) - f(2)` assuming fibonacci series is like `1,1,2,3,5,8...`
_________________________________
### Infix to Perfix conversion using Stack
_________________________________
### Infix to Prefix conversion using recursion
_________________________________
### Evaluation of Postfix
_________________________________
### Evaluation of Prefix
_________________________________
### Largest sum contiguous sub-array - Kadane's Algo
* Space Complexity: `O(1)`
* Time Complexity: `O(n)`
* Edge cases:
  * all the numbers are negative (in this case it should return the largest number in the array)
  * the array given is of length `0` (should return `0` in this case)

```java
public class LeetCode53 {
    public static void main(String[] args) {
        System.out.println(new LeetCode53().maxSubArray(new int[]{-10, -2, -3, -1})); // -1
        System.out.println(new LeetCode53().maxSubArray(new int[]{-1, -6, -9, -9})); // -1
        System.out.println(new LeetCode53().maxSubArray(new int[]{-5, -8, 6, -8, -7})); // 6
        System.out.println(new LeetCode53().maxSubArray(new int[]{4, 6, -11, 7, 8, 0, -3, 10}));// 22
        System.out.println(new LeetCode53().maxSubArray(new int[]{-5, 6})); // 6
    }

    public int maxSubArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0)
                currentSum = 0; // should I initialize it to 0

            currentSum = currentSum + nums[i];
            if (maxSum < currentSum)
                maxSum = currentSum;
        }
        return maxSum;
    }
}
```
_________________________________
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
