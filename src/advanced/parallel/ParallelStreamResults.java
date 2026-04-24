package advanced.parallel;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class ParallelStreamResults {

    /*
     * ANSWER KEY — ParallelStreamExercises
     * Source : basics.streams.Input.EMPLOYEES (12 employés)
     *          basics.lambda.LambdaFunctionalInput.NUMBERS
     *
     * Parallel results must be identical to sequential results for deterministic
     * operations (filter/map/collect). forEach order is NOT guaranteed in parallel.
     */

    // Task 01 — active employee names sorted (parallel = sequential)
    public static final List<String> TASK_01_ACTIVE_SORTED = List.of(
            "Alice Johnson", "Bob Smith", "Diana Prince", "Eve Adams",
            "Frank Moore", "Henry Ford", "Ivy Chen", "Jack Brown", "Kate Miller", "Leo Nfor"
    );

    // Task 02 — sum of all salaries via mapToDouble
    public static final double TASK_02_SALARY_SUM = 52400.0;

    // Task 03 — employee count by department (parallel = sequential)
    public static final Map<String, Long> TASK_03_COUNT_BY_DEPT = Map.of(
            "Engineering", 5L, "Finance", 2L, "Support", 2L, "Sales", 2L, "HR", 1L
    );

    // Task 05 — sum of salaries via 3-arg reduce
    public static final BigDecimal TASK_05_SALARY_SUM = new BigDecimal("52400.00");

    // Task 06 — sum of NUMBERS {14,-5,0,22,7,7,19,-12,44,3,28,14} via IntStream parallel reduce
    public static final int TASK_06_NUMBERS_SUM = 141;

    // Task 09 — total value of all order items (quantity * unitPrice)
    // Orders: (1*1200+2*25) + (1*180+3*10) + (2*300+1*45) + (1*220+1*400) + (1*90+2*60)
    // = 1250 + 210 + 645 + 620 + 210 = 2935
    public static final double TASK_09_ORDERS_TOTAL = 2935.0;

    // Task 12 — partition by active (parallel = sequential)
    public static final Map<Boolean, Long> TASK_12_PARTITION_COUNT = Map.of(true, 10L, false, 2L);

    // Task 13 — count of SUCCESS transactions
    // Transactions with SUCCESS: 2001, 2003, 2005, 2006, 2008, 2010 → 6
    public static final long TASK_13_SUCCESS_COUNT = 6L;

    // Task 14 — employees sorted by salary descending (parallel sorted = sequential sorted)
    public static final List<String> TASK_14_SORTED_BY_SALARY_DESC = List.of(
            "Henry Ford", "Eve Adams", "Leo Nfor", "Bob Smith",
            "Alice Johnson", "Grace Lee", "Ivy Chen", "Diana Prince",
            "Jack Brown", "Kate Miller", "Charlie King", "Frank Moore"
    );
}