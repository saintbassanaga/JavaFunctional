package datastructures.stack;

public class StackExercises {

    /*
     * STACK — 15 TASKS
     *
     * Rappel : une pile est LIFO. Implémente chaque structure from scratch
     * (tableau ou liste chaînée) sauf indication contraire.
     *
     * Données inline dans les tâches (simples à construire).
     */

    public static final String[] TASKS = {

        // --- Implémentations de base ---
        "01. Implémente une pile générique MyStack<T> avec push(T), pop(), peek(), isEmpty(), size(). " +
            "Stockage interne : tableau redimensionnable. Pas de java.util.Stack.",

        "02. Implémente MinStack : push(int), pop(), top(), getMin() tous en O(1). " +
            "Astuce : pile secondaire qui stocke le minimum courant à chaque push. " +
            "Test : push(5,3,7,3,2,1), getMin()=1, pop(), getMin()=2, pop(), getMin()=3.",

        // --- Validation ---
        "03. Valid Parentheses : vérifie si '({[]})' est valide, '([)]' ne l'est pas, '{[]}' l'est. " +
            "Gère les types : '(', ')', '{', '}', '[', ']'. O(n).",

        "04. Vérifie si une séquence de push/pop est valide : " +
            "pushed={1,2,3,4,5}, popped={4,5,3,2,1} → true ; popped={4,3,5,1,2} → false. " +
            "Simule les opérations avec une pile auxiliaire.",

        // --- Évaluation d'expressions ---
        "05. Évalue une expression en notation postfixe (RPN) : " +
            "[\"2\",\"1\",\"+\",\"3\",\"*\"] → (2+1)*3 = 9 ; " +
            "[\"4\",\"13\",\"5\",\"/\",\"+\"] → 4+13/5 = 6.",

        // --- Pile monotone ---
        "06. Next Greater Element : pour {2,1,2,4,3,5,1}, retourne {4,2,4,5,5,-1,-1}. " +
            "Pile monotone décroissante. O(n).",

        "07. Daily Temperatures : pour {73,74,75,71,69,72,76,73}, retourne {1,1,4,2,1,1,0,0} " +
            "(nombre de jours jusqu'à une température plus haute). Pile monotone. O(n).",

        "08. Largest Rectangle in Histogram pour {2,1,5,6,2,3} = 10. " +
            "Pile monotone croissante des indices. O(n). (Même données qu'Arrays task 24 — vérifie ta cohérence.)",

        "09. Max Rectangle in Binary Matrix : trouve le plus grand rectangle de 1s dans BINARY_MATRIX " +
            "(ArrayInput). Utilise l'approche histogram par ligne + stack. O(m*n).",

        // --- Opérations sur strings ---
        "10. Decode String : '3[a2[c]]' → 'accaccacc' ; '2[abc]3[cd]ef' → 'abcabccdcdcdef'. " +
            "Deux piles : une pour les counts, une pour les strings partielles.",

        "11. Simplifie un chemin Unix absolu : '/a/./b/../../c/' → '/c' ; '/../' → '/' ; " +
            "'/home//foo/' → '/home/foo'. Pile de composants.",

        "12. Remove All Adjacent Duplicates : 'abbaca' → 'ca' ; 'azxxzy' → 'ay'. " +
            "Pile char. O(n).",

        // --- Structures avancées ---
        "13. Implémente deux piles dans un seul tableau de taille fixe n=10 sans gaspillage d'espace : " +
            "stack1 part de l'index 0 vers la droite, stack2 part de l'index n-1 vers la gauche.",

        "14. Trie une pile en utilisant uniquement des opérations de pile (push, pop, peek, isEmpty). " +
            "Récursion autorisée. Résultat : élément le plus petit en haut.",

        "15. Implémente une Queue à partir de deux Stacks : enqueue(x), dequeue(), peek(), isEmpty(). " +
            "Dequeue amorti O(1). Test : enqueue(1,2,3), dequeue()=1, enqueue(4), dequeue()=2."
    };

    public static void main(String[] args) {
        for (String task : TASKS) System.out.println(task);
    }
}
