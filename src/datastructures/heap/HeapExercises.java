package datastructures.heap;

public class HeapExercises {

    /*
     * HEAP / PRIORITY QUEUE — 10 TASKS
     *
     * Convention : utilise java.util.PriorityQueue sauf quand la tâche demande
     * explicitement une implémentation from scratch.
     *
     * Données inline dans les tâches.
     */

    public static final String[] TASKS = {

        "01. [FROM SCRATCH] Implémente un MinHeap avec : insert(int), extractMin(), peekMin(), heapifyUp(), " +
            "heapifyDown(). Stockage : tableau int[]. Teste : insert(5,3,8,1,4), extractMin()=1, extractMin()=3.",

        "02. Kth Largest Element dans {3,2,1,5,6,4} pour k=2 via un MinHeap de taille k. " +
            "Résultat : 5. O(n log k).",

        "03. Kth Smallest Element dans {7,10,4,3,20,15} pour k=3 via un MaxHeap de taille k. " +
            "Résultat : 7. O(n log k).",

        "04. Merge K Sorted Arrays : fusionne [[1,4,5],[1,3,4],[2,6]] en [1,1,2,3,4,4,5,6]. " +
            "Min-heap de (valeur, index_tableau, index_dans_tableau). O(n log k).",

        "05. Top K Frequent Elements dans {1,1,1,2,2,3} pour k=2. Résultat : [1,2]. " +
            "HashMap de fréquences + MinHeap de taille k. O(n log k).",

        "06. Find Median from Data Stream : implémente MedianFinder avec addNum(int) et findMedian(). " +
            "addNum(1), addNum(2) → 1.5 ; addNum(3) → 2.0. " +
            "Deux PriorityQueues : maxHeap (moitié gauche) + minHeap (moitié droite). O(log n) par insertion.",

        "07. K Closest Points to Origin parmi [(1,3),(-2,2),(5,8),(0,1),(3,3)] pour k=2. " +
            "Résultat : [(0,1),(-2,2)] — distance² respectivement 1 et 8. " +
            "MaxHeap de taille k sur la distance euclidienne². O(n log k).",

        "08. Task Scheduler : tasks=['A','A','A','B','B','B'], n=2 (cooldown). " +
            "Nombre minimum d'intervalles = 8. " +
            "Greedy : MaxHeap des fréquences + queue des tâches en cooldown.",

        "09. Reorganize String : réarrange 'aab' → 'aba', 'aaab' → '' (impossible). " +
            "MaxHeap sur fréquences des caractères. À chaque étape, prends le char le plus fréquent " +
            "différent du précédent.",

        "10. Sliding Window Median : pour {1,3,-1,-3,5,3,6,7} et k=3, retourne [1.0,-1.0,-1.0,3.0,5.0,6.0]. " +
            "Deux heaps (maxHeap + minHeap) avec lazy deletion. O(n log k)."
    };

    public static void main(String[] args) {
        for (String task : TASKS) System.out.println(task);
    }
}
