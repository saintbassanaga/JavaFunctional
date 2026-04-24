package datastructures.arrays;

public class ArrayInput {

    // General unsorted arrays
    public static final int[] ARR_GENERAL      = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
    public static final int[] ARR_WITH_NEGS    = {-2, 1, -3, 4, -1, 2, 1, -5, 4};  // Kadane classic
    public static final int[] ARR_WITH_ZEROS   = {0, 1, 0, 3, 12, 0, 7};
    public static final int[] ARR_012           = {2, 0, 2, 1, 1, 0, 2, 1, 0};      // Dutch flag
    public static final int[] ARR_DUPS          = {4, 3, 2, 7, 8, 2, 3, 1};         // duplicates [1-n]

    // Sorted arrays
    public static final int[] SORTED_1          = {1, 3, 5, 7, 9, 11, 13, 15};
    public static final int[] SORTED_2          = {2, 4, 6, 8, 10, 12};
    public static final int[] ROTATED_SORTED    = {4, 5, 6, 7, 0, 1, 2};            // rotated at index 4

    // Domain arrays
    public static final int[] HEIGHTS           = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; // rain water
    public static final int[] HISTOGRAM         = {2, 1, 5, 6, 2, 3};               // largest rectangle
    public static final int[] STOCK_PRICES      = {7, 1, 5, 3, 6, 4};              // buy/sell stock
    public static final int[] STOCK_PRICES_2    = {1, 2, 3, 4, 5};                 // all increasing

    // 2D arrays
    public static final int[][] MATRIX_3X3      = {{1,2,3},{4,5,6},{7,8,9}};
    public static final int[][] BINARY_MATRIX   = {
            {1, 0, 1, 0, 0},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0}
    };

    // Interval arrays  [start, end]
    public static final int[][] INTERVALS = {{1,3},{2,6},{8,10},{15,18}};

    // Two-sum / k-sum targets
    public static final int TWO_SUM_TARGET   = 9;
    public static final int THREE_SUM_TARGET = 0;
}
