package datastructures.linkedlist;

public class LinkedListExercises {

    /*
     * LINKED LIST — 20 TASKS
     *
     * Data : LinkedListInput.java  (ListNode, RandomNode, pre-built lists)
     *
     * Conventions :
     *   - [O(1) space] = pas de structure auxiliaire, seulement des pointeurs.
     *   - [ONE PASS]   = parcours unique de la liste.
     *   - Implémente chaque opération comme une méthode statique.
     */

    public static final String[] TASKS = {

        // --- Opérations de base ---
        "01. Implémente insertAtHead(head, val), insertAtTail(head, val), deleteByValue(head, val), " +
            "printList(head). Teste sur LIST_1().",

        // --- Inversion ---
        "02. [O(1) space] Inverse LIST_1() itérativement. Retourne le nouveau head. Résultat : 5->4->3->2->1.",
        "03. [O(1) space] Inverse LIST_1() récursivement. Même résultat attendu.",
        "04. [O(1) space] Inverse par groupes de k=2 : LIST_1() → 2->1->4->3->5. Gère le cas où les noeuds restants < k.",

        // --- Détection de cycle ---
        "05. Détecte si LIST_WITH_CYCLE() contient un cycle (algorithme de Floyd tortue/lièvre). Retourne boolean.",
        "06. Trouve le nœud de départ du cycle dans LIST_WITH_CYCLE() (extension de Floyd). Retourne ListNode.",

        // --- Milieu / suppression ---
        "07. [ONE PASS] Trouve le nœud du milieu de LIST_1() (slow/fast pointer). Retourne ListNode val=3.",
        "08. [ONE PASS] Supprime le nième nœud depuis la fin de LIST_1() pour n=2. Résultat : 1->2->3->5.",

        // --- Fusion / tri ---
        "09. Fusionne LIST_SORTED_A() et LIST_SORTED_B() en une liste triée. [O(1) space]",
        "10. Trie LIST_PARTITION() en utilisant le tri fusion (merge sort). O(n log n), O(1) espace hors récursion.",

        // --- Palindrome / doublons ---
        "11. Vérifie si LIST_PALINDROME() est un palindrome [O(1) espace : inverse la 2ème moitié, compare, restaure].",
        "12. Supprime les doublons de LIST_DUPS() (liste triée). Résultat : 1->2->3->4->5. [O(1) espace]",
        "13. Supprime TOUS les nœuds dont la valeur apparaît en doublon dans LIST_DUPS(). " +
            "Résultat : 1->2->3->4->5 → attend : <none des dupliqués> = 1->2->3->4->5 " +
            "Attends : {1,2,3,4,5} → supprime 1,3,4 car répétés → garde seulement 2 et 5.",

        // --- Opérations arithmétiques ---
        "14. Addition de deux nombres stockés en ordre inverse dans des listes : " +
            "L1 = 2->4->3 (342), L2 = 5->6->4 (465) → résultat = 7->0->8 (807).",

        // --- Partition ---
        "15. Partitionne LIST_PARTITION() autour de x=5 : tous les nœuds < 5 avant, ≥ 5 après, " +
            "en conservant l'ordre relatif dans chaque groupe.",

        // --- Rotation ---
        "16. Fait pivoter LIST_1() de k=2 positions vers la droite. Résultat : 4->5->1->2->3.",

        // --- Intersection ---
        "17. Trouve le nœud d'intersection de deux listes qui se rejoignent. " +
            "Construit : A = 4->1->8->4->5, B = 5->6->1->8->4->5 (se rejoignent au nœud val=8). " +
            "Retourne le nœud d'intersection sans modifier les listes.",

        // --- Deep copy ---
        "18. Deep copy d'une liste avec pointeur random : chaque RandomNode a next et random. " +
            "Construit : 7->13->11->10->1 avec randoms pointant vers des nœuds variés. " +
            "Retourne la copie sans utiliser de HashMap (astuce : entrelacement de nœuds). O(1) espace.",

        // --- LRU Cache ---
        "19. Implémente un LRU Cache capacity=3 avec get(key) et put(key,value) en O(1). " +
            "Utilise une HashMap + une doubly-linked list (pas les classes Java). " +
            "Vérifie : put(1,1), put(2,2), put(3,3), get(1)=1, put(4,4) → évince key=2, get(2)=-1.",

        // --- Aplatissement ---
        "20. Aplatit une liste doublement chaînée multi-niveaux : chaque nœud peut avoir un child " +
            "qui est lui-même la tête d'une autre liste. Résultat : liste plate en ordre de profondeur d'abord. " +
            "Exemple : 1-2-3-4-5-6, avec 3.child = 7-8-9-10, 8.child = 11-12 " +
            "→ 1->2->3->7->8->11->12->9->10->4->5->6."
    };

    public static void main(String[] args) {
        for (String task : TASKS) System.out.println(task);
    }
}
