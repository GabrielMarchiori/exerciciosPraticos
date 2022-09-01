package services;

public class BoardingHouse {

    private String name;
    private String email;

    public BoardingHouse(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
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

    public String toString() {
        return getName() +", "+getEmail();
    }

    
    
}
