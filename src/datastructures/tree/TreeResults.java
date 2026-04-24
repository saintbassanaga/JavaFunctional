package datastructures.tree;

import java.util.List;

public class TreeResults {

    // Task 01 — Inorder of TREE_BST
    public static final List<Integer> TASK_01_INORDER = List.of(1, 2, 3, 4, 5, 7, 8, 9, 10);

    // Task 02 — Preorder of TREE_1
    public static final List<Integer> TASK_02_PREORDER = List.of(1, 2, 4, 5, 3, 6);

    // Task 03 — Postorder of TREE_1
    public static final List<Integer> TASK_03_POSTORDER = List.of(4, 5, 2, 6, 3, 1);

    // Task 04 — Level-order of TREE_1 → [[1],[2,3],[4,5,6]]
    public static final List<List<Integer>> TASK_04_LEVEL_ORDER =
            List.of(List.of(1), List.of(2, 3), List.of(4, 5, 6));

    // Task 05 — Zigzag level-order of TREE_1 → [[1],[3,2],[4,5,6]]
    public static final List<List<Integer>> TASK_05_ZIGZAG =
            List.of(List.of(1), List.of(3, 2), List.of(4, 5, 6));

    // Task 06 — Right side view of TREE_1
    public static final List<Integer> TASK_06_RIGHT_VIEW = List.of(1, 3, 6);

    // Task 07 — Height of TREE_1 (3 levels)
    public static final int TASK_07_HEIGHT = 3;

    // Task 08 — TREE_SYMMETRIC is symmetric
    public static final boolean TASK_08_SYMMETRIC = true;

    // Task 09 — Diameter of TREE_1: path 4->2->1->3->6 = 4 edges
    public static final int TASK_09_DIAMETER = 4;

    // Task 10 — TREE_BST is balanced (all subtree height diffs ≤ 1)
    public static final boolean TASK_10_BALANCED = true;

    // Task 11 — Path sum 22 exists in TREE_PATH (5->4->11->2)
    public static final boolean TASK_11_PATH_EXISTS = true;

    // Task 12 — All paths summing to 22 in TREE_PATH
    public static final List<List<Integer>> TASK_12_ALL_PATHS =
            List.of(List.of(5, 4, 11, 2));

    // Task 13 — LCA in TREE_BST
    public static final int TASK_13_LCA_2_8 = 5;  // LCA(2,8) = root 5
    public static final int TASK_13_LCA_2_4 = 3;  // LCA(2,4) = node 3

    // Task 15 — Count Good Nodes in TREE_BST
    // Good = no ancestor has a greater value: nodes 5,8,9,10 qualify
    public static final int TASK_15_GOOD_NODES = 4;

    // Task 16 — Maximum Path Sum in TREE_MAX_PATH (15->20->7 = 42)
    public static final int TASK_16_MAX_PATH_SUM = 42;

    // Task 17 — TREE_BST is a valid BST
    public static final boolean TASK_17_VALID_BST = true;

    // Task 18 — Kth Smallest in TREE_BST for k=3
    // Inorder: [1,2,3,4,5,7,8,9,10] → 3rd = 3
    public static final int TASK_18_KTH_SMALLEST = 3;

    // Task 20 — Serialized TREE_1 (DFS preorder, '#' = null)
    public static final String TASK_20_SERIALIZED = "1,2,4,#,#,5,#,#,3,#,6,#,#";
}
