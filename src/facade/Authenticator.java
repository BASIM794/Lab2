package facade;

public class Authenticator {

    public String login(String user, String pass) {
        System.out.println("User authenticated.");
        return "TOKEN123";
    }
}