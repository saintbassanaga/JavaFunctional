package basics.lambda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class LambdaFunctionalInput {

    public record Employee(
            long id,
            String name,
            int age,
            String department,
            BigDecimal salary,
            boolean active,
            List<String> skills
    ) {}

    @FunctionalInterface
    public interface TextFormatter {
        String format(String input);
    }

    @FunctionalInterface
    public interface NumberRule {
        boolean test(int value);
    }

    @FunctionalInterface
    public interface EmployeeRule {
        boolean test(Employee employee);
    }

    @FunctionalInterface
    public interface SalaryTransformer {
        BigDecimal apply(BigDecimal salary);
    }

    @FunctionalInterface
    public interface NameJoiner {
        String join(String left, String right);
    }

    public static final List<Integer> NUMBERS = List.of(
            14, -5, 0, 22, 7, 7, 19, -12, 44, 3, 28, 14
    );

    public static final List<String> WORDS = Arrays.asList(
            "  Java  ", "spring", "Lambda", "", "Functional", "  ",
            "Stream", "API", "java", null, "Docker"
    );

    public static final List<BigDecimal> PRICES = List.of(
            new BigDecimal("12.50"),
            new BigDecimal("99.99"),
            new BigDecimal("5.00"),
            new BigDecimal("42.42"),
            new BigDecimal("18.75")
    );

    public static final List<String> MESSAGES = List.of(
            "error: redis",
            "info: startup",
            "warn: slow query",
            "error: token",
            "info: ready"
    );

    public static final List<Employee> EMPLOYEES = List.of(
            new Employee(1L, "Alice", 29, "Engineering", new BigDecimal("4200.00"), true,  List.of("Java", "Spring", "SQL")),
            new Employee(2L, "Bob",   34, "Engineering", new BigDecimal("5100.00"), true,  List.of("Docker", "Kubernetes", "Linux")),
            new Employee(3L, "Chloe", 26, "Support",     new BigDecimal("2800.00"), false, List.of("SQL", "Troubleshooting")),
            new Employee(4L, "David", 31, "Finance",     new BigDecimal("3900.00"), true,  List.of("Excel", "Compliance")),
            new Employee(5L, "Emma",  38, "Engineering", new BigDecimal("6800.00"), true,  List.of("Java", "Architecture", "Security")),
            new Employee(6L, "Frank", 24, "Sales",       new BigDecimal("2500.00"), true,  List.of("CRM", "Negotiation")),
            new Employee(7L, "Grace", 27, "Engineering", new BigDecimal("4100.00"), false, List.of("Angular", "TypeScript", "UX")),
            new Employee(8L, "Henry", 45, "Finance",     new BigDecimal("7300.00"), true,  List.of("Leadership", "Budgeting"))
    );
}
