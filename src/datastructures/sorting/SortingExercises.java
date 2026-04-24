package datastructures.sorting;

public class SortingExercises {

    /*
     * SORTING ALGORITHMS — 10 TASKS
     *
     * Données : ArrayInput.ARR_GENERAL, ARR_WITH_NEGS et tableaux inline.
     *
     * Conventions :
     *   - [IN-PLACE]   = O(1) espace auxiliaire (hors pile de récursion).
     *   - [STABLE]     = l'ordre relatif des éléments égaux est préservé.
     *   - Indique systématiquement : complexité temps best/average/worst + complexité espace.
     */

    public static final String[] TASKS = {

        "01. [STABLE] Implémente Merge Sort sur un int[]. " +
            "Complexité : O(n log n) temps, O(n) espace. " +
            "Test : {38,27,43,3,9,82,10} → {3,9,10,27,38,43,82}.",

        "02. [IN-PLACE] Implémente Quick Sort avec pivot = dernier élément (schéma de Lomuto). " +
            "Complexité : O(n log n) moyenne, O(n²) worst, O(log n) espace (pile). " +
            "Test : {10,7,8,9,1,5} → {1,5,7,8,9,10}.",

        "03. [IN-PLACE] Implémente Heap Sort. " +
            "Complexité : O(n log n) garanti, O(1) espace. " +
            "Test : {12,11,13,5,6,7} → {5,6,7,11,12,13}.",

        "04. Counting Sort pour entiers dans [0, k] avec k=9 : {4,2,2,8,3,3,1} → {1,2,2,3,3,4,8}. " +
            "Complexité : O(n+k). Non-comparatif.",

        "05. Radix Sort (LSD) pour entiers non-négatifs : {170,45,75,90,802,24,2,66} → {2,24,45,66,75,90,170,802}. " +
            "O(n·d) où d = nombre de chiffres du max. Utilise Counting Sort comme sous-routine.",

        "06. QuickSelect : trouve le kème plus grand élément (k=3) dans {3,2,1,5,6,4} → 4. " +
            "O(n) moyen, O(1) espace. Partition de Lomuto. " +
            "Ne trie pas le tableau entier.",

        "07. Sort By Parity : {3,1,2,4} → les pairs d'abord puis les impairs, ordre relatif conservé. " +
            "Résultat : {2,4,3,1}. [STABLE, O(n), O(1) extra espace].",

        "08. Wiggle Sort : réarrange {1,5,1,1,6,4} pour que nums[0]≤nums[1]≥nums[2]≤nums[3]… " +
            "Résultat possible : {1,6,1,5,1,4}. [IN-PLACE, O(n)].",

        "09. Largest Number : arrange {3,30,34,5,9} pour former le plus grand nombre. " +
            "Résultat : '9534330'. Comparateur custom : (a,b) → (b+a).compareTo(a+b). O(n log n).",

        "10. [DÉFI] Sort a Linked List en utilisant Merge Sort : O(n log n) temps, O(log n) espace " +
            "(pile de récursion uniquement, pas de tableau). " +
            "Input : 4->2->1->3 → 1->2->3->4. " +
            "Utilise la classe ListNode de LinkedListInput."
    };

    public static void main(String[] args) {
        for (String task : TASKS) System.out.println(task);
    }
}
