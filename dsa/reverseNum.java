
public class reverseNum {

    public static void main(String[] args) {
        reverse(124);
        System.out.println(" " + rev2(34556));
        rev3(234);
        System.out.println(sum);
    }

    static int reverse(int n) {
        if (n % 10 == n) {
            System.out.print(n);
            return 0;
        }
        System.out.print(n % 10);
        reverse(n / 10);
        return 0;
    }

    static int rev2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static int sum = 0;

    static int rev3(int n) {
        if (n == 0) {
            return 0;
        }
        sum = sum * 10 + n % 10;
        return rev3(n / 10);
    }
}
