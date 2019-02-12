* [Data Structures](#data-structures)
  * [Arrays](#arrays)
  * [Linked-List](#linked-list)
  * [Stack](#stack)
  * [Queue](#queue)
  * [Binary Tree](#binary-tree)
  * [Binary Search Tree](#binary-search-tree)
  * [Self Balancing Tree](#self-balancing-tree)
  * [Heap (basically a priority queue - implemented as array)](#heap-(basically-a-priority-queue---implemented-as-array))
  * [Hash-Table](#hash-table)
  * [Graph](#graph)
  * [Segment Tree](#segment-tree)
  * [Suffix Array and Suffix Tree](#suffix-array-and-suffix-tree)
  * [Binary-Indexed Tree](#binary-indexed-tree)
  * [Trie](#trie)
  * [Splay Tree](#splay-tree)
  * [K Dimensional Tree](#k-dimensional-tree)
  * [Treap](#treap)
* [Algorithms](#algorithms)
  * [Basic recursion](#basic-recursion)
  * [Binary Search](#binary-search)
      * [Sorting](#sorting)
      * [Divide and Conquer](#divide-and-conquer)
      * [Greedy Algorithms](#greedy-algorithms)
      * [Dynamic Programming](#dynamic-programming)
  * [Graph](#graph)
* [Problem Solving](#problem-solving)
* [My custom preparation (DataDump)](#my-custom-preparation-datadump)
  * [isPrime](#isprime)
  * [Recursive Extended Euclidean Theorem](#recursive-extended-euclidean-theorem)
  * [Euclidean Algorithm for GCD](#euclidean-algorithm-for-gcd)
  * [Recursive Modular Exponentiation](#recursive-modular-exponentiation)
  * [Iterative Modular Exponention](#iterative-modular-exponention)
  * [Power function for negative/positive exponents](#power-function-for-negative/positive-exponents)
  * [Counting number of 1 in binary representation of a number](#counting-number-of-1-in-binary-representation-of-a-number)
  * [Seive of Erasthones (using BitSet)](#seive-of-erasthones-(using-bitset))
  * [Number of Divisors using Array](#number-of-divisors-using-array)
  * [Sum of Divisors Using Array](#sum-of-divisors-using-array)
  * [Finding Modular Multiplicative Inverse](#finding-modular-multiplicative-inverse)
    * [With respect to a prime](#with-respect-to-a-prime)
    * [With respect to a non-prime](#with-respect-to-a-non-prime)
  * [Finding all SubStrings nC2 + n](#finding-all-substrings-nc2-+-n)
  * [Recursive function to print all permutations of a String](#recursive-function-to-print-all-permutations-of-a-string)
  * [Printing all lexicographic permutations of String (non-recursive)](#printing-all-lexicographic-permutations-of-string-(non-recursive))
  * [Finding all the sub-sets of a given set (Power-set) - Recursive](#finding-all-the-sub-sets-of-a-given-set-(power-set)---recursive)
  * [Finding all the sub-sets of a given set (Power-set) - Iterative](#finding-all-the-sub-sets-of-a-given-set-(power-set)---iterative)
  * [Finding the number of ways in which `n` can be expressed as a sum of `k` different numbers](#finding-the-number-of-ways-in-which-`n`-can-be-expressed-as-a-sum-of-`k`-different-numbers)
  * [Calculate `nCk (mod p)` (where `p` is prime)](#calculate-`nck-(mod-p)`-(where-`p`-is-prime))
  * [Fibonacci numbers](#fibonacci-numbers)
  * [Sum of first `n` fibonacci numbers in `O(log(n))`](#sum-of-first-`n`-fibonacci-numbers-in-`o(log(n))`)
  * [Infix to Perfix conversion using Stack](#infix-to-perfix-conversion-using-stack)
  * [Infix to Prefix conversion using recursion](#infix-to-prefix-conversion-using-recursion)
  * [Evaluation of Postfix](#evaluation-of-postfix)
  * [Evaluation of Prefix](#evaluation-of-prefix)
  * [Largest sum contiguous sub-array - Kadane's Algo](#largest-sum-contiguous-sub-array---kadane's-algo)
  * [Finding a pair in array that sums to a given value](#finding-a-pair-in-array-that-sums-to-a-given-value)
  * [Finding a Triplet in array that sums to a given value](#finding-a-triplet-in-array-that-sums-to-a-given-value)
  * [Finding a tuple of 4 elementes in array that sums to a given value](#finding-a-tuple-of-4-elementes-in-array-that-sums-to-a-given-value)
  * [Convert Binary Tree into it's mirror](#convert-binary-tree-into-it's-mirror)
  * [Check if a give Binary tree is mirror of itself](#check-if-a-give-binary-tree-is-mirror-of-itself)
  * [Check if two trees are mirror of each other](#check-if-two-trees-are-mirror-of-each-other)
  * [Lowest common ancestor in a BST](#lowest-common-ancestor-in-a-bst)
  * [Height of a Binary Tree](#height-of-a-binary-tree)
  * [Tree-Traversals](#tree-traversals)
    * [InOrder](#inorder)
    * [PreOrder](#preorder)
    * [PostOrder](#postorder)
    * [Level Order Traversal](#level-order-traversal)
  * [Determine if 2 given trees are identical](#determine-if-2-given-trees-are-identical)
  * [Count leaf nodes in a given Binary tree](#count-leaf-nodes-in-a-given-binary-tree)
  * [Size of a Binary Tree](#size-of-a-binary-tree)
  * [Children sum property](#children-sum-property)
  * [Path sum in a tree](#path-sum-in-a-tree)
  * [Tower of Hanoi](#tower-of-hanoi)
  * [Check whether a number is power of 2 or not using bitwise-operators](#check-whether-a-number-is-power-of-2-or-not-using-bitwise-operators)
  * [DP (Dynamic programming)](#dp-(dynamic-programming))
  * [LIS - Longest Increasing SubSequence (LIS) O(n^2) and O(n log(n))](#lis---longest-increasing-subsequence-(lis)-o(n^2)-and-o(n-log(n)))
  * [LCS - Longest common subsequence (LCS)](#lcs---longest-common-subsequence-(lcs))
  * [Edit Distance](#edit-distance)
  * [min-cost path](#min-cost-path)
  * [Subset sum problem](#subset-sum-problem)
  * [Knapsack Problem (With repetition, without repetition, fractional knapsack)](#knapsack-problem-with-repetition,-without-repetition,-fractional-knapsack)
  * [Coin change problem](#coin-change-problem)
  * [Calculating binomial coefficient](#calculating-binomial-coefficient)
  * [Matric Chain Multiplication](#matric-chain-multiplication)
  * [Longest palindromic Subsequence](#longest-palindromic-subsequence)
  * [Rod Cutting problem](#rod-cutting-problem)
  * [Maximum Sum Increasing Subsequence](#maximum-sum-increasing-subsequence)
  * [Longest Bitonic Sequence](#longest-bitonic-sequence)
  * [Floyd Warshall's Algo - All pair shortest path](#floyd-warshall's-algo---all-pair-shortest-path)
  * [Catalan Number](#catalan-number)
  * [Generating 0 and 1 randomly with 75% and 25% probaility](#generating-0-and-1-randomly-with-75%-and-25%-probaility)
  * [Adjacency matrix. Interpretation of A^n[i][j]](#adjacency-matrix.-interpretation-of-a^n[i][j])
  * [Finding cycles in undirected graph](#finding-cycles-in-undirected-graph)
  * [Finding cycles in directed graph](#finding-cycles-in-directed-graph)
  * [DFS - Longest path in a DAG](#dfs---longest-path-in-a-dag)
  * [Disjoint Set (Union-find)](#disjoint-set-(union-find))
  * [String pattern matching](#string-pattern-matching)
  * [Search in a rotated sorted array](#search-in-a-rotated-sorted-array)
  * [Find first and last position of an element in sorted array](#find-first-and-last-position-of-an-element-in-sorted-array)
* [Some Tricky or tough problems](#some-tricky-or-tough-problems)
  * [Rotating 2-D square matrix](#rotating-2-d-square-matrix)
  * [Median of 2 sorted Arrays](#median-of-2-sorted-arrays)
  * [Largest rectangle in a Histogram](#largest-rectangle-in-a-histogram)
* [Some simple problems but worth doing](#some-simple-problems-but-worth-doing)
  * [2 Sum](#2-sum)
  * [Closest 3 sum](#closest-3-sum)
  * [4 Sum](#4-sum)
* [GeeksForGeeks](#geeksforgeeks)
* [System Design](#system-design)
  * [Fuzzy String matching](#fuzzy-string-matching)
* [Programming language utilities (Specifically for Java)](#programming-language-utilities-(specifically-for-java))
  * [Priority Queues](#priority-queues)
  * [Binary search in Java](#binary-search-in-java)
  * [Sort](#sort)
  * [floor/ceil operations in a  sorted data structure](#floor/ceil-operations-in-a--sorted-data-structure)
  * [Signed and unsigned bitwise operators](#signed-and-unsigned-bitwise-operators)
  * [creating copy of a list](#creating-copy-of-a-list)
  * [Map - `java.util.Map`](#map---`java.util.map`)
  * [Set - `java.util.Set`](#set---`java.util.set`)
  * [BitSet - `java.util.BitSet`](#bitset---`java.util.bitset`)
  * [Stack In Java](#stack-in-java)
  * [Queue In Java](#queue-in-java)
* [Questions that you need to ask](#questions-that-you-need-to-ask)

# Data Structures

## Arrays

* Collection of items stored at contiguous memory location
* Random Access
* Growing or shrinking the array is difficult, all the previous elements need to be relocated
* Because of contiguous storage, you have better cache locality (more cache hits and so preformance advantage)

## Linked-List

* Elements are not stored at contiguous memory locations
* No Random access
* Bad cache utilization
* growing/shrinking the list is inherently supported

## Stack

* Last-In First-Out
* Usage:
  * DFS
  * InOrder, PreOrder and PostOrder tree traversals
  * Infix, prefix and postfix evaluation
  * effectively every recursive problem can be modelled to an iterative one using Stack
  * Pervious smaller number for every element of the array [LeetCode84](https://leetcode.com/problems/largest-rectangle-in-histogram/)
  * Next Smaller number for every element of the array [LeetCode84](https://leetcode.com/problems/largest-rectangle-in-histogram/)
  * Largest rectangle in a histogram [LeetCode84](https://leetcode.com/problems/largest-rectangle-in-histogram/)

## Queue

* First-In First-Out
* Usage:
    * BFS
    * Priority queues are used in Dijkstras

## Binary Tree

## Binary Search Tree

## Self Balancing Tree

* B Tree
* B+ Tree
* SelfBalancing Binary Search Tree
	* AVL tree
		* Strict balancing is maintained
		* difference between height of left subtree and right subtree is no more than 1.
	* Red Black Tree
		* flexible balancing
		* the longest root-to-leaf path can be in worst case at max double of the shortest root-to-leaf path.

## Heap (basically a priority queue - implemented as array)

* Min-Heap
* Max-Heap
* Binomial Heap
* Fibonnacci Heap

## Hash-Table

* Collision Handling Technique
	* Separate chaining
	* Open addressing

## Segment Tree

* Lazy propogation in segment tree

## Suffix Array and Suffix Tree

## Binary-Indexed Tree

## Trie

* [LeetCode208](https://leetcode.com/problems/implement-trie-prefix-tree/)

## Splay Tree

## K Dimensional Tree

## Treap

# Algorithms
## Basic recursion

* [LeetCode337](https://leetcode.com/problems/house-robber-iii/)

## Binary Search

* A variant - [LeetCode162](https://leetcode.com/problems/find-peak-element/)

#### Sorting

* [with custom comparator](https://leetcode.com/problems/largest-number/)

#### Divide and Conquer

#### Greedy Algorithms

#### Dynamic Programming

* Subset Sum Problem [LeetCode416](https://leetcode.com/problems/partition-equal-subset-sum/)
* Variant of coin change problem [LeetCode279](https://leetcode.com/problems/perfect-squares/)

## Graph

* Tree (a connected graph with no cycles)
  * Directed/undirected
  * Weighted/unweighted
* Basic Traversal - [LeetCode310](https://leetcode.com/problems/minimum-height-trees/)
* BFS - [LeetCode200](https://leetcode.com/problems/number-of-islands/)
* DFS - [LeetCode200](https://leetcode.com/problems/number-of-islands/)
  * Topological sorting - [LeetCode210](https://leetcode.com/problems/course-schedule-ii/)
  * Strongly connected components
  * Detecting cycles in a undirected/directed graph - [LeetCode210](https://leetcode.com/problems/course-schedule-ii/)
  * Longest path in a DAG [LeetCode329](https://leetcode.com/problems/longest-increasing-path-in-a-matrix/) (Read [this](http://www.mathcs.emory.edu/~cheung/Courses/171/Syllabus/11-Graph/Docs/longest-path-in-dag.pdf) link for a more clear and succinct explanation)
* Detecting cycles in an undirected graph
  * Disjoint set data-structure - (union-find)
* Detecting cycles in a directed graph
  * Simple DFS and while doing DFS if you get a "back-edge" (an edge from curent vertex to a partially visited vertex) then the graph contains cycles.

# Problem Solving

* Simulating division - [LeetCode166](https://leetcode.com/problems/fraction-to-recurring-decimal/)
* [4Sum - LeetCode454](https://leetcode.com/problems/4sum-ii/) (good)
    * To be done with Time Complexity = `O(n^2)`
    * Space complexity = `O(n^2)`
* Decode Strings [LeetCode394](https://leetcode.com/problems/decode-string/) (good)



# My custom preparation (DataDump)

## isPrime

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

## Recursive Extended Euclidean Theorem

## Euclidean Algorithm for GCD

* This will be used to reduce the fraction to the lowest terms.
* Make sure that the fraction should not have the numerator or denominator as negative.
    * To be on the safe side, maintain negative and numberator and denominator separately.

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

## Recursive Modular Exponentiation

* Time Complexity = `O(log(b))` to calculate `a^b`
* (using bitwise-operators can be an advantage, but now-a-days compilers are smart enough to do this on your behalf - so you might not care about this)

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
        long temp = power(a, b >> 1, mod);
        if ((b & 1) == 1) { // don't forget to put (b&1) in brackets
            return (((temp * temp) % mod) * a) % mod;
        } else {
            return (temp * temp) % mod;
        }
    }

    public long powerAlternative(long a, long b, long mod) {
        if (b == 0) return 1;
        if ((b & 1) == 1) {
            return (a * powerAlternative((a * a) % mod, b >> 1, mod)) % mod;
        } else {
            return powerAlternative((a * a) % mod, b >> 1, mod);
        }
    }
}
```
_________________________________

## Iterative Modular Exponention

* Time complexity = `O(log(b))` to calculate `a^b`.
* (using bitwise-operators can be an advantage, but now-a-days compilers are smart enough to do this on your behalf - so you might not care about this)

```java
public class IterativeModularExponentiation {
    public static void main(String[] args) {
        System.out.println(new IterativeModularExponentiation().power(1, 43543, 435)); // returns 1
        System.out.println(new IterativeModularExponentiation().power(154654, 0, 435)); // returns 1
        System.out.println(new IterativeModularExponentiation().power(2, 10, 100)); // returns 24
    }
    public long power(long a, long b, long mod) {
        long result = 1;
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

## Power function for negative/positive exponents

* Make sure to have proper method signature - this shows how carefully you design your API
* [LeetCode50](https://leetcode.com/problems/powx-n/)

```java
public class LeetCode50 {
    public static void main(String[] args) {
        System.out.println(new LeetCode50().myPow(2.0, 10)); // 1024.0
        System.out.println(new LeetCode50().myPow(2.1, 3)); // 9.261
        System.out.println(new LeetCode50().myPow(2.0, -2)); // 0.25
        System.out.println(new LeetCode50().myPow(2.0, 10)); // 1024.0
        System.out.println(new LeetCode50().myPow(3.21, 1)); // 3.21
        System.out.println(new LeetCode50().myPow(3.21, -1)); // 0.3115264797507788
    }

    public double myPow(double x, int n) {
        if (n == 0)
            return 1;
        double temp = myPow(x, n / 2);
        if ((n & 1) != 0 && n < 0)
            return temp * temp / x;
        else if ((n & 1) != 0 && n > 0)
            return temp * temp * x;
        return temp * temp;
    }
}
```
_________________________________

## Counting number of 1 in binary representation of a number

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
    /**
     * Works only for integers greater than equals to 0
     * 
     * Time Complexity: O(count of 1s in the number)
     */
    public int countOnesGood(int n) {
        int c = 0;
        while (n != 0) {
            c++;
            n = (n & (n - 1));
        }
        return c;
    }

}
```
_________________________________

## Seive of Erasthones (using BitSet)

* (You should know how to use `BitSet` or equivalent in the programming language that you are coding in.)
* Time complexity = `O(nlog(log(n)))`

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

## Number of Divisors using Array

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

## Sum of Divisors Using Array

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

## Finding Modular Multiplicative Inverse

### With respect to a prime

* Using Euler's theorem `a^phi(n) = 1 (mod n)` if `a` and `n` are coprime (their GCD is 1).
* If `p` is a prime then, `phi(p) = p-1`.
* `a^(p-1) = 1 (mod p)` if `p` is prime and `a` & `p` are co-prime (this is Fermatt's Little theorem). This gives `a^(-1) = a^(p-2) (mod p)`. You can calculate this using modular exponentiation.

### With respect to a non-prime

* To calculate multiplicative modular inverse of `a` wrt `m`, it's only possible if `a` and `m` are co-prime.
* Using Extended Euclidean Theorem you can write `ax + my = 1` where `x` and `y` are integers. Here `x` is the multiplicative inverse of `a` with respect to `m`.
_________________________________

## Finding all SubStrings nC2 + n

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

## Recursive function to print all permutations of a String

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

## Printing all lexicographic permutations of String (non-recursive)

_________________________________

## Finding all the sub-sets of a given set (Power-set) - Recursive

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PowerSetRecursive {
    public static void main(String[] args) {
        System.out.println(new PowerSetRecursive().getPowerSetRecursive(Arrays.asList(1, 2, 3)));
        System.out.println(new PowerSetRecursive().getPowerSetRecursive(Arrays.asList(1, 2, 3, 4, 5)).size()); // should be 32
        System.out.println(new PowerSetRecursive().getPowerSetRecursive(Arrays.asList())); // empty list
        System.out.println(new PowerSetRecursive().getPowerSetRecursive(null)); // null list
    }

    public List<List<Integer>> getPowerSetRecursive(List<Integer> list) {
        return getPowerSetRecursive(list, 0);
    }

    private List<List<Integer>> getPowerSetRecursive(List<Integer> list, int counter) {
        List<List<Integer>> result = new ArrayList<>();
        if (list == null || counter == list.size()) {
            result.add(Collections.emptyList());
            return result;
        }

        List<List<Integer>> prevList = getPowerSetRecursive(list, counter + 1);
        result.addAll(prevList);
        for (List<Integer> cl : prevList) {
            List<Integer> tempList = new ArrayList<>(cl);
            tempList.add(list.get(counter));
            result.add(tempList);
        }
        return result;
    }

}
```

_________________________________

## Finding all the sub-sets of a given set (Power-set) - Iterative

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PowerSetIterative {
    public static void main(String[] args) {
        System.out.println(new PowerSetIterative().powerSetIterative(Arrays.asList(new Integer[]{1, 2, 3})));
    }

	public List<List<Integer>> powerSetIterative(List<Integer> list) {
		if (list == null || list.size() == 0)
    		return Collections.emptyList();
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
## Finding the number of ways in which `n` can be expressed as a sum of `k` different numbers

* `k` non-zero numbers
* Suppose you need to find number of ways in which `10` can be expresses as a sum of `4` different non-zero numbers.
 * To visualize, assume you have an array of `10` elements and each element of the array is `1`.
 * there are a total of 9 internal boundaries in this array and and you need to choose `3` of them to partition this arrya of `1`s into 4 non-zero parts.
 * so for `n=10` and `k=4`, then answer is `9C3` = `84`
* The answer comes out to be `(n-1)C(k-1)`

_________________________________

## Calculate `nCk (mod p)` (where `p` is prime)

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

## Fibonacci numbers

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

 ```bash
 [ 1 1 ] ^ n   =  [F(n+1)     F(n)]
 [ 1 0 ]          [F(n)       F(n-1)]
 ```

   * You can calculate the power of the above matrix in `O(log(n))` using divide and conquer

_________________________________

## Sum of first `n` fibonacci numbers in `O(log(n))`

* `Sum(first n fibonacci numbers) = f(n+2) - f(2)` assuming fibonacci series is like `1,1,2,3,5,8...`

_________________________________

## Infix to Perfix conversion using Stack

_________________________________

## Infix to Prefix conversion using recursion

_________________________________

## Evaluation of Postfix

_________________________________

## Evaluation of Prefix

_________________________________

## Largest sum contiguous sub-array - Kadane's Algo

* Space Complexity: `O(1)`
* Time Complexity: `O(n)`
* Edge cases:
  * all the numbers are negative (in this case it should return the largest number in the array)
  * the array given is of length `0` (should return `0` in this case)
* Check on LeetCode - [LeetCode53](https://leetcode.com/problems/maximum-subarray/)

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

* A simple Dynamic Programming solution:

```java
    /**
    * A dynamic programming solution
    */
   public int maxSubArray(int[] nums) {
       /*
        * dp[i] stores the sum of contiguous sub-array
        * that ends at ith index and has max sum
        */
       int[] dp = new int[nums.length];
       int max;
       max = dp[0] = nums[0];

       for (int i = 1; i < nums.length; i++) {
           if (dp[i - 1] + nums[i] > nums[i])
               dp[i] = dp[i - 1] + nums[i];
           else dp[i] = nums[i];
           if (max < dp[i])
               max = dp[i];
       }
       return max;
   }
```

_________________________________

## Finding a pair in array that sums to a given value

* The following program returns the indices of elements whose sum is given target.

```java
// {1, 2} target = 3 solution should be {0,1}
// {2, 2} target = 4 solution should be {0,1}
/*
extra space - O(n)
time complexity - O(n)
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode1 {
    public static void main(String[] args) {
        int []r1 = new LeetCode1().twoSum(new int[]{1, 2}, 3);
        System.out.println(r1[0] + " " + r1[1]);
        int []r2 = new LeetCode1().twoSum(new int[]{2, 2}, 4);
        System.out.println(r2[0] + " " + r2[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int toBeSearched = target - entry.getKey();
            if (toBeSearched == entry.getKey() && entry.getValue().size() > 1) {
                return new int[]{entry.getValue().get(0), entry.getValue().get(1)};
            } else if (map.containsKey(toBeSearched) && map.get(toBeSearched).size() > 0) {
                return new int[]{entry.getValue().get(0), map.get(toBeSearched).get(0)};
            }
        }
        // should never be the case
        return new int[]{-1, -1};
    }


}
```

_________________________________

## Finding a Triplet in array that sums to a given value

* [LeetCode15](https://leetcode.com/problems/3sum/).
* Following the approach given [here](https://www.geeksforgeeks.org/count-triplets-with-sum-smaller-that-a-given-value/).

```java
import java.util.*;
/*
    Time complexity - O(n^2)
    Space complexity - O(n)
*/

public class LeetCode15_1 {
    public static void main(String[] args) {
        System.out.println(new LeetCode15_1().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(new LeetCode15_1().threeSum(new int[]{1, 2, 3}));
        System.out.println(new LeetCode15_1().threeSum(new int[]{0, 0, 0}));
        System.out.println(new LeetCode15_1().threeSum(new int[]{-2, 0, 0, 2, 2}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            List<List<Integer>> lists = findPair(i + 1, -nums[i], nums);
            for (List<Integer> cl : lists) {
                result.add(Arrays.asList(new Integer[]{nums[i], cl.get(0), cl.get(1)}));
            }
        }
        return new ArrayList<>(result);
    }

    private List<List<Integer>> findPair(int start, int target, int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = start, j = nums.length - 1; i < j; ) {
            if (nums[i] + nums[j] < target) {
                i++;
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else {
                result.add(Arrays.asList(new Integer[]{nums[i], nums[j]}));
                i++;
                j--;
            }
        }
        return result;
    }
}
```

_________________________________

## Finding a tuple of 4 elementes in array that sums to a given value

* Time complexity - O(n^2)
* Space complexity - O(n^2)
* Make sure you return unique quadruples

```java
/*
Time complexity - O(n^2)
Space complexity - O(n^2)

test cases:
{1, 2, 3, 4, 1} target = 12 // should return an empty list
*/

import java.util.*;

public class LeetCode18 {
    public static void main(String[] args) {
        System.out.println(new LeetCode18().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int cs = nums[i] + nums[j];
                map.putIfAbsent(cs, new ArrayList<List<Integer>>());
                map.get(cs).add(Arrays.asList(new Integer[]{i, j}));
            }
        }
        Set<List<Integer>> result = new HashSet<>();
        for (Map.Entry<Integer, List<List<Integer>>> entry : map.entrySet()) {
            int a = entry.getKey();
            int b = target - a;
            if (map.containsKey(b)) {
                acc(entry.getValue(), map.get(b), result, nums);
            }
        }
        List<List<Integer>> finalResult = new ArrayList<>();
        finalResult.addAll(result);
        return finalResult;
    }

    private void acc(List<List<Integer>> list1, List<List<Integer>> list2, Set<List<Integer>> result, int[] nums) {
        for (List<Integer> pair1 : list1) {
            for (List<Integer> pair2 : list2) {
                assert pair1.size() == 2;
                assert pair2.size() == 2;
                if (checkIfDistinct(pair1.get(0), pair1.get(1), pair2.get(0), pair2.get(1))) {
                    int w = nums[pair1.get(0)];
                    int x = nums[pair1.get(1)];
                    int y = nums[pair2.get(0)];
                    int z = nums[pair2.get(1)];

                    List<Integer> tempList = new ArrayList<>(4);
                    tempList.addAll(Arrays.asList(new Integer[]{w, x, y, z}));
                    Collections.sort(tempList); // this is to find unique quadruples
                    result.add(tempList);
                }
            }
        }
    }

    private boolean checkIfDistinct(int a, int b, int c, int d) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(new Integer[]{a, b, c, d}));
        return set.size() == 4;
    }
}
```

_________________________________

## Convert Binary Tree into it's mirror

_________________________________

## Check if a give Binary tree is mirror of itself

* Simple Recursive solution
* [LeetCode226](https://leetcode.com/problems/invert-binary-tree/)

```java
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class LeetCode226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        swapChildren(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    private void swapChildren(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

}
```

_________________________________

## Check if two trees are mirror of each other

```java
public class LeetCode101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) // both roots are null
            return true;
        if (root1 == null || root2 == null) // exactly one root is null
            return false;
        return root1.val == root2.val &&
                isSymmetric(root1.left, root2.right) &&
                isSymmetric(root1.right, root2.left);
    }
}
```

_________________________________

## Lowest common ancestor in a BST

* [LeetCode235](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)
* Time Complexity - `O(h)`, where `h` is height of the tree
* The following program assumes that both the nodes `p` and `q` are present in tree. (so this method will never return `null`).

```java
public class LeetCode235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode cn = root;
        while (cn != null) {
            if (cn.val > p.val && cn.val > q.val)
                cn = cn.left;
            else if (cn.val < p.val && cn.val < q.val)
                cn = cn.right;
            else if (cn.val == p.val)
                return cn;
            else if (cn.val == q.val)
                return cn;
            else return cn;
        }
        // should never be the case
        // if both p and q exists in the tree
        return null;
    }
}
```

_________________________________

## Height of a Binary Tree

* [LeetCode104](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

```java
public class LeetCode104 {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
```

## Tree-Traversals

### InOrder

* Recursive and iterative (using stack)
* [LeetCode94](https://leetcode.com/problems/binary-tree-inorder-traversal/)

```java
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode94 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(new LeetCode94().inorderTraversal(root));

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        iterative(root, list);
        return list;
    }

    private void iterative(TreeNode root, List<Integer> list) {
        Deque<TreeNode> stack = new LinkedList<>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
        while (stack.size() != 0) {
            TreeNode currentRoot = stack.pop();
            list.add(currentRoot.val);
            currentRoot = currentRoot.right;
            while (currentRoot != null) {
                stack.push(currentRoot);
                currentRoot = currentRoot.left;
            }
        }
    }

    private void recursive(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        recursive(root.left, list);
        list.add(root.val);
        recursive(root.right, list);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
```

### PreOrder

### PostOrder

### Level Order Traversal


## Determine if 2 given trees are identical

## Count leaf nodes in a given Binary tree

## Size of a Binary Tree

## Children sum property


## Path sum in a tree

* [LeetCode437](https://leetcode.com/problems/path-sum-iii/)
* Time Complexity = `O(n^2)`

```java
public class LeetCode437 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        return pathSum(root.left, sum) +
                pathSum(root.right, sum) +
                pathSumHelper(root, sum);
    }

    public int pathSumHelper(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int c = pathSumHelper(root.left, sum - root.val);
        int d = pathSumHelper(root.right, sum - root.val);
        int answer = (root.val == sum ? 1 : 0);
        return c + d + answer;
    }
}
```

_________________________________

## Tower of Hanoi

_________________________________

## Check whether a number is power of 2 or not using bitwise-operators

```java
public class CheckPowerOf2 {
    public static void main(String[] args) {
        System.out.println(new CheckPowerOf2().isPowerOf2(100));
        System.out.println(new CheckPowerOf2().isPowerOf2(1024));
    }
    public boolean isPowerOf2(long n) {
        return (n>=0) && ((n & (n-1)) == 0);
    }
}
```

_________________________________

## DP (Dynamic programming)

* Dynamic Programming is a programming paradigm in  which we solve each subproblem exactly once and store the subsolutions in a table.
* The next time when same subproblem needs to be solved, we simply lookup to the previously computed solution.
* Memoization and DP are different
  * DP is bottom up approach
  * Memoization is a top-down approach
* Properties of a Dynamic Programming Problem:
  * Overlapping Sub-problems
  * Optimal Sub-structure
* **Overlapping sub-problems** - In divide and conquer subproblems don't overlap, but in DP same sub-problem needs to be solved again and again.
* Shortest path in a graph exhibits optimal substructure property, but longest path in a graph don't exhibit this property.

_________________________________

## LIS - Longest Increasing SubSequence (LIS) O(n^2) and O(n log(n))

* Time Complexity = `O(n log(n))` and space complexity = `O(n)`

```java
import java.util.*;

public class LeetCode300 {
    public static void main(String[] args) {
        System.out.println(new LeetCode300().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    public int lengthOfLIS(int[] arr) {
        // this list is always sorted (this invariant is maintained)
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int res = Collections.binarySearch(list, arr[i]);
            if (res < 0) {
                res++;
                res = -res;
                if (res == list.size())
                    list.add(arr[i]);
                else
                    list.set(res, arr[i]);
            }
        }

        return list.size();
    }
}
```

_________________________________

## LCS - Longest common subsequence (LCS)

* Given 2 strings `x` and `y` find the length of LCS.
* Suppose `x=ABCDGH` and `y=AEDFHR`, then the LCS is `ADH`
* Data-Structure for storing solution of subproblems: A 2-D matrix/table of size `(m+1)*(n+1)`, where `m` is the length of first string and `n` is the length of second string.
* `dp[i][j]` denotes the length of LCS for strings:
    * prefix string of `x` taking only first `i` characters.
    * prefix string of `y` taking only first `j` characters.
* Solving base cases trivially:
    * `dp[0][j]` for all `j=0 to y.length` is `0`
    * `dp[i][j]` for all `i=0 to x.length` is `0`
* Recursively defining the solution:
    * `dp[i][j] = max(dp[i-1][j], dp[i][j-1], dp[i-1][j-1] + diff)` where `diff=1` if `i`th alphabet of `x` is equal to `j` alpahbet of `y` otherwise `diff=0`

```java
public class LCS {
    public static void main(String[] args) {
        System.out.println(new LCS().lcs("", "")); // should return 0
        System.out.println(new LCS().lcs("ABCDGH", "AEDFHR")); // should return 3
        System.out.println(new LCS().lcs("AGGTAB", "GXTXAYB")); // should return 4

    }

    public int lcs(String x, String y) {
        int m = x.length(), n = y.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++)
            dp[i][0] = 0;
        for (int j = 0; j <= n; j++)
            dp[0][j] = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int diff = (x.charAt(i - 1) == y.charAt(j - 1) ? 1 : 0);
                dp[i][j] = max3(dp[i][j - 1], dp[i - 1][j], dp[i - 1][j - 1] + diff);
            }
        }
        return dp[m][n];
    }

    private int max3(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
```

_________________________________

## Edit Distance

* [Levenshtein Distance](https://en.wikipedia.org/wiki/Levenshtein_distance)
* Also read [this](https://www.datacamp.com/community/tutorials/fuzzy-string-python) for a more broader view.
* [LeetCode72](https://leetcode.com/problems/edit-distance/)
* You can insert, remove or replace (all operations cost equal). 
* You need to find the minimum cost of converting one string `x` to other string `y`.
* Dynamic programming solution:
    * store subsolutions in a table of size `(m+1)*(n+1)` where `m` is size of `x` and `n` is size of `y`

    ```java
    public class EditDistance {
        public static void main(String[] args) {
            System.out.println(new EditDistance().editDistance("", "")); // should return 0
            System.out.println(new EditDistance().editDistance("sunday", "saturday")); // should return 3
            System.out.println(new EditDistance().editDistance("cat", "cut")); // should return 0
        }

        public int editDistance(String x, String y) {
            int m = x.length(), n = y.length();
            int[][] dp = new int[m + 1][n + 1];
            // base cases
            // if the length of any one string is 0, then the answer is length of other string
            for (int i = 0; i <= m; i++) {
                dp[i][0] = i;
            }
            for (int j = 0; j <= n; j++) {
                dp[0][j] = j;
            }

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    int diff = (x.charAt(i - 1) == y.charAt(j - 1) ? 0 : 1);
                    dp[i][j] = min3(dp[i][j - 1] + 1, dp[i - 1][j] + 1, diff + dp[i - 1][j - 1]);
                }
            }
            return dp[m][n];
        }

        public int min3(int a, int b, int c) {
            return Math.min(Math.min(a, b), c);
        }
    }

    ```

* The time-complexity of above solution is `O(mn)` and space complexity is also `O(mn)`
* You can reduce the space complexity to `O(min(m,n))` by using two different 1-D arrays.

    ```java
    class Solution {
    public int minDistance(String word1, String word2) {
            int[][] dp = new int[2][word2.length() + 1];
            dp[1][0] = 1;
            for (int j = 0; j <= word2.length(); j++) {
                dp[0][j] = j;
            }

            for (int i = 1; i <= word1.length(); i++) {
                int dpiIndex = i & 1; // int dpiIndex = i % 2;
                dp[dpiIndex][0] = i; // CATION: this is important - you might miss this
                int otherIndex = dpiIndex ^ 1;

                for (int j = 1; j <= word2.length(); j++) {
                    int diff = 0;
                    if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                        diff++;
                    }
                    dp[dpiIndex][j] = min3(dp[otherIndex][j] + 1,
                            dp[dpiIndex][j - 1] + 1,
                            diff + dp[otherIndex][j - 1]);
                }
            }
            return dp[word1.length() & 1][word2.length()];
        }

        private int min3(int a, int b, int c) {
            return Math.min(a, Math.min(b, c));
        }
    }
    ```

_________________________________

## min-cost path

```java
public class LeetCode64 {
    public static void main(String[] args) {
        int answer = new LeetCode64().minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}); // 7
        System.out.println(answer);
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length, n;
        if (m == 0)
            return 0;
        n = grid[0].length;
        int dp[][] = new int[m][n];
        // dp[i][j] denotes the cost of minimum path from [0,0] to [i,j]
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }

}
```

_________________________________
## Subset sum problem

## Knapsack Problem (With repetition, without repetition, fractional knapsack)

## Coin change problem

## Calculating binomial coefficient

## Matric Chain Multiplication

## Longest palindromic Subsequence

## Rod Cutting problem

## Maximum Sum Increasing Subsequence

## Longest Bitonic Sequence

## Floyd Warshall's Algo - All pair shortest path

## Catalan Number

* Read [this](https://en.wikipedia.org/wiki/Catalan_number) article from wikipedia.

_________________________________
## Generating 0 and 1 randomly with 75% and 25% probaility

## Adjacency matrix. Interpretation of A^n[i][j]

## Finding cycles in undirected graph

## Finding cycles in directed graph

## DFS - Longest path in a DAG

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

## Disjoint Set (Union-find)

* InterviewBit [Commutable-Islands](https://www.interviewbit.com/problems/commutable-islands/)

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IB_CommutableIslands {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1, 2, 15)));
        list.add(new ArrayList<>(Arrays.asList(3, 2, 14)));
        list.add(new ArrayList<>(Arrays.asList(4, 3, 7)));
        list.add(new ArrayList<>(Arrays.asList(2, 5, 10)));
        list.add(new ArrayList<>(Arrays.asList(5, 4, 6)));
        list.add(new ArrayList<>(Arrays.asList(5, 1, 7)));

        System.out.println(new IB_CommutableIslands().solve(5, list));
    }

    public int solve(int A, ArrayList<ArrayList<Integer>> list) {
        List<Edge> edges = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            assert list.get(i).size() == 3;
            edges.add(new Edge(list.get(i).get(0) - 1,
                    list.get(i).get(1) - 1,
                    list.get(i).get(2)));
        }
        Collections.sort(edges, (x, y) -> Integer.compare(x.w, y.w));

        int[] parent = new int[A];
        int[] size = new int[A];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        int answer = 0;
        for (int i = 0; i < edges.size(); i++) {
            Edge ce = edges.get(i);
            if (find(parent, ce.a) == find(parent, ce.b)) {
                continue;
            }
            answer += ce.w;
            merge(parent, size, ce.a, ce.b);
        }
        return answer;
    }

    // gives the representative element of 'a'
    private int find(int[] parent, int a) {
        if (parent[a] == a)
            return a;
        return parent[a] = find(parent, parent[a]); // path compression
    }

    private void merge(int[] parent, int[] size, int a, int b) {
        int ra = find(parent, a);
        int rb = find(parent, b);
        if (ra != rb) {
            if (size[ra] > size[rb]) {
                parent[rb] = ra;
                size[ra] += size[rb];
            } else {
                parent[ra] = rb;
                size[rb] += size[ra];
            }
        }
    }

    private static class Edge {
        int a, b, w;

        public Edge(int a, int b, int w) {
            this.a = a;
            this.b = b;
            this.w = w;
        }
    }

}
```

* [LeetCode128](https://leetcode.com/problems/longest-consecutive-sequence/)
* This is an important data-structure.
* This data structure can also be used to **detect cycles in an undirected graph**. See [this](https://www.geeksforgeeks.org/union-find/) for details.
    * The idea is simply to merge 2 different vertices in the same group/disjoint-set for each edge in the graph. But if while doing so you find that the vertices for the edge are already in the same set then there is a cycle in the graph.
* To find cycles in a directed graph you can simply run DFS and search for back-edges

```java
import java.util.HashMap;
import java.util.Map;

public class LeetCode128 {
    public static void main(String[] args) {
        System.out.println(new LeetCode128().longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(new LeetCode128().longestConsecutive(new int[]{5, 4, 3, 2, 1}));
        System.out.println(new LeetCode128().longestConsecutive(new int[]{1, 3, 5, 9}));
        System.out.println(new LeetCode128().longestConsecutive(new int[]{2}));
        System.out.println(new LeetCode128().longestConsecutive(new int[]{}));
        System.out.println(new LeetCode128().longestConsecutive(new int[]{0, 0, -1})); // output should be 2
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        int[] parent = new int[nums.length];
        int[] size = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // make sure that you iterate over the map instead of the whole array
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int b = entry.getKey();
            int a = b - 1;
            int c = b + 1;
            if (map.containsKey(a))
                merge(entry.getValue(), map.get(a), parent, size);
            if (map.containsKey(c))
                merge(entry.getValue(), map.get(c), parent, size);
        }

        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            int r = find(i, parent);
            max = max < size[r] ? size[r] : max;
        }
        return max;
    }

    // find the index representative element of the number present at this index
    private int find(int index, int[] parent) {
        if (parent[index] == index) return index;
        return parent[index] = find(parent[index], parent);
    }

    private void merge(int a, int b, int[] parent, int[] size) {
        int pa = find(a, parent);
        int pb = find(b, parent);
        if (pa != pb) {
            if (size[pa] > size[pb]) {
                size[pa] += size[pb];
                parent[pb] = pa;
            } else {
                size[pb] += size[pa];
                parent[pa] = pb;
            }
        }
    }

}
```

_________________________________
## String pattern matching

* Assume that `m` is size of patterh and `n` is size of text
* Naive String matching algorithm takes `O(m*n)`
* Rabin-Karp 
    * Best and average case time compleity = `O(n-m)`
    * Worst case time complexity = `O(mn)`
    * [Rolling hash function](https://en.wikipedia.org/wiki/Rolling_hash) - getting the hash from previous hash in constant time
    * if you have weak hash function you have spurious hit
* KMP algorithm
    * Wost case Time complexity - `O(m+n)`
    * space complexity - `O(m)`

* **Just a thought** - Extension of Rabin-Karp
    * Assume that we are given that all the patterns will be of length `m` or less.
    * We can pre-compute the rolling hash starting at every index and for ever substring of length `m` or less. This pre-computation will take `O(m*n)`.
    * Then for each length of substring (`<=m`) we can store a list of starting indices that have same hash. 
    * This initial construction will take `O(m*n)`, but after that, every query can be answered in `O(m)`. This factor of `m` exists becuase we will have to calculate the hash of pattern.
    * The space complexity of this approach is `O(m*n)`
    * I like this approach because usually `m` is very small in practical test editors.
    * More concrete thought:
        * If `m=10`
        * I'll store 10 `HashMap<Integer, List<Integer>>` where key is `hash` and the value is list of indices in the text where we got this hash. Each `HashMap` corresponds to the size of the pattern we are targetting. (And we assumed that all the patterns will be of size `m` or less)
        * Now querying on this hashMap that whether some key exists or not can be done in `O(1)` amortized.
        * so at the end everything boils down to calculating the hash of pattern and then choosing map that corresponds to the size of the pattern and querying in that map (this takes `O(1)`) and finally actually checking the pattern and the text - this actual checking will take `O(m)*number of occurrences` (to confirm that it was not a suprious hit)

```java
import java.util.ArrayList;
import java.util.List;

public class StringPatternMatch {
    public static void main(String[] args) {
        String longText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. It was popularised in the 1960s with the release of " +
                "Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum.";

        System.out.println(new StringPatternMatch().matchNaive("abcde", "de"));
        System.out.println(new StringPatternMatch().matchNaive("THIS IS A TEST TEXT", "TEST"));
        System.out.println(new StringPatternMatch().matchNaive("AABAACAADAABAABA", "AABA"));
        System.out.println(new StringPatternMatch().matchNaive("AAAAA", "AAA"));
        System.out.println(new StringPatternMatch().matchNaive(longText, "electronic"));

        System.out.println("____________________");

        System.out.println(new StringPatternMatch().matchRabinKarp("abcde", "de"));
        System.out.println(new StringPatternMatch().matchRabinKarp("THIS IS A TEST TEXT", "TEST"));
        System.out.println(new StringPatternMatch().matchRabinKarp("AABAACAADAABAABA", "AABA"));
        System.out.println(new StringPatternMatch().matchRabinKarp("AAAAA", "AAA"));
        System.out.println(new StringPatternMatch().matchRabinKarp(longText, "electronic"));
    }

    /**
     * Time complexity - O((n-m)*(m)) where
     * m is the length of pattern, and n is the lenght of string
     */
    public List<Integer> matchNaive(String str, String pattern) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < str.length() && i <= str.length() - pattern.length(); i++) {
            int counter = 0;
            for (int j = 0; j < pattern.length(); j++) {
                if (i + j < str.length() && pattern.charAt(j) == str.charAt(i + j))
                    counter++;
                else break;
            }
            if (counter == pattern.length())
                result.add(i);
        }
        return result;
    }

    public List<Integer> matchRabinKarp(String str, String pattern) {
        int base = (1 << 8);
        int prime = 9973; // any big enough prime number
        int patternHash = hash(pattern, base, prime);
        int strHash = hash(str.substring(0, pattern.length()), base, prime);
        List<Integer> result = new ArrayList<>();
        int firstHashPower = power(base, pattern.length() - 1, prime);
        for (int i = 0; i <= str.length() - pattern.length(); i++) {
            if (patternHash == strHash) {
                int counter = 0;
                for (int j = 0; j < pattern.length(); j++) {
                    if (str.charAt(i + j) == pattern.charAt(j))
                        counter++;
                    else break;
                }
                if (counter == pattern.length())
                    result.add(i);
                else
                    System.out.println("this is a miss");
            }
            if (i + pattern.length() < str.length()) {
                strHash = (strHash - (str.charAt(i) * firstHashPower) % prime) * base + str.charAt(i + pattern.length());
                strHash = (strHash % prime + prime) % prime;
            }
        }
        return result;
    }

    private int power(int a, int b, int mod) {
        if (a == 0 || a == 1)
            return 1;
        if (b == 1)
            return a % mod;
        int temp = power(a, b / 2, mod);
        if ((b & 1) == 0)
            return (temp * temp) % mod;
        return (((temp * temp) % mod) * a) % mod;
    }

    // a rolling hash function
    private int hash(String s, int base, int mod) {
        int hash = 0;
        for (int i = 0; i < s.length(); i++)
            hash = (hash * base + s.charAt(i)) % mod;
        return hash;
    }

}
```

_________________________________

## Search in a rotated sorted array

* Be sure that you find the pivot in a correct way
* Beware of the edge cases
    * When there is only one elemnt in the array

```java
public class LeetCode33 {
    public static void main(String[] args) {
        System.out.println(new LeetCode33().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)); // 4
        System.out.println(new LeetCode33().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 4)); // 0
        System.out.println(new LeetCode33().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 2)); // 6
        System.out.println(new LeetCode33().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5)); // 1
        System.out.println(new LeetCode33().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1)); // 5
        System.out.println(new LeetCode33().search(new int[]{4, 5, 6, 7, 10, 1, 2}, 0)); // -1
        System.out.println(new LeetCode33().search(new int[]{}, 0)); // -1
        System.out.println(new LeetCode33().search(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 0)); // -1
        System.out.println(new LeetCode33().search(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 9)); // 9
        System.out.println(new LeetCode33().search(new int[]{1}, 0)); // -1
        System.out.println(new LeetCode33().search(new int[]{1, 2}, 1)); // 0
        System.out.println(new LeetCode33().search(new int[]{2, 1}, 1)); // 1
    }

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int pivot = findPivot(nums);
        if (nums[nums.length - 1] > target)
            return binSearch(nums, pivot, nums.length - 1, target);
        else if (nums[nums.length - 1] == target)
            return nums.length - 1;
        else return binSearch(nums, 0, pivot - 1, target);
    }

    private int binSearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    private int findPivot(int[] nums) {
        if (nums[0] < nums[nums.length - 1] || nums.length == 1)
            return 0;
        // if the execution is here, it is rotated by at least 1 element
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isProperPivot(nums, mid))
                return mid;
            if (isProperPivot(nums, low))
                return low;
            if (isProperPivot(nums, high))
                return high;
            if (nums[low] < nums[mid])
                low = mid + 1;// because of this low can cross the pivot
            else if (nums[low] > nums[mid])
                high = mid - 1;
        }
        // should never be the case
        return -1;
    }

    private boolean isProperPivot(int[] nums, int index) {
        return index != 0 && nums[index - 1] > nums[index];
    }

}
```

_________________________________

## Find first and last position of an element in sorted array

* simple binary search implementation
* beware of the edge cases

```java
public class LeetCode34 {
    public static void main(String[] args) {
        {
            int answer[] = new LeetCode34().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
            System.out.println(answer[0] + " " + answer[1]);
        }
        {
            int answer[] = new LeetCode34().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
            System.out.println(answer[0] + " " + answer[1]);
        }
        {
            int answer[] = new LeetCode34().searchRange(new int[]{5}, 6);
            System.out.println(answer[0] + " " + answer[1]);
        }
        {
            int answer[] = new LeetCode34().searchRange(new int[]{5}, 5);
            System.out.println(answer[0] + " " + answer[1]);
        }
        {
            int answer[] = new LeetCode34().searchRange(new int[]{5, 7}, 7);
            System.out.println(answer[0] + " " + answer[1]);
        }
        {
            int answer[] = new LeetCode34().searchRange(new int[]{6, 6, 6, 6}, 6);
            System.out.println(answer[0] + " " + answer[1]);
        }
        {
            int answer[] = new LeetCode34().searchRange(new int[]{}, 6);
            System.out.println(answer[0] + " " + answer[1]);
        }


    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{lower(nums, target), higher(nums, target)};
    }

    private int lower(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (nums[mid] == target) {
                if (isProperLow(nums, mid)) return mid;
                else high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return -1;
    }

    private boolean isProperLow(int[] nums, int index) {
        return index == 0 || nums[index - 1] != nums[index];
    }

    /*
     * {},2 return value = -1
     * {2}, 3 return value = -1
     * {2}, 2 return value = 0
     */
    private int higher(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (nums[mid] == target) {
                if (isProperHigh(nums, mid))
                    return mid;
                else low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else low = mid + 1;
        }
        return -1;
    }

    private boolean isProperHigh(int[] nums, int index) {
        return index + 1 == nums.length || nums[index + 1] != nums[index];
    }

}
```

_________________________________

# Some tricky or tough problems

## Rotating 2-D square matrix

* [Rotate Matrix on InterviewBit](https://www.interviewbit.com/problems/rotate-matrix/)
* No extra memory should be used, and the algorithm should work in-place.
* This is a simple problem but it can be tricky with thinking it for the first time.

```java
import java.util.ArrayList;
import java.util.Arrays;

public class IB_RotateMatrix {
    public static void main(String[] args) {
        test1(); // for odd
        test2(); // for even
    }

    private static void test1() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>(Arrays.asList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3))));
        list.add(new ArrayList<>(Arrays.asList(Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6))));
        list.add(new ArrayList<>(Arrays.asList(Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9))));

        new IB_RotateMatrix().rotate(list);
        System.out.println(list);

    }

    private static void test2() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>(Arrays.asList(Integer.valueOf(1), Integer.valueOf(2),
                Integer.valueOf(3), Integer.valueOf(4))));
        list.add(new ArrayList<>(Arrays.asList(Integer.valueOf(5), Integer.valueOf(6),
                Integer.valueOf(7), Integer.valueOf(8))));
        list.add(new ArrayList<>(Arrays.asList(Integer.valueOf(9), Integer.valueOf(10),
                Integer.valueOf(11), Integer.valueOf(12))));
        list.add(new ArrayList<>(Arrays.asList(Integer.valueOf(13), Integer.valueOf(14),
                Integer.valueOf(15), Integer.valueOf(16))));
        
        new IB_RotateMatrix().rotate(list);
        System.out.println(list);

    }

    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        int x, y;
        // counter is the ring number, 0 being the outermost one
        for (int counter = 0; counter < n; counter++) {
            int x1 = counter, y1 = counter;
            int x2 = counter, y2 = n - 1 - counter;
            int x3 = n - 1 - counter, y3 = n - 1 - counter;
            int x4 = n - 1 - counter, y4 = counter;

            for (int i = 0; i < n - 2 * counter - 1; i++, y1++, x2++, y3--, x4--) {
                swap(a, x1, y1, x2, y2);
                swap(a, x1, y1, x3, y3);
                swap(a, x1, y1, x4, y4);
            }
        }
    }

    private void swap(ArrayList<ArrayList<Integer>> a, int x1, int y1, int x2, int y2) {
        int temp = a.get(x1).get(y1);
        a.get(x1).set(y1, a.get(x2).get(y2));
        a.get(x2).set(y2, temp);
    }

}
```

_________________________________

## Median of 2 sorted arrays

* InterviewBit - [Median of Arrays](https://www.interviewbit.com/problems/median-of-array/)
* Time Complexity = `O(log(min(m,n)))` where `m` and `n` are the size of arrays/lists

```java
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class IB_MedianOf2Arrays {
    public static void main(String[] args) {
        System.out.println(new IB_MedianOf2Arrays().findMedianSortedArrays(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(6, 7, 7, 8, 9, 12))); // 6.5

        System.out.println(new IB_MedianOf2Arrays().findMedianSortedArrays(
                Arrays.asList(1, 3),
                Arrays.asList(2))); // 2.0

        System.out.println(new IB_MedianOf2Arrays().findMedianSortedArrays(
                Arrays.asList(),
                Arrays.asList(1, 2, 10, 20))); // 6.0

        System.out.println(new IB_MedianOf2Arrays().findMedianSortedArrays(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4))); // 2.5
    }

    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        // can any list be null?
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);

        int m = a.size(), n = b.size();
        // can both the lists be empty (with no elements)?

        if (m > n) return findMedianSortedArrays(b, a);

        int start = 0, end = a.size();
        while (start <= end) {
            int mid = (start + end) / 2;

            // indices
            int l1 = mid;                   // these many elements of A on left side
            int r1 = m - l1;                // these many elements of A on right side
            int l2 = (r1 + n - mid) / 2;    // these many elements of B on left side
            int r2 = n - l2;                // these many elements of B on right side

            // values
            int aLeftMax = (l1 == 0 ? Integer.MIN_VALUE : a.get(l1 - 1));
            int aRightMin = l1 == m ? Integer.MAX_VALUE : a.get(l1);
            int bLeftMax = (l2 == 0 ? Integer.MIN_VALUE : b.get(l2 - 1));
            int bRightMin = l2 == n ? Integer.MAX_VALUE : b.get(l2);

            if (aLeftMax <= bRightMin && bLeftMax <= aRightMin) {
                // proper partition found
                if (isEven(m + n)) {
                    return avg(Math.max(aLeftMax, bLeftMax), Math.min(aRightMin, bRightMin));
                } else {
                    if (l1 + l2 > r1 + r2)
                        return Math.max(aLeftMax, bLeftMax);
                    else return Math.min(aRightMin, bRightMin);
                }
            } else if (aLeftMax > bRightMin) {
                end = mid - 1;
            } else if (bLeftMax > aRightMin) {
                start = mid + 1;
            } else {
                // both of the conditions can never be false together
                throw new IllegalArgumentException("It looks like the input lists are not sorted");
            }
        }
        // should never be the case
        throw new RuntimeException("this should have never occurred");
    }

    private boolean isEven(int a) {
        return (a & 1) == 0;
    }

    private double avg(int a, int b) {
        return (a + b) / 2.0;
    }

}
```

## Largest rectangle in a Histogram

* InterviewBit - [largest rectangle in a Historgram](https://www.interviewbit.com/problems/largest-rectangle-in-histogram/)

```java
import java.util.*;
import java.util.stream.Collectors;

public class IB_LargestRecInHistogram {
    public static void main(String[] args) {
        System.out.println(new IB_LargestRecInHistogram().largestRectangleArea(
                new ArrayList<>(Arrays.asList(2, 1, 5, 6, 2, 3)))); // 10
        System.out.println(new IB_LargestRecInHistogram().largestRectangleArea(
                new ArrayList<>(Arrays.asList(6, 2, 5, 4, 5, 1, 6)))); // 12
        System.out.println(new IB_LargestRecInHistogram().largestRectangleArea(
                new ArrayList<>(Arrays.asList(1, 1)))); // 2
    }

    public int largestRectangleArea(ArrayList<Integer> list) {
        List<Integer> nextSmaller = nextSmaller(list);
        List<Integer> prevSmaller = prevSmaller(list);
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            int ns = nextSmaller.get(i);
            int ps = prevSmaller.get(i);
            int right = (ns == -1 ? list.size() : ns);
            int left = ps;
            int cm = list.get(i) * (right - left - 1);
            max = Math.max(max, cm);
        }
        return max;
    }

    private List<Integer> prevSmaller(ArrayList<Integer> list) {
        ArrayList<Integer> cl = new ArrayList<>(list);
        Collections.reverse(cl);
        // next greater of reverse
        List<Integer> result = nextSmaller(cl);
        Collections.reverse(result);
        return result.stream()
                .map(a -> a == -1 ? a : list.size() - 1 - a)
                .collect(Collectors.toList());
    }

    private List<Integer> nextSmaller(ArrayList<Integer> list) {
        Deque<Integer> stack = new ArrayDeque<>(list.size());
        ArrayList<Integer> result = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++)
            result.add(-1);
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            if (stack.size() == 0) {
                stack.push(i);
                continue;
            }
            if (list.get(stack.peek()) <= current) stack.push(i);
            else {
                while (stack.size() > 0 && list.get(stack.peek()) > current) {
                    result.set(stack.pop(), i);
                }
                stack.push(i);
            }
        }
        return result;
    }
}
```

## Maximum Width of binary tree

If you are allowed to modify the index of the `TreeNode` (The following code cannot be submitted on LeetCode)

```java
/*
        Question :
        Given a binary tree, write a function to get the row with maximum width in the tree.
        The width of one row is defined as the length between the end-nodes
        (the leftmost and right most non-null nodes in the level,
        where the null nodes between the end-nodes are also counted into the length calculation.)
               1	    		   0
           2      3	           1		2
        4   .  6   	.        3	 .    5	  .

        5-3+1 = 3
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode662Alternative {
    public static void main(String[] args) {
        test1(); // 2
        test2(); // 4
        test3(); // 3
        test4(); // 1
    }

    private static void test1() {
        /*
                1
              2   3
              answer should be 2
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(new LeetCode662Alternative().getMaxWidth(root));
    }

    private static void test2() {
        /*
                    1
                 2       3
             4     .  .      5
             answer should be 4
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println(new LeetCode662Alternative().getMaxWidth(root));
    }

    private static void test3() {
        /*
                     1
                2         3
             .     4    .    5
             answer should be 3
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println(new LeetCode662Alternative().getMaxWidth(root));
    }

    private static void test4() {
        /*
                           1
                     .            2
                 .      .     .       3
                . .    . .   . .     .  4
             answer should be 1
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        System.out.println(new LeetCode662Alternative().getMaxWidth(root));
    }


    // root
    public int getMaxWidth(TreeNode root) {
        if (root == null)
            return 0;
        Deque<TreeNode> queue = new ArrayDeque<>();
        // root.index = 0; // is already 0, you don't need to explicitly do this
        queue.offer(root);
        int minCL = Integer.MAX_VALUE; // min of current level
        int maxCL = Integer.MIN_VALUE; // max of current level
        int answer = 1;
        int ncl = 1; // nodes in current level
        int nnl = 0; // nodes in next level
        while (queue.size() != 0) {
            TreeNode cn = queue.poll(); // current node
            ncl--;

            if (cn.left != null) {
                queue.offer(cn.left);
                minCL = Math.min(minCL, cn.index * 2 + 1);
                maxCL = Math.max(maxCL, cn.index * 2 + 1);
                cn.left.index = cn.index * 2 + 1;
                nnl++;
            }
            if (cn.right != null) {
                queue.offer(cn.right);
                minCL = Math.min(minCL, cn.index * 2 + 2);
                maxCL = Math.max(maxCL, cn.index * 2 + 2);
                cn.right.index = cn.index * 2 + 2;
                nnl++;
            }
            if (ncl == 0) {
                ncl = nnl;
                nnl = 0;
                if (minCL != Integer.MAX_VALUE && maxCL != Integer.MIN_VALUE) {
                    if (maxCL - minCL + 1 > answer)
                        answer = maxCL - minCL + 1;
                    minCL = Integer.MAX_VALUE;
                    maxCL = Integer.MIN_VALUE;
                }
            }
        }
        return answer;
    }

    static class TreeNode {
        int val;
        TreeNode left, right;
        int index;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
```

If you are not allowed to modify the index of the `TreeNode` (The following code can be submitted on LeetCode)

```java
// without changing the node structure
/*
        Question :
        Given a binary tree, write a function to get the row with maximum width in the tree.
        The width of one row is defined as the length between the end-nodes
        (the leftmost and right most non-null nodes in the level,
        where the null nodes between the end-nodes are also counted into the length calculation.)
               1	    		   0
           2      3	           1		2
        4   .  6   	.        3	 .    5	  .

        5-3+1 = 3
*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class LeetCode662 {
    public static void main(String[] args) {
        test1(); // 2
        test2(); // 4
        test3(); // 3
        test4(); // 1
    }

    private static void test1() {
        /*
                1
              2   3
              answer should be 2
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(new LeetCode662().widthOfBinaryTree(root));
    }

    private static void test2() {
        /*
                    1
                 2       3
             4     .  .      5
             answer should be 4
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println(new LeetCode662().widthOfBinaryTree(root));
    }

    private static void test3() {
        /*
                     1
                2         3
             .     4    .    5
             answer should be 3
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println(new LeetCode662().widthOfBinaryTree(root));
    }

    private static void test4() {
        /*
                           1
                     .            2
                 .      .     .       3
                . .    . .   . .     .  4
             answer should be 1
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        System.out.println(new LeetCode662().widthOfBinaryTree(root));
    }


    // root
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int minCL = Integer.MAX_VALUE; // min for the current level
        int maxCL = Integer.MIN_VALUE; // max for the next level
        int answer = 1;
        int ncl = 1; // nodes in the current level
        int nnl = 0; // nodes in the next level
        /*
             for keeping index, as treenode won't have hashCode() defined,
             so the hashCode is assumed to be distince for different nodes
             depending on Object.hashCode() -> this can be particularly bad
             this solution will go wrong if already the hashCode is overriden
             in TreeNode and multiple TreeNodes can have same hash.
        */
        Map<TreeNode, Integer> indexMap = new HashMap<>();
        indexMap.put(root, 0);
        while (queue.size() != 0) {
            TreeNode cn = queue.poll(); // current node
            ncl--;

            if (cn.left != null) {
                queue.offer(cn.left);
                minCL = Math.min(minCL, indexMap.get(cn) * 2 + 1);
                maxCL = Math.max(maxCL, indexMap.get(cn) * 2 + 1);
                indexMap.put(cn.left, indexMap.get(cn) * 2 + 1);
                nnl++;
            }
            if (cn.right != null) {
                queue.offer(cn.right);
                minCL = Math.min(minCL, indexMap.get(cn) * 2 + 2);
                maxCL = Math.max(maxCL, indexMap.get(cn) * 2 + 2);
                indexMap.put(cn.right, indexMap.get(cn) * 2 + 2);
                nnl++;
            }
            if (ncl == 0) {
                ncl = nnl;
                nnl = 0;
                if (minCL != Integer.MAX_VALUE && maxCL != Integer.MIN_VALUE) {
                    if (maxCL - minCL + 1 > answer)
                        answer = maxCL - minCL + 1;
                    minCL = Integer.MAX_VALUE;
                    maxCL = Integer.MIN_VALUE;
                }
            }
        }
        return answer;
    }

    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
```

# Some simple problems but worth doing

## 2 Sum

```java
import java.util.*;

/**
 * https://www.interviewbit.com/problems/2-sum/
 *
 * Time complexity = O(n)
 * space complexity = O(n)
 */
public class IB_2Sum {
    public static void main(String[] args) {
        System.out.println(new IB_2Sum().twoSum(Arrays.asList(2, 7, 11, 15), 9));
        System.out.println(new IB_2Sum().twoSum(Arrays.asList(-10, -10, -10), -5));
    }

    public ArrayList<Integer> twoSum(final List<Integer> list, int sum) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.putIfAbsent(list.get(i), new ArrayList<>());
            map.get(list.get(i)).add(i);
        }
        Pair answer = null;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int a = entry.getKey();
            int b = sum - a;
            if (a == b) {
                if (entry.getValue().size() > 1) {
                    Pair cp = new Pair(entry.getValue().get(0), entry.getValue().get(1));
                    if (answer == null || answer.compareTo(cp) == 1) {
                        answer = cp;
                    }
                }
            } else {
                if (map.containsKey(b)) {
                    Pair cp = new Pair(map.get(a).get(0), map.get(b).get(0));
                    if (answer == null || answer.compareTo(cp) == 1) {
                        answer = cp;
                    }
                }
            }
        }
        ArrayList<Integer> finalResult = new ArrayList<>(2);
        if (answer == null) // means no such two numbers exist
            return finalResult;
        finalResult.add(answer.x + 1);
        finalResult.add(answer.y + 1);
        return finalResult;
    }

    private static class Pair implements Comparable<Pair> {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
            if (this.x > this.y) swap();
        }

        private void swap() {
            int temp = x;
            x = y;
            y = temp;
        }

        @Override
        public int compareTo(Pair p) {
            if (y < p.y) return -1;
            else if (y > p.y) return 1;
            else if (x < p.x) return -1;
            else if (x > p.x) return 1;
            else return 0;
        }
    }

}
```

## Closest 3 Sum

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://www.interviewbit.com/problems/3-sum/
 * <p>
 * Time complexity = O(n^2)
 * Space complexity = O(1)
 */
public class IB_3Sum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1, 2, 1, -4));
        System.out.println(new IB_3Sum().threeSumClosest(list, 1)); // 2
    }

    public int threeSumClosest(ArrayList<Integer> A, int sum) {
        if (A == null || A.size() < 3)
            throw new IllegalArgumentException("the list either null or of size less than 3");

        List<Integer> list = new ArrayList<>(A);
        Collections.sort(list);
        int answer = list.get(0) + list.get(1) + list.get(2);
        for (int i = 0; i < list.size() - 1; i++) {
            int cs = list.get(i) + findClosestSum(list, i + 1, list.size() - 1, sum - list.get(i));
            if (Math.abs(cs - sum) < Math.abs(answer - sum))
                answer = cs;
        }
        return answer;
    }

    // assuming that the list is sorted.
    private int findClosestSum(List<Integer> list, int start, int end, int sum) {
        int closest = list.get(start) + list.get(end);
        for (int i = start, j = end; i < j; ) {
            int cs = list.get(i) + list.get(j);
            if (Math.abs(cs - sum) < Math.abs(closest - sum))
                closest = cs;
            if (cs < sum) {
                i++;
            } else if (cs > sum) {
                j--;
            } else if (cs == sum) {
                return cs;
            }
        }
        return closest;
    }

}
```

## 4 Sum

```java
import java.util.*;

/**
 * https://www.interviewbit.com/problems/4-sum/
 *
 * Time complexity O(n^2)
 * Space complexity O(n^2)
 */
public class IB_4Sum {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 0, -1, 0, -2, 2));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8));

        // [[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]
        System.out.println(new IB_4Sum().fourSum(list1, 0));

        // [[-8, -7, 3, 9], [-8, -5, 1, 9], [-8, -5, 3, 7], [-8, -4, 2, 7], [-8, -3, -1, 9], [-8, -3, 1, 7], [-8, -3, 4, 4], [-8, -2, 3, 4], [-8, -1, 2, 4], [-8, -1, 3, 3], [-8, 1, 2, 2], [-7, -7, 2, 9], [-7, -7, 4, 7], [-7, -5, 2, 7], [-7, -4, -1, 9], [-7, -4, 1, 7], [-7, -4, 4, 4], [-7, -3, -2, 9], [-7, -3, 3, 4], [-7, -2, -1, 7], [-7, -2, 2, 4], [-7, -2, 3, 3], [-7, -1, 1, 4], [-7, -1, 2, 3], [-5, -5, -2, 9], [-5, -5, 3, 4], [-5, -4, -3, 9], [-5, -4, -1, 7], [-5, -4, 2, 4], [-5, -4, 3, 3], [-5, -3, -2, 7], [-5, -3, 1, 4], [-5, -3, 2, 3], [-5, -2, 1, 3], [-5, -2, 2, 2], [-5, -1, 1, 2], [-4, -4, -4, 9], [-4, -4, -2, 7], [-4, -4, 1, 4], [-4, -4, 2, 3], [-4, -3, -3, 7], [-4, -3, 1, 3], [-4, -3, 2, 2], [-4, -2, -1, 4], [-4, -2, 1, 2], [-3, -3, -1, 4], [-3, -3, 1, 2], [-3, -2, -1, 3]]
        System.out.println(new IB_4Sum().fourSum(list2, -3));

    }

    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> list, int s) {

        Map<Integer, List<Pair>> sum = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int current = list.get(i) + list.get(j);
                sum.putIfAbsent(current, new ArrayList<>());
                // adding the index and not the elements
                sum.get(current).add(new Pair(i, j));
            }
        }

        Set<ArrayList<Integer>> answer = new HashSet<>();
        for (Map.Entry<Integer, List<Pair>> entry : sum.entrySet()) {
            int a = entry.getKey();
            int b = s - a;
            if (a == b) {
                if (sum.get(a).size() > 1) {
                    for (int i = 0; i < sum.get(a).size(); i++) {
                        for (int j = i + 1; j < sum.get(a).size(); j++) {
                            Pair ap = sum.get(a).get(i);
                            Pair bp = sum.get(a).get(j);
                            addPair(list, answer, ap, bp);
                        }
                    }
                }
            } else {
                if (sum.containsKey(b)) {
                    for (Pair ap : sum.get(a)) {
                        for (Pair bp : sum.get(b)) {
                            addPair(list, answer, ap, bp);
                        }
                    }
                }
            }
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(answer.size());
        result.addAll(answer);
        Collections.sort(result, (l1, l2) -> {
            for (int i = 0; i < l2.size() && i < l1.size(); i++) {
                if (l1.get(i) != l2.get(i)) {
                    return Integer.compare(l1.get(i), l2.get(i));
                }
            }
            return Integer.compare(l1.size(), l2.size());
        });
        return result;
    }

    private void addPair(List<Integer> list, Set<ArrayList<Integer>> answer, Pair ap, Pair bp) {
        Set<Integer> tempSet = new HashSet<>();
        tempSet.addAll(Arrays.asList(ap.x, ap.y, bp.x, bp.y));
        if (tempSet.size() < 4)
            return;
        ArrayList<Integer> tempList = new ArrayList<>(4);
        tempList.add(list.get(ap.x));
        tempList.add(list.get(ap.y));
        tempList.add(list.get(bp.x));
        tempList.add(list.get(bp.y));
        Collections.sort(tempList); // essential to remove duplicates
        answer.add(tempList);
    }

    private static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
```

# GeeksForGeeks

* [Maximum sum in circular array such that no two elements are adjacent](https://www.geeksforgeeks.org/maximum-sum-in-circular-array-such-that-no-two-elements-are-adjacent/)

# System design

## Fuzzy string matching

* These ideas were taken from [here](https://www.datacamp.com/community/tutorials/fuzzy-string-python)
* Assuming that you have 2 strings of length `m` and `n`
* Go for edit distance ([Levenshtein Distance](#edit-distance))
* Define similarity index `(m+n-editDistance) / (m+n)`
  * define a threshold for the similarity index
* do some preprocessing on the string
  * like both the strings should be converted to lower-case before calculating the edit distance. (`String#toLowerCase()`)
* Try giving different weights to insertion, deletion and substitution
  * You should take care of situations when 2 alphabets are shuffled.
  * should you consider out of order mismatches and give them lesser weight
* What if a punctuation character is missing? Shouldn't you consider giving less weight to it rather than giving it same weight as for an ordinary alphabet-miss?
* What if one string is substring of other.
* What if the tokens are in different order?
  * do you want to consider `Hello World` and `World Hello` same?
  * sorting the tokens
  * removing punctuation characters

# Programming language utilities (Specifically for Java)

## Priority Queues

* Construct PriorityQueue using `PriorityQueue<Person> personPriorityQueue = new PriorityQueue<>((p1, p2) -> p1.getName().compareTo(p2.getName()));`
* This implementation provides `O(log(n))` time for the enqueuing and dequeuing methods (`offer`, `poll`, `remove` and `add`)
* If the `PriorityQueue` is of type `Person` and `Person` implements `Comparable<Person>`, at the same time you have provided `Comparator<Person>` while constructing the queue, then the custom `Comparator` provided when constructing the queue will be given the preference over the `Comparable` that `Person` implements.
* You can have duplicate elements in `PriorityQueue`. During retrieval the ties between duplicate elements are broking arbitrarily.

```java
import java.util.PriorityQueue;


public class PriorityQueueExample {
    public static void main(String[] args) {
        test1(true);
        System.out.println("=====");
        test1(false);
    }

    private static void test1(boolean takeComparator) {
        PriorityQueue<Person> personPriorityQueue;
        if (takeComparator)
            personPriorityQueue = new PriorityQueue<>((p1, p2) -> p1.getName().compareTo(p2.getName()));
        else
            personPriorityQueue = new PriorityQueue<>();
        personPriorityQueue.offer(new Person("A", 5));
        personPriorityQueue.offer(new Person("E", 1));
        personPriorityQueue.offer(new Person("C", 3));
        personPriorityQueue.offer(new Person("B", 4));
        personPriorityQueue.offer(new Person("D", 2));

        while (personPriorityQueue.size() != 0) {
            System.out.println(personPriorityQueue.poll());
        }
    }

    private static class Person implements Comparable<Person> {
        private final String name;
        private final int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name + ", " + age;
        }

        @Override
        public int compareTo(Person p) {
            return age - p.age;
        }
    }
}
```

Output of the above code is:

```bash
A, 5
B, 4
C, 3
D, 2
E, 1
=====
E, 1
D, 2
C, 3
B, 4
A, 5
```

_________________________________

## Binary search in Java

* `Collections.binarySearch(sortedCollection, searchValue)`
* `Collections.binarySearch(sortedCollection, searchValue, comparator)`
* `Arrays.binarySearch` (TODO: you need to make one example)
* Do [LeetCode300](https://leetcode.com/problems/longest-increasing-subsequence/).
* What `Collections.binarySearch` returns? 

> The index of the search key, if it is contained in the list; otherwise, (-(insertion point) - 1). The insertion point is defined as the point at which the key would be inserted into the list: the index of the first element greater than the key, or list.size() if all elements in the list are less than the specified key. Note that this guarantees that the return value will be >= 0 if and only if the key is found.

> If the list contains multiple elements equal to the specified object, there is no guarantee which one will be found. 

* See how to properly apply `Collections.binarySearch`.

_________________________________

## Sort

* `Collections.sort(list)` -> this is a stable sort. (Solve [Max Distance on InterviewBit](https://www.interviewbit.com/problems/max-distance/) to see how sorting makes problems easy.)
* Custom comparator
    *  Never subtract two raw numbers for comparison, this can lead to overflows and you may get wrong result.

        ```java
        List<Integer> list = Arrays.asList(new Integer[]{200, Integer.MIN_VALUE});
        Comparator<Integer> cmp1 = (a, b) -> b - a; // this is not correct
        Comparator<Integer> cmp2 = (a, b) -> -a.compareTo(b); // this is correct
        Comparator<Integer> cmp3 = (a, b) -> b.compareTo(a); // this is correct and is same as cmp2
        Comparator<Integer> cmp3 = (a, b) -> Integer.compare(b, a); // this is correct and is same as cmp2
        ```

* sorting `java.util.List`
    * Custom `Comparator` given in `Collections#sort` is given more preferenece over `Comparable` which the `Person` class implements.

    ```java
    import java.util.Arrays;
    import java.util.Collections;

    public class ListSortingExample {
        public static void main(String[] args) {
            Person p1 = new Person("A", 3);
            Person p2 = new Person("B", 2);
            Person p3 = new Person("C", 1);

            Person[] persons = new Person[]{p1, p2, p3};
            Collections.sort(Arrays.asList(persons)); // this will sort by Comparable - sorting by age
            printPersonArray(persons);

            Person[] persons1 = new Person[]{p1, p2, p3};
            Collections.sort(Arrays.asList(persons1), (person1, person2)->
                    person1.getName().compareTo(person2.getName()));
            printPersonArray(persons1); // sorted by name

        }
        private static void printPersonArray(Person[] persons) {
            for(int i=0;i<persons.length;i++) {
                System.out.print(persons[i]);
            }
            System.out.println();
        }
        private static class Person implements Comparable<Person> {
            private final String name;
            private final int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return "["+name + ", " + age+"]";
            }

            @Override
            public int compareTo(Person p) {
                return age - p.age;
            }
        }
    }
    ```

    output:

    ```bash
    [C, 1][B, 2][A, 3]
    [A, 3][B, 2][C, 1]
    ```

* sorting arrays
  * Custom `Comparator` given in `Arrays#sort` is given more preferenece over `Comparable` which the `Person` class implements.
  * Sorting an array with custom comparator seems to be not possible in java. See [this](https://stackoverflow.com/questions/3699141/how-to-sort-an-array-of-ints-using-a-custom-comparator). 

    ```java
    import java.util.Arrays;

    public class ArraysSortExample {
        public static void main(String[] args) {
            Person p1 = new Person("A", 3);
            Person p2 = new Person("B", 2);
            Person p3 = new Person("C", 1);

            Person[] persons = new Person[]{p1, p2, p3};
            Arrays.sort(persons); // this will sort by Comparable - sorting by age
            printPersonArray(persons);

            Person[] persons1 = new Person[]{p1, p2, p3};
            Arrays.sort(persons1, (person1, person2)-> person1.getName().compareTo(person2.getName()));
            printPersonArray(persons1); // sorted by name

        }
        private static void printPersonArray(Person[] persons) {
            for(int i=0;i<persons.length;i++) {
                System.out.print(persons[i]);
            }
            System.out.println();
        }
        private static class Person implements Comparable<Person> {
            private final String name;
            private final int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return "["+name + ", " + age+"]";
            }

            @Override
            public int compareTo(Person p) {
                return age - p.age;
            }
        }
    }

    ```

    output:

    ```bash
    [C, 1][B, 2][A, 3]
    [A, 3][B, 2][C, 1]
    ```

_________________________________

## floor/ceil operations in a  sorted data structure

_________________________________

## Signed and unsigned bitwise operators

_________________________________

## creating copy of a list

_________________________________

## Map - `java.util.Map`

* `TreeMap`
* `HashMap`
> All hash-based collections assume that an object’s hash value does not change while it is in use as a key in the collection.
_________________________________

## Set - `java.util.Set`

_________________________________

## BitSet - `java.util.BitSet` 

* Constructors
    * `BitSet bitSet = new BitSet(1000);` - creates a `BitSet` with `1000` bits. All are set to `false` initially. (You can even do `bitSet.set(1100, true);` - the `BitSet` will expand automatically.)
	* `BitSet bitSet = new BitSet();` - creates an empty `BitSet` with all bits `false` initially.
* Utility methods
	* `clear(index)` sets the bit at `index` to `false`
	* `set(index)` sets the bit at `index` to `true`
	* `set(index, value)` sets the bit at `index` to `value` (value is `boolean`)
	* `length()` - Returns the "logical size" of this BitSet: the index of the highest set bit in the BitSet plus one. Returns zero if the BitSet contains no set bits.
	* `flip(int fromIndex, int toIndex)` Sets each bit from the specified fromIndex (inclusive) to the specified toIndex (exclusive) to the complement of its current value.
_________________________________

## Stack In Java

* Use `java.util.Deque` for Stack

    ```java
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(10); // push 10 at the top of the stack
    stack.pop(); // pop the top of the stack
    stack.peek(); // peek on the top of the stack (without removing it)
    // stack.peek() is same as stack.peekFirst()
    ```

_________________________________

## Queue In Java

* Use `java.util.Deque` for Queues

    ```java
    Deque<Integer> queue = new ArrayDeque<>();
    queue.offer(10); // enqueues 10 in the queue at front
    queue.poll(); // dequeues the front of the queue
    queue.peek(); // peek in the front of the queue (without removing it)
    // queue.peek() is same as queue.peekFirst()
    ```

_________________________________

# Questions that you need to ask

* Clarify the problem
* What are your assumptions regarding the problem/input.
  * Ask interviewer if he/she is fine with these assumptions
* propose a solution
  * A brute force solution
  * An optimized version
* State the time complexity and space complexity
* What if there are multiple solutions that exists
  * should you return any solution?
  * should you return a specific one?
  * should you return all the solutions?