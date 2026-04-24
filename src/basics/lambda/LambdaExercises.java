package basics.lambda;

import basics.lambda.solutions.LambdaSolutions;

public class LambdaExercises {

    public static final String[] TASKS = {
            "01. Nettoie LambdaFunctionalInput.WORDS avec des lambdas: trim, suppression des null, suppression des blanks.",
            "02. Normalise les mots en lowercase, supprime les doublons et conserve l'ordre d'apparition.",
            "03. Filtre uniquement les nombres pairs avec une lambda.",
            "04. Trie LambdaFunctionalInput.NUMBERS en ordre décroissant avec un Comparator lambda.",
            "05. Transforme tous les nombres en valeur absolue avec une lambda.",
            "06. Calcule le carré de chaque nombre avec une lambda.",
            "07. Compte combien de nombres sont négatifs avec une condition lambda.",
            "08. Trouve le second plus grand nombre distinct.",
            "09. Transforme tous les mots nettoyés en uppercase.",
            "10. Trie les mots nettoyés par longueur puis ordre alphabétique.",
            "11. Récupère les mots qui commencent par 'j' sans tenir compte de la casse.",
            "12. Récupère les noms des employés actifs.",
            "13. Récupère les noms des employés du département Engineering.",
            "14. Trie les employés par salaire décroissant et retourne seulement les noms.",
            "15. Trie les employés par âge croissant puis nom.",
            "16. Trie les employés par département puis nom.",
            "17. Récupère toutes les compétences distinctes triées alphabétiquement.",
            "18. Récupère les employés ayant un salaire >= 4000.",
            "19. Récupère les employés actifs du département Engineering.",
            "20. Concatène tous les noms d'employés avec ', '.",
            "21. Concatène les noms des employés actifs avec ', '.",
            "22. Applique une lambda de taxation de 19.25% sur chaque prix.",
            "23. Applique une remise de 10% sur chaque prix.",
            "24. Récupère les prix strictement supérieurs à 20 sous forme de String.",
            "25. Récupère les messages qui commencent par 'error'.",
            "26. Extrait le préfixe de chaque message avant ':'.",
            "27. Récupère les mots nettoyés dont la longueur est > 5.",
            "28. Récupère les mots nettoyés contenant la lettre 'a'.",
            "29. Trie les noms des employés en ordre alphabétique inverse.",
            "30. Trouve le nom de l'employé le mieux payé."
    };

    public static void main(String[] args) {
        boolean token = LambdaSolutions.normalizedWords.equals(LambdaResults.TASK_02_NORMALIZED_UNIQUE_WORDS);
        System.out.println(token ? "OK" : "KO");
        System.out.println(LambdaSolutions.normalizedWords);
    }
}
