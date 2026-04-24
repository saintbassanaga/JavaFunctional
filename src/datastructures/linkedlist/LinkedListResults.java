package datastructures.linkedlist;

import java.util.List;

public class LinkedListResults {

    // Task 02 — reverse LIST_1 {1,2,3,4,5}
    public static final String TASK_02 = "5->4->3->2->1";

    // Task 04 — reverse by groups of k=2
    public static final String TASK_04 = "2->1->4->3->5";

    // Task 05 — LIST_WITH_CYCLE has cycle
    public static final boolean TASK_05 = true;

    // Task 06 — cycle start node value in LIST_WITH_CYCLE (val=2)
    public static final int TASK_06_CYCLE_START_VAL = 2;

    // Task 07 — middle of LIST_1 {1,2,3,4,5} → node val=3
    public static final int TASK_07_MIDDLE_VAL = 3;

    // Task 08 — remove 2nd from end of LIST_1 → 1->2->3->5
    public static final String TASK_08 = "1->2->3->5";

    // Task 09 — merge LIST_SORTED_A {1,3,5,7,9} and LIST_SORTED_B {2,4,6,8}
    public static final String TASK_09 = "1->2->3->4->5->6->7->8->9";

    // Task 11 — LIST_PALINDROME {1,2,3,2,1} is palindrome
    public static final boolean TASK_11 = true;

    // Task 12 — remove dups from sorted LIST_DUPS {1,1,2,3,3,4,4,5}
    public static final String TASK_12 = "1->2->3->4->5";

    // Task 13 — remove ALL duplicate-valued nodes from {1,1,2,3,3,4,4,5}
    // 1 appears twice, 3 appears twice, 4 appears twice → only 2 and 5 remain
    public static final String TASK_13 = "2->5";

    // Task 14 — add 342 + 465 = 807 stored as reversed lists
    public static final String TASK_14 = "7->0->8";

    // Task 16 — rotate LIST_1 {1,2,3,4,5} by k=2 right
    public static final String TASK_16 = "4->5->1->2->3";

    // Task 17 — intersection node value (the shared node has val=8)
    public static final int TASK_17_INTERSECTION_VAL = 8;

    // Task 19 — LRU cache capacity=3
    // put(1,1), put(2,2), put(3,3), get(1)=1, put(4,4) evicts key=2, get(2)=-1
    public static final int TASK_19_GET_1 = 1;
    public static final int TASK_19_GET_2_AFTER_EVICTION = -1;

    // Task 20 — flatten multilevel doubly linked list
    // 1-2-3-4-5-6 with 3.child=7-8-9-10, 8.child=11-12
    public static final List<Integer> TASK_20_FLAT =
            List.of(1, 2, 3, 7, 8, 11, 12, 9, 10, 4, 5, 6);
}
