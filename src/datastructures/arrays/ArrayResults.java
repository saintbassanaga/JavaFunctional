package datastructures.arrays;

import java.util.List;

public class ArrayResults {

    /*
     * ANSWER KEY — ArrayExercises
     * ARR_GENERAL   = {3,1,4,1,5,9,2,6,5,3,5}
     * ARR_WITH_NEGS = {-2,1,-3,4,-1,2,1,-5,4}
     * ARR_WITH_ZEROS= {0,1,0,3,12,0,7}
     * ARR_012       = {2,0,2,1,1,0,2,1,0}
     * ARR_DUPS      = {4,3,2,7,8,2,3,1}
     * SORTED_1      = {1,3,5,7,9,11,13,15}
     * SORTED_2      = {2,4,6,8,10,12}
     * ROTATED_SORTED= {4,5,6,7,0,1,2}
     * HEIGHTS       = {0,1,0,2,1,0,1,3,2,1,2,1}
     * HISTOGRAM     = {2,1,5,6,2,3}
     * STOCK_PRICES  = {7,1,5,3,6,4}
     * STOCK_PRICES_2= {1,2,3,4,5}
     */

    // 01. Reverse ARR_GENERAL
    public static final int[] TASK_01_REVERSED = {5,3,5,6,2,9,5,1,4,1,3};

    // 03. Binary search SORTED_1 target=9 → index 4
    public static final int TASK_03_INDEX = 4;

    // 04. Search in ROTATED_SORTED target=0 → index 4
    public static final int TASK_04_INDEX = 4;

    // 05. Min in ROTATED_SORTED = 0
    public static final int TASK_05_MIN = 0;

    // 06. ARR_WITH_ZEROS after move zeros: {1,3,12,7,0,0,0}
    public static final int[] TASK_06_RESULT = {1,3,12,7,0,0,0};

    // 10. Max sum subarray size k=3 in ARR_GENERAL = 9+2+6=17? Wait:
    //  windows: [3,1,4]=8, [1,4,1]=6, [4,1,5]=10, [1,5,9]=15, [5,9,2]=16, [9,2,6]=17, [2,6,5]=13, [6,5,3]=14, [5,3,5]=13
    //  max = 17
    public static final int TASK_10_MAX_SUM_K3 = 17;

    // 12. Kadane on ARR_WITH_NEGS = {-2,1,-3,4,-1,2,1,-5,4}
    //  max subarray = [4,-1,2,1] = 6
    public static final int TASK_12_MAX_SUBARRAY_SUM = 6;

    // 14. Longest consecutive sequence in ARR_GENERAL = {3,1,4,1,5,9,2,6,5,3,5}
    //  distinct: {1,2,3,4,5,6,9} → consecutive runs: 1-2-3-4-5-6 = length 6
    public static final int TASK_14_LONGEST_CONSECUTIVE = 6;

    // 15. Best time to buy/sell STOCK_PRICES = {7,1,5,3,6,4}
    //  buy at 1, sell at 6 → profit = 5
    public static final int TASK_15_MAX_PROFIT = 5;

    // 16. Multiple transactions on STOCK_PRICES_2 = {1,2,3,4,5}
    //  total profit = (2-1)+(3-2)+(4-3)+(5-4) = 4
    public static final int TASK_16_TOTAL_PROFIT = 4;

    // 18. Majority element in {3,2,3,1,2,3,3} = 3
    public static final int TASK_18_MAJORITY = 3;

    // 20. Kth largest k=3 in ARR_GENERAL = {3,1,4,1,5,9,2,6,5,3,5}
    //  sorted desc: 9,6,5,5,5,4,3,3,2,1,1 → kth=3 is 5
    public static final int TASK_20_KTH_LARGEST = 5;

    // 21. Spiral order of MATRIX_3X3 = {1,2,3,6,9,8,7,4,5}
    public static final int[] TASK_21_SPIRAL = {1,2,3,6,9,8,7,4,5};

    // 23. Trapping rain water on HEIGHTS = {0,1,0,2,1,0,1,3,2,1,2,1} = 6
    public static final int TASK_23_WATER = 6;

    // 24. Largest rectangle in HISTOGRAM = {2,1,5,6,2,3} = 10
    public static final int TASK_24_LARGEST_RECT = 10;

    // 25. Merge INTERVALS = {[1,3],[2,6],[8,10],[15,18]} → [[1,6],[8,10],[15,18]]
    public static final int[][] TASK_25_MERGED = {{1,6},{8,10},{15,18}};
}
