package facade;

public class Main {

    public static void main(String[] args) {

        LoginFacade loginFacade = new LoginFacade();

        loginFacade.handleLogin("Basim", "2222");
    }
}