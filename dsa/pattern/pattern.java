
public class pattern {

    public static void main(String[] args) {
        box(5);
        halfLeftTriangle(5);
        downhalfLeftTringle(5);
        numTriangle(5);
        halfHSquare(5);
        kict(5);
        numberPramid(5);
        numberDiamond(5);
        numberBox(5);
    }

    static void halfLeftTriangle(int row) {
        System.out.println();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void box(int n) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void downhalfLeftTringle(int n) {
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void numTriangle(int n) {
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void halfHSquare(int n) {
        System.out.println();
        for (int i = 0; i <= n * 2 - 1; i++) {
            int col = i > n ? n * 2 - i : i;
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void kict(int n) {
        System.out.println();
        for (int i = 0; i <= n * 2 - 1; i++) {
            int col = i > n ? n * 2 - i : i;
            int space = n - col; // or i > n ? i - n : n - i for '>' space = col
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void numberPramid(int n) {
        System.out.println();
        for (int i = 1; i <= n; i++) {
            int col = i > n ? n * 2 - i : i;
            int space = n - col; // or i > n ? i - n : n - i for '>' space = col
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    static void numberDiamond(int n) {
        System.out.println();
        for (int i = 1; i <= n * 2; i++) {
            int col = i > n ? n * 2 - i : i;
            int space = n - col; // or i > n ? i - n : n - i for '>' space = col
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            for (int j = col; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k <= col; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    static void numberBox(int n) {
        System.out.println();
        int c = n;
        n = n * 2;
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n; col++) {
                int atEveryIndex = c - Math.min(Math.min(row, col), Math.min(n - row, n - col)) + 1;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
