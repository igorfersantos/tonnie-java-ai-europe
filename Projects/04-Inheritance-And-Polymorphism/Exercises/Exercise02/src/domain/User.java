package domain;

public abstract class User {
    protected String name;
    protected String email;
    protected String password;
    protected boolean isAdmin;
    protected boolean isLoggedIn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    // I didn't need to implement these functions as the exercise do not ask for it. But I did anyway.
    public boolean login(String email, String password) {
        if (this.email != email || this.password != password) return false;
        isLoggedIn = true;
        return true;
    }

    public void logoff() {
        isLoggedIn = false;
    }

    public boolean changeInfo(String name) {
        if (!isLoggedIn) return false;
        this.name = name;
        return true;
    }

    public boolean changePassword(String newPassword) {
        if (!isLoggedIn) return false;
        this.password = newPassword;
        return true;
    }
}
