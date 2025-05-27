
public class sumOfDigits {

    public static void main(String[] args) {
        System.out.print(sod(1234));
    }

    static int sod(int n) {
        if (n <= 0) {
            return 0;
        }
        return n % 10 + sod(n / 10);
    }
}
