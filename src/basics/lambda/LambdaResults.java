package basics.lambda;

import java.math.BigDecimal;
import java.util.List;

public class LambdaResults {

    public static final List<String> TASK_01_CLEAN_WORDS = List.of(
            "Java", "spring", "Lambda", "Functional", "Stream", "API", "java", "Docker"
    );

    public static final List<String> TASK_02_NORMALIZED_UNIQUE_WORDS = List.of(
            "java", "spring", "lambda", "functional", "stream", "api", "docker"
    );

    public static final List<Integer> TASK_03_EVEN_NUMBERS = List.of(14, 0, 22, -12, 44, 28, 14);

    public static final List<Integer> TASK_04_NUMBERS_DESC = List.of(44, 28, 22, 19, 14, 14, 7, 7, 3, 0, -5, -12);

    public static final List<Integer> TASK_05_ABSOLUTE_VALUES = List.of(14, 5, 0, 22, 7, 7, 19, 12, 44, 3, 28, 14);

    public static final List<Integer> TASK_06_SQUARED_VALUES = List.of(196, 25, 0, 484, 49, 49, 361, 144, 1936, 9, 784, 196);

    public static final long TASK_07_NEGATIVE_COUNT = 2L;

    public static final int TASK_08_SECOND_HIGHEST_DISTINCT = 28;

    public static final List<String> TASK_09_UPPERCASE_WORDS = List.of(
            "JAVA", "SPRING", "LAMBDA", "FUNCTIONAL", "STREAM", "API", "JAVA", "DOCKER"
    );

    public static final List<String> TASK_10_WORDS_SORTED_BY_LENGTH = List.of(
            "API", "Java", "java", "Docker", "Lambda", "spring", "Stream", "Functional"
    );

    public static final List<String> TASK_11_WORDS_STARTING_WITH_J = List.of("Java", "java");

    public static final List<String> TASK_12_ACTIVE_EMPLOYEE_NAMES = List.of(
            "Alice", "Bob", "David", "Emma", "Frank", "Henry"
    );

    public static final List<String> TASK_13_ENGINEERING_EMPLOYEE_NAMES = List.of(
            "Alice", "Bob", "Emma", "Grace"
    );

    public static final List<String> TASK_14_EMPLOYEE_NAMES_BY_SALARY_DESC = List.of(
            "Henry", "Emma", "Bob", "Alice", "Grace", "David", "Chloe", "Frank"
    );

    public static final List<String> TASK_15_EMPLOYEE_NAMES_BY_AGE_ASC = List.of(
            "Frank", "Chloe", "Grace", "Alice", "David", "Bob", "Emma", "Henry"
    );

    public static final List<String> TASK_16_EMPLOYEE_NAMES_BY_DEPARTMENT_THEN_NAME = List.of(
            "Alice", "Bob", "Emma", "Grace", "David", "Henry", "Frank", "Chloe"
    );

    public static final List<String> TASK_17_DISTINCT_SKILLS_SORTED = List.of(
            "Angular", "Architecture", "Budgeting", "CRM", "Compliance", "Docker", "Excel",
            "Java", "Kubernetes", "Leadership", "Linux", "Negotiation", "SQL", "Security",
            "Spring", "Troubleshooting", "TypeScript", "UX"
    );

    public static final List<String> TASK_18_EMPLOYEES_WITH_SALARY_AT_LEAST_4000 = List.of(
            "Alice", "Bob", "Emma", "Grace", "Henry"
    );

    public static final List<String> TASK_19_ACTIVE_ENGINEERING_EMPLOYEES = List.of(
            "Alice", "Bob", "Emma"
    );

    public static final String TASK_20_JOINED_ALL_EMPLOYEE_NAMES = "Alice, Bob, Chloe, David, Emma, Frank, Grace, Henry";

    public static final String TASK_21_JOINED_ACTIVE_EMPLOYEE_NAMES = "Alice, Bob, David, Emma, Frank, Henry";

    public static final List<BigDecimal> TASK_22_PRICES_WITH_19_25_PERCENT_TAX = List.of(
            new BigDecimal("14.91"),
            new BigDecimal("119.24"),
            new BigDecimal("5.96"),
            new BigDecimal("50.59"),
            new BigDecimal("22.36")
    );

    public static final List<BigDecimal> TASK_23_PRICES_WITH_10_PERCENT_DISCOUNT = List.of(
            new BigDecimal("11.25"),
            new BigDecimal("89.99"),
            new BigDecimal("4.50"),
            new BigDecimal("38.18"),
            new BigDecimal("16.88")
    );

    public static final List<String> TASK_24_PRICES_GREATER_THAN_20_AS_STRING = List.of("99.99", "42.42");

    public static final List<String> TASK_25_ERROR_MESSAGES = List.of("error: redis", "error: token");

    public static final List<String> TASK_26_MESSAGE_PREFIXES = List.of("error", "info", "warn", "error", "info");

    public static final List<String> TASK_27_WORDS_LONGER_THAN_5 = List.of("spring", "Lambda", "Functional", "Stream", "Docker");

    public static final List<String> TASK_28_WORDS_CONTAINING_A = List.of("Java", "Lambda", "Functional", "Stream", "API", "java");

    public static final List<String> TASK_29_EMPLOYEE_NAMES_REVERSE_ALPHA = List.of(
            "Henry", "Grace", "Frank", "Emma", "David", "Chloe", "Bob", "Alice"
    );

    public static final String TASK_30_HIGHEST_PAID_EMPLOYEE_NAME = "Henry";
}
