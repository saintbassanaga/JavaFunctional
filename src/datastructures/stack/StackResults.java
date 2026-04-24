package datastructures.stack;

public class StackResults {

    // Task 02 — MinStack: push(5,3,7,3,2,1), getMin()=1, pop(), getMin()=2, pop(), getMin()=3
    public static final int TASK_02_MIN_INITIAL = 1;
    public static final int TASK_02_MIN_AFTER_POP_1 = 2;
    public static final int TASK_02_MIN_AFTER_POP_2 = 3;

    // Task 03 — Valid Parentheses
    public static final boolean TASK_03_VALID_1 = true;   // ({[]})
    public static final boolean TASK_03_VALID_2 = false;  // ([)]
    public static final boolean TASK_03_VALID_3 = true;   // {[]}

    // Task 04 — validate push/pop sequence
    // pushed={1,2,3,4,5}, popped={4,5,3,2,1} → true
    // pushed={1,2,3,4,5}, popped={4,3,5,1,2} → false
    public static final boolean TASK_04_SEQ_1 = true;
    public static final boolean TASK_04_SEQ_2 = false;

    // Task 05 — RPN evaluation
    // ["2","1","+","3","*"] = (2+1)*3 = 9
    // ["4","13","5","/","+"] = 4 + 13/5 = 6
    public static final int TASK_05_RPN_1 = 9;
    public static final int TASK_05_RPN_2 = 6;

    // Task 06 — Next Greater Element for {2,1,2,4,3,5,1}
    public static final int[] TASK_06_NGE = {4, 2, 4, 5, 5, -1, -1};

    // Task 07 — Daily Temperatures for {73,74,75,71,69,72,76,73}
    public static final int[] TASK_07_TEMPS = {1, 1, 4, 2, 1, 1, 0, 0};

    // Task 08 — Largest Rectangle in Histogram {2,1,5,6,2,3}
    public static final int TASK_08_HIST = 10;

    // Task 09 — Max Rectangle in BINARY_MATRIX
    // Row-by-row histogram: max area = 6 (row 2, cols 2-4 at height 2)
    public static final int TASK_09_MATRIX = 6;

    // Task 10 — Decode String
    public static final String TASK_10_DECODE_1 = "accaccacc";   // 3[a2[c]]
    public static final String TASK_10_DECODE_2 = "abcabccdcdcdef"; // 2[abc]3[cd]ef

    // Task 11 — Simplify Unix path
    public static final String TASK_11_PATH_1 = "/c";         // /a/./b/../../c/
    public static final String TASK_11_PATH_2 = "/";          // /../
    public static final String TASK_11_PATH_3 = "/home/foo";  // /home//foo/

    // Task 12 — Remove All Adjacent Duplicates
    public static final String TASK_12_DUP_1 = "ca";  // abbaca
    public static final String TASK_12_DUP_2 = "ay";  // azxxzy
}
