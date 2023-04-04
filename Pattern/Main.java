package Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern1(5);
        System.out.println();
        Pattern2(5);
        System.out.println();
        Pattern3(5);

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
}