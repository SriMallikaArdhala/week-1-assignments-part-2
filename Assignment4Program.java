import java.util.*;
import static java.lang.System.out;
public class Assignment4Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Starting Number:");
        int startingNumber = sc.nextInt();
        out.print("Ending Number: ");
        int endingNumber = sc.nextInt();
        if (startingNumber < 0 || endingNumber < 0) {
            out.println("numbers must be non negative.");
        }else if (startingNumber > endingNumber) {

            out.println("Starting number must not be greater than ending number.");

        }else{
            out.println("armstrong numbers:");
            int count = 0;
            for (int i = startingNumber; i <= endingNumber; i++) {
                int num = i;
                int digits = 0;
                int num1 = i;
                int rem = 0;
                while (num != 0) {
                    num = num / 10;
                    digits++;

                }
                int sum = 0;

                while (num1 != 0) {
                    rem = num1 % 10;
                    num1 = num1 / 10;
                    sum += (int)Math.pow(rem , digits);
                }
                if (sum == i) {
                    out.println(i);
                    count++;

                }
            }
            out.println("Armstrong numbers count: "+count);
        }

    }
}
