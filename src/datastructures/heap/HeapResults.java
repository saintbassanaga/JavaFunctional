package datastructures.heap;

import java.util.List;

public class HeapResults {

    // Task 01 — MinHeap: insert(5,3,8,1,4), extractMin()=1, extractMin()=3
    public static final int TASK_01_EXTRACT_1 = 1;
    public static final int TASK_01_EXTRACT_2 = 3;

    // Task 02 — Kth Largest in {3,2,1,5,6,4} k=2
    // Sorted desc: [6,5,4,3,2,1] → 2nd = 5
    public static final int TASK_02_KTH_LARGEST = 5;

    // Task 03 — Kth Smallest in {7,10,4,3,20,15} k=3
    // Sorted asc: [3,4,7,10,15,20] → 3rd = 7
    public static final int TASK_03_KTH_SMALLEST = 7;

    // Task 04 — Merge K Sorted Arrays [[1,4,5],[1,3,4],[2,6]]
    public static final List<Integer> TASK_04_MERGED = List.of(1, 1, 2, 3, 4, 4, 5, 6);

    // Task 05 — Top 2 Frequent Elements in {1,1,1,2,2,3}
    public static final List<Integer> TASK_05_TOP_K = List.of(1, 2);

    // Task 06 — MedianFinder
    // addNum(1), addNum(2) → 1.5 ; addNum(3) → 2.0
    public static final double TASK_06_MEDIAN_AFTER_2 = 1.5;
    public static final double TASK_06_MEDIAN_AFTER_3 = 2.0;

    // Task 07 — K Closest Points to Origin k=2
    // Points: (1,3)→d²=10, (-2,2)→d²=8, (5,8)→d²=89, (0,1)→d²=1, (3,3)→d²=18
    // 2 closest: (0,1) and (-2,2)
    public static final int[][] TASK_07_CLOSEST = {{0, 1}, {-2, 2}};

    // Task 08 — Task Scheduler A,A,A,B,B,B n=2
    // Greedy: A-B-idle-A-B-idle-A-B = 8 intervals
    public static final int TASK_08_INTERVALS = 8;

    // Task 09 — Reorganize String
    public static final String TASK_09_REORGANIZE_AAB = "aba";
    public static final String TASK_09_REORGANIZE_AAAB = "";  // impossible

    // Task 10 — Sliding Window Median {1,3,-1,-3,5,3,6,7} k=3
    // [1,3,-1]→1.0, [3,-1,-3]→-1.0, [-1,-3,5]→-1.0, [-3,5,3]→3.0, [5,3,6]→5.0, [3,6,7]→6.0
    public static final double[] TASK_10_SLIDING_MEDIAN = {1.0, -1.0, -1.0, 3.0, 5.0, 6.0};
}
