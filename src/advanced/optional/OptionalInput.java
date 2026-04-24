package advanced.optional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class OptionalInput {

    public record Address(
            String street,
            String city,
            String country,
            String zipCode
    ) {}

    public record Profile(
            long id,
            String firstName,
            String lastName,
            String email,
            String phone,
            Address address
    ) {}

    public record Account(
            long id,
            long profileId,
            String username,
            String nickname,
            BigDecimal balance,
            String promotionCode
    ) {}

    public static final List<Profile> PROFILES = List.of(
            new Profile(1L, "Alice", "Martin",  "alice@mail.com", "+237600000001",
                    new Address("12 Rue des Fleurs",       "Yaoundé", "CM", "237001")),
            new Profile(2L, "Bob",   "Ngono",   null,             "+237600000002",
                    new Address("45 Avenue de la Liberté", "Douala",  "CM", null)),
            new Profile(3L, "Chloe", "Dubois",  "chloe@mail.com", null,
                    new Address("7 Rue Victor Hugo",       "Paris",   "FR", "75001")),
            new Profile(4L, "David", "Lee",     null,             null,            null),
            new Profile(5L, "Emma",  "White",   "emma@mail.com",  "+447700000001",
                    new Address("10 Baker Street",         "London",  "UK", "NW1 6XE")),
            new Profile(6L, "Frank", "Nkomo",   "frank@mail.com", "+237600000006",
                    new Address("3 Rue de la Paix",        "Yaoundé", "CM", null))
    );

    public static final List<Account> ACCOUNTS = List.of(
            new Account(101L, 1L, "alice_m", "ali",  new BigDecimal("1250.75"), "PROMO10"),
            new Account(102L, 2L, "bob_ng",  null,   new BigDecimal("300.00"),  null),
            new Account(103L, 3L, "chloe_d","chlo",  new BigDecimal("0.00"),    "WELCOME"),
            new Account(104L, 4L, "david_l", null,   new BigDecimal("5890.00"), null),
            new Account(105L, 5L, "emma_w", "emmy",  new BigDecimal("2300.50"), "PROMO10"),
            new Account(106L, 6L, "frank_n", null,   new BigDecimal("750.00"),  null)
    );

    public static Optional<Profile> findProfileById(long id) {
        return PROFILES.stream().filter(p -> p.id() == id).findFirst();
    }

    public static Optional<Account> findAccountByProfileId(long profileId) {
        return ACCOUNTS.stream().filter(a -> a.profileId() == profileId).findFirst();
    }
}
