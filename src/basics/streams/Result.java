package basics.streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Result {

    /*
     * FULL 125-TASK ANSWER KEY
     *
     * Interpretation rule for ambiguous tasks:
     * - When a task asks to "return orders", "return invoices", or "return transactions",
     *   this answer key usually normalizes the result to IDs unless a full object is explicitly clearer.
     * - Compare your output against these exact expected values.
     */

    // ==================================================
    // TASKS 001 - 020 : RAW STRINGS / RAW NUMBERS
    // ==================================================

    public static final List<String> TASK_001_CLEAN_NON_BLANK_NAMES = List.of(
            "Alice", "bob", "ALICE", "Charlie", "bob", "diana", "Eve"
    );

    public static final List<String> TASK_002_NORMALIZED_UNIQUE_LOWERCASE_NAMES = List.of(
            "alice", "bob", "charlie", "diana", "eve"
    );

    public static final long TASK_003_COUNT_BLANK_OR_NULL_NAMES = 3L;

    public static final List<Integer> TASK_004_EVEN_NUMBERS = List.of(12, 0, 18, 42, -10, 18, 60, 12);

    public static final List<Integer> TASK_005_DISTINCT_SORTED_NUMBERS = List.of(-10, -3, 0, 1, 5, 7, 12, 18, 25, 33, 42, 60);

    public static final int TASK_006_SUM_OF_POSITIVE_NUMBERS = 240;

    public static final double TASK_007_AVERAGE_OF_POSITIVE_NUMBERS = 20.0;

    public static final int TASK_008_SECOND_HIGHEST_NUMBER = 42;

    public static final List<Integer> TASK_009_ODD_NUMBERS = List.of(7, -3, 25, 7, 33, 5, 1);

    public static final List<Integer> TASK_010_NUMBERS_GREATER_THAN_10_DESC = List.of(60, 42, 33, 25, 18, 18, 12, 12);

    public static final List<Integer> TASK_011_SQUARED_NUMBERS = List.of(144, 49, 9, 0, 625, 324, 49, 1764, 100, 1089, 324, 25, 3600, 1, 144);

    public static final long TASK_012_DISTINCT_POSITIVE_NUMBER_COUNT = 9L;

    public static final int TASK_013_MAX_NUMBER = 60;

    public static final int TASK_014_MIN_NUMBER = -10;

    public static final String TASK_015_JOINED_CLEAN_NAMES = "Alice, bob, ALICE, Charlie, bob, diana, Eve";

    public static final List<Integer> TASK_016_CLEAN_NAME_LENGTHS = List.of(5, 3, 5, 7, 3, 5, 3);

    public static final List<String> TASK_017_NAMES_STARTING_WITH_A = List.of("Alice", "ALICE");

    public static final Map<String, List<String>> TASK_018_CLEAN_NAMES_GROUPED_BY_FIRST_CHAR = Map.of(
            "a", List.of("Alice", "ALICE"),
            "b", List.of("bob", "bob"),
            "c", List.of("Charlie"),
            "d", List.of("diana"),
            "e", List.of("Eve")
    );

    public static final Map<String, Long> TASK_019_NORMALIZED_NAME_FREQUENCY = Map.of(
            "alice", 2L, "bob", 2L, "charlie", 1L, "diana", 1L, "eve", 1L
    );

    public static final Map<Boolean, List<Integer>> TASK_020_PARTITION_POSITIVE_NUMBERS = Map.of(
            true,  List.of(12, 7, 25, 18, 7, 42, 33, 18, 5, 60, 1, 12),
            false, List.of(-3, 0, -10)
    );

    // ==================================================
    // TASKS 021 - 050 : EMPLOYEES
    // ==================================================

    public static final List<String> TASK_021_ACTIVE_EMPLOYEE_NAMES = List.of(
            "Alice Johnson", "Bob Smith", "Diana Prince", "Eve Adams", "Frank Moore",
            "Henry Ford", "Ivy Chen", "Jack Brown", "Kate Miller", "Leo Nfor"
    );

    public static final List<String> TASK_022_ENGINEERING_EMPLOYEE_NAMES = List.of(
            "Alice Johnson", "Bob Smith", "Eve Adams", "Grace Lee", "Leo Nfor"
    );

    public static final Map<String, Long> TASK_023_EMPLOYEE_COUNT_BY_DEPARTMENT = Map.of(
            "Engineering", 5L, "Support", 2L, "Finance", 2L, "Sales", 2L, "HR", 1L
    );

    public static final Map<String, BigDecimal> TASK_024_AVERAGE_SALARY_BY_DEPARTMENT = Map.of(
            "Engineering", new BigDecimal("5220.00"),
            "Support",     new BigDecimal("3000.00"),
            "Finance",     new BigDecimal("5600.00"),
            "Sales",       new BigDecimal("3050.00"),
            "HR",          new BigDecimal("3000.00")
    );

    public static final BigDecimal TASK_025_TOTAL_ENGINEERING_SALARY = new BigDecimal("26100.00");

    public static final String TASK_026_HIGHEST_PAID_EMPLOYEE_NAME = "Henry Ford";

    public static final BigDecimal TASK_027_HIGHEST_SALARY = new BigDecimal("7300.00");

    public static final String TASK_028_YOUNGEST_EMPLOYEE_NAME = "Frank Moore";

    public static final Set<String> TASK_029_ALL_DISTINCT_SKILLS = Set.of(
            "Java", "Spring", "PostgreSQL", "Docker", "Kubernetes", "Linux",
            "SQL", "Troubleshooting", "Excel", "Compliance", "Architecture", "Security",
            "CRM", "Negotiation", "Angular", "TypeScript", "UX", "Leadership", "Budgeting",
            "Testing", "Automation", "Salesforce", "Presentation", "Hiring", "Policy", "OAuth2"
    );

    public static final List<String> TASK_030_EMPLOYEES_JOINED_AFTER_2024_01_01 = List.of(
            "Charlie King", "Frank Moore", "Grace Lee", "Ivy Chen", "Kate Miller"
    );

    public static final Map<Boolean, List<String>> TASK_031_PARTITION_ACTIVE_EMPLOYEES = Map.of(
            true,  List.of("Alice Johnson","Bob Smith","Diana Prince","Eve Adams","Frank Moore",
                           "Henry Ford","Ivy Chen","Jack Brown","Kate Miller","Leo Nfor"),
            false, List.of("Charlie King", "Grace Lee")
    );

    public static final List<String> TASK_032_TOP_3_HIGHEST_PAID_EMPLOYEES = List.of("Henry Ford", "Eve Adams", "Leo Nfor");

    public static final List<String> TASK_033_SUPPORT_EMPLOYEE_EMAILS = List.of("charlie@acme.io", "ivy@acme.io");

    public static final List<String> TASK_034_DISTINCT_DEPARTMENTS_SORTED = List.of("Engineering", "Finance", "HR", "Sales", "Support");

    public static final long TASK_035_EMPLOYEES_OLDER_THAN_30_COUNT = 6L;

    public static final List<String> TASK_036_EMPLOYEE_NAMES_SORTED_BY_AGE_THEN_NAME = List.of(
            "Frank Moore","Charlie King","Grace Lee","Kate Miller","Alice Johnson","Ivy Chen",
            "Diana Prince","Jack Brown","Bob Smith","Leo Nfor","Eve Adams","Henry Ford"
    );

    public static final List<String> TASK_037_ACTIVE_EMPLOYEES_BY_SALARY_DESC = List.of(
            "Henry Ford","Eve Adams","Leo Nfor","Bob Smith","Alice Johnson",
            "Diana Prince","Jack Brown","Ivy Chen","Kate Miller","Frank Moore"
    );

    public static final List<String> TASK_038_EMPLOYEES_WITH_SALARY_AT_LEAST_5000 = List.of("Bob Smith", "Eve Adams", "Henry Ford", "Leo Nfor");

    public static final boolean TASK_039_ALL_EMPLOYEES_HAVE_AT_LEAST_ONE_SKILL = true;

    public static final boolean TASK_040_ANY_EMPLOYEE_IN_HR = true;

    public static final long TASK_041_INACTIVE_EMPLOYEE_COUNT = 2L;

    public static final Map<String, List<String>> TASK_042_EMPLOYEE_NAMES_BY_DEPARTMENT_SORTED = Map.of(
            "Engineering", List.of("Alice Johnson","Bob Smith","Eve Adams","Grace Lee","Leo Nfor"),
            "Support",     List.of("Charlie King","Ivy Chen"),
            "Finance",     List.of("Diana Prince","Henry Ford"),
            "Sales",       List.of("Frank Moore","Jack Brown"),
            "HR",          List.of("Kate Miller")
    );

    public static final Map<String, BigDecimal> TASK_043_TOTAL_SALARY_BY_DEPARTMENT = Map.of(
            "Engineering", new BigDecimal("26100.00"),
            "Support",     new BigDecimal("6000.00"),
            "Finance",     new BigDecimal("11200.00"),
            "Sales",       new BigDecimal("6100.00"),
            "HR",          new BigDecimal("3000.00")
    );

    public static final String TASK_044_DEPARTMENT_WITH_HIGHEST_AVERAGE_SALARY = "Finance";

    public static final List<String> TASK_045_EMPLOYEES_WITH_JAVA_SKILL = List.of("Alice Johnson","Eve Adams","Ivy Chen","Leo Nfor");

    public static final List<String> TASK_046_EMPLOYEES_WITH_JAVA_OR_SECURITY = List.of("Alice Johnson","Eve Adams","Ivy Chen","Leo Nfor");

    public static final Map<String, Long> TASK_047_SKILL_FREQUENCY = Map.ofEntries(
            Map.entry("Java",4L), Map.entry("Spring",1L), Map.entry("PostgreSQL",1L),
            Map.entry("Docker",1L), Map.entry("Kubernetes",1L), Map.entry("Linux",1L),
            Map.entry("SQL",1L), Map.entry("Troubleshooting",1L), Map.entry("Excel",1L),
            Map.entry("Compliance",1L), Map.entry("Architecture",1L), Map.entry("Security",2L),
            Map.entry("CRM",1L), Map.entry("Negotiation",1L), Map.entry("Angular",1L),
            Map.entry("TypeScript",1L), Map.entry("UX",1L), Map.entry("Leadership",1L),
            Map.entry("Budgeting",1L), Map.entry("Testing",1L), Map.entry("Automation",1L),
            Map.entry("Salesforce",1L), Map.entry("Presentation",1L), Map.entry("Hiring",1L),
            Map.entry("Policy",1L), Map.entry("OAuth2",1L)
    );

    public static final List<String> TASK_048_DISTINCT_ROLES_SORTED = List.of(
            "Account Executive","Accountant","Architect","Backend Engineer","DevOps Engineer",
            "Finance Manager","Frontend Engineer","HR Specialist","QA Analyst","Sales Rep",
            "Security Engineer","Support Engineer"
    );

    public static final String TASK_049_JOINED_ACTIVE_ENGINEERING_NAMES = "Alice Johnson, Bob Smith, Eve Adams, Leo Nfor";

    public static final boolean TASK_050_ALL_ACTIVE_EMPLOYEES_HAVE_EMAIL = true;

    // ==================================================
    // TASKS 051 - 065 : INVOICES
    // ==================================================

    public static final List<Long> TASK_051_OVERDUE_UNPAID_INVOICE_IDS_AS_OF_2026_04_23 = List.of(1001L,1003L,1004L,1006L,1007L);

    public static final BigDecimal TASK_052_TOTAL_UNPAID_AMOUNT = new BigDecimal("10250.00");

    public static final Map<Long, BigDecimal> TASK_053_UNPAID_AMOUNT_BY_EMPLOYEE_ID = Map.of(
            1L,new BigDecimal("1200.00"), 3L,new BigDecimal("800.00"),
            5L,new BigDecimal("3100.00"), 10L,new BigDecimal("950.00"), 12L,new BigDecimal("4200.00")
    );

    public static final List<Long> TASK_054_PAID_INVOICE_IDS = List.of(1002L, 1005L);

    public static final Map<Boolean, Long> TASK_055_INVOICE_COUNT_BY_PAID_STATUS = Map.of(true, 2L, false, 5L);

    public static final BigDecimal TASK_056_HIGHEST_INVOICE_AMOUNT = new BigDecimal("5000.00");

    public static final long TASK_057_EMPLOYEE_ID_WITH_LARGEST_INVOICE = 8L;

    public static final List<Long> TASK_058_UNPAID_INVOICE_IDS_SORTED_BY_DUE_DATE = List.of(1003L,1007L,1001L,1006L,1004L);

    public static final Map<Boolean, List<Long>> TASK_059_INVOICE_IDS_BY_PAID_STATUS = Map.of(
            true,  List.of(1002L,1005L),
            false, List.of(1001L,1003L,1004L,1006L,1007L)
    );

    public static final List<Long> TASK_060_EMPLOYEE_IDS_WITH_MORE_THAN_ONE_INVOICE = List.of();

    public static final Map<Long, BigDecimal> TASK_061_TOTAL_INVOICE_AMOUNT_BY_EMPLOYEE_ID = Map.of(
            1L,new BigDecimal("1200.00"), 2L,new BigDecimal("2200.00"), 3L,new BigDecimal("800.00"),
            5L,new BigDecimal("3100.00"), 8L,new BigDecimal("5000.00"),
            10L,new BigDecimal("950.00"), 12L,new BigDecimal("4200.00")
    );

    public static final List<Long> TASK_062_INVOICE_IDS_DUE_IN_APRIL_2026 = List.of(1001L,1003L,1004L,1006L,1007L);

    public static final LocalDate TASK_063_EARLIEST_UNPAID_DUE_DATE = LocalDate.of(2026, 4, 1);

    public static final List<Long> TASK_064_OVERDUE_UNPAID_INVOICE_IDS_BY_AMOUNT_DESC = List.of(1007L,1004L,1001L,1006L,1003L);

    public static final String TASK_065_JOINED_OVERDUE_UNPAID_INVOICE_IDS = "1007, 1004, 1001, 1006, 1003";

    // ==================================================
    // TASKS 066 - 085 : TRANSACTIONS
    // ==================================================

    public static final List<Long> TASK_066_FAILED_TRANSACTION_IDS = List.of(2002L,2004L,2007L,2009L);

    public static final BigDecimal TASK_067_TOTAL_SUCCESSFUL_TRANSACTION_AMOUNT = new BigDecimal("3920.00");

    public static final Map<String, Long> TASK_068_TRANSACTION_COUNT_BY_STATUS = Map.of("SUCCESS",6L,"FAILED",4L);

    public static final Map<Long, BigDecimal> TASK_069_TOTAL_SUCCESSFUL_AMOUNT_BY_EMPLOYEE_ID = Map.of(
            1L,new BigDecimal("150.00"), 2L,new BigDecimal("420.00"),
            5L,new BigDecimal("1200.00"), 8L,new BigDecimal("1500.00"), 12L,new BigDecimal("650.00")
    );

    public static final Map<Long, LocalDateTime> TASK_070_LATEST_TRANSACTION_TIME_BY_EMPLOYEE_ID = Map.of(
            1L,LocalDateTime.of(2026,4,20,11,0), 2L,LocalDateTime.of(2026,4,21,14,40),
            5L,LocalDateTime.of(2026,4,22,18,20), 8L,LocalDateTime.of(2026,4,22,16,5),
            10L,LocalDateTime.of(2026,4,23,9,0), 12L,LocalDateTime.of(2026,4,23,10,10)
    );

    public static final List<Long> TASK_071_EMPLOYEE_IDS_WITH_SUCCESS_OVER_1000 = List.of(8L);

    public static final List<Long> TASK_072_SUCCESSFUL_TRANSFER_TRANSACTION_IDS = List.of(2005L,2006L,2010L);

    public static final Map<String, Long> TASK_073_TRANSACTION_COUNT_BY_TYPE = Map.of("PAYMENT",5L,"TRANSFER",4L,"REFUND",1L);

    public static final BigDecimal TASK_074_HIGHEST_SUCCESSFUL_TRANSACTION_AMOUNT = new BigDecimal("1500.00");

    public static final List<Long> TASK_075_FAILED_TRANSACTION_IDS_BY_AMOUNT_DESC = List.of(2009L,2004L,2007L,2002L);

    public static final BigDecimal TASK_076_TOTAL_FAILED_TRANSACTION_AMOUNT = new BigDecimal("490.00");

    public static final List<Long> TASK_077_EMPLOYEE_IDS_WITH_SUCCESS_AND_FAILED_TRANSACTIONS = List.of(1L,2L,5L);

    public static final Map<Long, List<Long>> TASK_078_TRANSACTION_IDS_BY_EMPLOYEE_ID = Map.of(
            1L,List.of(2001L,2002L), 2L,List.of(2003L,2004L), 5L,List.of(2005L,2006L,2007L),
            8L,List.of(2008L), 10L,List.of(2009L), 12L,List.of(2010L)
    );

    public static final Input.Transaction TASK_079_LATEST_SUCCESSFUL_TRANSACTION =
            new Input.Transaction(2010L, 12L, new BigDecimal("650.00"), "TRANSFER", "SUCCESS", LocalDateTime.of(2026, 4, 23, 10, 10));

    public static final Map<String, BigDecimal> TASK_080_SUCCESSFUL_TRANSACTION_TOTALS_BY_TYPE = Map.of(
            "PAYMENT", new BigDecimal("2070.00"), "TRANSFER", new BigDecimal("1850.00")
    );

    public static final Map<Long, Long> TASK_081_SUCCESSFUL_TRANSACTION_COUNT_BY_EMPLOYEE_ID = Map.of(
            1L,1L, 2L,1L, 5L,2L, 8L,1L, 12L,1L
    );

    public static final List<LocalDate> TASK_082_DISTINCT_TRANSACTION_DATES_SORTED = List.of(
            LocalDate.of(2026,4,20), LocalDate.of(2026,4,21),
            LocalDate.of(2026,4,22), LocalDate.of(2026,4,23)
    );

    public static final Input.Transaction TASK_083_FIRST_TRANSACTION_CHRONOLOGICALLY =
            new Input.Transaction(2001L, 1L, new BigDecimal("150.00"), "PAYMENT", "SUCCESS", LocalDateTime.of(2026, 4, 20, 9, 10));

    public static final Input.Transaction TASK_084_LAST_TRANSACTION_CHRONOLOGICALLY =
            new Input.Transaction(2010L, 12L, new BigDecimal("650.00"), "TRANSFER", "SUCCESS", LocalDateTime.of(2026, 4, 23, 10, 10));

    public static final Map<Long, String> TASK_085_LATEST_TRANSACTION_STATUS_BY_EMPLOYEE_ID = Map.of(
            1L,"FAILED", 2L,"FAILED", 5L,"FAILED", 8L,"SUCCESS", 10L,"FAILED", 12L,"SUCCESS"
    );

    // ==================================================
    // TASKS 086 - 100 : LOGS
    // ==================================================

    public static final Map<String, Long> TASK_086_LOG_COUNT_BY_LEVEL = Map.of("INFO",2L,"WARN",1L,"ERROR",5L);

    public static final Map<String, Long> TASK_087_LOG_COUNT_BY_SERVICE = Map.of(
            "auth-service",3L, "billing-service",3L, "gateway-service",2L
    );

    public static final LocalDateTime TASK_088_FIRST_TIMESTAMP_OF_3_CONSECUTIVE_ERRORS = LocalDateTime.of(2026, 4, 23, 8, 12);

    public static final List<String> TASK_089_SERVICES_WITH_AT_LEAST_2_ERRORS = List.of("auth-service","billing-service");

    public static final List<String> TASK_090_ERROR_LOG_MESSAGES = List.of(
            "Redis timeout","Invoice sync failed","Invalid token","Downstream unavailable","Payment mismatch"
    );

    public static final Map<String, Long> TASK_091_ERROR_LOG_COUNT_BY_SERVICE = Map.of(
            "auth-service",2L, "billing-service",2L, "gateway-service",1L
    );

    public static final List<String> TASK_092_DISTINCT_LOG_LEVELS_SORTED = List.of("ERROR","INFO","WARN");

    public static final LocalDateTime TASK_093_EARLIEST_LOG_TIMESTAMP = LocalDateTime.of(2026, 4, 23, 8, 0);

    public static final LocalDateTime TASK_094_LATEST_LOG_TIMESTAMP = LocalDateTime.of(2026, 4, 23, 8, 22);

    public static final Map<Boolean, List<Long>> TASK_095_PARTITION_ERROR_LOG_IDS = Map.of(
            true,  List.of(3002L,3004L,3005L,3006L,3008L),
            false, List.of(3001L,3003L,3007L)
    );

    public static final List<String> TASK_096_SERVICES_WITH_AT_LEAST_ONE_INFO_LOG = List.of("auth-service","gateway-service");

    public static final List<String> TASK_097_BILLING_SERVICE_LOG_MESSAGES = List.of(
            "Slow invoice query","Invoice sync failed","Payment mismatch"
    );

    public static final long TASK_098_NUMBER_OF_SERVICES_IN_LOGS = 3L;

    public static final Map<String, List<String>> TASK_099_LOG_MESSAGES_BY_SERVICE = Map.of(
            "auth-service",    List.of("Startup complete","Redis timeout","Invalid token"),
            "billing-service", List.of("Slow invoice query","Invoice sync failed","Payment mismatch"),
            "gateway-service", List.of("Downstream unavailable","Recovered route")
    );

    public static final String TASK_100_JOINED_ERROR_LOG_MESSAGES =
            "Redis timeout | Invoice sync failed | Invalid token | Downstream unavailable | Payment mismatch";

    // ==================================================
    // TASKS 101 - 120 : ORDERS / NESTED DATA
    // ==================================================

    public static final int TASK_101_TOTAL_ITEM_QUANTITY_ACROSS_ALL_ORDERS = 15;

    public static final BigDecimal TASK_102_TOTAL_ORDER_VALUE_ACROSS_ALL_ORDERS = new BigDecimal("2935.00");

    public static final String TASK_103_MOST_EXPENSIVE_SINGLE_ITEM_PRODUCT = "Laptop";

    public static final Set<String> TASK_104_DISTINCT_ORDER_CATEGORIES = Set.of("Hardware","Accessories","Office");

    public static final Map<String, Integer> TASK_105_TOTAL_QUANTITY_BY_CATEGORY = Map.of(
            "Hardware",7, "Accessories",6, "Office",2
    );

    public static final Map<Long, BigDecimal> TASK_106_TOTAL_ORDER_VALUE_BY_EMPLOYEE_ID = Map.of(
            1L,new BigDecimal("1250.00"), 2L,new BigDecimal("210.00"),
            5L,new BigDecimal("645.00"),  8L,new BigDecimal("620.00"), 12L,new BigDecimal("210.00")
    );

    public static final List<String> TASK_107_EMPLOYEES_WHO_ORDERED_HARDWARE = List.of(
            "Alice Johnson","Bob Smith","Eve Adams","Leo Nfor"
    );

    public static final List<Long> TASK_108_PAID_ORDER_IDS = List.of(4001L,4002L,4004L);

    public static final Map<String, Long> TASK_109_ORDER_COUNT_BY_STATUS = Map.of("PAID",3L,"PENDING",1L,"CANCELLED",1L);

    public static final int TASK_110_TOTAL_ACCESSORIES_QUANTITY = 6;

    public static final int TASK_111_TOTAL_HARDWARE_QUANTITY = 7;

    public static final List<String> TASK_112_DISTINCT_PRODUCT_NAMES_SORTED = List.of(
            "Cable","Chair","Desk","Dock","Headset","Keyboard","Laptop","Monitor","Mouse","Webcam"
    );

    public static final String TASK_113_CHEAPEST_PRODUCT_BY_UNIT_PRICE = "Cable";

    public static final long TASK_114_ORDER_ID_WITH_HIGHEST_TOTAL_VALUE = 4001L;

    public static final Map<String, List<String>> TASK_115_PRODUCT_NAMES_BY_CATEGORY = Map.of(
            "Hardware",    List.of("Dock","Laptop","Monitor","Mouse","Webcam"),
            "Accessories", List.of("Cable","Headset","Keyboard"),
            "Office",      List.of("Chair","Desk")
    );

    public static final List<Long> TASK_116_EMPLOYEE_IDS_WITH_MORE_THAN_ONE_ORDER = List.of();

    public static final List<Long> TASK_117_ORDER_IDS_SORTED_BY_ORDERED_AT_DESC = List.of(4005L,4004L,4003L,4002L,4001L);

    public static final BigDecimal TASK_118_AVERAGE_UNIT_PRICE_OF_OFFICE_ITEMS = new BigDecimal("310.00");

    public static final int TASK_119_TOTAL_NUMBER_OF_ORDER_ITEMS = 10;

    public static final Map<Long, Integer> TASK_120_ORDER_ID_TO_TOTAL_ITEM_QUANTITY = Map.of(
            4001L,3, 4002L,4, 4003L,3, 4004L,2, 4005L,3
    );

    // ==================================================
    // TASKS 121 - 125 : MIXED / DASHBOARD
    // ==================================================

    public static final List<String> TASK_121_ACTIVE_ENGINEERING_EMAILS_SORTED = List.of(
            "alice@acme.io","bob@acme.io","eve@acme.io","leo@acme.io"
    );

    public static final List<Long> TASK_122_ACTIVE_EMPLOYEE_IDS_WITH_OVERDUE_UNPAID_INVOICES = List.of(1L,5L,10L,12L);

    public static final LocalDate TASK_123_MOST_RECENT_JOIN_DATE = LocalDate.of(2025, 2, 10);

    public static final String TASK_124_MOST_RECENTLY_JOINED_EMPLOYEE = "Charlie King";

    public static final Map<String, Object> TASK_125_MINI_DASHBOARD_SUMMARY = Map.of(
            "totalEmployees",          12,
            "activeEmployees",         10,
            "unpaidInvoiceTotal",      new BigDecimal("10250.00"),
            "successfulTransactionTotal", new BigDecimal("3920.00"),
            "totalOrderValue",         new BigDecimal("2935.00")
    );
}
