package datastructures.queue;

public class QueueExercises {

    /*
     * QUEUE / DEQUE — 10 TASKS
     *
     * Rappel : une file est FIFO.
     *   - ArrayDeque est autorisé comme implémentation de Deque.
     *   - Les files custom doivent être implémentées from scratch.
     */

    public static final String[] TASKS = {

        "01. Implémente une Queue circulaire (Circular Queue) de capacité fixe k=5 avec : " +
            "enqueue(val), dequeue(), front(), rear(), isEmpty(), isFull(). " +
            "Utilise un tableau interne + deux pointeurs. Pas de java.util.*Queue.",

        "02. Implémente une Deque (double-ended queue) from scratch avec : " +
            "addFront(x), addRear(x), removeFront(), removeRear(), peekFront(), peekRear(), isEmpty(). " +
            "Stockage : tableau circulaire ou liste doublement chaînée.",

        "03. Sliding Window Maximum : pour {1,3,-1,-3,5,3,6,7} et k=3, retourne {3,3,5,5,6,7}. " +
            "Deque des indices (monotone décroissant). O(n).",

        "04. First Non-Repeating Character in Stream : pour le flux 'aababc', retourne à chaque étape " +
            "le premier caractère non répété : 'a','a','b','b','c','c'. " +
            "File + tableau de fréquences. O(n).",

        "05. Génère les N=10 premiers nombres binaires avec une file : " +
            "1→ enfile '10' et '11', 10→ enfile '100' et '101', etc. " +
            "Retourne [\"1\",\"10\",\"11\",\"100\",\"101\",\"110\",\"111\",\"1000\",\"1001\",\"1010\"].",

        "06. Rotten Oranges : grille 2D, 0=vide, 1=orange fraîche, 2=orange pourrie. " +
            "Grille : {{2,1,1},{1,1,0},{0,1,1}}. Retourne le nombre minimum de minutes pour pourrir " +
            "toutes les oranges, ou -1 si impossible. BFS multi-source. Résultat : 4.",

        "07. Level-order traversal d'un arbre binaire avec une file. " +
            "Retourne List<List<Integer>>. (Construit l'arbre depuis TreeInput — tâche de liaison " +
            "avec le module tree/.) O(n).",

        "08. Interleave les deux moitiés d'une file : {1,2,3,4,5,6} → {1,4,2,5,3,6}. " +
            "Utilise une pile auxiliaire pour inverser la 2ème moitié. O(n).",

        "09. Implémente un Rate Limiter basé sur une Sliding Window Queue : " +
            "maxRequests=3 par fenêtre de windowMs=1000ms. " +
            "isAllowed(timestamp) retourne true/false. " +
            "Test : isAllowed(1)=true, isAllowed(2)=true, isAllowed(3)=true, isAllowed(4)=false, isAllowed(1002)=true.",

        "10. Implémente un Stack à partir de deux Queues : push(x), pop(), top(), empty(). " +
            "Deux variantes : (a) push O(n), pop O(1) — (b) push O(1), pop O(n). " +
            "Implémente les deux et compare."
    };

    public static void main(String[] args) {
        for (String task : TASKS) System.out.println(task);
    }
}
