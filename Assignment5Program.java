import java.util.Scanner;
import static java.lang.System.out;

public class Assignment5Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        out.print("N: ");
        int n = sc.nextInt();

        if (n < 2 || n > 10) {

            out.println("N must be between 2 and 10.");

        } else {

            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= n - i; j++) {
                    out.print(" ");
                }
                if (i == 1) {
                    out.print("*");
                } else {
                    out.print("*");

                    for (int j = 1; j <= 2 * i - 3; j++) {
                        out.print(" ");
                    }

                    out.print("*");
                }

                out.println();
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    out.print(" ");
                }

                if (i == 1) {
                    out.print("*");
                } else {
                    out.print("*");

                    for (int j = 1; j <= 2 * i - 3; j++) {
                        out.print(" ");
                    }

                    out.print("*");
                }

                out.println();
            }
        }

    }
}