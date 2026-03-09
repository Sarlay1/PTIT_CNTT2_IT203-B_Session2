import java.util.*;
import java.util.function.*;

class Account {
    private String username;

    public Account() {
        this.username = "Guest";
    }

    public Account(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

public class Bai4 {
    public static void main(String[] args) {

        List<Account> accounts = Arrays.asList(
                new Account("Alice"),
                new Account("Bob"),
                new Account("Charlie")
        );

        Function<Account, String> getName = Account::getUsername;

        Consumer<String> print = System.out::println;

        Supplier<Account> createAccount = Account::new;

        accounts.stream()
                .map(getName)
                .forEach(print);

        Account newAccount = createAccount.get();
        System.out.println("New account: " + newAccount.getUsername());
    }
}