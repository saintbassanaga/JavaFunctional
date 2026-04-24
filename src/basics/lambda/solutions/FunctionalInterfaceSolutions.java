package basics.lambda.solutions;

import basics.lambda.LambdaFunctionalInput.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static basics.lambda.LambdaFunctionalInput.EMPLOYEES;

public class FunctionalInterfaceSolutions {

    // TASK_1
    static Predicate<Employee> adultEmployee = e -> e.age() >= 30;

    public static List<String> employees = EMPLOYEES
            .stream().filter(adultEmployee).map(Employee::name)
            .collect(Collectors.toList());

    // TASK_2
    static Predicate<Employee> isActive = Employee::active;
    static Predicate<Employee> isHighPaid = e -> e.salary().doubleValue() >= 5000;

    public static List<String> activeHighPaidNames = EMPLOYEES
            .stream()
            .filter(isActive.and(isHighPaid))
            .map(Employee::name)
            .collect(Collectors.toList());

    // TASK_3
    static Predicate<Employee> isEngineering = e -> "Engineering".equals(e.department());
    static Predicate<Employee> isFinance = e -> "Finance".equals(e.department());

    public static List<String> engineeringOrFinanceNames = EMPLOYEES
            .stream()
            .filter(isEngineering.or(isFinance))
            .map(Employee::name)
            .collect(Collectors.toList());


    // TASK_4
    static Function<Employee, String> toUppercase = e -> e.name().toUpperCase();

    public static Map<String, String> nameInUppercase = EMPLOYEES
            .stream().collect(Collectors.toMap(Employee::name, toUppercase));


    //TASK_5
    static Function<Employee , Integer> nameSize = e -> e.name().length();

    public static Map<String, Integer> nameSizeMap = EMPLOYEES
            .stream().collect(Collectors.toMap(Employee::name, nameSize));


    // TASK_6

    static Function <Employee, BigDecimal> priceFormater = e -> e.salary().plus();
}
