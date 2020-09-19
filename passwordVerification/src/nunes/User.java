package nunes;

public class User {

    private String password;
    private String salt;
    private String hash;

    public User() {

    }

    public User(String iniPassword) {
        password = iniPassword;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }

    public String getSalt() {

        return salt;
    }

    public void setSalt(String newSalt) {
        salt = newSalt;
    }

    public String getHashedPassword() {

        return hash;
    }

    public void setHashedPassword(String newHash) {
        hash = newHash;
    }
}
