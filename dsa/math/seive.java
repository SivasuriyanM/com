// Optimized Prime Number Time Complexity O(N*Log(Log N))

public class seive {

    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        sieve(n, primes);

    }

    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (primes[i] == false) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

}
