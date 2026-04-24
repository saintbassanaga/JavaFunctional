package advanced.flatmap;

import java.util.List;

public class FlatMapInput {

    public record Team(
            String name,
            List<String> members,
            List<String> technologies
    ) {}

    public record Topic(String label, boolean mandatory) {}

    public record Module(
            String name,
            List<Topic> topics,
            int durationHours
    ) {}

    public record Course(
            String title,
            List<String> prerequisites,
            List<Module> modules
    ) {}

    public static final List<Team> TEAMS = List.of(
            new Team("Backend",  List.of("Alice","Bob","David"),
                    List.of("Java","Spring","PostgreSQL","Docker")),
            new Team("Frontend", List.of("Carol","Eve"),
                    List.of("React","TypeScript","CSS","Docker")),
            new Team("DevOps",   List.of("Frank","Grace"),
                    List.of("Kubernetes","Docker","Terraform","Linux")),
            new Team("Data",     List.of("Henry","Ivy","Alice"),
                    List.of("Python","Spark","PostgreSQL","Kafka"))
    );

    public static final List<Course> COURSES = List.of(
            new Course("Java Fundamentals",
                    List.of("Basic Programming"),
                    List.of(
                            new Module("Syntax & Types",
                                    List.of(new Topic("variables",true), new Topic("loops",true),
                                            new Topic("arrays",true),    new Topic("varargs",false)), 4),
                            new Module("OOP",
                                    List.of(new Topic("classes",true),     new Topic("inheritance",true),
                                            new Topic("polymorphism",true), new Topic("sealed",false)), 6),
                            new Module("Collections",
                                    List.of(new Topic("List",true), new Topic("Map",true),
                                            new Topic("Set",true),  new Topic("Queue",false)), 5)
                    )),
            new Course("Spring Boot",
                    List.of("Java Fundamentals","Maven"),
                    List.of(
                            new Module("IoC & DI",
                                    List.of(new Topic("beans",true), new Topic("autowiring",true),
                                            new Topic("configuration",true), new Topic("profiles",false)), 4),
                            new Module("REST APIs",
                                    List.of(new Topic("controllers",true),       new Topic("DTOs",true),
                                            new Topic("validation",true),         new Topic("exception handling",true),
                                            new Topic("versioning",false)), 6),
                            new Module("Data JPA",
                                    List.of(new Topic("entities",true),       new Topic("repositories",true),
                                            new Topic("queries",true),         new Topic("transactions",true)), 5)
                    )),
            new Course("Functional Java",
                    List.of("Java Fundamentals"),
                    List.of(
                            new Module("Lambdas",
                                    List.of(new Topic("syntax",true), new Topic("method references",true),
                                            new Topic("closures",false)), 3),
                            new Module("Streams",
                                    List.of(new Topic("map",true),    new Topic("filter",true),
                                            new Topic("reduce",true), new Topic("collect",true),
                                            new Topic("flatMap",true),new Topic("parallel",false)), 5),
                            new Module("Optional",
                                    List.of(new Topic("creation",true), new Topic("chaining",true),
                                            new Topic("orElse",true),   new Topic("flatMap",true)), 2)
                    ))
    );
}
