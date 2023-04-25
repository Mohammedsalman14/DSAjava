package Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern1(5);
        System.out.println();
        Pattern2(5);
        System.out.println();
        Pattern3(5);
        System.out.println();
        Pattern4(5);
        System.out.println();
        Pattern5(5);
        System.out.println();
        Pattern6(5);
        System.out.println();
        Pattern7(5);

    }

    static void Pattern1(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void Pattern2(int n) {

        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int totalColInRows = i > n ? 2 * n - i : i;
            for (int j = 0; j < totalColInRows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern5(int n) {
        for (int i = 0; i <= n; i++) {
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n) {
        for (int i = n; i >= 0; i--) {
            for (int space = i; space <= n - 1; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern7(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int totalColInRows = i > n ? 2 * n - i : i;
            for (int noofspaces = 0; noofspaces <n- totalColInRows; noofspaces++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalColInRows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}