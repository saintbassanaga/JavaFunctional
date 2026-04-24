package datastructures.stack;

public class StackInput {

    // Task 02 — MinStack push sequence
    public static final int[] MIN_STACK_PUSH = {5, 3, 7, 3, 2, 1};

    // Task 03 — Valid Parentheses
    public static final String PARENS_1 = "({[]})";  // valid
    public static final String PARENS_2 = "([)]";    // invalid
    public static final String PARENS_3 = "{[]}";    // valid

    // Task 04 — Validate push/pop sequence
    public static final int[] PUSH_SEQ        = {1, 2, 3, 4, 5};
    public static final int[] POP_SEQ_VALID   = {4, 5, 3, 2, 1};
    public static final int[] POP_SEQ_INVALID = {4, 3, 5, 1, 2};

    // Task 05 — Evaluate Reverse Polish Notation
    public static final String[] RPN_1 = {"2", "1", "+", "3", "*"};   // (2+1)*3 = 9
    public static final String[] RPN_2 = {"4", "13", "5", "/", "+"};  // 4+13/5 = 6

    // Task 06 — Next Greater Element
    public static final int[] NGE_ARR = {2, 1, 2, 4, 3, 5, 1};

    // Task 07 — Daily Temperatures
    public static final int[] TEMPERATURES = {73, 74, 75, 71, 69, 72, 76, 73};

    // Task 08 — Largest Rectangle in Histogram (same data as ArrayInput.HISTOGRAM)
    public static final int[] HISTOGRAM = {2, 1, 5, 6, 2, 3};

    // Task 10 — Decode String
    public static final String DECODE_1 = "3[a2[c]]";
    public static final String DECODE_2 = "2[abc]3[cd]ef";

    // Task 11 — Simplify Unix absolute path
    public static final String PATH_1 = "/a/./b/../../c/";
    public static final String PATH_2 = "/../";
    public static final String PATH_3 = "/home//foo/";

    // Task 12 — Remove All Adjacent Duplicates
    public static final String DUPS_1 = "abbaca";
    public static final String DUPS_2 = "azxxzy";
}