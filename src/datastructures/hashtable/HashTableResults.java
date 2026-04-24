package datastructures.hashtable;

import java.util.List;

public class HashTableResults {

    // Task 02 — Two Sum {2,7,11,15} target=9 → indices [0,1]
    public static final int[] TASK_02_TWO_SUM = {0, 1};

    // Task 03 — Group Anagrams {"eat","tea","tan","ate","nat","bat"}
    public static final List<List<String>> TASK_03_ANAGRAMS = List.of(
            List.of("eat", "tea", "ate"),
            List.of("tan", "nat"),
            List.of("bat")
    );

    // Task 04 — Longest Substring Without Repeating Characters
    public static final int TASK_04_ABCABCBB = 3;   // "abc"
    public static final int TASK_04_BBBBB = 1;
    public static final int TASK_04_PWWKEW = 3;     // "wke"

    // Task 05 — Subarray Sum = k=2 in {1,1,1} → 2 subarrays
    public static final int TASK_05_SUBARRAY_COUNT = 2;

    // Task 06 — Longest Consecutive Sequence in {100,4,200,1,3,2} → 4 (1-2-3-4)
    public static final int TASK_06_CONSECUTIVE = 4;

    // Task 07 — Top 4 Frequent Words
    // Counts: the=3, is=3, sunny=2, day=1
    // Equal freq → lexicographic order: "is" < "the"
    public static final List<String> TASK_07_TOP_WORDS = List.of("is", "the", "sunny", "day");

    // Task 08 — First Unique Character
    public static final int TASK_08_LEETCODE = 0;       // 'l' at index 0
    public static final int TASK_08_LOVELEETCODE = 2;   // 'v' at index 2

    // Task 09 — Intersection of Two Arrays with multiplicity
    // {1,2,2,1} ∩ {2,2} → [2,2]
    public static final int[] TASK_09_INTERSECTION = {2, 2};

    // Task 10 — Isomorphic Strings
    public static final boolean TASK_10_EGG_ADD    = true;   // egg / add
    public static final boolean TASK_10_FOO_BAR    = false;  // foo / bar
    public static final boolean TASK_10_PAPER_TITLE = true;  // paper / title

    // Task 11 — Word Pattern
    public static final boolean TASK_11_ABBA_1 = true;   // abba / dog cat cat dog
    public static final boolean TASK_11_ABBA_2 = false;  // abba / dog cat cat fish

    // Task 12 — Minimum Window Substring 'ADOBECODEBANC' for 'ABC' → 'BANC'
    public static final String TASK_12_MIN_WINDOW = "BANC";

    // Task 13 — Subarrays with equal 0s and 1s in {0,1,0,1,1,0,0}
    // Transform 0→-1: prefix sums = [0,-1,0,-1,0,1,0,-1]
    // Count pairs with same prefix sum → 8 subarrays
    public static final int TASK_13_EQUAL_01 = 8;

    // Task 14 — 4Sum {1,0,-1,0,-2,2} target=0
    public static final List<List<Integer>> TASK_14_4SUM = List.of(
            List.of(-2, -1, 1, 2),
            List.of(-2, 0, 0, 2),
            List.of(-1, 0, 0, 1)
    );

    // Task 15 — Find All Anagrams: s='cbaebabacd', p='abc' → start indices [0,6]
    public static final List<Integer> TASK_15_ANAGRAM_INDICES = List.of(0, 6);
}
