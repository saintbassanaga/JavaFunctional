package datastructures.tree;

public class TreeExercises {

    /*
     * BINARY TREE — 20 TASKS
     *
     * Data : TreeInput.java  (TreeNode, TREE_1, TREE_BST, TREE_PATH, TREE_SYMMETRIC, TREE_MAX_PATH)
     *
     * Conventions :
     *   - [REC]  = résous récursivement
     *   - [ITER] = résous itérativement (avec une pile ou une file)
     *   - [BST]  = l'arbre est garanti être un BST valide
     */

    public static final String[] TASKS = {

        // --- Traversals ---
        "01. [REC + ITER] Inorder traversal de TREE_BST. " +
            "Résultat attendu : [1,2,3,4,5,7,8,9,10]. Les deux versions doivent produire le même résultat.",

        "02. [REC + ITER] Preorder traversal de TREE_1. " +
            "Résultat attendu : [1,2,4,5,3,6].",

        "03. [REC + ITER] Postorder traversal de TREE_1. " +
            "Résultat attendu : [4,5,2,6,3,1].",

        "04. Level-order traversal de TREE_1 : retourne List<List<Integer>>. " +
            "Résultat : [[1],[2,3],[4,5,6]]. Utilise une file (BFS).",

        "05. Zigzag level-order traversal de TREE_1 : niveaux pairs de gauche à droite, " +
            "niveaux impairs de droite à gauche. Résultat : [[1],[3,2],[4,5,6]].",

        "06. Right side view de TREE_1 : dernier nœud visible de chaque niveau. " +
            "Résultat : [1,3,6].",

        // --- Propriétés ---
        "07. Hauteur (profondeur maximale) de TREE_1. Résultat : 3.",

        "08. Vérifie si TREE_SYMMETRIC est symétrique. Résultat : true. " +
            "[REC] et [ITER] tous les deux.",

        "09. Diamètre de TREE_1 : la plus longue distance en nombre d'arêtes entre deux nœuds. " +
            "Résultat : 4 (4->2->1->3->6). O(n) avec une seule DFS.",

        "10. Vérifie si TREE_BST est un arbre équilibré (différence de hauteur ≤ 1 pour chaque nœud). " +
            "Résultat : true. O(n) : calcule hauteur et équilibre en un seul passage.",

        // --- Recherche / modification ---
        "11. Path Sum : existe-t-il un chemin racine→feuille dont la somme vaut 22 dans TREE_PATH ? " +
            "Résultat : true (5->4->11->2).",

        "12. All Path Sums : retourne tous les chemins racine→feuille dont la somme vaut 22 dans TREE_PATH. " +
            "Résultat : [[5,4,11,2]].",

        "13. Lowest Common Ancestor (LCA) de deux nœuds dans TREE_BST. " +
            "LCA(2,8)=5 ; LCA(2,4)=3. [BST version : O(log n)]",

        "14. [ITER + O(1) space] Inverse (miroir) TREE_1 in-place. " +
            "Résultat inorder après inversion : [6,3,1,5,4,2] → preorder : [1,3,6,2,5,4].",

        "15. Count Good Nodes dans TREE_BST : un nœud est 'good' si aucun ancêtre n'a une valeur supérieure. " +
            "Résultat : 4 (5,8,9,10 sont good).",

        // --- Chemins max ---
        "16. Maximum Path Sum dans TREE_MAX_PATH : le chemin peut commencer et finir n'importe où. " +
            "Résultat : 42 (15->20->7). O(n).",

        // --- BST ---
        "17. [BST] Valide qu'un arbre est bien un BST. TREE_BST → true. " +
            "Astuce : range [min, max] propagé à chaque nœud, pas d'inorder + mémoire.",

        "18. [BST] Kth Smallest Element dans TREE_BST pour k=3. Résultat : 3. " +
            "Inorder itératif O(k) temps, O(h) espace.",

        // --- Construction / sérialisation ---
        "19. Reconstruit un arbre depuis son preorder [1,2,4,5,3,6] et inorder [4,2,5,1,3,6]. " +
            "Retourne la racine. Résultat = TREE_1.",

        "20. Sérialise TREE_1 en String '1,2,4,#,#,5,#,#,3,#,6,#,#' (DFS preorder, '#' = null) " +
            "et désérialise la String pour reconstruire l'arbre identique."
    };

    public static void main(String[] args) {
        for (String task : TASKS) System.out.println(task);
    }
}
