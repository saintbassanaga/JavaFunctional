package advanced.optional;

public class OptionalExercises {

    /*
     * OPTIONAL<T> — 25 TASKS
     *
     * Data:  OptionalInput.java  (Profiles, Accounts, helper finders)
     * Rules:
     *   - Never call .get() sans isPresent() — utilise toujours orElse / orElseGet / orElseThrow / map / etc.
     *   - Chaque tâche doit être résolue en une seule expression fluide si possible.
     */

    public static final String[] TASKS = {
        "01. Récupère l'email du profil id=1 via Optional. Retourne la String 'N/A' si absent.",
        "02. Récupère l'email du profil id=4 via Optional. Retourne la String 'N/A' si absent.",
        "03. Récupère le téléphone du profil id=3 via Optional. Lance une NoSuchElementException avec message 'no phone' si absent.",
        "04. Vérifie (boolean) avec Optional.isPresent() si le profil id=4 possède une adresse.",
        "05. Vérifie (boolean) avec Optional.isEmpty() si le profil id=2 a un email.",
        "06. Pour le profil id=1, récupère la ville de l'adresse via Optional.map() doublement chaîné. Retourne 'Unknown' si absent.",
        "07. Pour le profil id=4, récupère la ville de l'adresse via Optional.map() chaîné. Retourne 'Unknown' si absent.",
        "08. Pour le profil id=2, récupère le zipCode via Optional.map() chaîné sur address puis zipCode. Retourne 'NO ZIP' si absent.",
        "09. Pour le profil id=5, récupère le pays de l'adresse, applique toUpperCase() via map(), retourne 'UNKNOWN' si absent.",
        "10. Via findProfileById(1), récupère le firstName et applique-lui une transformation 'Bonjour, <nom>!' via map().",
        "11. Via findProfileById(1), retourne l'email seulement s'il se termine par '@mail.com' (Optional.filter). Sinon Optional.empty().",
        "12. Via findProfileById(2), retourne l'email seulement s'il est non-null et non-blank (Optional.ofNullable + filter). Sinon 'INVALID'.",
        "13. Via findProfileById(3), retourne le téléphone seulement s'il commence par '+237'. Sinon retourne 'NOT CM'.",
        "14. Via findProfileById(99) (inexistant), utilise orElseGet() qui construit et retourne un profil par défaut id=0.",
        "15. Via findProfileById(4), récupère l'email avec orElseGet(() -> username + '@default.io') en cherchant le compte associé.",
        "16. Via findProfileById(1), enchaîne findAccountByProfileId() avec flatMap() pour obtenir l'Optional<Account>.",
        "17. Via findProfileById(99), enchaîne findAccountByProfileId() avec flatMap(). Vérifie que le résultat est Optional.empty().",
        "18. Via findProfileById(1), chaîne flatMap(findAccountByProfileId) puis map(Account::promotionCode) puis orElse('NONE').",
        "19. Via findProfileById(2), chaîne flatMap(findAccountByProfileId) puis map(Account::nickname) puis orElse('anonymous').",
        "20. Utilise ifPresent() pour afficher 'Email: <valeur>' si le profil id=1 a un email. Sinon ne rien faire.",
        "21. Utilise ifPresentOrElse() sur le téléphone du profil id=3: affiche 'Tel: <val>' si présent, sinon affiche 'Pas de téléphone'.",
        "22. Via findProfileById(4), utilise Optional.or() pour fournir un Optional<Profile> de secours (profil id=1) si id=4 n'a pas d'email.",
        "23. Utilise Optional.stream() sur findProfileById(1) pour obtenir un Stream<Profile> et récupère le firstName.",
        "24. Utilise Optional.stream() sur findProfileById(99) et vérifie via count() que le Stream est vide (result = 0).",
        "25. Pour chaque Account de ACCOUNTS, si promotionCode est présent retourne 'username:code', sinon 'username:NO_PROMO'. " +
            "Résultat: List<String>. Utilise Optional.ofNullable(account.promotionCode()) dans chaque map()."
    };

    public static void main(String[] args) {
        for (String task : TASKS) {
            System.out.println(task);
        }
    }
}
