
public class Main {

    public static void main(String[] agrs) {
        System.out.println("----OOPs Concepts----");

        System.out.println("----Encapsulation----");
        Encapsulation e = new Encapsulation();
        System.out.println(e.setDetails("Siva", "Hello There", 17));
        System.out.println(e.setDetails("Siva", "Hello There", 22));

        System.out.println("----Abstraction----");
        Abstraction siva = new Male("Alive", "male");
        System.out.println("is he male : " + siva.toString());
        Abstraction parvathi = new Female("Alive", "female");
        System.out.println("is he female : " + parvathi.toString());

    }
}
