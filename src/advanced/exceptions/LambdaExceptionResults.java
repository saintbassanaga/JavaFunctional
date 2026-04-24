package advanced.exceptions;

import java.time.LocalDate;
import java.util.List;

public class LambdaExceptionResults {

    /*
     * RAW_INTEGERS = ["12","abc","7","","25","3x","-4",null,"100","0","oops","42"]
     * RAW_DOUBLES  = ["3.14","N/A","2.71","0.0","bad","42.0",null,"1.618","∞"]
     * RAW_DATES    = ["2026-01-15","not-a-date","2025-06-01","2026/04/01","2024-12-31",null,"2023-13-01"]
     */

    public static final List<Integer> TASK_01_VALID_INTEGERS     = List.of(12,7,25,-4,100,0,42);
    public static final List<Double>  TASK_02_DOUBLES_WITH_FALLBACK = List.of(3.14,0.0,2.71,0.0,0.0,42.0,0.0,1.618,0.0);
    public static final List<Integer> TASK_03_VALID_INTEGERS     = List.of(12,7,25,-4,100,0,42);

    public static final List<LocalDate> TASK_04_VALID_DATES = List.of(
            LocalDate.of(2026,1,15), LocalDate.of(2025,6,1), LocalDate.of(2024,12,31)
    );

    public static final List<String> TASK_05_VALID_URLS = List.of("https://valid.com","http://ok.org","https://test.io");

    public static final List<Integer> TASK_06 = List.of(10,20,30);

    public static final List<LocalDate> TASK_07 = List.of(LocalDate.of(2026,1,1), LocalDate.of(2025,6,15));

    public static final List<Integer> TASK_08_VALID_INTEGERS = List.of(12,7,25,-4,100,0,42);

    public static final List<LocalDate> TASK_09_VALID_DATES = List.of(
            LocalDate.of(2026,1,15), LocalDate.of(2025,6,1), LocalDate.of(2024,12,31)
    );

    public static final long TASK_10_VALID_COUNT   = 7L;
    public static final long TASK_10_INVALID_COUNT = 5L;

    public static final List<String> TASK_11_ERROR_MESSAGES = List.of(
            "Invalide: abc","Invalide: ","Invalide: 3x","Invalide: null","Invalide: oops"
    );

    public static final List<Integer> TASK_12_VALID   = List.of(12,7,25,-4,100,0,42);
    public static final List<String>  TASK_12_INVALID = List.of("abc","","3x",null,"oops");

    public static final String TASK_13 = "sum=49.468, invalid=4";

    public static final List<String> TASK_14 = List.of("n=5","n=12","n=99");

    // Pipeline: valides→[12,7,25,-4,100,0,42] → filter>10→[12,25,100,42] → x²→[144,625,10000,1764] → desc
    public static final List<Integer> TASK_15 = List.of(10000,1764,625,144);
}
