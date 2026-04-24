package datastructures.tree;

public class TreeInput {

    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) { this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    /*
     * TREE_1  — arbre général
     *
     *         1
     *        / \
     *       2   3
     *      / \   \
     *     4   5   6
     */
    public static TreeNode TREE_1() {
        return new TreeNode(1,
            new TreeNode(2, new TreeNode(4), new TreeNode(5)),
            new TreeNode(3, null, new TreeNode(6)));
    }

    /*
     * TREE_BST — BST valide
     *
     *         5
     *        / \
     *       3   8
     *      / \ / \
     *     2  4 7  9
     *    /       \
     *   1        10
     */
    public static TreeNode TREE_BST() {
        TreeNode n1  = new TreeNode(1);
        TreeNode n2  = new TreeNode(2, n1, null);
        TreeNode n4  = new TreeNode(4);
        TreeNode n3  = new TreeNode(3, n2, n4);
        TreeNode n7  = new TreeNode(7);
        TreeNode n10 = new TreeNode(10);
        TreeNode n9  = new TreeNode(9, null, n10);
        TreeNode n8  = new TreeNode(8, n7, n9);
        return new TreeNode(5, n3, n8);
    }

    /*
     * TREE_PATH — pour path sum
     *
     *         5
     *        / \
     *       4   8
     *      /   / \
     *     11  13  4
     *    /  \      \
     *   7    2      1
     *
     * Chemin racine→feuille sommant à 22 : 5->4->11->2
     */
    public static TreeNode TREE_PATH() {
        return new TreeNode(5,
            new TreeNode(4,
                new TreeNode(11, new TreeNode(7), new TreeNode(2)),
                null),
            new TreeNode(8,
                new TreeNode(13),
                new TreeNode(4, null, new TreeNode(1))));
    }

    /*
     * TREE_SYMMETRIC
     *
     *       1
     *      / \
     *     2   2
     *    / \ / \
     *   3  4 4  3
     */
    public static TreeNode TREE_SYMMETRIC() {
        return new TreeNode(1,
            new TreeNode(2, new TreeNode(3), new TreeNode(4)),
            new TreeNode(2, new TreeNode(4), new TreeNode(3)));
    }

    /*
     * TREE_MAX_PATH — pour maximum path sum
     *
     *      -10
     *      / \
     *     9  20
     *       /  \
     *      15   7
     *
     * Max path = 15->20->7 = 42
     */
    public static TreeNode TREE_MAX_PATH() {
        return new TreeNode(-10,
            new TreeNode(9),
            new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    }
}
