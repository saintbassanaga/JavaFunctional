package advanced.optional;

import java.util.List;
import java.util.Optional;

public class OptionalResults {

    public static final String TASK_01 = "alice@mail.com";
    public static final String TASK_02 = "N/A";
    // 03 : lance NoSuchElementException — pas de constante
    public static final boolean TASK_04 = false;
    public static final boolean TASK_05 = true;
    public static final String TASK_06 = "Yaoundé";
    public static final String TASK_07 = "Unknown";
    public static final String TASK_08 = "NO ZIP";
    public static final String TASK_09 = "UK";
    public static final String TASK_10 = "Bonjour, Alice!";
    public static final Optional<String> TASK_11 = Optional.of("alice@mail.com");
    public static final String TASK_12 = "INVALID";
    public static final String TASK_13 = "NOT CM";
    // 14 : profil par défaut id=0 — contrat : résultat non-null et id() == 0L
    public static final String TASK_15 = "david_l@default.io";
    public static final long   TASK_16_ACCOUNT_ID       = 101L;
    public static final String TASK_16_ACCOUNT_USERNAME = "alice_m";
    public static final boolean TASK_17_IS_EMPTY = true;
    public static final String TASK_18 = "PROMO10";
    public static final String TASK_19 = "anonymous";
    // 20 : side-effect (affichage) — pas de constante
    // 21 : side-effect (affichage) — pas de constante
    // 22 : contrat — Optional présent pointant vers profil id=1
    public static final String TASK_23 = "Alice";
    public static final long   TASK_24_COUNT = 0L;
    public static final List<String> TASK_25 = List.of(
            "alice_m:PROMO10",
            "bob_ng:NO_PROMO",
            "chloe_d:WELCOME",
            "david_l:NO_PROMO",
            "emma_w:PROMO10",
            "frank_n:NO_PROMO"
    );
}
