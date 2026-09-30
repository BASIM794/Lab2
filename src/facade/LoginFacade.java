package facade;

public class LoginFacade {

    private Authenticator authenticator;
    private UserCache userCache;
    private ActivityLogger activityLogger;

    public LoginFacade() {
        authenticator = new Authenticator();
        userCache = new UserCache();
        activityLogger = new ActivityLogger();
    }

    public void handleLogin(String user, String pass) {
        String token = authenticator.login(user, pass);
        userCache.storeToken(token);
        activityLogger.logLogin(user);
    }
}
