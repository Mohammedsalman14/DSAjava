package Pattern;

public class test {
    public static void main(String[] args) {
        Pattern(5);
        Pattern2(5);
        Pattern3(5);
        Pattern5(5);
        Pattern6(5);
        patterntest(5);

    }

    static void Pattern(int n) {
        for (int i = 0; i <= 2 * n; i++) {
            int totalnofcols = i >= n ? 2 * n - i : i;
            for (int space = 0; space <= n - totalnofcols; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= totalnofcols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void Pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 0; space < n - i; space++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    static void Pattern3(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int totalnof = i > n ? 2 * n - i : i;
            for (int space = 0; space <= n - totalnof; space++) {
                System.out.print("  ");
            }
            for (int j = totalnof; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= totalnof; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    static void Pattern5(int n) {

        for (int i = 0; i < n * 2 - 1; i++) {
            int totalno0fcols = i > n ? 2 * n - i : i;
            for (int j = 0; j < totalno0fcols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n) {
        for (int row = 1; row <= n * 2 - 1; row++) {
            int totalnoofcols = row > n ? 2 * n - row : row;
            for (int space = 0; space <= n - totalnoofcols; space++) {
                System.out.print("  ");
            }
            for (int col = totalnoofcols; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= totalnoofcols; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void patterntest(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <=n; j++) {
                if(i==2||i==3){
                    for (int j2 = 0; j2<=2*n-i+j; j2++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
}
