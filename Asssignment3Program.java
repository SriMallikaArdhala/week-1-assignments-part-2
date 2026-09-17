import java.util.*;
import static java.lang.System.out;
public class Asssignment3Program {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        out.print("Starting Number:");
        int startingNo=sc.nextInt();
        out.print("Ending number: ");
        int endingNo=sc.nextInt();

        if (startingNo > endingNo) {

            out.println("Starting number must not be greater than ending number.");

        } else {

            int count = 0;
            int sum = 0;

            out.print("Prime numbers: ");

            for (int i = startingNo; i <= endingNo; i++) {
                if (i < 2) {
                    continue;
                }
                boolean isPrime = true;

                for (int j = 2; j * j <= i; j++) {

                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    out.print(i + " ");
                    count++;
                    sum += i;
                }
            }
            out.println();
            out.println("Number of primes: " + count);
            out.println("Sum of primes: " + sum);
        }
    }
}
