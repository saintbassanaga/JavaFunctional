package advanced.refs;

public class MethodRefExercises {

    /*
     * METHOD REFERENCES — 20 TASKS
     *
     * Data:  basics.streams.Input  (RAW_NAMES, RAW_NUMBERS, EMPLOYEES, ORDERS)
     *        basics.lambda.LambdaFunctionalInput  (WORDS, EMPLOYEES)
     *
     * Les 4 formes à maîtriser :
     *   A) Référence de méthode statique           : ClassName::staticMethod
     *   B) Référence sur une instance particulière : instance::instanceMethod
     *   C) Référence non-liée (sur le type)        : ClassName::instanceMethod
     *   D) Référence de constructeur               : ClassName::new
     *
     * Règle : chaque tâche DOIT utiliser une method reference, pas une lambda équivalente.
     */

    public static final String[] TASKS = {
        "01. [Statique] Utilise Objects::nonNull pour filtrer les null de Input.RAW_NAMES. Retourne List<String>.",
        "02. [Statique] Utilise Objects::isNull pour compter combien de null existent dans Input.RAW_NAMES.",
        "03. [Statique] Utilise Integer::parseInt pour convertir la List<String> {\"1\",\"2\",\"3\",\"42\"} en List<Integer>.",
        "04. [Statique] Utilise Math::abs pour obtenir la valeur absolue de chaque élément de Input.RAW_NUMBERS. Retourne List<Integer>.",
        "05. [Statique] Utilise String::valueOf pour convertir chaque Integer de Input.RAW_NUMBERS en List<String>.",
        "06. [Statique] Utilise Collections::unmodifiableList via Collectors.collectingAndThen(toList(), …) pour produire une List<String> immuable des noms d'employés.",
        "07. [Instance liée] Utilise System.out::println avec forEach pour afficher chaque nom d'employé actif de Input.EMPLOYEES.",
        "08. [Instance liée] Crée un String prefix = \"EMP: \"; utilise prefix::concat avec map() pour préfixer chaque nom d'employé.",
        "09. [Instance liée] Crée un Predicate<String> via \"Engineering\"::equals et utilise-le pour compter les employés de ce département.",
        "10. [Non-liée] Utilise String::toUpperCase pour transformer LambdaFunctionalInput.WORDS non-null en uppercase.",
        "11. [Non-liée] Utilise String::trim pour nettoyer LambdaFunctionalInput.WORDS non-null.",
        "12. [Non-liée] Utilise String::isBlank comme Predicate pour filtrer les chaînes vides ou espaces de RAW_NAMES.",
        "13. [Non-liée] Utilise String::length comme Function<String,Integer> pour obtenir la longueur de chaque nom d'employé.",
        "14. [Non-liée] Utilise Employee::name (basics.streams.Input.Employee) pour extraire les noms de tous les employés en List<String>.",
        "15. [Non-liée] Utilise Employee::active (basics.streams.Input.Employee) comme Predicate<Employee> pour filtrer les actifs.",
        "16. [Non-liée] Utilise Comparator.comparing(Employee::salary) pour trier Input.EMPLOYEES par salaire croissant.",
        "17. [Non-liée] Utilise Comparator.comparing(Employee::age).reversed() puis thenComparing(Employee::name) pour trier.",
        "18. [Constructeur] Utilise ArrayList::new dans Collectors.toCollection pour collecter les noms des actifs en ArrayList<String>.",
        "19. [Constructeur] Utilise TreeSet::new dans Collectors.toCollection pour obtenir un TreeSet<String> trié des noms d'employés.",
        "20. [Composition] Compose String::trim et String::toLowerCase via Function.andThen() et applique cette Function composée " +
            "sur RAW_NAMES non-null via map(). Les deux étapes DOIVENT utiliser des method references, pas de lambdas."
    };

    public static void main(String[] args) {
        for (String task : TASKS) {
            System.out.println(task);
        }
    }
}
