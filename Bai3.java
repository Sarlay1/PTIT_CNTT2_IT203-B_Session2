@FunctionalInterface
interface Authenticatable {

    String getPassword();

    default boolean isAuthenticated() {
        return getPassword() != null && !getPassword().isEmpty();
    }

    static String encrypt(String rawPassword) {
        return "ENC_" + rawPassword;
    }
}

class Student implements Authenticatable {

    private String password;

    public Student(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }
}

public class Bai3 {
    public static void main(String[] args) {

        Student student = new Student("123456");

        System.out.println("Authenticated: " + student.isAuthenticated());

        String encrypted = Authenticatable.encrypt(student.getPassword());
        System.out.println("Encrypted password: " + encrypted);
    }
}