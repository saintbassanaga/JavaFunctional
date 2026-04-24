package datastructures.graph;

import java.util.List;

public class GraphResults {

    // Task 01 — BFS from vertex 0 on UNDIRECTED_CONNECTED
    public static final List<Integer> TASK_01_BFS = List.of(0, 1, 3, 2, 4, 5);

    // Task 04 — Cycle detection in UNDIRECTED_WITH_CYCLE
    public static final boolean TASK_04_HAS_CYCLE = true;

    // Task 05 — Cycle detection in DIRECTED_WITH_CYCLE
    public static final boolean TASK_05_HAS_CYCLE = true;

    // Task 08 — Connected components in graph {0-1, 2-3, 4}: 3 components
    public static final int TASK_08_COMPONENTS = 3;

    // Task 09 — Number of Islands in GRID_ISLANDS
    public static final int TASK_09_ISLANDS = 3;

    // Task 10 — Flood Fill from (sr=1,sc=1,newColor=2) on GRID_FLOOD
    // Original: {{1,1,1},{1,1,0},{1,0,1}} → all connected 1s from (1,1) become 2
    public static final int[][] TASK_10_FLOOD_FILL = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};

    // Task 11 — Shortest path 0→5 in UNDIRECTED_CONNECTED (BFS, unweighted)
    // Paths: 0→1→2→5 or 0→3→4→5, both = 3 edges
    public static final int TASK_11_SHORTEST_PATH = 3;

    // Task 12 — Dijkstra from vertex 0 in WEIGHTED_GRAPH (9 nodes)
    // dist[i] = minimum distance from 0 to i
    public static final int[] TASK_12_DIJKSTRA = {0, 4, 12, 19, 21, 11, 9, 8, 14};

    // Task 13 — UNDIRECTED_CONNECTED is bipartite (6-cycle = even, 2-colorable)
    public static final boolean TASK_13_BIPARTITE = true;

    // Task 14 — Course Schedule: can complete 4 courses with given prerequisites?
    public static final boolean TASK_14_CAN_FINISH = true;     // COURSE_PREREQUISITES
    public static final boolean TASK_14_CYCLIC = false;        // COURSE_CYCLIC has a cycle
}
