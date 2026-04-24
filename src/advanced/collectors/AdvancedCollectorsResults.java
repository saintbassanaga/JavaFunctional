package advanced.collectors;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class AdvancedCollectorsResults {

    /*
     * ANSWER KEY — AdvancedCollectorsExercises
     * Source : basics.streams.Input.EMPLOYEES (12 employés)
     */

    public static final Map<String, Long> TASK_01_COUNT_BY_DEPT = Map.of(
            "Engineering", 5L, "Finance", 2L, "Support", 2L, "Sales", 2L, "HR", 1L
    );

    public static final Map<String, Integer> TASK_02_SUM_AGE_BY_DEPT = Map.of(
            "Engineering", 164, "Finance", 76, "Support", 56, "Sales", 57, "HR", 28
    );

    public static final Map<String, Double> TASK_03_AVG_SALARY_BY_DEPT = Map.of(
            "Engineering", 5220.0, "Finance", 5600.0, "Support", 3000.0, "Sales", 3050.0, "HR", 3000.0
    );

    // 04 : DoubleSummaryStatistics — vérifie via getters
    public static final long   TASK_04_COUNT = 12L;
    public static final double TASK_04_SUM   = 52400.0;
    public static final double TASK_04_MIN   = 2500.0;
    public static final double TASK_04_MAX   = 7300.0;

    public static final Map<String, List<String>> TASK_05_NAMES_BY_DEPT = Map.of(
            "Engineering", List.of("Alice Johnson","Bob Smith","Eve Adams","Grace Lee","Leo Nfor"),
            "Finance",     List.of("Diana Prince","Henry Ford"),
            "Support",     List.of("Charlie King","Ivy Chen"),
            "Sales",       List.of("Frank Moore","Jack Brown"),
            "HR",          List.of("Kate Miller")
    );

    public static final Map<String, String> TASK_06_NAMES_JOINED_BY_DEPT = Map.of(
            "Engineering", "Alice Johnson, Bob Smith, Eve Adams, Grace Lee, Leo Nfor",
            "Finance",     "Diana Prince, Henry Ford",
            "Support",     "Charlie King, Ivy Chen",
            "Sales",       "Frank Moore, Jack Brown",
            "HR",          "Kate Miller"
    );

    public static final Map<String, String> TASK_07_NAMES_BRACKETED_BY_DEPT = Map.of(
            "Engineering", "[Alice Johnson, Bob Smith, Eve Adams, Grace Lee, Leo Nfor]",
            "Finance",     "[Diana Prince, Henry Ford]",
            "Support",     "[Charlie King, Ivy Chen]",
            "Sales",       "[Frank Moore, Jack Brown]",
            "HR",          "[Kate Miller]"
    );

    public static final List<String> TASK_08_ACTIVE_NAMES = List.of(
            "Alice Johnson","Bob Smith","Diana Prince","Eve Adams",
            "Frank Moore","Henry Ford","Ivy Chen","Jack Brown","Kate Miller","Leo Nfor"
    );

    public static final Map<String, String> TASK_09_TEAM_SIZE = Map.of(
            "Engineering","grand","Finance","petit","Support","petit","Sales","petit","HR","petit"
    );

    public static final String TASK_10_LARGEST_DEPT = "Engineering";

    public static final Map<Boolean, Long> TASK_11_PARTITION_COUNT = Map.of(true, 10L, false, 2L);

    public static final Map<Boolean, String> TASK_12_PARTITION_NAMES = Map.of(
            true,  "Bob Smith, Eve Adams, Henry Ford, Leo Nfor",
            false, "Alice Johnson, Charlie King, Diana Prince, Frank Moore, Grace Lee, Ivy Chen, Jack Brown, Kate Miller"
    );

    public static final Map<Long, String> TASK_14_ID_TO_NAME = Map.ofEntries(
            Map.entry(1L,"Alice Johnson"), Map.entry(2L,"Bob Smith"),   Map.entry(3L,"Charlie King"),
            Map.entry(4L,"Diana Prince"),  Map.entry(5L,"Eve Adams"),   Map.entry(6L,"Frank Moore"),
            Map.entry(7L,"Grace Lee"),     Map.entry(8L,"Henry Ford"),  Map.entry(9L,"Ivy Chen"),
            Map.entry(10L,"Jack Brown"),   Map.entry(11L,"Kate Miller"),Map.entry(12L,"Leo Nfor")
    );

    public static final Map<String, BigDecimal> TASK_15_SALARY_BY_DEPT = Map.of(
            "Engineering", new BigDecimal("26100.00"),
            "Finance",     new BigDecimal("11200.00"),
            "Support",     new BigDecimal("6000.00"),
            "Sales",       new BigDecimal("6100.00"),
            "HR",          new BigDecimal("3000.00")
    );

    public static final Map<Long, BigDecimal> TASK_16_UNPAID_BY_EMPLOYEE = Map.of(
            1L,new BigDecimal("1200.00"), 3L,new BigDecimal("800.00"),
            5L,new BigDecimal("3100.00"), 10L,new BigDecimal("950.00"), 12L,new BigDecimal("4200.00")
    );

    public static final List<String> TASK_17_ACTIVE_ENGINEERING = List.of(
            "Alice Johnson","Bob Smith","Eve Adams","Leo Nfor"
    );

    public static final int TASK_18_DEPT_COUNT = 5;

    public static final Map<String, String> TASK_20_TOP_SALARY_BY_DEPT = Map.of(
            "Engineering","Eve Adams","Finance","Henry Ford",
            "Support","Ivy Chen","Sales","Jack Brown","HR","Kate Miller"
    );

    public static final Map<String, String> TASK_21_YOUNGEST_BY_DEPT = Map.of(
            "Engineering","Grace Lee","Finance","Diana Prince",
            "Support","Charlie King","Sales","Frank Moore","HR","Kate Miller"
    );

    public static final String TASK_23 = "total=52400.00, count=12";

    public static final Map<String, Long> TASK_25_TOP_SKILLS = Map.of("Java", 4L, "Security", 2L);
}
