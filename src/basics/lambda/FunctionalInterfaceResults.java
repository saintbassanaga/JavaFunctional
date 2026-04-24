package basics.lambda;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class FunctionalInterfaceResults {

    public static final List<String> TASK_01_ADULT_EMPLOYEE_NAMES = List.of("Bob", "David", "Emma", "Henry");

    public static final List<String> TASK_02_ACTIVE_HIGH_PAID_EMPLOYEE_NAMES = List.of("Bob", "Emma", "Henry");

    public static final List<String> TASK_03_ENGINEERING_OR_FINANCE_EMPLOYEE_NAMES = List.of("Alice", "Bob", "David", "Emma", "Grace", "Henry");

    public static final Map<String, String> TASK_04_NAME_TO_UPPERCASE = Map.of(
            "Alice", "ALICE", "Bob", "BOB", "Chloe", "CHLOE", "David", "DAVID",
            "Emma", "EMMA", "Frank", "FRANK", "Grace", "GRACE", "Henry", "HENRY"
    );

    public static final Map<String, Integer> TASK_05_NAME_TO_LENGTH = Map.of(
            "Alice", 5, "Bob", 3, "Chloe", 5, "David", 5,
            "Emma", 4, "Frank", 5, "Grace", 5, "Henry", 5
    );

    public static final Map<String, BigDecimal> TASK_06_SALARY_PLUS_500 = Map.of(
            "Alice", new BigDecimal("4700.00"), "Bob",   new BigDecimal("5600.00"),
            "Chloe", new BigDecimal("3300.00"), "David", new BigDecimal("4400.00"),
            "Emma",  new BigDecimal("7300.00"), "Frank", new BigDecimal("3000.00"),
            "Grace", new BigDecimal("4600.00"), "Henry", new BigDecimal("7800.00")
    );

    public static final Map<String, String> TASK_07_SALARY_BAND = Map.of(
            "Alice", "MID", "Bob", "MID", "Chloe", "LOW", "David", "LOW",
            "Emma",  "HIGH","Frank","LOW","Grace", "MID", "Henry", "HIGH"
    );

    public static final List<String> TASK_08_FORMATTED_PRICE_STRINGS = List.of(
            "XAF 12.50", "XAF 99.99", "XAF 5.00", "XAF 42.42", "XAF 18.75"
    );

    public static final String TASK_09_SUPPLIER_CONSTANT = "functional-ready";

    public static final int TASK_10_TOTAL_CLEAN_WORD_LENGTH = 45;

    public static final List<String> TASK_11_NAME_TO_DEPARTMENT_LABELS = List.of(
            "Alice->Engineering", "Bob->Engineering", "Chloe->Support",  "David->Finance",
            "Emma->Engineering",  "Frank->Sales",     "Grace->Engineering","Henry->Finance"
    );

    public static final List<String> TASK_12_NAME_TO_SALARY_LABELS = List.of(
            "Alice:4200.00", "Bob:5100.00",  "Chloe:2800.00", "David:3900.00",
            "Emma:6800.00",  "Frank:2500.00","Grace:4100.00", "Henry:7300.00"
    );

    public static final BigDecimal TASK_13_MAX_PRICE = new BigDecimal("99.99");

    public static final BigDecimal TASK_14_SUM_OF_PRICES = new BigDecimal("178.66");

    public static final long TASK_15_PRODUCT_OF_POSITIVE_NUMBERS = 14837488512L;

    public static final List<String> TASK_16_WORDS_STARTING_WITH_VOWEL = List.of("API");

    public static final List<String> TASK_17_WORDS_LENGTH_AT_LEAST_6 = List.of("spring", "Lambda", "Functional", "Stream", "Docker");

    public static final List<String> TASK_18_LONG_WORDS_CONTAINING_A = List.of("Lambda", "Functional", "Stream");

    public static final int TASK_19_NON_BLANK_WORD_COUNT = 8;

    public static final List<String> TASK_20_TRIM_THEN_UPPERCASE = List.of(
            "JAVA", "SPRING", "LAMBDA", "", "FUNCTIONAL", "", "STREAM", "API", "JAVA", "DOCKER"
    );

    public static final List<String> TASK_21_DOUBLE_THEN_STRINGIFY = List.of(
            "n=28","n=-10","n=0","n=44","n=14","n=14","n=38","n=-24","n=88","n=6","n=56","n=28"
    );

    public static final Map<String, BigDecimal> TASK_22_SALARY_PLUS_10_PERCENT = Map.of(
            "Alice", new BigDecimal("4620.00"), "Bob",   new BigDecimal("5610.00"),
            "Chloe", new BigDecimal("3080.00"), "David", new BigDecimal("4290.00"),
            "Emma",  new BigDecimal("7480.00"), "Frank", new BigDecimal("2750.00"),
            "Grace", new BigDecimal("4510.00"), "Henry", new BigDecimal("8030.00")
    );

    public static final List<String> TASK_23_DISTINCT_DEPARTMENTS_SORTED = List.of(
            "Engineering", "Finance", "Sales", "Support"
    );

    public static final boolean TASK_24_ANY_EMPLOYEE_HAS_JAVA = true;

    public static final boolean TASK_25_ALL_ACTIVE_EMPLOYEES_HAVE_POSITIVE_SALARY = true;

    public static final boolean TASK_26_NO_EMPLOYEE_IS_MINOR = true;

    public static final List<String> TASK_27_NON_ENGINEERING_EMPLOYEE_NAMES = List.of(
            "Chloe", "David", "Frank", "Henry"
    );

    public static final Map<String, Integer> TASK_28_NAME_LOWER_THEN_LENGTH = Map.of(
            "Alice", 5, "Bob", 3, "Chloe", 5, "David", 5,
            "Emma", 4, "Frank", 5, "Grace", 5, "Henry", 5
    );

    public static final List<String> TASK_29_FULL_EMPLOYEE_LABELS = List.of(
            "Alice|Engineering|4200.00", "Bob|Engineering|5100.00",
            "Chloe|Support|2800.00",     "David|Finance|3900.00",
            "Emma|Engineering|6800.00",  "Frank|Sales|2500.00",
            "Grace|Engineering|4100.00", "Henry|Finance|7300.00"
    );

    public static final List<String> TASK_30_MESSAGES_UPPERCASE_WITH_BANG = List.of(
            "ERROR: REDIS!", "INFO: STARTUP!", "WARN: SLOW QUERY!", "ERROR: TOKEN!", "INFO: READY!"
    );
}
