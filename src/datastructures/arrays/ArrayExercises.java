package datastructures.arrays;

public class ArrayExercises {

    /*
     * ARRAYS — 25 TASKS
     *
     * Data : ArrayInput.java
     *
     * Conventions :
     *   - Indique la complexité O(?) attendue dans ta solution.
     *   - Les tâches marquées [IN-PLACE] ne doivent pas allouer de tableau supplémentaire.
     *   - Les tâches marquées [O(1) space] excluent le tableau de sortie.
     */

    public static final String[] TASKS = {

        // --- Fondamentaux ---
        "01. [IN-PLACE] Inverse ARR_GENERAL sur place. Retourne le tableau modifié.",
        "02. [IN-PLACE] Fais pivoter ARR_GENERAL de k=3 positions vers la droite sans tableau auxiliaire. " +
            "Astuce : triple inversion. Retourne le tableau modifié.",
        "03. Recherche binaire dans SORTED_1 pour target=9. Retourne l'index ou -1. Complexité O(log n).",
        "04. Recherche dans ROTATED_SORTED pour target=0. Retourne l'index. Complexité O(log n).",
        "05. Trouve le minimum dans ROTATED_SORTED. Complexité O(log n).",

        // --- Two-pointer ---
        "06. [IN-PLACE] Déplace tous les zéros de ARR_WITH_ZEROS à la fin en conservant l'ordre des non-zéros.",
        "07. Container with most water : deux colonnes de hauteurs données par ARR_GENERAL (premiers 6 éléments), " +
            "trouve la paire d'indices qui maximise l'aire. Complexité O(n).",
        "08. Three Sum : trouve tous les triplets uniques de ARR_WITH_NEGS dont la somme vaut 0. " +
            "Complexité O(n²), sans doublons.",
        "09. [O(1) space] Fusionne SORTED_1 et SORTED_2 en un seul tableau trié in-place " +
            "(imagine SORTED_1 a n+m slots, les m derniers étant libres).",

        // --- Sliding window ---
        "10. Somme maximale d'un sous-tableau continu de taille k=3 dans ARR_GENERAL. Complexité O(n).",
        "11. Longueur du plus long sous-tableau dont la somme est ≤ 15 dans ARR_GENERAL. Complexité O(n).",

        // --- Sous-tableau / sous-séquence ---
        "12. Maximum Subarray (Kadane) : retourne la somme maximale d'un sous-tableau continu dans ARR_WITH_NEGS. " +
            "Complexité O(n).",
        "13. [O(1) space] Produit de tableau sauf soi-même : pour ARR_GENERAL retourne un tableau " +
            "output[i] = produit de tous les éléments sauf arr[i], sans division.",
        "14. Longest Consecutive Sequence dans ARR_GENERAL. Retourne la longueur. Complexité O(n) via HashSet.",

        // --- Stock ---
        "15. Best Time to Buy and Sell Stock (une seule transaction) sur STOCK_PRICES. Retourne le profit max.",
        "16. Best Time to Buy and Sell Stock II (transactions multiples) sur STOCK_PRICES_2. Retourne le profit total.",

        // --- Doublons / fréquences ---
        "17. Trouve tous les doublons dans ARR_DUPS en O(n) et O(1) espace (valeurs dans [1,n]). " +
            "Astuce : utilise le signe de l'élément à l'index valeur-1.",
        "18. Majority Element dans {3,2,3,1,2,3,3} : l'élément apparaissant > n/2 fois. " +
            "Algorithme de Boyer-Moore O(n) O(1).",

        // --- Tris spéciaux ---
        "19. [IN-PLACE] Sort Colors (Dutch National Flag) sur ARR_012 : trie les 0, 1, 2 en un seul passage. O(n) O(1).",
        "20. Kth Largest Element dans ARR_GENERAL pour k=3 via QuickSelect. Complexité O(n) moyenne.",

        // --- 2D ---
        "21. Retourne tous les éléments de MATRIX_3X3 en ordre spiral (→↓←↑).",
        "22. Nombre maximum de 1s consécutifs dans BINARY_MATRIX ligne par ligne.",

        // --- Eau / histogram ---
        "23. Trapping Rain Water sur HEIGHTS : calcule le volume total d'eau piégée. O(n) O(1) (two-pointer).",
        "24. Largest Rectangle in Histogram sur HISTOGRAM via pile monotone. O(n).",

        // --- Intervalles ---
        "25. Merge Intervals : fusionne tous les intervalles qui se chevauchent dans INTERVALS. " +
            "Retourne List<int[]> triée. O(n log n)."
    };

    public static void main(String[] args) {
        for (String task : TASKS) System.out.println(task);
    }
}
