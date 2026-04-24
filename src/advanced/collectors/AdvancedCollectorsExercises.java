package advanced.collectors;

public class AdvancedCollectorsExercises {

    /*
     * COLLECTORS AVANCÉS — 25 TASKS
     *
     * Data : basics.streams.Input  (EMPLOYEES, INVOICES, TRANSACTIONS, LOGS, ORDERS)
     *
     * Collectors ciblés :
     *   counting(), summingInt/Long/Double(), averagingDouble()
     *   summarizingDouble/Int(), mapping(), joining()
     *   toUnmodifiableList/Set/Map(), toMap() avec merge function
     *   collectingAndThen(), groupingBy() avec downstream complexe
     *   partitioningBy() avec downstream, maxBy/minBy downstream
     *   teeing() (Java 12+), groupingBy() avec TreeMap supplier
     */

    public static final String[] TASKS = {
        "01. Utilise groupingBy(department, counting()) pour compter les employés par département. Résultat : Map<String, Long>.",
        "02. Utilise groupingBy(department, summingInt(age)) pour sommer les âges par département. Résultat : Map<String, Integer>.",
        "03. Utilise groupingBy(department, averagingDouble(salary)) pour la moyenne salariale par département. Résultat : Map<String, Double>.",
        "04. Utilise summarizingDouble(salary) sur TOUS les employés pour obtenir DoubleSummaryStatistics (count, min, max, sum, average). Retourne l'objet entier.",
        "05. Utilise groupingBy(department, mapping(name, toList())) pour obtenir les noms d'employés par département. Résultat : Map<String, List<String>>.",
        "06. Utilise groupingBy(department, mapping(name, joining(', '))) pour obtenir une String des noms par département. Résultat : Map<String, String>.",
        "07. Utilise groupingBy(department, mapping(name, joining(', ', '[', ']'))) pour obtenir les noms encadrés par département.",
        "08. Utilise collectingAndThen(toList(), Collections::unmodifiableList) pour obtenir une List<String> immuable des noms d'employés actifs.",
        "09. Utilise groupingBy(department, collectingAndThen(counting(), n -> n > 2 ? \"grand\" : \"petit\")) pour classifier la taille des équipes.",
        "10. Utilise collectingAndThen(groupingBy(department, counting()), map -> map.entrySet().stream().max(Map.Entry.comparingByValue()).get()) pour trouver le département le plus peuplé.",
        "11. Utilise partitioningBy(active) avec counting() comme downstream. Résultat : Map<Boolean, Long>.",
        "12. Utilise partitioningBy(salary >= 5000) avec mapping(name, joining(', ')) comme downstream. Résultat : Map<Boolean, String>.",
        "13. Utilise partitioningBy(active) avec summarizingDouble(salary) comme downstream pour les stats salariales des actifs vs inactifs.",
        "14. Utilise toMap(id, name) pour créer une Map<Long, String> id->nom de chaque employé.",
        "15. Utilise toMap(department, salary, BigDecimal::add) pour sommer les salaires par département. Résultat : Map<String, BigDecimal>.",
        "16. Utilise toMap(employeeId, amount, BigDecimal::add) sur INVOICES non-payées pour totaliser la dette par employé.",
        "17. Utilise toUnmodifiableList() pour collecter les noms des employés actifs de Engineering.",
        "18. Utilise toUnmodifiableSet() pour collecter les départements distincts.",
        "19. Utilise toUnmodifiableMap(id, email) pour créer une Map<Long, String> id->email immuable.",
        "20. Utilise groupingBy(department, maxBy(Comparator.comparing(salary))) pour le mieux payé par département. Résultat : Map<String, Optional<Employee>>.",
        "21. Utilise groupingBy(department, minBy(Comparator.comparing(age))) pour le plus jeune par département. Résultat : Map<String, Optional<Employee>>.",
        "22. Utilise groupingBy(department, TreeMap::new, toList()) pour obtenir une TreeMap triée de département->List<Employee>.",
        "23. Utilise Collectors.teeing() pour calculer simultanément en une seule passe la somme ET le count des salaires de tous les employés. " +
            "Retourne une String 'total=X, count=Y'.",
        "24. Utilise Collectors.teeing() pour obtenir simultanément la List des actifs et la List des inactifs en une seule passe sur EMPLOYEES.",
        "25. FlatMap les skills de chaque employé puis utilise groupingBy(skill, counting()) pour obtenir la fréquence de chaque skill " +
            "à travers tous les employés. Résultat : Map<String, Long> trié par fréquence décroissante."
    };

    public static void main(String[] args) {
        for (String task : TASKS) {
            System.out.println(task);
        }
    }
}
