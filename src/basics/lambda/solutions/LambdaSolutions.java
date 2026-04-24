package basics.lambda.solutions;

import basics.lambda.LambdaFunctionalInput;

import java.util.List;
import java.util.Objects;

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
}
