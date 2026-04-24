package datastructures.graph;

import java.util.List;
import java.util.Map;

public class GraphInput {

    /*
     * Représentation : liste d'adjacence Map<Integer, List<Integer>>
     * Les sommets sont numérotés à partir de 0.
     */

    /*
     * UNDIRECTED_CONNECTED — graphe connexe sans cycle
     *
     *  0 -- 1 -- 2
     *  |         |
     *  3 -- 4 -- 5
     */
    public static final Map<Integer, List<Integer>> UNDIRECTED_CONNECTED = Map.of(
            0, List.of(1, 3),
            1, List.of(0, 2),
            2, List.of(1, 5),
            3, List.of(0, 4),
            4, List.of(3, 5),
            5, List.of(2, 4)
    );

    /*
     * UNDIRECTED_WITH_CYCLE — graphe avec un cycle
     *
     *  0 -- 1
     *  |  / |
     *  2    3
     */
    public static final Map<Integer, List<Integer>> UNDIRECTED_WITH_CYCLE = Map.of(
            0, List.of(1, 2),
            1, List.of(0, 2, 3),
            2, List.of(0, 1),
            3, List.of(1)
    );

    /*
     * DIRECTED_DAG — graphe orienté acyclique (pour topological sort)
     *
     *  5 → 0 ← 4
     *  ↓       ↓
     *  2 → 3 → 1
     *
     * Topo sort valide : 4,5,2,0,3,1 ou 5,4,2,3,1,0 etc.
     */
    public static final Map<Integer, List<Integer>> DIRECTED_DAG = Map.of(
            5, List.of(0, 2),
            4, List.of(0, 1),
            2, List.of(3),
            3, List.of(1),
            1, List.of(),
            0, List.of()
    );

    /*
     * DIRECTED_WITH_CYCLE — graphe orienté avec cycle (pour détection)
     *
     *  0 → 1 → 2
     *      ↑   ↓
     *      4 ← 3
     */
    public static final Map<Integer, List<Integer>> DIRECTED_WITH_CYCLE = Map.of(
            0, List.of(1),
            1, List.of(2),
            2, List.of(3),
            3, List.of(4),
            4, List.of(1)   // cycle : 1→2→3→4→1
    );

    /*
     * WEIGHTED_GRAPH — graphe pondéré pour Dijkstra
     * Paires (voisin, poids) représentées comme int[]{voisin, poids}
     *
     *      (4)   (8)
     *  0 ----- 1 ----- 2
     *  |       |       |
     * (8)     (11)     (2)
     *  |       |       |
     *  7 ----- 6       3
     *    (1)      (6) / (7)
     *          5
     *     (10)/ \(2)
     *        4   (14)
     *
     * Simplifié pour l'exercice :
     *  0→1 : 4 ; 0→7 : 8
     *  1→2 : 8 ; 1→7 : 11
     *  2→3 : 7 ; 2→5 : 4 ; 2→8 : 2
     *  3→4 : 9 ; 3→5 : 14
     *  4→5 : 10 ; 5→6 : 2 ; 6→7 : 1 ; 6→8 : 6 ; 7→8 : 7
     */
    public static final int WEIGHTED_NODES = 9;
    public static final int[][][] WEIGHTED_GRAPH = {
            // node 0
            {{1,4},{7,8}},
            // node 1
            {{0,4},{2,8},{7,11}},
            // node 2
            {{1,8},{3,7},{5,4},{8,2}},
            // node 3
            {{2,7},{4,9},{5,14}},
            // node 4
            {{3,9},{5,10}},
            // node 5
            {{2,4},{3,14},{4,10},{6,2}},
            // node 6
            {{5,2},{7,1},{8,6}},
            // node 7
            {{0,8},{1,11},{6,1},{8,7}},
            // node 8
            {{2,2},{6,6},{7,7}}
    };

    /*
     * GRID — pour les problèmes sur grilles (Number of Islands, Flood Fill)
     * '1' = terre, '0' = eau
     */
    public static final char[][] GRID_ISLANDS = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
    };

    /*
     * GRID_FLOOD — pour Flood Fill
     */
    public static final int[][] GRID_FLOOD = {
            {1,1,1},
            {1,1,0},
            {1,0,1}
    };

    // Cours pour Course Schedule
    public static final int COURSE_COUNT = 4;
    public static final int[][] COURSE_PREREQUISITES = {{1,0},{2,0},{3,1},{3,2}};   // [a,b] = b avant a
    public static final int[][] COURSE_CYCLIC = {{1,0},{0,1}};                       // cycle → impossible
}
