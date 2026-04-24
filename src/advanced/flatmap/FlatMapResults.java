package advanced.flatmap;

import java.util.List;
import java.util.Map;

public class FlatMapResults {

    public static final int    TASK_01_TOTAL_ITEMS               = 10;
    public static final int    TASK_02_TOTAL_SKILLS              = 30;

    public static final List<String> TASK_03_DISTINCT_SKILLS_SORTED = List.of(
            "Angular","Architecture","Automation","Budgeting","CRM","Compliance","Docker","Excel",
            "Hiring","Java","Kubernetes","Leadership","Linux","Negotiation","OAuth2","Policy",
            "PostgreSQL","Presentation","SQL","Salesforce","Security","Spring","Testing","Troubleshooting",
            "TypeScript","UX"
    );

    public static final List<String> TASK_04_ALL_MEMBERS = List.of(
            "Alice","Bob","David","Carol","Eve","Frank","Grace","Henry","Ivy","Alice"
    );

    public static final List<String> TASK_05_DISTINCT_TECHNOLOGIES_SORTED = List.of(
            "CSS","Docker","Java","Kafka","Kubernetes","Linux","PostgreSQL","Python","React","Spark","Spring","Terraform","TypeScript"
    );

    public static final int TASK_06_HARDWARE_ITEMS_COUNT    = 5;
    public static final int TASK_07_MANDATORY_TOPICS_COUNT  = 31;

    public static final List<String> TASK_08_MODULES_OVER_4H = List.of("OOP","Collections","REST APIs","Data JPA","Streams");

    public static final List<String> TASK_09_ORDER_ITEMS = List.of(
            "4001:Laptop","4001:Mouse","4002:Dock","4002:Cable",
            "4003:Monitor","4003:Keyboard","4004:Chair","4004:Desk","4005:Webcam","4005:Headset"
    );

    public static final List<String> TASK_10_COURSE_MODULES = List.of(
            "Java Fundamentals:Syntax & Types","Java Fundamentals:OOP","Java Fundamentals:Collections",
            "Spring Boot:IoC & DI","Spring Boot:REST APIs","Spring Boot:Data JPA",
            "Functional Java:Lambdas","Functional Java:Streams","Functional Java:Optional"
    );

    public static final List<String> TASK_11_TEAM_MEMBERS = List.of(
            "Backend:Alice","Backend:Bob","Backend:David",
            "Frontend:Carol","Frontend:Eve",
            "DevOps:Frank","DevOps:Grace",
            "Data:Henry","Data:Ivy","Data:Alice"
    );

    public static final long TASK_12_TOTAL_TOPICS_COUNT = 38L;
    public static final int  TASK_13_TOTAL_QUANTITY     = 15;
    public static final int  TASK_14_TOTAL_HOURS        = 40;

    public static final List<String> TASK_15_PRESENT_VALUES  = List.of("a","b","c");
    public static final List<String> TASK_16_PRESENT_EMAILS  = List.of("alice@mail.com","chloe@mail.com","emma@mail.com","frank@mail.com");

    // 17 : 40 paires (3×4 + 2×4 + 2×4 + 3×4)
    public static final int TASK_17_CARTESIAN_COUNT = 40;
    // 18 : 38 triplets (= nombre total de topics)
    public static final int TASK_18_TRIPLE_COUNT    = 38;

    public static final Map<String, String> TASK_19_PRODUCT_CATEGORY = Map.of(
            "Laptop","Hardware","Mouse","Hardware","Dock","Hardware","Cable","Accessories",
            "Monitor","Hardware","Keyboard","Accessories","Chair","Office","Desk","Office",
            "Webcam","Hardware","Headset","Accessories"
    );

    public static final Map<String, List<String>> TASK_20_TEAM_TECHNOLOGIES = Map.of(
            "Backend",  List.of("Java","Spring","PostgreSQL","Docker"),
            "Frontend", List.of("React","TypeScript","CSS","Docker"),
            "DevOps",   List.of("Kubernetes","Docker","Terraform","Linux"),
            "Data",     List.of("Python","Spark","PostgreSQL","Kafka")
    );
}
