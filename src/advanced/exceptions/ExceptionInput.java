package advanced.exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ExceptionInput {

    public static final List<String> RAW_INTEGERS = Arrays.asList(
            "12","abc","7","","25","3x","-4",null,"100","0","oops","42"
    );

    public static final List<String> RAW_DOUBLES = Arrays.asList(
            "3.14","N/A","2.71","0.0","bad","42.0",null,"1.618","∞"
    );

    public static final List<String> RAW_DATES = Arrays.asList(
            "2026-01-15","not-a-date","2025-06-01","2026/04/01","2024-12-31",null,"2023-13-01"
    );

    public static final List<String> RAW_URLS = Arrays.asList(
            "https://valid.com","not_a_url","http://ok.org","ftp://weird://x","https://test.io",null
    );

    @FunctionalInterface
    public interface CheckedFunction<T, R> {
        R apply(T t) throws Exception;
    }

    @FunctionalInterface
    public interface CheckedSupplier<T> {
        T get() throws Exception;
    }

    @FunctionalInterface
    public interface CheckedConsumer<T> {
        void accept(T t) throws Exception;
    }

    public static <T, R> Function<T, R> wrap(CheckedFunction<T, R> fn) {
        return t -> {
            try {
                return fn.apply(t);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    public static <T, R> Function<T, Optional<R>> wrapToOptional(CheckedFunction<T, R> fn) {
        return t -> {
            try {
                return Optional.ofNullable(fn.apply(t));
            } catch (Exception e) {
                return Optional.empty();
            }
        };
    }
}
