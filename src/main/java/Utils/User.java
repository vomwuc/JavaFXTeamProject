package Utils;

public class User {
    private static User userInstance;

    String personalNumber;
    Boolean isAdmin;

    public static User getInstacne() {
        if(userInstance == null) {
            userInstance = new User();
        }

        return userInstance;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}
