
public class countSteps {

    public static void main(String[] args) {
        System.out.println(count(14));
    }

    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 2;
        if (rem == 1) {

            return helper(n - 1, c + 1);
        }
        return helper(n / 2, c + 1);
    }
}
