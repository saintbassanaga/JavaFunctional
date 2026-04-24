package basics.streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Input {

    public record Employee(
            long id,
            String name,
            String email,
            Integer age,
            String department,
            String role,
            BigDecimal salary,
            boolean active,
            LocalDate joinedAt,
            List<String> skills
    ) {}

    public record Invoice(
            long id,
            long employeeId,
            BigDecimal amount,
            boolean paid,
            LocalDate dueDate
    ) {}

    public record Transaction(
            long id,
            long employeeId,
            BigDecimal amount,
            String type,
            String status,
            LocalDateTime createdAt
    ) {}

    public record LogEntry(
            long id,
            String service,
            String level,
            LocalDateTime timestamp,
            String message
    ) {}

    public record OrderItem(
            String product,
            String category,
            int quantity,
            BigDecimal unitPrice
    ) {}

    public record Order(
            long id,
            long employeeId,
            String status,
            LocalDate orderedAt,
            List<OrderItem> items
    ) {}

    public static final List<String> RAW_NAMES = Arrays.asList(
            "  Alice  ", "bob", "ALICE", "", "   ", null, "Charlie", "bob", "diana", "Eve"
    );

    public static final List<Integer> RAW_NUMBERS = Arrays.asList(
            12, 7, -3, 0, 25, 18, 7, 42, -10, 33, 18, 5, 60, 1, 12
    );

    public static final List<Employee> EMPLOYEES = List.of(
            new Employee(1L,  "Alice Johnson",  "alice@acme.io",   29, "Engineering", "Backend Engineer",
                    new BigDecimal("4200.00"), true,  LocalDate.of(2024, 1, 15),  List.of("Java", "Spring", "PostgreSQL")),
            new Employee(2L,  "Bob Smith",      "bob@acme.io",     34, "Engineering", "DevOps Engineer",
                    new BigDecimal("5100.00"), true,  LocalDate.of(2023, 6, 1),   List.of("Docker", "Kubernetes", "Linux")),
            new Employee(3L,  "Charlie King",   "charlie@acme.io", 26, "Support",     "Support Engineer",
                    new BigDecimal("2800.00"), false, LocalDate.of(2025, 2, 10),  List.of("SQL", "Troubleshooting")),
            new Employee(4L,  "Diana Prince",   "diana@acme.io",   31, "Finance",     "Accountant",
                    new BigDecimal("3900.00"), true,  LocalDate.of(2022, 11, 5),  List.of("Excel", "Compliance")),
            new Employee(5L,  "Eve Adams",      "eve@acme.io",     38, "Engineering", "Architect",
                    new BigDecimal("6800.00"), true,  LocalDate.of(2021, 4, 20),  List.of("Java", "Architecture", "Security")),
            new Employee(6L,  "Frank Moore",    "frank@acme.io",   24, "Sales",       "Sales Rep",
                    new BigDecimal("2500.00"), true,  LocalDate.of(2025, 1, 5),   List.of("CRM", "Negotiation")),
            new Employee(7L,  "Grace Lee",      "grace@acme.io",   27, "Engineering", "Frontend Engineer",
                    new BigDecimal("4100.00"), false, LocalDate.of(2024, 8, 19),  List.of("Angular", "TypeScript", "UX")),
            new Employee(8L,  "Henry Ford",     "henry@acme.io",   45, "Finance",     "Finance Manager",
                    new BigDecimal("7300.00"), true,  LocalDate.of(2020, 3, 2),   List.of("Leadership", "Budgeting")),
            new Employee(9L,  "Ivy Chen",       "ivy@acme.io",     30, "Support",     "QA Analyst",
                    new BigDecimal("3200.00"), true,  LocalDate.of(2024, 10, 1),  List.of("Testing", "Automation", "Java")),
            new Employee(10L, "Jack Brown",     "jack@acme.io",    33, "Sales",       "Account Executive",
                    new BigDecimal("3600.00"), true,  LocalDate.of(2023, 9, 12),  List.of("Salesforce", "Presentation")),
            new Employee(11L, "Kate Miller",    "kate@acme.io",    28, "HR",          "HR Specialist",
                    new BigDecimal("3000.00"), true,  LocalDate.of(2024, 5, 6),   List.of("Hiring", "Policy")),
            new Employee(12L, "Leo Nfor",       "leo@acme.io",     36, "Engineering", "Security Engineer",
                    new BigDecimal("5900.00"), true,  LocalDate.of(2022, 7, 14),  List.of("Security", "OAuth2", "Java"))
    );

    public static final List<Invoice> INVOICES = List.of(
            new Invoice(1001L, 1L,  new BigDecimal("1200.00"), false, LocalDate.of(2026, 4, 10)),
            new Invoice(1002L, 2L,  new BigDecimal("2200.00"), true,  LocalDate.of(2026, 3, 28)),
            new Invoice(1003L, 3L,  new BigDecimal("800.00"),  false, LocalDate.of(2026, 4, 1)),
            new Invoice(1004L, 5L,  new BigDecimal("3100.00"), false, LocalDate.of(2026, 4, 22)),
            new Invoice(1005L, 8L,  new BigDecimal("5000.00"), true,  LocalDate.of(2026, 2, 15)),
            new Invoice(1006L, 10L, new BigDecimal("950.00"),  false, LocalDate.of(2026, 4, 18)),
            new Invoice(1007L, 12L, new BigDecimal("4200.00"), false, LocalDate.of(2026, 4, 5))
    );

    public static final List<Transaction> TRANSACTIONS = List.of(
            new Transaction(2001L, 1L,  new BigDecimal("150.00"),  "PAYMENT",  "SUCCESS", LocalDateTime.of(2026, 4, 20, 9,  10)),
            new Transaction(2002L, 1L,  new BigDecimal("70.00"),   "REFUND",   "FAILED",  LocalDateTime.of(2026, 4, 20, 11,  0)),
            new Transaction(2003L, 2L,  new BigDecimal("420.00"),  "PAYMENT",  "SUCCESS", LocalDateTime.of(2026, 4, 21, 10, 30)),
            new Transaction(2004L, 2L,  new BigDecimal("120.00"),  "PAYMENT",  "FAILED",  LocalDateTime.of(2026, 4, 21, 14, 40)),
            new Transaction(2005L, 5L,  new BigDecimal("900.00"),  "TRANSFER", "SUCCESS", LocalDateTime.of(2026, 4, 22,  8, 15)),
            new Transaction(2006L, 5L,  new BigDecimal("300.00"),  "TRANSFER", "SUCCESS", LocalDateTime.of(2026, 4, 22, 12, 45)),
            new Transaction(2007L, 5L,  new BigDecimal("100.00"),  "TRANSFER", "FAILED",  LocalDateTime.of(2026, 4, 22, 18, 20)),
            new Transaction(2008L, 8L,  new BigDecimal("1500.00"), "PAYMENT",  "SUCCESS", LocalDateTime.of(2026, 4, 22, 16,  5)),
            new Transaction(2009L, 10L, new BigDecimal("200.00"),  "PAYMENT",  "FAILED",  LocalDateTime.of(2026, 4, 23,  9,  0)),
            new Transaction(2010L, 12L, new BigDecimal("650.00"),  "TRANSFER", "SUCCESS", LocalDateTime.of(2026, 4, 23, 10, 10))
    );

    public static final List<LogEntry> LOGS = List.of(
            new LogEntry(3001L, "auth-service",    "INFO",  LocalDateTime.of(2026, 4, 23, 8,  0), "Startup complete"),
            new LogEntry(3002L, "auth-service",    "ERROR", LocalDateTime.of(2026, 4, 23, 8,  5), "Redis timeout"),
            new LogEntry(3003L, "billing-service", "WARN",  LocalDateTime.of(2026, 4, 23, 8,  7), "Slow invoice query"),
            new LogEntry(3004L, "billing-service", "ERROR", LocalDateTime.of(2026, 4, 23, 8, 12), "Invoice sync failed"),
            new LogEntry(3005L, "auth-service",    "ERROR", LocalDateTime.of(2026, 4, 23, 8, 13), "Invalid token"),
            new LogEntry(3006L, "gateway-service", "ERROR", LocalDateTime.of(2026, 4, 23, 8, 14), "Downstream unavailable"),
            new LogEntry(3007L, "gateway-service", "INFO",  LocalDateTime.of(2026, 4, 23, 8, 20), "Recovered route"),
            new LogEntry(3008L, "billing-service", "ERROR", LocalDateTime.of(2026, 4, 23, 8, 22), "Payment mismatch")
    );

    public static final List<Order> ORDERS = List.of(
            new Order(4001L, 1L,  "PAID",      LocalDate.of(2026, 4, 10), List.of(
                    new OrderItem("Laptop",   "Hardware",    1, new BigDecimal("1200.00")),
                    new OrderItem("Mouse",    "Hardware",    2, new BigDecimal("25.00")))),
            new Order(4002L, 2L,  "PAID",      LocalDate.of(2026, 4, 11), List.of(
                    new OrderItem("Dock",     "Hardware",    1, new BigDecimal("180.00")),
                    new OrderItem("Cable",    "Accessories", 3, new BigDecimal("10.00")))),
            new Order(4003L, 5L,  "PENDING",   LocalDate.of(2026, 4, 12), List.of(
                    new OrderItem("Monitor",  "Hardware",    2, new BigDecimal("300.00")),
                    new OrderItem("Keyboard", "Accessories", 1, new BigDecimal("45.00")))),
            new Order(4004L, 8L,  "PAID",      LocalDate.of(2026, 4, 13), List.of(
                    new OrderItem("Chair",    "Office",      1, new BigDecimal("220.00")),
                    new OrderItem("Desk",     "Office",      1, new BigDecimal("400.00")))),
            new Order(4005L, 12L, "CANCELLED", LocalDate.of(2026, 4, 14), List.of(
                    new OrderItem("Webcam",   "Hardware",    1, new BigDecimal("90.00")),
                    new OrderItem("Headset",  "Accessories", 2, new BigDecimal("60.00"))))
    );
}
