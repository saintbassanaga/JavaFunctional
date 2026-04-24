package basics.lambda;

public class FunctionalInterfaceExercises {

    public static final String[] TASKS = {
            "01. Utilise un Predicate<Employee> pour récupérer les employés adultes (age >= 30).",
            "02. Compose deux Predicate<Employee> pour récupérer les employés actifs avec salaire >= 5000.",
            "03. Combine des Predicate<Employee> avec or() pour récupérer les employés Engineering ou Finance.",
            "04. Utilise un Function<Employee, String> pour transformer chaque nom en uppercase.",
            "05. Utilise un Function<Employee, Integer> pour retourner la longueur de chaque nom.",
            "06. Utilise un Function<Employee, BigDecimal> puis une transformation pour ajouter 500 à chaque salaire.",
            "07. Utilise un Function<Employee, String> pour classer les salaires en LOW, MID, HIGH.",
            "08. Utilise un Function<BigDecimal, String> pour formater chaque prix en 'XAF valeur'.",
            "09. Utilise un Supplier<String> qui retourne une constante 'functional-ready'.",
            "10. Utilise un Consumer<String> pour accumuler la somme des longueurs des mots nettoyés.",
            "11. Utilise un BiFunction<String, String, String> pour produire 'nom->departement'.",
            "12. Utilise un BiFunction<String, BigDecimal, String> pour produire 'nom:salaire'.",
            "13. Utilise un BinaryOperator<BigDecimal> pour obtenir le prix maximum.",
            "14. Utilise un BinaryOperator<BigDecimal> pour sommer tous les prix.",
            "15. Utilise un BinaryOperator<Long> pour calculer le produit des nombres positifs sans overflow.",
            "16. Utilise un Predicate<String> pour récupérer les mots commençant par une voyelle.",
            "17. Utilise un Predicate<String> pour récupérer les mots de longueur >= 6.",
            "18. Compose des Predicate<String> avec and() pour récupérer les mots de longueur >= 6 contenant 'a'.",
            "19. Utilise Predicate.not(...) pour compter les mots non vides après nettoyage.",
            "20. Compose des Function<String, String> pour faire trim puis uppercase sur tous les mots non null.",
            "21. Compose une transformation numérique pour doubler chaque nombre puis le convertir en String 'n=...'.",
            "22. Utilise un UnaryOperator<BigDecimal> pour ajouter 10% à chaque salaire.",
            "23. Utilise un Supplier puis Set logique métier pour récupérer les départements distincts triés.",
            "24. Utilise un Predicate<Employee> pour vérifier si au moins un employé possède la skill 'Java'.",
            "25. Utilise un Predicate<Employee> pour vérifier si tous les employés actifs ont un salaire positif.",
            "26. Utilise un Predicate<Employee> pour vérifier qu'aucun employé n'est mineur.",
            "27. Utilise negate() sur un Predicate<Employee> pour récupérer les employés non-Engineering.",
            "28. Compose des Function<String, String> et Function<String, Integer> pour obtenir name -> lower -> length.",
            "29. Utilise un BiFunction<String, String, String> enrichi pour produire 'nom|departement|salaire'.",
            "30. Utilise un UnaryOperator<String> pour uppercaser chaque message et ajouter '!'."
    };

    public static void main(String[] args) {
        for (String task : TASKS) {
            System.out.println(task);
        }
    }
}
