
public class equlidian {

    public static void main(String[] args) {
        System.out.print(gcd(7, 5));
        System.out.println();
        System.out.print(lcm(7, 5));

    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    // LCM
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
