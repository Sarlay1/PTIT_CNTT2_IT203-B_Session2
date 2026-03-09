import java.util.function.*;

class User {
    String username;
    String role;

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User: " + username + " | Role: " + role;
    }
}

public class Bai1 {
    public static void main(String[] args) {

        Supplier<User> createUser = () -> new User("guest", "USER");
        User user = createUser.get();

        Predicate<User> isAdmin = u -> u.getRole().equals("ADMIN");

        Function<User, String> getUsername = u -> u.getUsername();

        Consumer<User> printUser = u -> System.out.println(u);

        printUser.accept(user);

        System.out.println("Username: " + getUsername.apply(user));

        System.out.println("Is Admin: " + isAdmin.test(user));
    }
}