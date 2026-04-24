package basics.lambda.solutions;

import basics.lambda.LambdaFunctionalInput;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LambdaSolutions {

    public static List<String> cleanWords = LambdaFunctionalInput.WORDS.stream()
            .filter(Objects::nonNull)
            .map(String::trim)
            .filter(word -> !word.isEmpty())
            .toList();

    public static List<String> normalizedWords = LambdaFunctionalInput.WORDS.stream()
            .filter(Objects::nonNull)
            .map(String::trim)
            .filter(word -> !word.isEmpty())
            .map(String::toLowerCase)
            .distinct()
            .toList();

    public static List<Integer> evenNumber = LambdaFunctionalInput
            .NUMBERS
            .stream()
            .filter(n -> n % 2 == 0)
            .toList();

    public static List<Integer> sortedNumbers = LambdaFunctionalInput.NUMBERS.stream()
            .sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    public static List<Integer> absoluteValues = LambdaFunctionalInput.NUMBERS.stream()
            .map(Math::abs)
            .toList();

}

