package advanced.exceptions;

public class LambdaExceptionExercises {

    /*
     * GESTION DES EXCEPTIONS DANS LES LAMBDAS — 15 TASKS
     *
     * Data : ExceptionInput.java  (RAW_INTEGERS, RAW_DOUBLES, RAW_DATES, RAW_URLS)
     *
     * Patterns à maîtriser :
     *   P1 — try-catch inline dans la lambda
     *   P2 — méthode utilitaire tryParse(…) → Optional<T>
     *   P3 — ExceptionInput.wrap() pour checked → unchecked
     *   P4 — ExceptionInput.wrapToOptional() pour checked → Optional
     *   P5 — Collectors.teeing() pour séparer valides/invalides
     *   P6 — CheckedFunction composé + wrap
     */

    public static final String[] TASKS = {
        "01. Convertis RAW_INTEGERS en List<Integer> avec try-catch INLINE dans map(). " +
            "Retourne null pour chaque invalide, puis filtre les null. Résultat : List<Integer>.",
        "02. Convertis RAW_DOUBLES en List<Double> avec try-catch inline. Substitue 0.0 pour les invalides (pas de filtre). " +
            "Résultat : List<Double> de même longueur que RAW_DOUBLES.",
        "03. Écris une méthode statique tryParseInt(String s) -> Optional<Integer> (vide si null ou non-parsable). " +
            "Utilise-la dans stream().map().filter(Optional::isPresent).map(Optional::get) pour extraire les entiers valides.",
        "04. Écris tryParseLocalDate(String s) -> Optional<LocalDate>. Utilise-la pour extraire les LocalDate valides de RAW_DATES.",
        "05. Écris tryParseURL(String s) -> Optional<java.net.URL>. Filtre RAW_URLS pour ne garder que les URLs valides. " +
            "Retourne List<String> des URL valides (toExternalForm()).",
        "06. Utilise ExceptionInput.wrap(Integer::parseInt) comme Function<String, Integer> dans map(). " +
            "Applique-le sur {\"10\", \"20\", \"30\"} — toutes valides. Retourne List<Integer>.",
        "07. Écris un CheckedFunction<String, LocalDate> qui parse via LocalDate.parse(). " +
            "Enroule-le avec wrap() puis utilise-le dans map() sur {\"2026-01-01\", \"2025-06-15\"}. Retourne List<LocalDate>.",
        "08. Utilise ExceptionInput.wrapToOptional(Integer::parseInt) dans map() sur RAW_INTEGERS. " +
            "Utilise ensuite flatMap(Optional::stream) pour n'extraire que les valides. Retourne List<Integer>.",
        "09. Utilise wrapToOptional() pour parser RAW_DATES en LocalDate. Filtre les Optional vides via flatMap(Optional::stream). " +
            "Retourne List<LocalDate>.",
        "10. Compte (long valid, long invalid) dans RAW_INTEGERS sans lever d'exception. " +
            "Utilise tryParseInt() + partition par Optional::isPresent. Affiche 'Valides: X, Invalides: Y'.",
        "11. Produis une List<String> des messages d'erreur pour chaque entrée INVALIDE de RAW_INTEGERS, " +
            "format : 'Invalide: <valeur brute>' (null affiché comme 'null'). Les valides sont ignorés.",
        "12. Utilise Collectors.teeing() sur RAW_INTEGERS pour construire simultanément " +
            "la List<Integer> des valides ET la List<String> des invalides (bruts). " +
            "Retourne un record ou tableau Object[] de 2 éléments.",
        "13. Utilise Collectors.teeing() sur RAW_DOUBLES pour obtenir la somme des valides " +
            "ET le count des invalides en une seule passe. Retourne une String 'sum=X, invalid=Y'.",
        "14. Compose deux CheckedFunctions via andThen : " +
            "  f1 : String -> Integer  (Integer::parseInt) " +
            "  f2 : Integer -> String  (n -> \"n=\" + n) " +
            "Enroule la composition avec wrap() et applique-la sur {\"5\", \"12\", \"99\"}. Retourne List<String>.",
        "15. [DÉFI] Pipeline complet sur RAW_INTEGERS : " +
            "(a) parse via wrapToOptional  (b) garde les valides  (c) filtre > 10  " +
            "(d) applique x -> x * x  (e) trie décroissant  (f) collecte en List<Integer> immuable. " +
            "Aucun try-catch inline autorisé."
    };

    public static void main(String[] args) {
        for (String task : TASKS) {
            System.out.println(task);
        }
    }
}
