package basics.lambda.solutions;

import basics.lambda.LambdaFunctionalInput.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static basics.lambda.LambdaFunctionalInput.EMPLOYEES;
import static basics.lambda.LambdaFunctionalInput.PRICES;

public class FunctionalInterfaceSolutions {

    static NameJoiner joiner = (left, right) -> left;


    // TASK_1: Defined a Predicate 'adultEmployee' using the lambda 'e -> e.age() >= 30'. The stream filters employees with this predicate, maps them to their names using 'Employee::name', and collects the results into a List.
    static Predicate<Employee> adultEmployee = e -> e.age() >= 30;

    public static List<String> employees = EMPLOYEES
            .stream().filter(adultEmployee).map(Employee::name)
            .collect(Collectors.toList());

    // TASK_2: Created two Predicates, 'isActive' (using a method reference) and 'isHighPaid' (using a lambda for salary check). These are combined using the '.and()' method to filter the stream before mapping to names.
    static Predicate<Employee> isActive = Employee::active;
    static Predicate<Employee> isHighPaid = e -> e.salary().doubleValue() >= 5000;

    public static List<String> activeHighPaidNames = EMPLOYEES
            .stream()
            .filter(isActive.and(isHighPaid))
            .map(Employee::name)
            .collect(Collectors.toList());

    // TASK_3: Defined 'isEngineering' and 'isFinance' predicates. They are joined with '.or()' to filter employees belonging to either department, then mapped to names and collected.
    static Predicate<Employee> isEngineering = e -> "Engineering".equals(e.department());
    static Predicate<Employee> isFinance = e -> "Finance".equals(e.department());

    public static List<String> engineeringOrFinanceNames = EMPLOYEES
            .stream()
            .filter(isEngineering.or(isFinance))
            .map(Employee::name)
            .collect(Collectors.toList());


    // TASK_4: Created a 'toUppercase' Function using 'e -> e.name().toUpperCase()'. The stream uses 'Collectors.toMap' where 'Employee::name' provides the key and the function provides the value.
    static Function<Employee, String> toUppercase = e -> e.name().toUpperCase();

    public static Map<String, String> nameInUppercase = EMPLOYEES
            .stream().collect(Collectors.toMap(Employee::name, toUppercase));


    // TASK_5: Defined a 'nameSize' Function that returns 'e.name().length()'. This is passed to 'Collectors.toMap' to create a mapping from employee names to their respective name lengths.
    static Function<Employee , Integer> nameSize = e -> e.name().length();

    public static Map<String, Integer> nameSizeMap = EMPLOYEES
            .stream().collect(Collectors.toMap(Employee::name, nameSize));


    // TASK_6: Implemented 'priceFormater' using 'e.salary().add(...)' with a new BigDecimal. 'Collectors.toMap' builds the map with names as keys and the updated salaries as values.
    static Function <Employee, BigDecimal> priceFormater = e -> e.salary().add(new BigDecimal("500.00"));

    public static Map<String , BigDecimal> priceFormaterMap = EMPLOYEES.stream().collect(Collectors.toMap(Employee::name,priceFormater));

    // TASK_7: 'salaryRanger' classifies employees into LOW, MID, or HIGH salary bands using nested ternary operators for conciseness. It uses 'compareTo' for precise BigDecimal comparison.
    static Function <Employee , String> salaryRanger = e ->
            e.salary().compareTo(new BigDecimal("4000")) < 0 ? "LOW" :
            e.salary().compareTo(new BigDecimal("6000")) < 0 ? "MID" : "HIGH";

    public static Map<String, String> salaryBandMap = EMPLOYEES.stream()
            .collect(Collectors.toMap(Employee::name, salaryRanger));


    // TASK_8: Defined a 'priceFormatter' Function<BigDecimal, String> that prepends "XAF " to the price. The stream maps each price in the 'PRICES' list using this function and collects the results into a List.
    static Function<BigDecimal, String> priceFormatter = price -> "XAF " + price;

    public static List<String> formattedPrices = PRICES.stream()
            .map(priceFormatter)
            .collect(Collectors.toList());


    // TASK_9 : Define a 'constantSupplier' that returns the string "functional-ready". The 'get()' method of this supplier is called to retrieve the constant value, which is stored in 'constanteValue'.
    static Supplier <String> constantSupplier = () -> "functional-ready";
    public static String constanteValue =  constantSupplier.get();



}
