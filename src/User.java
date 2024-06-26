public abstract class User {
    private String username;
    private String password;

    //constructor
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    // asbtract method for login
    public abstract void login();

    // getters m setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
