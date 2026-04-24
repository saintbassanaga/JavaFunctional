package datastructures.queue;

import java.util.List;

public class QueueResults {

    // Task 03 — Sliding Window Maximum {1,3,-1,-3,5,3,6,7} k=3
    public static final int[] TASK_03_SLIDING_MAX = {3, 3, 5, 5, 6, 7};

    // Task 04 — First Non-Repeating in stream 'aababc'
    // After each char: a=a, ab=a, aba=b, abab=b, abab(second a)=b, aababc=c
    public static final char[] TASK_04_STREAM = {'a', 'a', 'b', 'b', 'b', 'c'};

    // Task 05 — First 10 binary numbers via queue
    public static final String[] TASK_05_BINARY = {
            "1","10","11","100","101","110","111","1000","1001","1010"
    };

    // Task 06 — Rotten Oranges {{2,1,1},{1,1,0},{0,1,1}} → 4 minutes
    public static final int TASK_06_ROTTEN = 4;

    // Task 08 — Interleave halves of {1,2,3,4,5,6} → {1,4,2,5,3,6}
    public static final List<Integer> TASK_08_INTERLEAVED = List.of(1, 4, 2, 5, 3, 6);

    // Task 09 — Rate Limiter: maxRequests=3 per 1000ms window
    // isAllowed(1)=true, isAllowed(2)=true, isAllowed(3)=true,
    // isAllowed(4)=false (3 requests already in [1,1000]),
    // isAllowed(1002)=true (window slides, earlier requests expired)
    public static final boolean TASK_09_RL_1    = true;
    public static final boolean TASK_09_RL_2    = true;
    public static final boolean TASK_09_RL_3    = true;
    public static final boolean TASK_09_RL_4    = false;
    public static final boolean TASK_09_RL_1002 = true;
}
