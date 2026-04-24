package datastructures.hashtable;

public class HashTableExercises {

    /*
     * HASH TABLE — 15 TASKS
     *
     * Convention : utilise HashMap / HashSet de Java sauf quand la tâche demande
     * une implémentation from scratch.
     *
     * Données inline dans les tâches.
     */

    public static final String[] TASKS = {

        // --- Implémentation ---
        "01. [FROM SCRATCH] Implémente une HashMap<K,V> simplifiée avec : put(K,V), get(K), remove(K), " +
            "containsKey(K), size(). Gestion des collisions par chaînage (linked list de buckets). " +
            "Capacité initiale : 16 buckets, load factor 0.75 → redimensionnement automatique.",

        // --- Problèmes classiques ---
        "02. Two Sum : dans {2,7,11,15} avec target=9, retourne [0,1]. " +
            "Une seule passe, O(n). Pas de tri.",

        "03. Group Anagrams : [{\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\"}] → " +
            "[[\"eat\",\"tea\",\"ate\"],[\"tan\",\"nat\"],[\"bat\"]]. " +
            "Clé = caractères triés. O(n·k·log k) où k = longueur max.",

        "04. Longest Substring Without Repeating Characters : 'abcabcbb' → 3 ('abc') ; " +
            "'bbbbb' → 1 ; 'pwwkew' → 3 ('wke'). Sliding window + HashMap. O(n).",

        "05. Subarray Sum Equals K : compte le nombre de sous-tableaux continus de {1,1,1} " +
            "dont la somme vaut k=2. Résultat : 2. " +
            "HashMap de prefix sums. O(n).",

        "06. Longest Consecutive Sequence : dans {100,4,200,1,3,2} → longueur 4 (1-2-3-4). " +
            "HashSet + démarrage de séquence si n-1 absent. O(n).",

        "07. Top K Frequent Words : dans [\"the\",\"day\",\"is\",\"sunny\",\"the\",\"the\",\"sunny\",\"is\",\"is\"] " +
            "pour k=4. Résultat : [\"the\",\"is\",\"sunny\",\"day\"]. " +
            "HashMap + PriorityQueue avec tri lexicographique pour égalité.",

        "08. First Unique Character in a String : 'leetcode' → 0 (l) ; 'loveleetcode' → 2 (v). " +
            "Deux passes : fréquences puis premier à fréquence 1. O(n).",

        "09. Intersection of Two Arrays avec fréquences : {1,2,2,1} ∩ {2,2} → [2,2]. " +
            "HashMap des fréquences du premier tableau. O(n+m).",

        "10. Isomorphic Strings : 'egg'/'add' → true ; 'foo'/'bar' → false ; 'paper'/'title' → true. " +
            "Deux mappings bidirectionnels. O(n).",

        "11. Word Pattern : pattern='abba', s='dog cat cat dog' → true ; " +
            "pattern='abba', s='dog cat cat fish' → false. " +
            "Deux HashMaps (char→word et word→char). O(n).",

        "12. Minimum Window Substring : s='ADOBECODEBANC', t='ABC' → 'BANC'. " +
            "Sliding window avec deux fréquences et compteur de satisfaction. O(n).",

        "13. Subarrays with Equal Number of 0s and 1s : dans {0,1,0,1,1,0,0} compte les sous-tableaux. " +
            "Résultat : 8. Transforme 0→-1, puis prefix sum + HashMap. O(n).",

        "14. 4Sum : dans {1,0,-1,0,-2,2} avec target=0, retourne tous les quadruplets uniques. " +
            "Résultat : [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]. " +
            "Trie + two-pointer avec outer double loop. O(n³).",

        "15. [DÉFI] Find All Anagrams in a String : s='cbaebabacd', p='abc' → indices [0,6]. " +
            "Sliding window de longueur p.length() avec fréquences. O(n). " +
            "Variante : compte aussi le nombre d'anagrammes distincts."
    };

    public static void main(String[] args) {
        for (String task : TASKS) System.out.println(task);
    }
}
