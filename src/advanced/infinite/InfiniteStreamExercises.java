package advanced.infinite;

public class InfiniteStreamExercises {

    /*
     * INFINITE STREAMS — 15 TASKS
     *
     * Outils : Stream.iterate(), Stream.generate(), takeWhile(), dropWhile(), limit()
     *
     * Règles :
     *   - Ne jamais collecter un stream infini sans limit() / takeWhile() / findFirst() / findAny().
     *   - Utilise la forme à 3 arguments de iterate() (Java 9+) quand le prédicat d'arrêt est connu à l'avance.
     *   - Préfère takeWhile/dropWhile sur un limit() arbitraire quand la condition de sortie est sémantique.
     */

    public static final String[] TASKS = {
        "01. Génère les 10 premiers entiers naturels (0, 1, 2, …, 9) avec Stream.iterate(0, n -> n + 1).limit(10). Retourne List<Integer>.",
        "02. Génère les 10 premiers nombres pairs positifs (2, 4, …, 20) avec Stream.iterate. Retourne List<Integer>.",
        "03. Génère les puissances de 2 (1, 2, 4, 8, …) pour les 12 premiers termes avec Stream.iterate. Retourne List<Long>.",
        "04. Génère les 15 premiers termes de la suite de Fibonacci (0, 1, 1, 2, 3, 5, …) via Stream.iterate avec un tableau de 2 états int[]{a,b}. Retourne List<Long>.",
        "05. Génère les factorielles 1! à 10! (1, 2, 6, 24, …, 3628800) via Stream.iterate avec un tableau d'état long[]{n, fact}. Retourne List<Long>.",
        "06. Génère une suite arithmétique de premier terme 1 et de raison 3 (1, 4, 7, 10, …) pour les 10 premiers termes. Retourne List<Integer>.",
        "07. Utilise Stream.iterate(1, n -> n + 1) + takeWhile(n -> n * n < 200) pour produire tous les entiers dont le carré est < 200. Retourne List<Integer>.",
        "08. Utilise Stream.iterate(2, n -> n + 2) + takeWhile(n -> n <= 50) pour tous les nombres pairs de 2 à 50. Retourne List<Integer>.",
        "09. Génère les 20 premiers entiers (0..19) via iterate, puis dropWhile(n -> n < 10), puis limit(5). Retourne List<Integer> [10,11,12,13,14].",
        "10. Utilise Stream.iterate(2, n -> n + 1) + filter(isPrime) + findFirst() pour trouver le premier nombre premier > 100. " +
            "Implémente isPrime comme méthode privée.",
        "11. Utilise Stream.generate(() -> \"ping\") limité à 5 pour créer une List<String> de 5 éléments \"ping\".",
        "12. Utilise Stream.generate(Math::random) pour obtenir les 8 premiers doubles aléatoires entre 0 et 1. Retourne List<Double>.",
        "13. Utilise Stream.generate avec un AtomicInteger (AtomicInteger counter = new AtomicInteger(1)) pour produire une séquence " +
            "auto-incrémentée : prends les 10 premiers. Retourne List<Integer> [1,2,...,10].",
        "14. Génère une séquence de LocalDate à partir du 2026-01-01, en avançant d'un jour à chaque itération, " +
            "et retourne les 7 premières dates (Stream.iterate + limit). Résultat : List<LocalDate>.",
        "15. Génère les n premiers nombres premiers (n = 10) via Stream.iterate(2, i -> i + 1) + filter(isPrime) + limit(10). " +
            "Retourne List<Integer>. Vérifie que isPrime ne teste la divisibilité que jusqu'à sqrt(candidate)."
    };

    public static void main(String[] args) {
        for (String task : TASKS) {
            System.out.println(task);
        }
    }
}
