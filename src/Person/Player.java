package Person;

public class Player {
    String firstName;
    String lastName;
    Double budget;


    public Player(String firstName, String lastName, Double budget){
        this.firstName = firstName;
        this.lastName = lastName;
        this.budget = budget;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }
}
