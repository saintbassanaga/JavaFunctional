package advanced.refs;

import java.util.List;
import java.util.Set;

public class MethodRefResults {

    /*
     * ANSWER KEY — MethodRefExercises
     * Source : basics.streams.Input  (RAW_NAMES, RAW_NUMBERS, EMPLOYEES, ORDERS)
     *          basics.lambda.LambdaFunctionalInput  (WORDS, EMPLOYEES)
     */

    // Task 01 — filter null from RAW_NAMES {"  Alice  ","bob","ALICE","","   ",null,"Charlie","bob","diana","Eve"}
    public static final List<String> TASK_01_NON_NULL = List.of(
            "  Alice  ", "bob", "ALICE", "", "   ", "Charlie", "bob", "diana", "Eve"
    );

    // Task 02 — count nulls in RAW_NAMES (1 null element)
    public static final long TASK_02_NULL_COUNT = 1L;

    // Task 03 — parse {"1","2","3","42"} to integers
    public static final List<Integer> TASK_03_PARSED = List.of(1, 2, 3, 42);

    // Task 04 — abs of RAW_NUMBERS {12,7,-3,0,25,18,7,42,-10,33,18,5,60,1,12}
    public static final List<Integer> TASK_04_ABS = List.of(
            12, 7, 3, 0, 25, 18, 7, 42, 10, 33, 18, 5, 60, 1, 12
    );

    // Task 05 — String.valueOf each RAW_NUMBER
    public static final List<String> TASK_05_STRINGS = List.of(
            "12", "7", "-3", "0", "25", "18", "7", "42", "-10", "33", "18", "5", "60", "1", "12"
    );

    // Task 08 — prefix each employee name with "EMP: "
    public static final List<String> TASK_08_PREFIXED = List.of(
            "EMP: Alice Johnson", "EMP: Bob Smith",    "EMP: Charlie King", "EMP: Diana Prince",
            "EMP: Eve Adams",     "EMP: Frank Moore",  "EMP: Grace Lee",    "EMP: Henry Ford",
            "EMP: Ivy Chen",      "EMP: Jack Brown",   "EMP: Kate Miller",  "EMP: Leo Nfor"
    );

    // Task 09 — count Engineering employees (5 in basics.streams.Input.EMPLOYEES)
    public static final long TASK_09_ENGINEERING_COUNT = 5L;

    // Task 10 — WORDS non-null uppercased
    // WORDS = {"  Java  ","spring","Lambda","","Functional","  ","Stream","API","java",null,"Docker"}
    public static final List<String> TASK_10_UPPER = List.of(
            "  JAVA  ", "SPRING", "LAMBDA", "", "FUNCTIONAL", "  ", "STREAM", "API", "JAVA", "DOCKER"
    );

    // Task 11 — WORDS non-null trimmed
    public static final List<String> TASK_11_TRIMMED = List.of(
            "Java", "spring", "Lambda", "", "Functional", "", "Stream", "API", "java", "Docker"
    );

    // Task 13 — length of each employee name
    public static final List<Integer> TASK_13_LENGTHS = List.of(
            13, 9, 12, 12, 9, 11, 9, 10, 8, 10, 11, 8
    );

    // Task 14 — all employee names via Employee::name
    public static final List<String> TASK_14_NAMES = List.of(
            "Alice Johnson", "Bob Smith", "Charlie King", "Diana Prince",
            "Eve Adams", "Frank Moore", "Grace Lee", "Henry Ford",
            "Ivy Chen", "Jack Brown", "Kate Miller", "Leo Nfor"
    );

    // Task 16 — employees sorted by salary ascending
    public static final List<String> TASK_16_SORTED_SALARY_ASC = List.of(
            "Frank Moore", "Charlie King", "Kate Miller", "Diana Prince",
            "Ivy Chen", "Jack Brown", "Grace Lee", "Alice Johnson",
            "Bob Smith", "Leo Nfor", "Eve Adams", "Henry Ford"
    );

    // Task 17 — sorted by age desc then name asc
    public static final List<String> TASK_17_SORTED_AGE_DESC = List.of(
            "Henry Ford", "Eve Adams", "Bob Smith", "Jack Brown",
            "Leo Nfor", "Diana Prince", "Ivy Chen", "Alice Johnson",
            "Kate Miller", "Grace Lee", "Charlie King", "Frank Moore"
    );

    // Task 19 — TreeSet of employee names (sorted)
    public static final Set<String> TASK_19_TREESET = Set.of(
            "Alice Johnson", "Bob Smith", "Charlie King", "Diana Prince",
            "Eve Adams", "Frank Moore", "Grace Lee", "Henry Ford",
            "Ivy Chen", "Jack Brown", "Kate Miller", "Leo Nfor"
    );
}