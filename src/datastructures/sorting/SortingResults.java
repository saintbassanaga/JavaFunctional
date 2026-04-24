package datastructures.sorting;

public class SortingResults {

    // Task 01 — Merge Sort {38,27,43,3,9,82,10}
    public static final int[] TASK_01_MERGE_SORT = {3, 9, 10, 27, 38, 43, 82};

    // Task 02 — Quick Sort {10,7,8,9,1,5}
    public static final int[] TASK_02_QUICK_SORT = {1, 5, 7, 8, 9, 10};

    // Task 03 — Heap Sort {12,11,13,5,6,7}
    public static final int[] TASK_03_HEAP_SORT = {5, 6, 7, 11, 12, 13};

    // Task 04 — Counting Sort {4,2,2,8,3,3,1} k=9
    public static final int[] TASK_04_COUNTING_SORT = {1, 2, 2, 3, 3, 4, 8};

    // Task 05 — Radix Sort (LSD) {170,45,75,90,802,24,2,66}
    public static final int[] TASK_05_RADIX_SORT = {2, 24, 45, 66, 75, 90, 170, 802};

    // Task 06 — QuickSelect: 3rd largest in {3,2,1,5,6,4}
    // Sorted desc: [6,5,4,3,2,1] → 3rd = 4
    public static final int TASK_06_KTH_LARGEST = 4;

    // Task 07 — Sort By Parity: evens first, odds after, relative order preserved
    // {3,1,2,4} → {2,4,3,1}
    public static final int[] TASK_07_PARITY = {2, 4, 3, 1};

    // Task 08 — Wiggle Sort {1,5,1,1,6,4}: one valid arrangement
    // Satisfies: nums[0]≤nums[1]≥nums[2]≤nums[3]…
    public static final int[] TASK_08_WIGGLE = {1, 6, 1, 5, 1, 4};

    // Task 09 — Largest Number from {3,30,34,5,9}
    // Comparator: (a,b) → (b+a).compareTo(a+b)
    // 9 > 5 > 34 > 3 > 30 → "9534330"
    public static final String TASK_09_LARGEST_NUM = "9534330";

    // Task 10 — Sort Linked List 4->2->1->3 via Merge Sort
    public static final String TASK_10_SORTED_LIST = "1->2->3->4";
}
