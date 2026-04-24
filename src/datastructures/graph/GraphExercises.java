package datastructures.graph;

public class GraphExercises {

    /*
     * GRAPH — 15 TASKS
     *
     * Data : GraphInput.java  (UNDIRECTED_CONNECTED, DIRECTED_DAG, WEIGHTED_GRAPH, GRID_ISLANDS…)
     *
     * Conventions :
     *   - [BFS]  = utilise une file
     *   - [DFS]  = utilise une pile ou la récursion
     *   - Indique la complexité O(V+E) dans ta solution.
     */

    public static final String[] TASKS = {

        // --- Parcours fondamentaux ---
        "01. [BFS] BFS depuis le sommet 0 sur UNDIRECTED_CONNECTED. " +
            "Retourne les nœuds dans l'ordre de visite : [0,1,3,2,4,5].",

        "02. [DFS récursif] DFS depuis le sommet 0 sur UNDIRECTED_CONNECTED. " +
            "Retourne une liste de visite (ordre dépend de l'implémentation, valider la complétude).",

        "03. [DFS itératif] Même chose que 02 mais avec une pile explicite (pas de récursion).",

        // --- Détection de cycle ---
        "04. [DFS] Détecte un cycle dans UNDIRECTED_WITH_CYCLE. Résultat : true. " +
            "Utilise un visited[] et vérifie si un voisin est déjà visité (hors parent).",

        "05. [DFS + coloring] Détecte un cycle dans DIRECTED_WITH_CYCLE. Résultat : true. " +
            "Trois couleurs : WHITE(0), GRAY(en cours), BLACK(terminé). Cycle si on retombe sur GRAY.",

        // --- Topological Sort ---
        "06. [BFS — Kahn's] Topological sort de DIRECTED_DAG via algorithme de Kahn (in-degree + queue). " +
            "Retourne une liste valide (plusieurs solutions possibles).",

        "07. [DFS] Topological sort de DIRECTED_DAG via DFS et post-order stack. " +
            "Résultat doit être valide (tout arc u→v vérifie pos(u) < pos(v)).",

        // --- Composantes connexes ---
        "08. Nombre de composantes connexes dans le graphe {0-1, 2-3, 4} (5 sommets). " +
            "Résultat : 3. Construit ce graphe inline avec une Map.",

        // --- Grilles ---
        "09. Number of Islands sur GRID_ISLANDS. Résultat : 3. " +
            "DFS ou BFS, marque les '1' visités avec 'x'. O(m*n).",

        "10. Flood Fill sur GRID_FLOOD depuis (sr=1, sc=1, newColor=2). " +
            "Résultat : {{2,2,2},{2,2,0},{2,0,1}}. BFS ou DFS. O(m*n).",

        // --- Plus court chemin ---
        "11. [BFS] Shortest Path entre sommet 0 et sommet 5 dans UNDIRECTED_CONNECTED (graphe non pondéré). " +
            "Retourne la longueur du chemin. Résultat : 2.",

        "12. Dijkstra's Shortest Path depuis sommet 0 dans WEIGHTED_GRAPH. " +
            "Retourne le tableau dist[] où dist[i] = distance minimale de 0 à i. " +
            "Résultat : dist = [0,4,12,19,21,11,9,8,14]. O((V+E) log V) via PriorityQueue.",

        // --- Bipartite / coloring ---
        "13. Vérifie si UNDIRECTED_CONNECTED est bipartite (2-colorable). " +
            "Résultat : true. BFS coloring : deux couleurs alternées, cycle impair = false.",

        // --- Problèmes applicatifs ---
        "14. Course Schedule : peut-on compléter COURSE_COUNT=4 cours avec COURSE_PREREQUISITES ? " +
            "Résultat : true. Détection de cycle dans graphe orienté (Kahn ou DFS). " +
            "Avec COURSE_CYCLIC → false.",

        "15. Clone Graph : deep-copy de UNDIRECTED_CONNECTED. " +
            "Chaque nœud de la copie doit avoir la même valeur et les mêmes voisins, " +
            "mais être de nouvelles instances. Utilise une HashMap<original, copy> pour éviter les cycles. " +
            "O(V+E)."
    };

    public static void main(String[] args) {
        for (String task : TASKS) System.out.println(task);
    }
}
