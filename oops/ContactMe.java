
public class ContactMe {

    private String name;
    private String emailId;
    private String message;

    public ContactMe(String name, String emailId, String message) {
        this.name = name;
        this.emailId = emailId;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getEmail() {
        return emailId;
    }

    public String submit() {
        if (!emailId.contains("@gmail")) {
            return "Invalid Email Id. Try Again!";
        }
        return "Submitted Succesfully";
    }

    public static void main(String[] args) {
        ContactMe cm = new ContactMe("siva", "siva", "Hello there! I would like to connect with you!");
        System.out.println(cm.submit());
        ContactMe cm2 = new ContactMe("siva", "siva@gmail.com", "Hello there! I would like to connect with you!");
        System.out.println(cm2.submit());
    }

}
