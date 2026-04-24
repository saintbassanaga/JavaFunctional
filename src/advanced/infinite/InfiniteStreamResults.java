package advanced.infinite;

import java.time.LocalDate;
import java.util.List;

public class InfiniteStreamResults {

    public static final List<Integer> TASK_01 = List.of(0,1,2,3,4,5,6,7,8,9);
    public static final List<Integer> TASK_02 = List.of(2,4,6,8,10,12,14,16,18,20);
    public static final List<Long>    TASK_03 = List.of(1L,2L,4L,8L,16L,32L,64L,128L,256L,512L,1024L,2048L);

    public static final List<Long> TASK_04_FIBONACCI = List.of(
            0L,1L,1L,2L,3L,5L,8L,13L,21L,34L,55L,89L,144L,233L,377L
    );

    public static final List<Long> TASK_05_FACTORIALS = List.of(
            1L,2L,6L,24L,120L,720L,5040L,40320L,362880L,3628800L
    );

    public static final List<Integer> TASK_06_ARITHMETIC = List.of(1,4,7,10,13,16,19,22,25,28);

    public static final List<Integer> TASK_07_SQUARES_UNDER_200 = List.of(
            1,2,3,4,5,6,7,8,9,10,11,12,13,14
    );

    public static final List<Integer> TASK_08_EVEN_UP_TO_50 = List.of(
            2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50
    );

    public static final List<Integer> TASK_09 = List.of(10,11,12,13,14);

    public static final int TASK_10_FIRST_PRIME_OVER_100 = 101;

    public static final List<String> TASK_11 = List.of("ping","ping","ping","ping","ping");

    // 12 : aléatoire — contrat : 8 doubles ∈ [0.0, 1.0)
    public static final int TASK_12_SIZE = 8;

    public static final List<Integer> TASK_13 = List.of(1,2,3,4,5,6,7,8,9,10);

    public static final List<LocalDate> TASK_14_DATES = List.of(
            LocalDate.of(2026,1,1), LocalDate.of(2026,1,2), LocalDate.of(2026,1,3),
            LocalDate.of(2026,1,4), LocalDate.of(2026,1,5), LocalDate.of(2026,1,6),
            LocalDate.of(2026,1,7)
    );

    public static final List<Integer> TASK_15_PRIMES = List.of(2,3,5,7,11,13,17,19,23,29);
}
