package advanced.parallel;

public class ParallelStreamExercises {

    /*
     * PARALLEL STREAMS — 15 TASKS
     *
     * Data : basics.streams.Input  (EMPLOYEES, INVOICES, TRANSACTIONS, LOGS, ORDERS)
     *        basics.lambda.LambdaFunctionalInput (NUMBERS)
     */

    public static final String[] TASKS = {
        "01. Utilise parallelStream().filter(active).map(name).sorted().collect(toList()) sur Input.EMPLOYEES. " +
            "Vérifie que le résultat est identique à la version séquentielle.",
        "02. Utilise parallelStream().mapToDouble(salary).sum() sur Input.EMPLOYEES. Compare avec le résultat séquentiel.",
        "03. Utilise parallelStream().collect(groupingBy(department, counting())) sur Input.EMPLOYEES. " +
            "Vérifie que la Map est identique à la version séquentielle.",
        "04. Utilise parallelStream().forEach(System.out::println) sur Input.EMPLOYEES et observe que l'ordre N'EST PAS garanti. " +
            "Utilise ensuite forEachOrdered() pour garantir l'ordre d'insertion original.",
        "05. Utilise parallelStream().reduce(BigDecimal.ZERO, (acc, e) -> acc.add(e.salary()), BigDecimal::add) " +
            "sur Input.EMPLOYEES pour sommer les salaires. Retourne BigDecimal.",
        "06. Utilise IntStream.of(…).parallel().reduce(0, Integer::sum) sur LambdaFunctionalInput.NUMBERS pour leur somme. " +
            "Note : tous les éléments même négatifs.",
        "07. Utilise parallelStream().collect(Collectors.toConcurrentMap(id, name)) sur Input.EMPLOYEES. " +
            "Retourne ConcurrentMap<Long, String>.",
        "08. Utilise parallelStream().collect(Collectors.groupingByConcurrent(department)) sur Input.EMPLOYEES. " +
            "Retourne ConcurrentMap<String, List<Employee>>.",
        "09. Utilise Input.ORDERS.parallelStream().flatMap(o -> o.items().stream()).mapToDouble(item -> item.quantity() * item.unitPrice().doubleValue()).sum(). " +
            "Retourne la valeur totale de toutes les commandes.",
        "10. Utilise Input.TRANSACTIONS.parallelStream().filter(t -> t.status().equals(\"SUCCESS\")).map(t -> t.amount()).collect(toList()). " +
            "Le résultat DOIT être identique à la version séquentielle après tri.",
        "11. [PIÈGE À ÉVITER] Démontre le danger en créant une ArrayList<String> externe et en utilisant " +
            "parallelStream().forEach(list::add) sur Input.EMPLOYEES. Affiche pourquoi la liste résultante est incohérente. " +
            "Ensuite, corrige avec parallelStream().collect(Collectors.toList()).",
        "12. Utilise parallelStream().collect(partitioningBy(active)) sur Input.EMPLOYEES. " +
            "Retourne Map<Boolean, List<Employee>> et vérifie la cohérence avec la version séquentielle.",
        "13. Utilise Input.TRANSACTIONS.parallelStream().filter(t -> t.status().equals(\"SUCCESS\")).count(). Retourne long.",
        "14. Utilise parallelStream().sorted(Comparator.comparing(salary).reversed()).map(name).collect(toList()) sur Input.EMPLOYEES. " +
            "sorted() garantit l'ordre même en parallèle — vérifie que le résultat est identique au séquentiel.",
        "15. [Analyse] Utilise séquentiellement puis en parallèle un stream de 8 employés pour calculer la somme des salaires. " +
            "Entoure chaque appel d'un System.nanoTime() pour mesurer la durée. Explique pourquoi le parallèle est probablement " +
            "PLUS LENT sur un si petit jeu de données (overhead de fork/join)."
    };

    public static void main(String[] args) {
        for (String task : TASKS) {
            System.out.println(task);
        }
    }
}
