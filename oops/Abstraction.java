
public class Abstraction {

    static abstract class Human {

        // Human class
        String organs, sex;

        public Human(String organs, String sex) {
            this.organs = organs;
            this.sex = sex;
        }

        public abstract String gender();

    }

    static class Male extends Human {

        public Male(String organs, String sex) {
            super(organs, sex);
        }

        @Override
        public String gender() {
            return (this.sex == "male") ? "Yes" : "No";
        }
    }

    static class Female extends Human {

        public Female(String organs, String sex) {
            super(organs, sex);
        }

        @Override

        public String gender() {
            return (this.sex == "female") ? "Yes" : "No";
        }
    }

    public static void main(String[] args) {
        System.out.println("----Abstraction----");
        Male siva = new Male("Alive", "male");
        System.out.println("Is he male : " + siva.gender());
        Human parvathi = new Female("Alive", "female");
        System.out.println("Is she female : " + parvathi.gender());
    }

}
