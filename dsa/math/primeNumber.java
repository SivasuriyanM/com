
public class primeNumber {

    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            System.out.println(isPrime(i) ? i : "");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int s = 2;
        while (s * s <= n) {
            if (n % s == 0) {
                return false;
            }
            s++;
        }
        return true;
    }
}
