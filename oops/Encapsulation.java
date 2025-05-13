
public class Encapsulation {

    private String userName, message;
    private int age;

    public String toString() {
        return this.userName + " " + this.age + " " + this.message;
    }

    public String setDetails(String userName, String message, int age) {
        if (age < 18) {
            return "Invalid Age!, Age Must be greater then 18 .";
        }
        this.userName = userName;
        this.message = message;
        this.age = age;
        toString();
        return "Submitted Succesfully!";
    }
}
