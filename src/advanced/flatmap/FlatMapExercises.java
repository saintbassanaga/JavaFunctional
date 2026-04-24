package advanced.flatmap;

public class FlatMapExercises {

    /*
     * FLATMAP DEEP DIVE — 20 TASKS
     *
     * Data : advanced.flatmap.FlatMapInput  (TEAMS, COURSES)
     *        basics.streams.Input           (ORDERS, EMPLOYEES)
     *        advanced.optional.OptionalInput (PROFILES — task 16)
     */

    public static final String[] TASKS = {
        "01. Extrait tous les OrderItem de tous les Input.ORDERS en une seule List<OrderItem> via flatMap.",
        "02. Extrait toutes les skills de tous les Input.EMPLOYEES en une seule List<String> via flatMap.",
        "03. Extrait toutes les skills DISTINCTES de tous les Input.EMPLOYEES, triées alphabétiquement.",
        "04. Extrait tous les membres de toutes les TEAMS en une seule List<String> via flatMap.",
        "05. Extrait toutes les technologies DISTINCTES de toutes les TEAMS, triées alphabétiquement.",
        "06. Extrait tous les OrderItem de catégorie 'Hardware' dans tous les Input.ORDERS.",
        "07. Extrait les topics OBLIGATOIRES (mandatory=true) de tous les modules de tous les COURSES.",
        "08. Extrait les noms de modules dont la durée est > 4h à travers tous les COURSES.",
        "09. Produis une List<String> 'orderId:productName' pour chaque item de chaque order (ex: '4001:Laptop').",
        "10. Produis une List<String> 'course:module' pour chaque module de chaque course (ex: 'Spring Boot:REST APIs').",
        "11. Produis une List<String> 'team:membre' pour chaque membre de chaque TEAM.",
        "12. Compte le nombre total de topics (tous cours, tous modules confondus) via flatMap().flatMap().count().",
        "13. Calcule la somme totale des quantités de tous les items de tous les orders via flatMap + mapToInt + sum.",
        "14. Calcule le nombre total d'heures de formation en sommant les durationHours de tous les modules de tous les COURSES.",
        "15. Tu as une List<Optional<String>> opts = List.of(Optional.of(\"a\"), Optional.empty(), Optional.of(\"b\"), Optional.empty(), Optional.of(\"c\")). " +
            "Utilise flatMap(Optional::stream) pour extraire uniquement les valeurs présentes. Résultat : List<String>.",
        "16. Transforme OptionalInput.PROFILES en List<Optional<String>> d'emails puis " +
            "utilise flatMap(Optional::stream) pour extraire seulement les emails présents.",
        "17. Pour chaque TEAM, pour chaque techno, produis une String 'membre:techno' pour chaque membre. " +
            "Résultat : une List<String> de toutes les combinaisons membre x techno.",
        "18. Pour chaque COURSE, pour chaque MODULE, pour chaque TOPIC : produis 'course|module|topic.label'. " +
            "Résultat : List<String>. (Triple flatMap ou flatMap imbriqués.)",
        "19. Construit une Map<String, String> product->category pour tous les items de tous les Input.ORDERS " +
            "via flatMap + toMap(). Si un même produit apparaît plusieurs fois avec la même catégorie, " +
            "utilise une merge function identité pour éviter l'exception.",
        "20. Construit une Map<String, List<String>> team->technologies via groupingBy : " +
            "chaque clé est le nom d'équipe, chaque valeur est la liste de ses technos (ordre conservé)."
    };

    public static void main(String[] args) {
        for (String task : TASKS) {
            System.out.println(task);
        }
    }
}
